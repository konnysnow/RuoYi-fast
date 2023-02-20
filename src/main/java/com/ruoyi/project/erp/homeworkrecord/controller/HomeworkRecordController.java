package com.ruoyi.project.erp.homeworkrecord.controller;

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
import com.ruoyi.project.erp.homeworkrecord.domain.HomeworkRecord;
import com.ruoyi.project.erp.homeworkrecord.service.IHomeworkRecordService;
import com.ruoyi.framework.web.controller.BaseController;
import com.ruoyi.framework.web.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.framework.web.page.TableDataInfo;

/**
 * 作业计时Controller
 * 
 * @author ruoyi
 * @date 2023-02-20
 */
@Controller
@RequestMapping("/erp/homeworkrecord")
public class HomeworkRecordController extends BaseController
{
    private String prefix = "erp/homeworkrecord";

    @Autowired
    private IHomeworkRecordService homeworkRecordService;

    @RequiresPermissions("erp:homeworkrecord:view")
    @GetMapping()
    public String homeworkrecord()
    {
        return prefix + "/homeworkrecord";
    }

    /**
     * 查询作业计时列表
     */
    @RequiresPermissions("erp:homeworkrecord:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(HomeworkRecord homeworkRecord)
    {
        startPage();
        List<HomeworkRecord> list = homeworkRecordService.selectHomeworkRecordList(homeworkRecord);
        return getDataTable(list);
    }

    /**
     * 导出作业计时列表
     */
    @RequiresPermissions("erp:homeworkrecord:export")
    @Log(title = "作业计时", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(HomeworkRecord homeworkRecord)
    {
        List<HomeworkRecord> list = homeworkRecordService.selectHomeworkRecordList(homeworkRecord);
        ExcelUtil<HomeworkRecord> util = new ExcelUtil<HomeworkRecord>(HomeworkRecord.class);
        return util.exportExcel(list, "作业计时数据");
    }

    /**
     * 新增作业计时
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存作业计时
     */
    @RequiresPermissions("erp:homeworkrecord:add")
    @Log(title = "作业计时", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(HomeworkRecord homeworkRecord)
    {
        return toAjax(homeworkRecordService.insertHomeworkRecord(homeworkRecord));
    }

    /**
     * 修改作业计时
     */
    @RequiresPermissions("erp:homeworkrecord:edit")
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap mmap)
    {
        HomeworkRecord homeworkRecord = homeworkRecordService.selectHomeworkRecordById(id);
        mmap.put("homeworkRecord", homeworkRecord);
        return prefix + "/edit";
    }

    /**
     * 修改保存作业计时
     */
    @RequiresPermissions("erp:homeworkrecord:edit")
    @Log(title = "作业计时", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(HomeworkRecord homeworkRecord)
    {
        return toAjax(homeworkRecordService.updateHomeworkRecord(homeworkRecord));
    }

    /**
     * 删除作业计时
     */
    @RequiresPermissions("erp:homeworkrecord:remove")
    @Log(title = "作业计时", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(homeworkRecordService.deleteHomeworkRecordByIds(ids));
    }
}
