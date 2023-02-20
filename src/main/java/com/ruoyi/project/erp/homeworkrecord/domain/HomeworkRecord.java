package com.ruoyi.project.erp.homeworkrecord.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.framework.aspectj.lang.annotation.Excel;
import com.ruoyi.framework.web.domain.BaseEntity;

/**
 * 作业计时对象 t_homework_record
 * 
 * @author ruoyi
 * @date 2023-02-20
 */
public class HomeworkRecord extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** id */
    private Long id;

    /** 作业id */
    @Excel(name = "作业id")
    private Long homeworkId;

    /** 负责人 */
    @Excel(name = "负责人")
    private String worker;

    /** 审核人 */
    @Excel(name = "审核人")
    private String auditor;

    /** 结果 */
    @Excel(name = "结果")
    private String result;

    /** 重点 */
    @Excel(name = "重点")
    private String keyContent;

    /** 开始时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "开始时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date beginDate;

    /** 完成时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "完成时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date endDate;

    /** 用时 */
    @Excel(name = "用时")
    private Long useTime;

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
    public void setHomeworkId(Long homeworkId)
    {
        this.homeworkId = homeworkId;
    }

    public Long getHomeworkId()
    {
        return homeworkId;
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
    public void setResult(String result)
    {
        this.result = result;
    }

    public String getResult()
    {
        return result;
    }
    public void setKeyContent(String keyContent)
    {
        this.keyContent = keyContent;
    }

    public String getKeyContent()
    {
        return keyContent;
    }
    public void setBeginDate(Date beginDate)
    {
        this.beginDate = beginDate;
    }

    public Date getBeginDate()
    {
        return beginDate;
    }
    public void setEndDate(Date endDate)
    {
        this.endDate = endDate;
    }

    public Date getEndDate()
    {
        return endDate;
    }
    public void setUseTime(Long useTime)
    {
        this.useTime = useTime;
    }

    public Long getUseTime()
    {
        return useTime;
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
            .append("homeworkId", getHomeworkId())
            .append("worker", getWorker())
            .append("auditor", getAuditor())
            .append("result", getResult())
            .append("keyContent", getKeyContent())
            .append("beginDate", getBeginDate())
            .append("endDate", getEndDate())
            .append("useTime", getUseTime())
            .append("createUser", getCreateUser())
            .append("createTime", getCreateTime())
            .append("updateUser", getUpdateUser())
            .append("updateTime", getUpdateTime())
            .append("remark", getRemark())
            .toString();
    }
}
