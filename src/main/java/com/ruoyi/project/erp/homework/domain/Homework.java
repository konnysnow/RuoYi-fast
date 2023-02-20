package com.ruoyi.project.erp.homework.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.framework.aspectj.lang.annotation.Excel;
import com.ruoyi.framework.web.domain.BaseEntity;

/**
 * 作业对象 t_homework
 * 
 * @author ruoyi
 * @date 2023-02-20
 */
public class Homework extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** id */
    private Long id;

    /** 作业名 */
    @Excel(name = "作业名")
    private String name;

    /** 负责人 */
    @Excel(name = "负责人")
    private String worker;

    /** 审核人 */
    @Excel(name = "审核人")
    private String auditor;

    /** 课程 */
    @Excel(name = "课程")
    private String className;

    /** 类型 */
    @Excel(name = "类型")
    private String type;

    /** 周期 */
    @Excel(name = "周期")
    private String freq;

    /** 周期时间 */
    @Excel(name = "周期时间")
    private String freqStr;

    /** 计划时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "计划时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date planDate;

    /** 计划用时 */
    @Excel(name = "计划用时")
    private Long planTime;

    /** 顺序 */
    @Excel(name = "顺序")
    private String displayOrder;

    /** 优先级 */
    @Excel(name = "优先级")
    private String priority;

    /** 提醒 */
    @Excel(name = "提醒")
    private String alert;

    /** 提醒时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "提醒时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date alertDate;

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
    public void setWorker(String worker)
    {
        this.worker = worker;
    }

    public String getWorker()
    {
        return worker;
    }
    public void setAuditor(String auditor)
    {
        this.auditor = auditor;
    }

    public String getAuditor()
    {
        return auditor;
    }
    public void setClassName(String className)
    {
        this.className = className;
    }

    public String getClassName()
    {
        return className;
    }
    public void setType(String type)
    {
        this.type = type;
    }

    public String getType()
    {
        return type;
    }
    public void setFreq(String freq)
    {
        this.freq = freq;
    }

    public String getFreq()
    {
        return freq;
    }
    public void setFreqStr(String freqStr)
    {
        this.freqStr = freqStr;
    }

    public String getFreqStr()
    {
        return freqStr;
    }
    public void setPlanDate(Date planDate)
    {
        this.planDate = planDate;
    }

    public Date getPlanDate()
    {
        return planDate;
    }
    public void setPlanTime(Long planTime)
    {
        this.planTime = planTime;
    }

    public Long getPlanTime()
    {
        return planTime;
    }
    public void setDisplayOrder(String displayOrder)
    {
        this.displayOrder = displayOrder;
    }

    public String getDisplayOrder()
    {
        return displayOrder;
    }
    public void setPriority(String priority)
    {
        this.priority = priority;
    }

    public String getPriority()
    {
        return priority;
    }
    public void setAlert(String alert)
    {
        this.alert = alert;
    }

    public String getAlert()
    {
        return alert;
    }
    public void setAlertDate(Date alertDate)
    {
        this.alertDate = alertDate;
    }

    public Date getAlertDate()
    {
        return alertDate;
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
            .append("worker", getWorker())
            .append("auditor", getAuditor())
            .append("className", getClassName())
            .append("type", getType())
            .append("freq", getFreq())
            .append("freqStr", getFreqStr())
            .append("planDate", getPlanDate())
            .append("planTime", getPlanTime())
            .append("displayOrder", getDisplayOrder())
            .append("priority", getPriority())
            .append("alert", getAlert())
            .append("alertDate", getAlertDate())
            .append("createUser", getCreateUser())
            .append("createTime", getCreateTime())
            .append("updateUser", getUpdateUser())
            .append("updateTime", getUpdateTime())
            .append("remark", getRemark())
            .toString();
    }
}
