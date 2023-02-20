package com.ruoyi.project.erp.homeworkrecord.mapper;

import java.util.List;
import com.ruoyi.project.erp.homeworkrecord.domain.HomeworkRecord;

/**
 * 作业计时Mapper接口
 * 
 * @author ruoyi
 * @date 2023-02-20
 */
public interface HomeworkRecordMapper 
{
    /**
     * 查询作业计时
     * 
     * @param id 作业计时主键
     * @return 作业计时
     */
    public HomeworkRecord selectHomeworkRecordById(Long id);

    /**
     * 查询作业计时列表
     * 
     * @param homeworkRecord 作业计时
     * @return 作业计时集合
     */
    public List<HomeworkRecord> selectHomeworkRecordList(HomeworkRecord homeworkRecord);

    /**
     * 新增作业计时
     * 
     * @param homeworkRecord 作业计时
     * @return 结果
     */
    public int insertHomeworkRecord(HomeworkRecord homeworkRecord);

    /**
     * 修改作业计时
     * 
     * @param homeworkRecord 作业计时
     * @return 结果
     */
    public int updateHomeworkRecord(HomeworkRecord homeworkRecord);

    /**
     * 删除作业计时
     * 
     * @param id 作业计时主键
     * @return 结果
     */
    public int deleteHomeworkRecordById(Long id);

    /**
     * 批量删除作业计时
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteHomeworkRecordByIds(String[] ids);
}
