package com.ruoyi.project.erp.order.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.framework.aspectj.lang.annotation.Excel;
import com.ruoyi.framework.web.domain.BaseEntity;

/**
 * 订单对象 t_order
 * 
 * @author ruoyi
 * @date 2023-02-11
 */
public class Order extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** id */
    private Long id;

    /** 订单编号 */
    @Excel(name = "订单编号")
    private String code;

    /** 客户id */
    @Excel(name = "客户id")
    private Long customerId;

    /** 订单状态 */
    @Excel(name = "订单状态")
    private String status;

    /** 类型 */
    @Excel(name = "类型")
    private String type;

    /** 数量 */
    @Excel(name = "数量")
    private Long quantity;

    /** 金额 */
    @Excel(name = "金额")
    private Long money;

    /** 优惠金额 */
    @Excel(name = "优惠金额")
    private Long discountsMoney;

    /** 下单时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "下单时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date orderTime;

    /** 客户指定配送时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "客户指定配送时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date targetTime;

    /** 商家预计配送时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "商家预计配送时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date planSendTime;

    /** 订单名称 */
    @Excel(name = "订单名称")
    private String title;

    /** 付款状态 */
    @Excel(name = "付款状态")
    private String payStatus;

    /** 付款金额 */
    @Excel(name = "付款金额")
    private Long payMoney;

    /** 付款时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "付款时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date payTime;

    /** 配送状态 */
    @Excel(name = "配送状态")
    private String sendStatus;

    /** 创建人 */
    @Excel(name = "创建人")
    private Long sendUser;

    /** 配送时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "配送时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date sendTime;

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

    /** 结单人 */
    @Excel(name = "结单人")
    private Long endUser;

    /** 结单时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "结单时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date endTime;

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
    public void setCode(String code)
    {
        this.code = code;
    }

    public String getCode()
    {
        return code;
    }
    public void setCustomerId(Long customerId)
    {
        this.customerId = customerId;
    }

    public Long getCustomerId()
    {
        return customerId;
    }
    public void setStatus(String status)
    {
        this.status = status;
    }

    public String getStatus()
    {
        return status;
    }
    public void setType(String type)
    {
        this.type = type;
    }

    public String getType()
    {
        return type;
    }
    public void setQuantity(Long quantity)
    {
        this.quantity = quantity;
    }

    public Long getQuantity()
    {
        return quantity;
    }
    public void setMoney(Long money)
    {
        this.money = money;
    }

    public Long getMoney()
    {
        return money;
    }
    public void setDiscountsMoney(Long discountsMoney)
    {
        this.discountsMoney = discountsMoney;
    }

    public Long getDiscountsMoney()
    {
        return discountsMoney;
    }
    public void setOrderTime(Date orderTime)
    {
        this.orderTime = orderTime;
    }

    public Date getOrderTime()
    {
        return orderTime;
    }
    public void setTargetTime(Date targetTime)
    {
        this.targetTime = targetTime;
    }

    public Date getTargetTime()
    {
        return targetTime;
    }
    public void setPlanSendTime(Date planSendTime)
    {
        this.planSendTime = planSendTime;
    }

    public Date getPlanSendTime()
    {
        return planSendTime;
    }
    public void setTitle(String title)
    {
        this.title = title;
    }

    public String getTitle()
    {
        return title;
    }
    public void setPayStatus(String payStatus)
    {
        this.payStatus = payStatus;
    }

    public String getPayStatus()
    {
        return payStatus;
    }
    public void setPayMoney(Long payMoney)
    {
        this.payMoney = payMoney;
    }

    public Long getPayMoney()
    {
        return payMoney;
    }
    public void setPayTime(Date payTime)
    {
        this.payTime = payTime;
    }

    public Date getPayTime()
    {
        return payTime;
    }
    public void setSendStatus(String sendStatus)
    {
        this.sendStatus = sendStatus;
    }

    public String getSendStatus()
    {
        return sendStatus;
    }
    public void setSendUser(Long sendUser)
    {
        this.sendUser = sendUser;
    }

    public Long getSendUser()
    {
        return sendUser;
    }
    public void setSendTime(Date sendTime)
    {
        this.sendTime = sendTime;
    }

    public Date getSendTime()
    {
        return sendTime;
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
    public void setEndUser(Long endUser)
    {
        this.endUser = endUser;
    }

    public Long getEndUser()
    {
        return endUser;
    }
    public void setEndTime(Date endTime)
    {
        this.endTime = endTime;
    }

    public Date getEndTime()
    {
        return endTime;
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
            .append("code", getCode())
            .append("customerId", getCustomerId())
            .append("status", getStatus())
            .append("type", getType())
            .append("quantity", getQuantity())
            .append("money", getMoney())
            .append("discountsMoney", getDiscountsMoney())
            .append("orderTime", getOrderTime())
            .append("targetTime", getTargetTime())
            .append("planSendTime", getPlanSendTime())
            .append("title", getTitle())
            .append("payStatus", getPayStatus())
            .append("payMoney", getPayMoney())
            .append("payTime", getPayTime())
            .append("sendStatus", getSendStatus())
            .append("sendUser", getSendUser())
            .append("sendTime", getSendTime())
            .append("province", getProvince())
            .append("city", getCity())
            .append("district", getDistrict())
            .append("village", getVillage())
            .append("tag", getTag())
            .append("address", getAddress())
            .append("addressAll", getAddressAll())
            .append("endUser", getEndUser())
            .append("endTime", getEndTime())
            .append("createUser", getCreateUser())
            .append("createTime", getCreateTime())
            .append("updateUser", getUpdateUser())
            .append("updateTime", getUpdateTime())
            .append("remark", getRemark())
            .toString();
    }
}
