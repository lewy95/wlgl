package cn.xzxy.lewy.dao;

import cn.xzxy.lewy.pojo.Customer25;

public interface ICustomerDao extends IBaseDao<Customer25> {

    public Customer25 findByCode(String customerCode);

}
