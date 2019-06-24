package cn.xzxy.lewy.dao.impl;

import cn.xzxy.lewy.dao.IUserDao;
import cn.xzxy.lewy.pojo.User33;
import org.springframework.stereotype.Repository;

@Repository
public class UserDao extends BaseDao<User33> implements IUserDao {

    public User33 login(String username) {
        // TODO Auto-generated method stub
        String hql = "select u from User33 u where loginid=?";
        User33 user = (User33) openSession().createQuery(hql)
                .setParameter(0, username).uniqueResult();
        return user;
    }

}
