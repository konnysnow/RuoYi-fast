package com.ruoyi.project.weie.exam.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.project.weie.exam.mapper.ExamMapper;
import com.ruoyi.project.weie.exam.domain.Exam;
import com.ruoyi.project.weie.exam.service.IExamService;
import com.ruoyi.common.utils.text.Convert;

/**
 * 问卷Service业务层处理
 * 
 * @author ruoyi
 * @date 2022-11-23
 */
@Service
public class ExamServiceImpl implements IExamService 
{
    @Autowired
    private ExamMapper examMapper;

    /**
     * 查询问卷
     * 
     * @param id 问卷主键
     * @return 问卷
     */
    @Override
    public Exam selectExamById(Long id)
    {
        return examMapper.selectExamById(id);
    }

    /**
     * 查询问卷列表
     * 
     * @param exam 问卷
     * @return 问卷
     */
    @Override
    public List<Exam> selectExamList(Exam exam)
    {
        return examMapper.selectExamList(exam);
    }

    /**
     * 新增问卷
     * 
     * @param exam 问卷
     * @return 结果
     */
    @Override
    public int insertExam(Exam exam)
    {
        exam.setCreateTime(DateUtils.getNowDate());
        return examMapper.insertExam(exam);
    }

    /**
     * 修改问卷
     * 
     * @param exam 问卷
     * @return 结果
     */
    @Override
    public int updateExam(Exam exam)
    {
        exam.setUpdateTime(DateUtils.getNowDate());
        return examMapper.updateExam(exam);
    }

    /**
     * 批量删除问卷
     * 
     * @param ids 需要删除的问卷主键
     * @return 结果
     */
    @Override
    public int deleteExamByIds(String ids)
    {
        return examMapper.deleteExamByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除问卷信息
     * 
     * @param id 问卷主键
     * @return 结果
     */
    @Override
    public int deleteExamById(Long id)
    {
        return examMapper.deleteExamById(id);
    }
}
