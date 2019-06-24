package cn.xzxy.lewy.dao.impl;

import cn.xzxy.lewy.dao.IHyhzdMainDao;
import cn.xzxy.lewy.pojo.HydHuizhiMain6;
import org.hibernate.query.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class HyhzdMainDao extends BaseDao<HydHuizhiMain6> implements IHyhzdMainDao {

    public HydHuizhiMain6 findByCode(String code) {
        String hql = "from HydHuizhiMain6 h where h.goodsRevertBillCode = :c";
        Query query = openSession().createQuery(hql).setParameter("c",code);
        HydHuizhiMain6 hyhzd = (HydHuizhiMain6) query.uniqueResult();
        return hyhzd;
    }

    public List<HydHuizhiMain6> listByExecute(String execute, int driverId) {
        String hql = "from HydHuizhiMain6 h where h.execute = :e and h.driverID = :d ";
        Query query = openSession().createQuery(hql)
                .setParameter("e",execute).setParameter("d",driverId);
        List<HydHuizhiMain6> dfHyhzds = query.list();
        return dfHyhzds;
    }

    public void updateExecute(int id, String state) {
        String hql = "update HydHuizhiMain6 set execute = :e where id = :i";
        Query query = openSession().createQuery(hql)
                .setParameter("e",state).setParameter("i",id);
        query.executeUpdate();
    }

    public List<HydHuizhiMain6> listByExecute() {
        String hql = "from HydHuizhiMain6 h where h.execute = :e and h.backBillState = :b";
        Query query = openSession().createQuery(hql)
                .setParameter("e","2").setParameter("b","1");
        List<HydHuizhiMain6> ydhws = query.list();
        return ydhws;
    }

    public List<HydHuizhiMain6> findWcHyhzd() {
        String hql = "from HydHuizhiMain6 h where h.execute = :e and h.backBillState = :b";
        Query query = openSession().createQuery(hql)
                .setParameter("e","0").setParameter("b","1");
        List<HydHuizhiMain6> wdhzds = query.list();
        return wdhzds;
    }

    public List<HydHuizhiMain6> findWdHyhzd() {
        String hql = "from HydHuizhiMain6 h where h.execute = :e and h.backBillState = :b";
        Query query = openSession().createQuery(hql)
                .setParameter("e","1").setParameter("b","1");
        List<HydHuizhiMain6> wchzds = query.list();
        return wchzds;
    }

    public List<HydHuizhiMain6> findYjHyhzd() {
        String hql = "from HydHuizhiMain6 h where h.ifBalance = :i and h.backBillState = :b";
        Query query = openSession().createQuery(hql)
                .setParameter("i","1").setParameter("b","1");
        List<HydHuizhiMain6> wjhzds = query.list();
        return wjhzds;

    }

    public List<HydHuizhiMain6> findWjHyhzd() {
        String hql = "from HydHuizhiMain6 h where h.ifBalance = :i and h.backBillState = :b";
        Query query = openSession().createQuery(hql)
                .setParameter("i","0").setParameter("b","1");
        List<HydHuizhiMain6> wjhzds = query.list();
        return wjhzds;

    }

    public List<HydHuizhiMain6> listByDriverId(int driverId) {
        String hql = "from HydHuizhiMain6 h where h.driverID = :d and h.backBillState = :b";
        Query query = openSession().createQuery(hql)
                .setParameter("d",driverId).setParameter("b","1");
        List<HydHuizhiMain6> driverHzds = query.list();
        return driverHzds;
    }

    public void updateIfBalance(String code) {
        String hql = "update HydHuizhiMain6 set ifBalance = :b where goodsRevertBillCode = :g";
        Query query = openSession().createQuery(hql)
                .setParameter("b","1").setParameter("g",code);
        query.executeUpdate();
    }
}
