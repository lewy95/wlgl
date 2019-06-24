package cn.xzxy.lewy.dao.impl;

import cn.xzxy.lewy.dao.IDriverDao;
import cn.xzxy.lewy.pojo.Driver27;
import org.hibernate.query.Query;
import org.springframework.stereotype.Repository;

@Repository
public class DriverDao extends BaseDao<Driver27> implements IDriverDao {

    public Driver27 findByName(String driverName) {
        String hql = "from Driver27 where driverName = :d";
        Query query = openSession().createQuery(hql).setParameter("d",driverName);
        Driver27 driver = (Driver27) query.uniqueResult();
        return driver;
    }
}
