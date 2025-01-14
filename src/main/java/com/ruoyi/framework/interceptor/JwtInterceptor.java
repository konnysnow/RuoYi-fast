package com.ruoyi.framework.interceptor;
import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * LoginController--生成token，用户密码登录
 * WxController--生成token，微信认证后
 * JwtInterceptor--校验token
 * ResourcesConfig--配置需要拦截的url
 * ShiroConfig--配置放行的url
 */
@Component
public class JwtInterceptor implements HandlerInterceptor {

    @Value("${jwt.secret}")
    private String secret;

    @Value("${jwt.expiration}")
    private Long expiration;

    @Value("${jwt.token_prefix}")
    private String tokenPrefix;//Bearer

    @Autowired
    private RedisTemplate<String, String> redisTemplate;

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        System.out.println("进来了。。。");
        if(2>1)return true;//fixme
        String token = request.getHeader("Authorization");
        System.out.println("进来了。。。token==\n"+token);
        if (token == null || !token.startsWith(tokenPrefix+" ")) {
            response.setStatus(HttpStatus.UNAUTHORIZED.value());
            System.out.println("进来了eee1111。。。");
            return false;
        }
        String tokenNoPrefix = token.substring(7);
        System.out.println("进来了。。。token.substring(7)==\n"+tokenNoPrefix);
        String subject = JWT.decode(tokenNoPrefix).getSubject();
        System.out.println("进来了。。。subject="+subject);
        String cachedToken = redisTemplate.opsForValue().get(subject);
        System.out.println("进来了。。。cachedToken="+cachedToken);
        if (!token.equals(cachedToken)) {
            response.setStatus(HttpStatus.UNAUTHORIZED.value());
            System.out.println("进来了eee222。。。");
            return false;
        }
        Algorithm algorithm = Algorithm.HMAC256(secret);
        JWT.require(algorithm).build().verify(tokenNoPrefix);
        System.out.println("进来了ok,,,222。。。");
        return true;
    }
}
