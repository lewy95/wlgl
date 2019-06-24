package cn.xzxy.lewy.dao.impl;

import cn.xzxy.lewy.dao.IDanjuDao;
import cn.xzxy.lewy.pojo.DjMingxi2;
import org.hibernate.query.Query;
import org.springframework.stereotype.Repository;


import java.util.List;

@Repository
public class DanjuDao extends BaseDao<DjMingxi2> implements IDanjuDao {

    public List<DjMingxi2> listYtDj() {
        String hql = "from DjMingxi2 d where d.billState = :b";
        Query query = openSession().createQuery(hql).setParameter("b","1");
        List<DjMingxi2> djmxs = query.list();
        return djmxs;
    }

    public List<DjMingxi2> listZfDj() {
        String hql = "from DjMingxi2 d where d.billState = :b";
        Query query = openSession().createQuery(hql).setParameter("b","0");
        List<DjMingxi2> djmxs = query.list();
        return djmxs;
    }

    public List<DjMingxi2> listYjDj() {
        String hql = "from DjMingxi2 d where d.billState = :b";
        Query query = openSession().createQuery(hql).setParameter("b","2");
        List<DjMingxi2> djmxs = query.list();
        return djmxs;
    }

    public DjMingxi2 findDjById(int id) {
        String hql = "from DjMingxi2 where id = :i";
        Query query = openSession().createQuery(hql).setParameter("i",id);
        DjMingxi2 djmx = (DjMingxi2) query.uniqueResult();
        return djmx;
    }

    public void updateDjState(int id, String state) {
        String hql = "update DjMingxi2 set billState = :s where id = :i";
        Query query = openSession().createQuery(hql)
                .setParameter("s",state).setParameter("i",id);
        query.executeUpdate();
    }
}
