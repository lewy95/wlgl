package cn.xzxy.lewy.service;

import cn.xzxy.lewy.pojo.User33;

public interface IUserService {
    public User33 login(String username, String password);

    public void add(User33 user);

    public void update(User33 user);
}
