package com.ruoyi.project.erp.note.controller;

import java.util.List;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.ruoyi.framework.aspectj.lang.annotation.Log;
import com.ruoyi.framework.aspectj.lang.enums.BusinessType;
import com.ruoyi.project.erp.note.domain.Note;
import com.ruoyi.project.erp.note.service.INoteService;
import com.ruoyi.framework.web.controller.BaseController;
import com.ruoyi.framework.web.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.framework.web.page.TableDataInfo;

/**
 * 笔记Controller
 * 
 * @author ruoyi
 * @date 2023-03-12
 */
@Controller
@RequestMapping("/erp/note")
public class NoteController extends BaseController
{
    private String prefix = "erp/note";

    @Autowired
    private INoteService noteService;

    @RequiresPermissions("erp:note:view")
    @GetMapping()
    public String note()
    {
        return prefix + "/note";
    }

    /**
     * 查询笔记列表
     */
    @RequiresPermissions("erp:note:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(Note note)
    {
        startPage();
        List<Note> list = noteService.selectNoteList(note);
        return getDataTable(list);
    }

    /**
     * 导出笔记列表
     */
    @RequiresPermissions("erp:note:export")
    @Log(title = "笔记", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(Note note)
    {
        List<Note> list = noteService.selectNoteList(note);
        ExcelUtil<Note> util = new ExcelUtil<Note>(Note.class);
        return util.exportExcel(list, "笔记数据");
    }

    /**
     * 新增笔记
     */
    @GetMapping("/add")
    public String add(ModelMap mmap)
    {
        Note note = new Note();
        mmap.put("note", note);
        return prefix + "/edit";
    }

    /**
     * 新增保存笔记
     */
    @RequiresPermissions("erp:note:add")
    @Log(title = "笔记", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(Note note)
    {
        return toAjax(noteService.insertNote(note));
    }

    /**
     * 修改笔记
     */
    @RequiresPermissions("erp:note:edit")
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap mmap)
    {
        Note note = noteService.selectNoteById(id);
        mmap.put("note", note);
        return prefix + "/edit";
    }

    /**
     * 修改保存笔记
     */
    @RequiresPermissions("erp:note:edit")
    @Log(title = "笔记", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(Note note)
    {
        return toAjax(noteService.updateNote(note));
    }

    /**
     * 删除笔记
     */
    @RequiresPermissions("erp:note:remove")
    @Log(title = "笔记", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(noteService.deleteNoteByIds(ids));
    }
}
