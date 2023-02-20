package com.ruoyi.project.erp.homework.mapper;

import java.util.List;
import com.ruoyi.project.erp.homework.domain.Homework;

/**
 * 作业Mapper接口
 * 
 * @author ruoyi
 * @date 2023-02-20
 */
public interface HomeworkMapper 
{
    /**
     * 查询作业
     * 
     * @param id 作业主键
     * @return 作业
     */
    public Homework selectHomeworkById(Long id);

    /**
     * 查询作业列表
     * 
     * @param homework 作业
     * @return 作业集合
     */
    public List<Homework> selectHomeworkList(Homework homework);

    /**
     * 新增作业
     * 
     * @param homework 作业
     * @return 结果
     */
    public int insertHomework(Homework homework);

    /**
     * 修改作业
     * 
     * @param homework 作业
     * @return 结果
     */
    public int updateHomework(Homework homework);

    /**
     * 删除作业
     * 
     * @param id 作业主键
     * @return 结果
     */
    public int deleteHomeworkById(Long id);

    /**
     * 批量删除作业
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteHomeworkByIds(String[] ids);
}
