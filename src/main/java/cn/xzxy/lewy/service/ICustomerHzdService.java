package cn.xzxy.lewy.service;

import cn.xzxy.lewy.pojo.CustomerHuizhiInfo7;

import java.util.List;

public interface ICustomerHzdService {

    public void add(CustomerHuizhiInfo7 customerHzd);

    public void delete(int id);

    public void update(CustomerHuizhiInfo7 customerHzd);

    public CustomerHuizhiInfo7 load(int id);

    public CustomerHuizhiInfo7 get(int id);

    public List<CustomerHuizhiInfo7> list();
}
