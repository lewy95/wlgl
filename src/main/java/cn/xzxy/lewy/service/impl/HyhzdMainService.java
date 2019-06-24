package cn.xzxy.lewy.service.impl;

import cn.xzxy.lewy.dao.IHyhzdMainDao;
import cn.xzxy.lewy.pojo.HydHuizhiMain6;
import cn.xzxy.lewy.service.IHyhzdMainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HyhzdMainService implements IHyhzdMainService {

    @Autowired
    IHyhzdMainDao hyhzdMainDao;

    public void add(HydHuizhiMain6 hyhzdm) {
        hyhzdMainDao.add(hyhzdm);
    }

    public void update(HydHuizhiMain6 hyhzdm) {
        hyhzdMainDao.update(hyhzdm);
    }

    public HydHuizhiMain6 load(int id) {
        return hyhzdMainDao.load(id);
    }

    public HydHuizhiMain6 get(int id) {
        return hyhzdMainDao.get(id);
    }

    public List<HydHuizhiMain6> list() {
        String hql = "from HydHuizhiMain6";
        List<HydHuizhiMain6> hydhzms = hyhzdMainDao.list(hql, null);
        return hydhzms;
    }

    public HydHuizhiMain6 findByCode(String code) {
        return hyhzdMainDao.findByCode(code);
    }

    public List<HydHuizhiMain6> listByExecute(String execute,int driverId) {
        return hyhzdMainDao.listByExecute(execute,driverId);
    }

    public void updateExecute(int id,String state) {
        hyhzdMainDao.updateExecute(id, state);
    }

    public List<HydHuizhiMain6> findWcHyhzd() {
        return hyhzdMainDao.findWcHyhzd();
    }

    public List<HydHuizhiMain6> findWdHyhzd() {
        return hyhzdMainDao.findWdHyhzd();
    }

    public List<HydHuizhiMain6> findWjHyhzd() {
        return hyhzdMainDao.findWjHyhzd();
    }

    public List<HydHuizhiMain6> findYjHyhzd() {
        return hyhzdMainDao.findYjHyhzd();
    }

    public List<HydHuizhiMain6> listByDriverId(int driverId) {
        return hyhzdMainDao.listByDriverId(driverId);
    }

    public void updateIfBalance(String code) {
        hyhzdMainDao.updateIfBalance(code);
    }

    public List<HydHuizhiMain6> listByExecute() {
        return hyhzdMainDao.listByExecute();
    }

}
