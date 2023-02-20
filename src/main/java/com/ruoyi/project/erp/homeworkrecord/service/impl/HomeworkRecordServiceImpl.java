package com.ruoyi.project.erp.homeworkrecord.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.project.erp.homeworkrecord.mapper.HomeworkRecordMapper;
import com.ruoyi.project.erp.homeworkrecord.domain.HomeworkRecord;
import com.ruoyi.project.erp.homeworkrecord.service.IHomeworkRecordService;
import com.ruoyi.common.utils.text.Convert;

/**
 * 作业计时Service业务层处理
 * 
 * @author ruoyi
 * @date 2023-02-20
 */
@Service
public class HomeworkRecordServiceImpl implements IHomeworkRecordService 
{
    @Autowired
    private HomeworkRecordMapper homeworkRecordMapper;

    /**
     * 查询作业计时
     * 
     * @param id 作业计时主键
     * @return 作业计时
     */
    @Override
    public HomeworkRecord selectHomeworkRecordById(Long id)
    {
        return homeworkRecordMapper.selectHomeworkRecordById(id);
    }

    /**
     * 查询作业计时列表
     * 
     * @param homeworkRecord 作业计时
     * @return 作业计时
     */
    @Override
    public List<HomeworkRecord> selectHomeworkRecordList(HomeworkRecord homeworkRecord)
    {
        return homeworkRecordMapper.selectHomeworkRecordList(homeworkRecord);
    }

    /**
     * 新增作业计时
     * 
     * @param homeworkRecord 作业计时
     * @return 结果
     */
    @Override
    public int insertHomeworkRecord(HomeworkRecord homeworkRecord)
    {
        homeworkRecord.setCreateTime(DateUtils.getNowDate());
        return homeworkRecordMapper.insertHomeworkRecord(homeworkRecord);
    }

    /**
     * 修改作业计时
     * 
     * @param homeworkRecord 作业计时
     * @return 结果
     */
    @Override
    public int updateHomeworkRecord(HomeworkRecord homeworkRecord)
    {
        homeworkRecord.setUpdateTime(DateUtils.getNowDate());
        return homeworkRecordMapper.updateHomeworkRecord(homeworkRecord);
    }

    /**
     * 批量删除作业计时
     * 
     * @param ids 需要删除的作业计时主键
     * @return 结果
     */
    @Override
    public int deleteHomeworkRecordByIds(String ids)
    {
        return homeworkRecordMapper.deleteHomeworkRecordByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除作业计时信息
     * 
     * @param id 作业计时主键
     * @return 结果
     */
    @Override
    public int deleteHomeworkRecordById(Long id)
    {
        return homeworkRecordMapper.deleteHomeworkRecordById(id);
    }
}
