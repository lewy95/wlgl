package cn.xzxy.lewy.dao.impl;

import cn.xzxy.lewy.dao.ICustomerDao;
import cn.xzxy.lewy.pojo.Customer25;
import org.hibernate.query.Query;
import org.springframework.stereotype.Repository;

@Repository
public class CustomerDao extends BaseDao<Customer25> implements ICustomerDao {

    public Customer25 findByCode(String customerCode){
        String hql = "from Customer25 c where c.customerCode = :code";
        Query query =  openSession().createQuery(hql).setParameter("code",customerCode);
        Customer25 customer = (Customer25) query.uniqueResult();
        return customer;
    }
}
