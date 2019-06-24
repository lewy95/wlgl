package cn.xzxy.lewy.service.impl;

import cn.xzxy.lewy.dao.IDanjuDao;
import cn.xzxy.lewy.dao.IDriverDao;
import cn.xzxy.lewy.pojo.DjMingxi2;
import cn.xzxy.lewy.pojo.Driver27;
import cn.xzxy.lewy.service.IDanjuService;
import cn.xzxy.lewy.service.IDriverService;
import cn.xzxy.lewy.util.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sun.reflect.generics.scope.Scope;

import java.util.List;

@Service
public class DanjuService implements IDanjuService {

    @Autowired
    IDanjuDao danjuDao;

    public void add(DjMingxi2 djmx) {
        danjuDao.add(djmx);
    }

    public void delete(int id) {
        DjMingxi2 djmx = danjuDao.load(id);
        danjuDao.delete(djmx);
    }

    public void update(DjMingxi2 djmx) {
        danjuDao.update(djmx);
    }

    public DjMingxi2 load(int id) {
        return danjuDao.load(id);
    }

    public DjMingxi2 get(int id) {
        return danjuDao.get(id);
    }

    public List<DjMingxi2> list() {
        String hql = "from DjMingxi2";
        List<DjMingxi2> djmxs = danjuDao.list(hql, null);
        return djmxs;
    }

    public List<DjMingxi2> listYtDj() {
        return danjuDao.listYtDj();
    }

    public List<DjMingxi2> listZfDj() {
        return danjuDao.listZfDj();
    }

    public List<DjMingxi2> listYjDj() {
        return danjuDao.listYjDj();
    }

    public DjMingxi2 findDjById(int id) {
        return danjuDao.findDjById(id);
    }

    public void updateDjState(int id, String state) {
        danjuDao.updateDjState(id, state);
    }
}
