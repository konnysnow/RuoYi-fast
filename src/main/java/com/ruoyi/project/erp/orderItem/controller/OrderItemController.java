package com.ruoyi.project.erp.orderItem.controller;

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
import com.ruoyi.project.erp.orderItem.domain.OrderItem;
import com.ruoyi.project.erp.orderItem.service.IOrderItemService;
import com.ruoyi.framework.web.controller.BaseController;
import com.ruoyi.framework.web.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.framework.web.page.TableDataInfo;

/**
 * 订单明细Controller
 * 
 * @author ruoyi
 * @date 2023-02-11
 */
@Controller
@RequestMapping("/erp/orderItem")
public class OrderItemController extends BaseController
{
    private String prefix = "erp/orderItem";

    @Autowired
    private IOrderItemService orderItemService;

    @RequiresPermissions("erp:orderItem:view")
    @GetMapping()
    public String orderItem()
    {
        return prefix + "/orderItem";
    }

    /**
     * 查询订单明细列表
     */
    @RequiresPermissions("erp:orderItem:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(OrderItem orderItem)
    {
        startPage();
        List<OrderItem> list = orderItemService.selectOrderItemList(orderItem);
        return getDataTable(list);
    }

    /**
     * 导出订单明细列表
     */
    @RequiresPermissions("erp:orderItem:export")
    @Log(title = "订单明细", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(OrderItem orderItem)
    {
        List<OrderItem> list = orderItemService.selectOrderItemList(orderItem);
        ExcelUtil<OrderItem> util = new ExcelUtil<OrderItem>(OrderItem.class);
        return util.exportExcel(list, "订单明细数据");
    }

    /**
     * 新增订单明细
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存订单明细
     */
    @RequiresPermissions("erp:orderItem:add")
    @Log(title = "订单明细", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(OrderItem orderItem)
    {
        return toAjax(orderItemService.insertOrderItem(orderItem));
    }

    /**
     * 修改订单明细
     */
    @RequiresPermissions("erp:orderItem:edit")
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap mmap)
    {
        OrderItem orderItem = orderItemService.selectOrderItemById(id);
        mmap.put("orderItem", orderItem);
        return prefix + "/edit";
    }

    /**
     * 修改保存订单明细
     */
    @RequiresPermissions("erp:orderItem:edit")
    @Log(title = "订单明细", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(OrderItem orderItem)
    {
        return toAjax(orderItemService.updateOrderItem(orderItem));
    }

    /**
     * 删除订单明细
     */
    @RequiresPermissions("erp:orderItem:remove")
    @Log(title = "订单明细", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(orderItemService.deleteOrderItemByIds(ids));
    }
}
