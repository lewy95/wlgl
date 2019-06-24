package cn.xzxy.lewy.service;

import cn.xzxy.lewy.pojo.HydHuizhiMain6;

import java.util.List;

public interface IHyhzdMainService {

    public void add(HydHuizhiMain6 hyhzdm);

    public void update(HydHuizhiMain6 hyhzdm);

    public HydHuizhiMain6 load(int id);

    public HydHuizhiMain6 get(int id);

    public List<HydHuizhiMain6> list();

    public HydHuizhiMain6 findByCode(String code);

    public List<HydHuizhiMain6> listByExecute(String execute, int driverId);

    public void updateExecute(int id,String state);

    public List<HydHuizhiMain6> findWcHyhzd();

    public List<HydHuizhiMain6> findWdHyhzd();

    public List<HydHuizhiMain6> findWjHyhzd();

    public List<HydHuizhiMain6> findYjHyhzd();

    public List<HydHuizhiMain6> listByDriverId(int driverId);

    public void updateIfBalance(String code);

    public List<HydHuizhiMain6> listByExecute();
}
