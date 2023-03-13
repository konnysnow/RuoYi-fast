package com.ruoyi.project.weixin;

import lombok.Data;
//import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
//import org.springframework.stereotype.Component;


@Data
@ConfigurationProperties(prefix = "wx.miniapp")
//@Component
public class WxMaProperties {
    /**
     * 设置微信小程序的appid
     */
//    @Value("${wx.miniapp.appid}")
    private String appid;

    /**
     * 设置微信小程序的Secret
     */
//    @Value("${wx.miniapp.secret}")
    private String secret;

    /**
     * 消息格式，XML或者JSON
     */
//    @Value("${wx.miniapp.msgDataFormat}")
    private String msgDataFormat;
}