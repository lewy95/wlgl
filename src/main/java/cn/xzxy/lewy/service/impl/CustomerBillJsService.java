package cn.xzxy.lewy.service.impl;

import cn.xzxy.lewy.dao.ICustomerBillJsDao;
import cn.xzxy.lewy.pojo.CustomerBillJs13;
import cn.xzxy.lewy.service.ICustomerBillJsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerBillJsService implements ICustomerBillJsService {

    @Autowired
    ICustomerBillJsDao customerBilljsDao;

    public void add(CustomerBillJs13 customerBillJs13) {
        customerBilljsDao.add(customerBillJs13);
    }
}
