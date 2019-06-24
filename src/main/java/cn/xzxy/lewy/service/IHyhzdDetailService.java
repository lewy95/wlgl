package cn.xzxy.lewy.service;

import cn.xzxy.lewy.pojo.HydHuizhiDetail5;

import java.util.List;

public interface IHyhzdDetailService {

    public void add(HydHuizhiDetail5 hyhzdx);

    public void update(HydHuizhiDetail5 hyhzdx);

    public HydHuizhiDetail5 load(int id);

    public HydHuizhiDetail5 get(int id);

    public List<HydHuizhiDetail5> list();

    public HydHuizhiDetail5 findByHzId(int hzId);

}
