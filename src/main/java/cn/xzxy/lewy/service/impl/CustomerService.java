package cn.xzxy.lewy.service.impl;

import cn.xzxy.lewy.dao.ICustomerDao;
import cn.xzxy.lewy.pojo.Customer25;
import cn.xzxy.lewy.service.ICustomerService;
import cn.xzxy.lewy.util.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService implements ICustomerService {

    @Autowired
    ICustomerDao customerDao;

    public void add(Customer25 customer) {
        customerDao.add(customer);
    }

    public void delete(int id) {
        Customer25 customer = customerDao.load(id);
        customerDao.delete(customer);
    }

    public void update(Customer25 customer) {
        customerDao.update(customer);
    }

    public Customer25 load(int id) {
        return customerDao.load(id);
    }

    public Customer25 get(int id) {
        return customerDao.get(id);
    }

    public List<Customer25> list() {
        String hql = "select c from Customer25 c";
        List<Customer25> customers = customerDao.list(hql, null);
        return customers;
    }

    public Page<Customer25> listByPage() {
        String hql = "from Customer25";
        String countHql = "select count(*)" + hql;
        return customerDao.page(hql,countHql);
    }

    public Customer25 findByCode(String customerCode) {
        return customerDao.findByCode(customerCode);
    }
}
