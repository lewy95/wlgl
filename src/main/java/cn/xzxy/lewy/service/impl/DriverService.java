package cn.xzxy.lewy.service.impl;

import cn.xzxy.lewy.dao.IDriverDao;
import cn.xzxy.lewy.pojo.Driver27;
import cn.xzxy.lewy.service.IDriverService;
import cn.xzxy.lewy.util.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DriverService implements IDriverService {

    @Autowired
    IDriverDao driverDao;

    public void add(Driver27 driver) {
        driverDao.add(driver);
    }

    public void delete(int id) {
        Driver27 driver = driverDao.load(id);
        driverDao.delete(driver);
    }

    public void update(Driver27 driver) {
        driverDao.update(driver);
    }

    public Driver27 load(int id) {
        return driverDao.load(id);
    }

    public Driver27 get(int id) {
        return driverDao.get(id);
    }

    public List<Driver27> list() {
        String hql = "select d from Driver27 d";
        List<Driver27> drivers = driverDao.list(hql, null);
        return drivers;
    }

    public Page<Driver27> listByPage() {
        String hql = "from Driver27";
        String countHql = "select count(*)" + hql;
        return driverDao.page(hql, countHql);
    }

    public Driver27 findByName(String driverName) {
        return driverDao.findByName(driverName);
    }
}
