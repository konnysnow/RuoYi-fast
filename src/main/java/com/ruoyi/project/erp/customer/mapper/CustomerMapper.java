package com.ruoyi.project.erp.customer.mapper;

import java.util.List;
import com.ruoyi.project.erp.customer.domain.Customer;

/**
 * 客户Mapper接口
 * 
 * @author ruoyi
 * @date 2023-02-11
 */
public interface CustomerMapper 
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
     * 删除客户
     * 
     * @param id 客户主键
     * @return 结果
     */
    public int deleteCustomerById(Long id);

    /**
     * 批量删除客户
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteCustomerByIds(String[] ids);
}
