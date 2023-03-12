package com.ruoyi.project.erp.note.mapper;

import java.util.List;
import com.ruoyi.project.erp.note.domain.Note;

/**
 * 笔记Mapper接口
 * 
 * @author ruoyi
 * @date 2023-03-12
 */
public interface NoteMapper 
{
    /**
     * 查询笔记
     * 
     * @param id 笔记主键
     * @return 笔记
     */
    public Note selectNoteById(Long id);

    /**
     * 查询笔记列表
     * 
     * @param note 笔记
     * @return 笔记集合
     */
    public List<Note> selectNoteList(Note note);

    /**
     * 新增笔记
     * 
     * @param note 笔记
     * @return 结果
     */
    public int insertNote(Note note);

    /**
     * 修改笔记
     * 
     * @param note 笔记
     * @return 结果
     */
    public int updateNote(Note note);

    /**
     * 删除笔记
     * 
     * @param id 笔记主键
     * @return 结果
     */
    public int deleteNoteById(Long id);

    /**
     * 批量删除笔记
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteNoteByIds(String[] ids);
}
