package com.ruoyi.project.weixin;
import cn.binarywang.wx.miniapp.api.WxMaService;
import cn.binarywang.wx.miniapp.bean.WxMaJscode2SessionResult;
import com.alibaba.fastjson.JSONObject;
import com.ruoyi.framework.web.controller.BaseController;
import com.ruoyi.project.erp.customer.domain.Customer;
import com.ruoyi.project.erp.customer.service.ICustomerService;
import com.ruoyi.project.erp.utils.JwtUtils;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import lombok.RequiredArgsConstructor;
import lombok.SneakyThrows;
import me.chanjar.weixin.common.error.WxErrorException;
import org.checkerframework.checker.units.qual.C;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.*;

/*
code2Session接口定义
https://developers.weixin.qq.com/miniprogram/dev/OpenApiDoc/user-login/code2Session.html
java客户端组件【weixin-java-miniapp】，使用方法
https://blog.csdn.net/weixin_44488397/article/details/126442301
 */
@Api(tags = "微信模块")
@RestController
@RequestMapping("/wx/auth")
@RequiredArgsConstructor
public class WxController extends BaseController {
    private final WxMaService wxService;
    @Autowired
    private ICustomerService customerService;
    @Autowired
    private RedisTemplate<String, String> redisTemplate;
    @Autowired
    private JwtUtils jwtUtils;
    @Value("${jwt.token_prefix}")
    private String tokenPrefix;//Bearer

    @ApiOperation("微信登陆")
    @PostMapping(value = "/getWxInfo", produces = "application/json")
    @SneakyThrows(WxErrorException.class)
    public JSONObject getWxInfo(@RequestBody JSONObject paramJson){
        String code = paramJson.getString("code");
        String nickname = paramJson.getString("nickname");
        String picurl = paramJson.getString("picurl");

        WxMaJscode2SessionResult wx = wxService.jsCode2SessionInfo(code);
        logger.info("请求微信授权完成=>{}",wx);
        System.out.println("111请求微信授权完成，，，===="+wx.toString());

        String openid = wx.getOpenid();
        String unionid= wx.getUnionid();
        String sessionKey=wx.getSessionKey();

        //1。redis存储openid和session_key（后续微信请求使用）
        redisTemplate.opsForValue().set(openid+"_sessionkey",sessionKey);//redis存储sessionkey

        //2。检查，新建/修改customer
        Customer customer = customerService.checkWeixinCustomer(openid);
        System.out.println("222微信客户id，是否创建，，，===="+customer.getId());
        //3.查询微信用户名，头像
        customer.setMiniUnionid(unionid);
        customer.setWeixinName(nickname);
        customer.setPicMain(picurl);
        int x = customerService.updateCustomer(customer);
        System.out.println("333更新客户结果x====="+x);

        //3.生成jwt,用于登录校验//TODO
        String jwtToken = tokenPrefix+" "+jwtUtils.generateToken(openid);
        System.out.println("444微信登录后，生产的jwtToken=="+jwtToken);
//            jwtToken = jwtToken.substring(7);
        redisTemplate.opsForValue().set(openid,jwtToken);//redis存储token

        JSONObject json =new JSONObject();
        json.put("openid",openid);
        json.put("unionid",unionid);
        json.put("jwtToken",jwtToken);
        return json;
    }
}