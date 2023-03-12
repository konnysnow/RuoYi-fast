package com.ruoyi.project.erp.note.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.project.erp.note.mapper.NoteMapper;
import com.ruoyi.project.erp.note.domain.Note;
import com.ruoyi.project.erp.note.service.INoteService;
import com.ruoyi.common.utils.text.Convert;

/**
 * 笔记Service业务层处理
 * 
 * @author ruoyi
 * @date 2023-03-12
 */
@Service
public class NoteServiceImpl implements INoteService 
{
    @Autowired
    private NoteMapper noteMapper;

    /**
     * 查询笔记
     * 
     * @param id 笔记主键
     * @return 笔记
     */
    @Override
    public Note selectNoteById(Long id)
    {
        return noteMapper.selectNoteById(id);
    }

    /**
     * 查询笔记列表
     * 
     * @param note 笔记
     * @return 笔记
     */
    @Override
    public List<Note> selectNoteList(Note note)
    {
        return noteMapper.selectNoteList(note);
    }

    /**
     * 新增笔记
     * 
     * @param note 笔记
     * @return 结果
     */
    @Override
    public int insertNote(Note note)
    {
        note.setCreateTime(DateUtils.getNowDate());
        return noteMapper.insertNote(note);
    }

    /**
     * 修改笔记
     * 
     * @param note 笔记
     * @return 结果
     */
    @Override
    public int updateNote(Note note)
    {
        if(note.getCreateTime()==null)
            note.setCreateTime(DateUtils.getNowDate());
        note.setUpdateTime(DateUtils.getNowDate());
        if(note.getId()==null){
            int cnt = noteMapper.insertNote(note);
            return cnt;
        }
        return noteMapper.updateNote(note);
    }

    /**
     * 批量删除笔记
     * 
     * @param ids 需要删除的笔记主键
     * @return 结果
     */
    @Override
    public int deleteNoteByIds(String ids)
    {
        return noteMapper.deleteNoteByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除笔记信息
     * 
     * @param id 笔记主键
     * @return 结果
     */
    @Override
    public int deleteNoteById(Long id)
    {
        return noteMapper.deleteNoteById(id);
    }
}
