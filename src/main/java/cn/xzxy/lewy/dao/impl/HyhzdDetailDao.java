package cn.xzxy.lewy.dao.impl;

import cn.xzxy.lewy.dao.IHyhzdDetailDao;
import cn.xzxy.lewy.dao.IHyhzdMainDao;
import cn.xzxy.lewy.pojo.HydHuizhiDetail5;
import cn.xzxy.lewy.pojo.HydHuizhiMain6;
import org.hibernate.query.Query;
import org.springframework.stereotype.Repository;

@Repository
public class HyhzdDetailDao extends BaseDao<HydHuizhiDetail5> implements IHyhzdDetailDao {

    public HydHuizhiDetail5 findByHzId(int hzId) {
        String hql = "from HydHuizhiDetail5 where goodsRevertBillID = :i";
        Query query = openSession().createQuery(hql).setParameter("i",hzId);
        HydHuizhiDetail5 hzdx = (HydHuizhiDetail5) query.uniqueResult();
        return hzdx;
    }
}
