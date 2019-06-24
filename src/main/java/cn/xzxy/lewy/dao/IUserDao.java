package cn.xzxy.lewy.dao;

import cn.xzxy.lewy.pojo.User33;


public interface IUserDao extends IBaseDao<User33> {
    public User33 login(String username);
}
