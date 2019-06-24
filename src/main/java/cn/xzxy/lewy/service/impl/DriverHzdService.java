package cn.xzxy.lewy.service.impl;

import cn.xzxy.lewy.dao.IDriverHzdDao;
import cn.xzxy.lewy.pojo.GoodsHuizhiInfo8;
import cn.xzxy.lewy.service.IDriverHzdService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DriverHzdService implements IDriverHzdService {

    @Autowired
    IDriverHzdDao driverHzdDao;

    public void add(GoodsHuizhiInfo8 driverHzd) {
        driverHzdDao.add(driverHzd);
    }

    public void delete(int id) {
        GoodsHuizhiInfo8 driverHzd = driverHzdDao.load(id);
        driverHzdDao.delete(driverHzd);
    }

    public void update(GoodsHuizhiInfo8 driverHzd) {
        driverHzdDao.update(driverHzd);
    }

    public GoodsHuizhiInfo8 load(int id) {
        return driverHzdDao.load(id);
    }

    public GoodsHuizhiInfo8 get(int id) {
        return driverHzdDao.get(id);
    }

    public List<GoodsHuizhiInfo8> list() {
        String hql = "from GoodsHuizhiInfo8";
        List<GoodsHuizhiInfo8> driverHzds = driverHzdDao.list(hql,null);
        return driverHzds;
    }
}
