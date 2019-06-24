package cn.xzxy.lewy.service;

import cn.xzxy.lewy.pojo.Customer25;
import cn.xzxy.lewy.util.Page;

import java.util.List;

public interface ICustomerService {

    public void add(Customer25 customer);

    public void delete(int id);

    public void update(Customer25 customer);

    public Customer25 load(int id);

    public Customer25 get(int id);

    public List<Customer25> list();

    public Page<Customer25> listByPage();

    public Customer25 findByCode(String customerCode);

}
