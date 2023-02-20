package com.ruoyi.project.erp.orderItem.service;

import java.util.List;
import com.ruoyi.project.erp.orderItem.domain.OrderItem;

/**
 * 订单明细Service接口
 * 
 * @author ruoyi
 * @date 2023-02-11
 */
public interface IOrderItemService 
{
    /**
     * 查询订单明细
     * 
     * @param id 订单明细主键
     * @return 订单明细
     */
    public OrderItem selectOrderItemById(Long id);

    /**
     * 查询订单明细列表
     * 
     * @param orderItem 订单明细
     * @return 订单明细集合
     */
    public List<OrderItem> selectOrderItemList(OrderItem orderItem);

    /**
     * 新增订单明细
     * 
     * @param orderItem 订单明细
     * @return 结果
     */
    public int insertOrderItem(OrderItem orderItem);

    /**
     * 修改订单明细
     * 
     * @param orderItem 订单明细
     * @return 结果
     */
    public int updateOrderItem(OrderItem orderItem);

    /**
     * 批量删除订单明细
     * 
     * @param ids 需要删除的订单明细主键集合
     * @return 结果
     */
    public int deleteOrderItemByIds(String ids);

    /**
     * 删除订单明细信息
     * 
     * @param id 订单明细主键
     * @return 结果
     */
    public int deleteOrderItemById(Long id);
}
