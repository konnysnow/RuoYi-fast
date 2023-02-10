package com.ruoyi.project.weie.exam.controller;

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
import com.ruoyi.project.weie.exam.domain.Exam;
import com.ruoyi.project.weie.exam.service.IExamService;
import com.ruoyi.framework.web.controller.BaseController;
import com.ruoyi.framework.web.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.framework.web.page.TableDataInfo;

/**
 * 问卷Controller
 * 
 * @author ruoyi
 * @date 2022-11-23
 */
@Controller
@RequestMapping("/weie/exam")
public class ExamController extends BaseController
{
    private String prefix = "weie/exam";

    @Autowired
    private IExamService examService;

//    @RequiresPermissions("weie:exam:view")
    @GetMapping()
    public String exam()
    {
        return prefix + "/exam";
    }

    /**
     * 查询问卷列表
     */
//    @RequiresPermissions("weie:exam:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(Exam exam)
    {
        startPage();
        List<Exam> list = examService.selectExamList(exam);
        return getDataTable(list);
    }

    /**
     * 导出问卷列表
     */
//    @RequiresPermissions("weie:exam:export")
    @Log(title = "问卷", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(Exam exam)
    {
        List<Exam> list = examService.selectExamList(exam);
        ExcelUtil<Exam> util = new ExcelUtil<Exam>(Exam.class);
        return util.exportExcel(list, "问卷数据");
    }

    /**
     * 新增问卷
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存问卷
     */
//    @RequiresPermissions("weie:exam:add")
    @Log(title = "问卷", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(Exam exam)
    {
        return toAjax(examService.insertExam(exam));
    }

    /**
     * 修改问卷
     */
//    @RequiresPermissions("weie:exam:edit")
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap mmap)
    {
        Exam exam = examService.selectExamById(id);
        mmap.put("exam", exam);
        return prefix + "/edit";
    }

    /**
     * 修改保存问卷
     */
//    @RequiresPermissions("weie:exam:edit")
    @Log(title = "问卷", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(Exam exam)
    {
        return toAjax(examService.updateExam(exam));
    }

    /**
     * 删除问卷
     */
//    @RequiresPermissions("weie:exam:remove")
    @Log(title = "问卷", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(examService.deleteExamByIds(ids));
    }
}
