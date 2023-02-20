package com.ruoyi.project.erp.homework.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.project.erp.homework.mapper.HomeworkMapper;
import com.ruoyi.project.erp.homework.domain.Homework;
import com.ruoyi.project.erp.homework.service.IHomeworkService;
import com.ruoyi.common.utils.text.Convert;

/**
 * 作业Service业务层处理
 * 
 * @author ruoyi
 * @date 2023-02-20
 */
@Service
public class HomeworkServiceImpl implements IHomeworkService 
{
    @Autowired
    private HomeworkMapper homeworkMapper;

    /**
     * 查询作业
     * 
     * @param id 作业主键
     * @return 作业
     */
    @Override
    public Homework selectHomeworkById(Long id)
    {
        return homeworkMapper.selectHomeworkById(id);
    }

    /**
     * 查询作业列表
     * 
     * @param homework 作业
     * @return 作业
     */
    @Override
    public List<Homework> selectHomeworkList(Homework homework)
    {
        return homeworkMapper.selectHomeworkList(homework);
    }

    /**
     * 新增作业
     * 
     * @param homework 作业
     * @return 结果
     */
    @Override
    public int insertHomework(Homework homework)
    {
        homework.setCreateTime(DateUtils.getNowDate());
        return homeworkMapper.insertHomework(homework);
    }

    /**
     * 修改作业
     * 
     * @param homework 作业
     * @return 结果
     */
    @Override
    public int updateHomework(Homework homework)
    {
        homework.setUpdateTime(DateUtils.getNowDate());
        return homeworkMapper.updateHomework(homework);
    }

    /**
     * 批量删除作业
     * 
     * @param ids 需要删除的作业主键
     * @return 结果
     */
    @Override
    public int deleteHomeworkByIds(String ids)
    {
        return homeworkMapper.deleteHomeworkByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除作业信息
     * 
     * @param id 作业主键
     * @return 结果
     */
    @Override
    public int deleteHomeworkById(Long id)
    {
        return homeworkMapper.deleteHomeworkById(id);
    }
}
