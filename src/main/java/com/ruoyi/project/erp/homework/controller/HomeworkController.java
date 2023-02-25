package com.ruoyi.project.erp.homework.controller;

import java.util.List;

import com.ruoyi.project.system.dict.domain.DictData;
import com.ruoyi.project.system.dict.service.IDictDataService;
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
import com.ruoyi.project.erp.homework.domain.Homework;
import com.ruoyi.project.erp.homework.service.IHomeworkService;
import com.ruoyi.framework.web.controller.BaseController;
import com.ruoyi.framework.web.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.framework.web.page.TableDataInfo;

/**
 * 作业Controller
 * 
 * @author ruoyi
 * @date 2023-02-20
 */
@Controller
@RequestMapping("/erp/homework")
public class HomeworkController extends BaseController
{
    private String prefix = "erp/homework";

    @Autowired
    private IHomeworkService homeworkService;
    @Autowired
    private IDictDataService dictDataService;

    @RequiresPermissions("erp:homework:view")
    @GetMapping()
    public String homework()
    {
        return prefix + "/homework";
    }

    /**
     * 查询作业列表
     */
    @RequiresPermissions("erp:homework:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(Homework homework)
    {
        startPage();
        List<Homework> list = homeworkService.selectHomeworkList(homework);
        return getDataTable(list);
    }

    /**
     * 导出作业列表
     */
    @RequiresPermissions("erp:homework:export")
    @Log(title = "作业", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(Homework homework)
    {
        List<Homework> list = homeworkService.selectHomeworkList(homework);
        ExcelUtil<Homework> util = new ExcelUtil<Homework>(Homework.class);
        return util.exportExcel(list, "作业数据");
    }

    /**
     * 新增作业
     */
    @GetMapping("/add")
    public String add(ModelMap mmap)
    {
        addDicts(  mmap);
        return prefix + "/add";
    }

    private void addDicts(ModelMap mmap){
        DictData dictData = new DictData();
        String key = "homework_class_name";
        dictData.setDictType(key);
        List<DictData> list = dictDataService.selectDictDataList(dictData);
        System.out.println(list);
        mmap.put("classNameList",list);
    }

    /**
     * 新增保存作业
     */
    @RequiresPermissions("erp:homework:add")
    @Log(title = "作业", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(Homework homework)
    {
        return toAjax(homeworkService.insertHomework(homework));
    }

    /**
     * 修改作业
     */
    @RequiresPermissions("erp:homework:edit")
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap mmap)
    {
        addDicts(  mmap);
        Homework homework = homeworkService.selectHomeworkById(id);
        mmap.put("homework", homework);
        return prefix + "/edit";
    }

    /**
     * 修改保存作业
     */
    @RequiresPermissions("erp:homework:edit")
    @Log(title = "作业", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(Homework homework)
    {
        return toAjax(homeworkService.updateHomework(homework));
    }

    /**
     * 删除作业
     */
    @RequiresPermissions("erp:homework:remove")
    @Log(title = "作业", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(homeworkService.deleteHomeworkByIds(ids));
    }
}
