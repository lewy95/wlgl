package cn.xzxy.lewy.service.impl;

import cn.xzxy.lewy.dao.IUserDao;
import cn.xzxy.lewy.exception.UserException;
import cn.xzxy.lewy.pojo.User33;
import cn.xzxy.lewy.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService implements IUserService {

    @Autowired
    private IUserDao userDao;

    public User33 login(String loginid, String password) {
        // TODO Auto-generated method stub
        User33 user = userDao.login(loginid);
        if(user == null) {
            throw new UserException("用户名不存在");
        }
        if(!user.getPassword().equals(password)) {
            throw new UserException("密码错误");
        }
        return user;
    }

    public void add(User33 user) {
        userDao.add(user);
    }

    public void update(User33 user) {
        userDao.update(user);
    }
}
