package com.ruoyi.project.weie.exam.service;

import java.util.List;
import com.ruoyi.project.weie.exam.domain.Exam;

/**
 * 问卷Service接口
 * 
 * @author ruoyi
 * @date 2022-11-23
 */
public interface IExamService 
{
    /**
     * 查询问卷
     * 
     * @param id 问卷主键
     * @return 问卷
     */
    public Exam selectExamById(Long id);

    /**
     * 查询问卷列表
     * 
     * @param exam 问卷
     * @return 问卷集合
     */
    public List<Exam> selectExamList(Exam exam);

    /**
     * 新增问卷
     * 
     * @param exam 问卷
     * @return 结果
     */
    public int insertExam(Exam exam);

    /**
     * 修改问卷
     * 
     * @param exam 问卷
     * @return 结果
     */
    public int updateExam(Exam exam);

    /**
     * 批量删除问卷
     * 
     * @param ids 需要删除的问卷主键集合
     * @return 结果
     */
    public int deleteExamByIds(String ids);

    /**
     * 删除问卷信息
     * 
     * @param id 问卷主键
     * @return 结果
     */
    public int deleteExamById(Long id);
}
