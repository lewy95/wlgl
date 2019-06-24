package cn.xzxy.lewy.service;

import cn.xzxy.lewy.pojo.Driver27;
import cn.xzxy.lewy.util.Page;

import java.util.List;

public interface IDriverService {

    public void add(Driver27 driver);

    public void delete(int id);

    public void update(Driver27 driver);

    public Driver27 load(int id);

    public Driver27 get(int id);

    public List<Driver27> list();

    public Page<Driver27> listByPage();

    public Driver27 findByName(String driverName);
}
