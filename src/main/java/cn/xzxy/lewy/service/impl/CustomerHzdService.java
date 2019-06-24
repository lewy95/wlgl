package cn.xzxy.lewy.service.impl;

import cn.xzxy.lewy.dao.ICustomerHzdDao;
import cn.xzxy.lewy.dao.IDriverHzdDao;
import cn.xzxy.lewy.pojo.CustomerHuizhiInfo7;
import cn.xzxy.lewy.pojo.GoodsHuizhiInfo8;
import cn.xzxy.lewy.service.ICustomerHzdService;
import cn.xzxy.lewy.service.IDriverHzdService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerHzdService implements ICustomerHzdService {

    @Autowired
    ICustomerHzdDao customerHzdDao;

    public void add(CustomerHuizhiInfo7 customerHzd) {
        customerHzdDao.add(customerHzd);
    }

    public void delete(int id) {
        CustomerHuizhiInfo7 customerHzd = customerHzdDao.load(id);
        customerHzdDao.delete(customerHzd);
    }

    public void update(CustomerHuizhiInfo7 customerHzd) {
        customerHzdDao.update(customerHzd);
    }

    public CustomerHuizhiInfo7 load(int id) {
        return customerHzdDao.load(id);
    }

    public CustomerHuizhiInfo7 get(int id) {
        return customerHzdDao.get(id);
    }

    public List<CustomerHuizhiInfo7> list() {
        String hql = "from CustomerHuizhiInfo7";
        List<CustomerHuizhiInfo7> customerHzds = customerHzdDao.list(hql,null);
        return customerHzds;
    }
}
