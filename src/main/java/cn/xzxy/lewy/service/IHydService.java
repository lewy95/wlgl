package cn.xzxy.lewy.service;

import cn.xzxy.lewy.pojo.HydMain3;

import java.util.List;

public interface IHydService {

    public void add(HydMain3 hyd);

    public void update(HydMain3 hyd);

    public HydMain3 load(int id);

    public HydMain3 get(int id);

    public List<HydMain3> list();

    public List<HydMain3> findNoAuditHyd();

    public void updateAudit(int id);

    public List<HydMain3> findDaifaHyd();

    public List<HydMain3> findWeidaoHyd();

    public List<HydMain3> findWeijieHyd();

    public List<HydMain3> findyijieHyd();

    public List<HydMain3> listByCustomer(String customer);

    public void updateValidity(String customer);

    public List<HydMain3> findByIfTransfer();

    public void updateIfJs(String code);
}
