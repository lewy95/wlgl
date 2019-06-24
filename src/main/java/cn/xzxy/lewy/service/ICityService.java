package cn.xzxy.lewy.service;

import cn.xzxy.lewy.pojo.City28;

import java.util.List;

/**
 * Created by yuehailin on 2018/6/7.
 */
public interface ICityService {
    public void add(City28 city);

    public void delete(int id);

    public void delete(City28 city);

    public void update(City28 city);

    public City28 load(int id);

    public City28 get(int id);

    public List<City28> list();
}
