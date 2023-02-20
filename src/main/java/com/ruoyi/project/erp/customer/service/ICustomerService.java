package com.ruoyi.project.erp.customer.service;

import java.util.List;
import com.ruoyi.project.erp.customer.domain.Customer;

/**
 * 客户Service接口
 * 
 * @author ruoyi
 * @date 2023-02-11
 */
public interface ICustomerService 
{
    /**
     * 查询客户
     * 
     * @param id 客户主键
     * @return 客户
     */
    public Customer selectCustomerById(Long id);

    /**
     * 查询客户列表
     * 
     * @param customer 客户
     * @return 客户集合
     */
    public List<Customer> selectCustomerList(Customer customer);

    /**
     * 新增客户
     * 
     * @param customer 客户
     * @return 结果
     */
    public int insertCustomer(Customer customer);

    /**
     * 修改客户
     * 
     * @param customer 客户
     * @return 结果
     */
    public int updateCustomer(Customer customer);

    /**
     * 批量删除客户
     * 
     * @param ids 需要删除的客户主键集合
     * @return 结果
     */
    public int deleteCustomerByIds(String ids);

    /**
     * 删除客户信息
     * 
     * @param id 客户主键
     * @return 结果
     */
    public int deleteCustomerById(Long id);
}
