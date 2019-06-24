package cn.xzxy.lewy.dao.impl;

import cn.xzxy.lewy.dao.IHydDao;
import cn.xzxy.lewy.pojo.HydMain3;
import org.hibernate.query.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class HydDao extends BaseDao<HydMain3> implements IHydDao {

    public List<HydMain3> findNoAuditHyd() {
        String hql = "from HydMain3 h where h.ifAudit = :a order by h.id desc" ;
        Query query = openSession().createQuery(hql).setParameter("a","0");
        List<HydMain3> hyds = query.list();
        return hyds;
    }

    public void updateAudit(int id) {
        String hql = "update HydMain3 set ifAudit =:a where id = :i";
        Query query = openSession().createQuery(hql).
                setParameter("a","1").setParameter("i",id);
        query.executeUpdate();
    }

    public List<HydMain3> findDaifaHyd() {
        String hql = "from HydMain3 h where h.ifAudit = :a and h.validity = :v";
        Query query = openSession().createQuery(hql)
                .setParameter("a","0").setParameter("v","1");
        List<HydMain3> hyds = query.list();
        return hyds;
    }

    public List<HydMain3> findWeidaoHyd() {
        String hql = "from HydMain3 h where h.ifAudit = :a and h.validity = :v";
        Query query = openSession().createQuery(hql)
                .setParameter("a","1").setParameter("v","1");
        List<HydMain3> hyds = query.list();
        return hyds;
    }

    public List<HydMain3> findyijieHyd() {
        String hql = "from HydMain3 h where h.ifSettleAccounts = :s and h.validity = :v";
        Query query = openSession().createQuery(hql)
                .setParameter("s","1").setParameter("v","1");
        List<HydMain3> hyds = query.list();
        return hyds;
    }

    public List<HydMain3> findWeijieHyd() {
        String hql = "from HydMain3 h where h.ifSettleAccounts = :s and h.validity = :v";
        Query query = openSession().createQuery(hql)
                .setParameter("s","0").setParameter("v","1");
        List<HydMain3> hyds = query.list();
        return hyds;
    }


    public List<HydMain3> listByCustomer(String customer) {
        String hql = "from HydMain3 h where h.sendGoodsCustomerNO = :s and h.validity = :v";
        Query query = openSession().createQuery(hql)
                .setParameter("s",customer).setParameter("v","1");
        List<HydMain3> driverHzds = query.list();
        return driverHzds;
    }

    public void updateValidity(String customer) {
        String hql = "update HydMain3 set validity =:v where goodsBillCode = :s";
        Query query = openSession().createQuery(hql).
                setParameter("v","0").setParameter("s",customer);
        query.executeUpdate();
    }

    public List<HydMain3> findByIfTransfer() {
        String hql = "from HydMain3 h where h.ifTransfer = :i and h.validity = :v";
        Query query = openSession().createQuery(hql)
                .setParameter("i","1").setParameter("v","1");
        List<HydMain3> ntHyds = query.list();
        return ntHyds;
    }

    public void updateIfJs(String code) {
        String hql = "update HydMain3 set ifSettleAccounts =:a where goodsBillCode = :s";
        Query query = openSession().createQuery(hql).
                setParameter("a","1").setParameter("s",code);
        query.executeUpdate();
    }


}
