package cn.xzxy.lewy.dao;

import cn.xzxy.lewy.pojo.Driver27;

public interface IDriverDao extends IBaseDao<Driver27> {

    public Driver27 findByName(String driverName);
}
