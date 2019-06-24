package cn.xzxy.lewy.dao;

import cn.xzxy.lewy.pojo.HydMain3;

import java.util.List;

public interface IHydDao extends IBaseDao<HydMain3> {

    //根据是否审核查找货运单
    public List<HydMain3> findNoAuditHyd();

    //更新是否审核为1
    public void updateAudit(int id);

    //查询待发运单
    public List<HydMain3> findDaifaHyd();

    //查询未到运单
    public List<HydMain3> findWeidaoHyd();

    //查询未结运单
    public List<HydMain3> findWeijieHyd();

    //查询未结运单
    public List<HydMain3> findyijieHyd();

    //根据客户编号查询货运单
    public List<HydMain3> listByCustomer(String customer);

    //根据客户编号修改有效性
    public void updateValidity(String customer);

    //根据是否中转查询运单
    public List<HydMain3> findByIfTransfer();

    //根据货运单编号修改货运单的是否结算状态
    public void updateIfJs(String code);
}
