package com.ruoyi.project.weixin;
import cn.binarywang.wx.miniapp.api.WxMaService;
import cn.binarywang.wx.miniapp.bean.WxMaJscode2SessionResult;
import com.ruoyi.framework.web.controller.BaseController;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import lombok.RequiredArgsConstructor;
import lombok.SneakyThrows;
import me.chanjar.weixin.common.error.WxErrorException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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

    @ApiOperation("微信登陆")
    @GetMapping(value = "/getWxInfo", produces = "application/json")
    @SneakyThrows(WxErrorException.class)
    public WxMaJscode2SessionResult getWxInfo(@ApiParam("小程序CODE") String code){
        WxMaJscode2SessionResult wx = wxService.jsCode2SessionInfo(code);
        logger.info("请求微信授权完成=>{}",wx);

        //1。redis存储openid和session_key（后续微信请求使用）


        //2。检查是否需要新建customer
        String openid = wx.getOpenid();
        String unionid= wx.getUnionid();
        String sessionKey=wx.getSessionKey();

        //3.生成jwt,用于登录校验


        return wx;
    }
}