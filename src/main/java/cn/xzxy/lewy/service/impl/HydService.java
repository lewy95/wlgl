package cn.xzxy.lewy.service.impl;

import cn.xzxy.lewy.dao.IHydDao;
import cn.xzxy.lewy.pojo.HydMain3;
import cn.xzxy.lewy.service.IHydService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HydService implements IHydService {

    @Autowired
    IHydDao hydDao;

    public void add(HydMain3 hyd) {
        hydDao.add(hyd);
    }

    public void update(HydMain3 hyd) {
        hydDao.update(hyd);
    }

    public HydMain3 load(int id) {
        return hydDao.load(id);
    }

    public HydMain3 get(int id) {
        return hydDao.get(id);
    }

    public List<HydMain3> list() {
        String hql = "from HydMain3";
        List<HydMain3> hyds = hydDao.list(hql, null);
        return hyds;
    }

    public List<HydMain3> findNoAuditHyd() {
        return hydDao.findNoAuditHyd();
    }

    public void updateAudit(int id) {
        hydDao.updateAudit(id);
    }

    public List<HydMain3> findDaifaHyd() {
        return hydDao.findDaifaHyd();
    }

    public List<HydMain3> findWeidaoHyd() {
        return hydDao.findWeidaoHyd();
    }

    public List<HydMain3> findWeijieHyd() {
        return hydDao.findWeijieHyd();
    }

    public List<HydMain3> findyijieHyd() {
        return hydDao.findyijieHyd();
    }

    public List<HydMain3> listByCustomer(String customer) {
        return hydDao.listByCustomer(customer);
    }

    public void updateValidity(String customer){
        hydDao.updateValidity(customer);
    }

    public List<HydMain3> findByIfTransfer() {
        return hydDao.findByIfTransfer();
    }

    public void updateIfJs(String code) {
        hydDao.updateIfJs(code);
    }

}
