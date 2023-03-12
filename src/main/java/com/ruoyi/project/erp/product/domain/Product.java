package com.ruoyi.project.erp.product.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.framework.aspectj.lang.annotation.Excel;
import com.ruoyi.framework.web.domain.BaseEntity;

/**
 * 产品对象 t_product
 * 
 * @author konny
 * @date 2023-02-11
 */
public class Product extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** id */
    private Long id;

    /** 名称 */
    @Excel(name = "名称")
    private String name;

    /** 二维码 */
    @Excel(name = "二维码")
    private String barcode;

    /** 货号 */
    @Excel(name = "货号")
    private String goodsCode;

    /** 英文名 */
    @Excel(name = "英文名")
    private String enName;

    /** 拼音缩写 */
    @Excel(name = "拼音缩写")
    private String pinyinName;

    /** 类型 */
    @Excel(name = "类型")
    private String type;

    /** 分类1 */
    @Excel(name = "分类1")
    private String category1;

    /** 分类2 */
    @Excel(name = "分类2")
    private String category2;

    /** 售价 */
    @Excel(name = "售价")
    private Double price;

    /** 原价 */
    @Excel(name = "原价")
    private Double oriPrice;

    /** 成本价 */
    @Excel(name = "成本价")
    private Double costPrice;

    /** 白银会员价 */
    @Excel(name = "白银会员价")
    private Double memPrice1;

    /** 黄金会员价 */
    @Excel(name = "黄金会员价")
    private Double memPrice2;

    /** 钻石会员价 */
    @Excel(name = "钻石会员价")
    private Double memPrice3;

    /** 主图 */
    @Excel(name = "主图")
    private String picMain;

    /** 主图缩略图 */
    @Excel(name = "主图缩略图")
    private String picMainS;

    /** 单位 */
    @Excel(name = "单位")
    private String unit;

    /** 标题 */
    @Excel(name = "标题")
    private String title;

    /** 重量 */
    @Excel(name = "重量")
    private String weight;

    /** 供应商 */
    @Excel(name = "供应商")
    private String supplier;

    /** 产地 */
    @Excel(name = "产地")
    private String productArea;

    /** 标签 */
    @Excel(name = "标签")
    private String tag;

    /** 描述 */
    @Excel(name = "描述")
    private String description;

    /** 库存数量 */
    @Excel(name = "库存数量")
    private Long stockQuantity;

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
    public void setBarcode(String barcode)
    {
        this.barcode = barcode;
    }

    public String getBarcode()
    {
        return barcode;
    }
    public void setGoodsCode(String goodsCode)
    {
        this.goodsCode = goodsCode;
    }

    public String getGoodsCode()
    {
        return goodsCode;
    }
    public void setEnName(String enName)
    {
        this.enName = enName;
    }

    public String getEnName()
    {
        return enName;
    }
    public void setPinyinName(String pinyinName)
    {
        this.pinyinName = pinyinName;
    }

    public String getPinyinName()
    {
        return pinyinName;
    }
    public void setType(String type)
    {
        this.type = type;
    }

    public String getType()
    {
        return type;
    }
    public void setCategory1(String category1)
    {
        this.category1 = category1;
    }

    public String getCategory1()
    {
        return category1;
    }
    public void setCategory2(String category2)
    {
        this.category2 = category2;
    }

    public String getCategory2()
    {
        return category2;
    }
    public void setPrice(Double price)
    {
        this.price = price;
    }

    public Double getPrice()
    {
        return price;
    }
    public void setOriPrice(Double oriPrice)
    {
        this.oriPrice = oriPrice;
    }

    public Double getOriPrice()
    {
        return oriPrice;
    }
    public void setCostPrice(Double costPrice)
    {
        this.costPrice = costPrice;
    }

    public Double getCostPrice()
    {
        return costPrice;
    }
    public void setMemPrice1(Double memPrice1)
    {
        this.memPrice1 = memPrice1;
    }

    public Double getMemPrice1()
    {
        return memPrice1;
    }
    public void setMemPrice2(Double memPrice2)
    {
        this.memPrice2 = memPrice2;
    }

    public Double getMemPrice2()
    {
        return memPrice2;
    }
    public void setMemPrice3(Double memPrice3)
    {
        this.memPrice3 = memPrice3;
    }

    public Double getMemPrice3()
    {
        return memPrice3;
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
    public void setUnit(String unit)
    {
        this.unit = unit;
    }

    public String getUnit()
    {
        return unit;
    }
    public void setTitle(String title)
    {
        this.title = title;
    }

    public String getTitle()
    {
        return title;
    }
    public void setWeight(String weight)
    {
        this.weight = weight;
    }

    public String getWeight()
    {
        return weight;
    }
    public void setSupplier(String supplier)
    {
        this.supplier = supplier;
    }

    public String getSupplier()
    {
        return supplier;
    }
    public void setProductArea(String productArea)
    {
        this.productArea = productArea;
    }

    public String getProductArea()
    {
        return productArea;
    }
    public void setTag(String tag)
    {
        this.tag = tag;
    }

    public String getTag()
    {
        return tag;
    }
    public void setDescription(String description)
    {
        this.description = description;
    }

    public String getDescription()
    {
        return description;
    }
    public void setStockQuantity(Long stockQuantity)
    {
        this.stockQuantity = stockQuantity;
    }

    public Long getStockQuantity()
    {
        return stockQuantity;
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
            .append("barcode", getBarcode())
            .append("goodsCode", getGoodsCode())
            .append("enName", getEnName())
            .append("pinyinName", getPinyinName())
            .append("type", getType())
            .append("category1", getCategory1())
            .append("category2", getCategory2())
            .append("price", getPrice())
            .append("oriPrice", getOriPrice())
            .append("costPrice", getCostPrice())
            .append("memPrice1", getMemPrice1())
            .append("memPrice2", getMemPrice2())
            .append("memPrice3", getMemPrice3())
            .append("picMain", getPicMain())
            .append("picMainS", getPicMainS())
            .append("unit", getUnit())
            .append("title", getTitle())
            .append("weight", getWeight())
            .append("supplier", getSupplier())
            .append("productArea", getProductArea())
            .append("tag", getTag())
            .append("description", getDescription())
            .append("stockQuantity", getStockQuantity())
            .append("createUser", getCreateUser())
            .append("createTime", getCreateTime())
            .append("updateUser", getUpdateUser())
            .append("updateTime", getUpdateTime())
            .append("remark", getRemark())
            .toString();
    }
}
