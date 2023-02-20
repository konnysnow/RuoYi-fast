package com.ruoyi.project.erp.customer.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.framework.aspectj.lang.annotation.Excel;
import com.ruoyi.framework.web.domain.BaseEntity;

/**
 * 客户对象 t_customer
 * 
 * @author ruoyi
 * @date 2023-02-11
 */
public class Customer extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** id */
    private Long id;

    /** 名称 */
    @Excel(name = "名称")
    private String name;

    /** 编号 */
    @Excel(name = "编号")
    private String code;

    /** 手机号 */
    @Excel(name = "手机号")
    private String mobile;

    /** 手机号2 */
    @Excel(name = "手机号2")
    private String mobile2;

    /** 类型 */
    @Excel(name = "类型")
    private String type;

    /** 微信名 */
    @Excel(name = "微信名")
    private String weixinName;

    /** 小程序openid */
    @Excel(name = "小程序openid")
    private String miniOpenid;

    /** 小程序unionid */
    @Excel(name = "小程序unionid")
    private String miniUnionid;

    /** 主图 */
    @Excel(name = "主图")
    private String picMain;

    /** 主图缩略图 */
    @Excel(name = "主图缩略图")
    private String picMainS;

    /** 省 */
    @Excel(name = "省")
    private String province;

    /** 市 */
    @Excel(name = "市")
    private String city;

    /** 区县 */
    @Excel(name = "区县")
    private String district;

    /** 村 */
    @Excel(name = "村")
    private String village;

    /** 标签 */
    @Excel(name = "标签")
    private String tag;

    /** 街道门牌 */
    @Excel(name = "街道门牌")
    private String address;

    /** 完整地址 */
    @Excel(name = "完整地址")
    private String addressAll;

    /** 车牌 */
    @Excel(name = "车牌")
    private String carCode;

    /** 创建人 */
    @Excel(name = "创建人")
    private Long createUser;

    /** 更新人 */
    @Excel(name = "更新人")
    private Long updateUser;

    public void setId(Long id)
    {
        this.id = id;
    }

    public Long getId()
    {
        return id;
    }
    public void setName(String name)
    {
        this.name = name;
    }

    public String getName()
    {
        return name;
    }
    public void setCode(String code)
    {
        this.code = code;
    }

    public String getCode()
    {
        return code;
    }
    public void setMobile(String mobile)
    {
        this.mobile = mobile;
    }

    public String getMobile()
    {
        return mobile;
    }
    public void setMobile2(String mobile2)
    {
        this.mobile2 = mobile2;
    }

    public String getMobile2()
    {
        return mobile2;
    }
    public void setType(String type)
    {
        this.type = type;
    }

    public String getType()
    {
        return type;
    }
    public void setWeixinName(String weixinName)
    {
        this.weixinName = weixinName;
    }

    public String getWeixinName()
    {
        return weixinName;
    }
    public void setMiniOpenid(String miniOpenid)
    {
        this.miniOpenid = miniOpenid;
    }

    public String getMiniOpenid()
    {
        return miniOpenid;
    }
    public void setMiniUnionid(String miniUnionid)
    {
        this.miniUnionid = miniUnionid;
    }

    public String getMiniUnionid()
    {
        return miniUnionid;
    }
    public void setPicMain(String picMain)
    {
        this.picMain = picMain;
    }

    public String getPicMain()
    {
        return picMain;
    }
    public void setPicMainS(String picMainS)
    {
        this.picMainS = picMainS;
    }

    public String getPicMainS()
    {
        return picMainS;
    }
    public void setProvince(String province)
    {
        this.province = province;
    }

    public String getProvince()
    {
        return province;
    }
    public void setCity(String city)
    {
        this.city = city;
    }

    public String getCity()
    {
        return city;
    }
    public void setDistrict(String district)
    {
        this.district = district;
    }

    public String getDistrict()
    {
        return district;
    }
    public void setVillage(String village)
    {
        this.village = village;
    }

    public String getVillage()
    {
        return village;
    }
    public void setTag(String tag)
    {
        this.tag = tag;
    }

    public String getTag()
    {
        return tag;
    }
    public void setAddress(String address)
    {
        this.address = address;
    }

    public String getAddress()
    {
        return address;
    }
    public void setAddressAll(String addressAll)
    {
        this.addressAll = addressAll;
    }

    public String getAddressAll()
    {
        return addressAll;
    }
    public void setCarCode(String carCode)
    {
        this.carCode = carCode;
    }

    public String getCarCode()
    {
        return carCode;
    }
    public void setCreateUser(Long createUser)
    {
        this.createUser = createUser;
    }

    public Long getCreateUser()
    {
        return createUser;
    }
    public void setUpdateUser(Long updateUser)
    {
        this.updateUser = updateUser;
    }

    public Long getUpdateUser()
    {
        return updateUser;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("name", getName())
            .append("code", getCode())
            .append("mobile", getMobile())
            .append("mobile2", getMobile2())
            .append("type", getType())
            .append("weixinName", getWeixinName())
            .append("miniOpenid", getMiniOpenid())
            .append("miniUnionid", getMiniUnionid())
            .append("picMain", getPicMain())
            .append("picMainS", getPicMainS())
            .append("province", getProvince())
            .append("city", getCity())
            .append("district", getDistrict())
            .append("village", getVillage())
            .append("tag", getTag())
            .append("address", getAddress())
            .append("addressAll", getAddressAll())
            .append("carCode", getCarCode())
            .append("createUser", getCreateUser())
            .append("createTime", getCreateTime())
            .append("updateUser", getUpdateUser())
            .append("updateTime", getUpdateTime())
            .append("remark", getRemark())
            .toString();
    }
}
