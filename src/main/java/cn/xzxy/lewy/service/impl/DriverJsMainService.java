package cn.xzxy.lewy.service.impl;

import cn.xzxy.lewy.dao.IDriverJsMainDao;
import cn.xzxy.lewy.pojo.DriverJsMain12;
import cn.xzxy.lewy.service.IDriverJsMainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DriverJsMainService implements IDriverJsMainService{
    @Autowired
    IDriverJsMainDao driverJsMainDao;
    public void add(DriverJsMain12 driverJsMain12) {
        driverJsMainDao.add(driverJsMain12);
    }
}
