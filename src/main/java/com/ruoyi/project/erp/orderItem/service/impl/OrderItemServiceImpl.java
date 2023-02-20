package com.ruoyi.project.erp.orderItem.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.project.erp.orderItem.mapper.OrderItemMapper;
import com.ruoyi.project.erp.orderItem.domain.OrderItem;
import com.ruoyi.project.erp.orderItem.service.IOrderItemService;
import com.ruoyi.common.utils.text.Convert;

/**
 * 订单明细Service业务层处理
 * 
 * @author ruoyi
 * @date 2023-02-11
 */
@Service
public class OrderItemServiceImpl implements IOrderItemService 
{
    @Autowired
    private OrderItemMapper orderItemMapper;

    /**
     * 查询订单明细
     * 
     * @param id 订单明细主键
     * @return 订单明细
     */
    @Override
    public OrderItem selectOrderItemById(Long id)
    {
        return orderItemMapper.selectOrderItemById(id);
    }

    /**
     * 查询订单明细列表
     * 
     * @param orderItem 订单明细
     * @return 订单明细
     */
    @Override
    public List<OrderItem> selectOrderItemList(OrderItem orderItem)
    {
        return orderItemMapper.selectOrderItemList(orderItem);
    }

    /**
     * 新增订单明细
     * 
     * @param orderItem 订单明细
     * @return 结果
     */
    @Override
    public int insertOrderItem(OrderItem orderItem)
    {
        orderItem.setCreateTime(DateUtils.getNowDate());
        return orderItemMapper.insertOrderItem(orderItem);
    }

    /**
     * 修改订单明细
     * 
     * @param orderItem 订单明细
     * @return 结果
     */
    @Override
    public int updateOrderItem(OrderItem orderItem)
    {
        orderItem.setUpdateTime(DateUtils.getNowDate());
        return orderItemMapper.updateOrderItem(orderItem);
    }

    /**
     * 批量删除订单明细
     * 
     * @param ids 需要删除的订单明细主键
     * @return 结果
     */
    @Override
    public int deleteOrderItemByIds(String ids)
    {
        return orderItemMapper.deleteOrderItemByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除订单明细信息
     * 
     * @param id 订单明细主键
     * @return 结果
     */
    @Override
    public int deleteOrderItemById(Long id)
    {
        return orderItemMapper.deleteOrderItemById(id);
    }
}
