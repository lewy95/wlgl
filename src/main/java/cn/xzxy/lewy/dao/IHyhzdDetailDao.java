package cn.xzxy.lewy.dao;

import cn.xzxy.lewy.pojo.HydHuizhiDetail5;
import org.hibernate.query.Query;

public interface IHyhzdDetailDao extends IBaseDao<HydHuizhiDetail5> {

    //根据货运回执单id获取该对象
    public HydHuizhiDetail5 findByHzId(int hzId);

}
