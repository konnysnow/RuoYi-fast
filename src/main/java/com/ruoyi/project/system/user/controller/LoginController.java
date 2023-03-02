package com.ruoyi.project.system.user.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.auth0.jwt.JWT;
import com.ruoyi.project.erp.utils.JwtUtils;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.ruoyi.common.utils.ServletUtils;
import com.ruoyi.common.utils.StringUtils;
import com.ruoyi.common.utils.text.Convert;
import com.ruoyi.framework.web.controller.BaseController;
import com.ruoyi.framework.web.domain.AjaxResult;
import com.ruoyi.framework.web.service.ConfigService;

/**
 * 登录验证
 * 
 * @author ruoyi
 */
@Controller
public class LoginController extends BaseController
{
    /**
     * 是否开启记住我功能
     */
    @Value("${shiro.rememberMe.enabled: false}")
    private boolean rememberMe;

    @Autowired
    private ConfigService configService;
    @Autowired
    private RedisTemplate<String, String> redisTemplate;
    @Autowired
    private JwtUtils jwtUtils;
    @Value("${jwt.token_prefix}")
    private String tokenPrefix;//Bearer

    @GetMapping("/login")//get进入登陆页面
    public String login(HttpServletRequest request, HttpServletResponse response, ModelMap mmap)
    {
        // 如果是Ajax请求，返回Json字符串。
        if (ServletUtils.isAjaxRequest(request))
        {
            return ServletUtils.renderString(response, "{\"code\":\"1\",\"msg\":\"未登录或登录超时。请重新登录\"}");
        }
        // 是否开启记住我
        mmap.put("isRemembered", rememberMe);
        // 是否开启用户注册
        mmap.put("isAllowRegister", Convert.toBool(configService.getKey("sys.account.registerUser"), false));
        return "login";
    }

    @PostMapping("/login")//post登陆请求
    @ResponseBody
    public AjaxResult ajaxLogin(String username, String password, Boolean rememberMe)
    {
        UsernamePasswordToken token = new UsernamePasswordToken(username, password, rememberMe);
        Subject subject = SecurityUtils.getSubject();
        try
        {
            subject.login(token);//登陆方法
            String jwtToken = tokenPrefix+" "+jwtUtils.generateToken(username);
            System.out.println("生产的jwtToken=="+jwtToken);
//            jwtToken = jwtToken.substring(7);
            redisTemplate.opsForValue().set(username,jwtToken);
//            System.out.println("存入redis成功。。。");
//            System.out.println("进来了。。。token.substring(7)==\n"+token);
//            String subject = JWT.decode(token).getSubject();
//            System.out.println("进来了。。。subject="+subject);
//            String cachedToken = redisTemplate.opsForValue().get(subject);
//            System.out.println("进来了。。。cachedToken="+cachedToken);
//            if (!token.equals(cachedToken)) {
//
//            }
            return success(jwtToken);
        }
        catch (AuthenticationException e)
        {
            String msg = "用户或密码错误";
            if (StringUtils.isNotEmpty(e.getMessage()))
            {
                msg = e.getMessage();
            }
            return error(msg);
        }
    }

    @GetMapping("/unauth")
    public String unauth()
    {
        return "error/unauth";
    }
}
