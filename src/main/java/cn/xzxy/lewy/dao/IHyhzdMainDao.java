package cn.xzxy.lewy.dao;

import cn.xzxy.lewy.pojo.HydHuizhiMain6;

import java.util.List;

public interface IHyhzdMainDao extends IBaseDao<HydHuizhiMain6> {

    public HydHuizhiMain6 findByCode(String code);

    //根据司机id和是否执行查询待发回执单
    public List<HydHuizhiMain6> listByExecute(String execute, int driverId);

    //根据id修改是否执行的状态
    public void updateExecute(int id,String state);

    //根据是否到货查询所有合同
    public List<HydHuizhiMain6> listByExecute();

    //查询未出合同
    public List<HydHuizhiMain6> findWcHyhzd();

    //查询未到合同
    public List<HydHuizhiMain6> findWdHyhzd();

    //查询未结合同
    public List<HydHuizhiMain6> findWjHyhzd();

    //查询已结合同
    public List<HydHuizhiMain6> findYjHyhzd();

    //根据司机id查询所有合同
    public List<HydHuizhiMain6> listByDriverId(int driverId);

    //根据货运回执单编号修改是否结算状态
    public void updateIfBalance(String code);
}
