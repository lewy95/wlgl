package cn.xzxy.lewy.service.impl;

import cn.xzxy.lewy.dao.ICityDao;
import cn.xzxy.lewy.pojo.City28;
import cn.xzxy.lewy.service.ICityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by yuehailin on 2018/6/7.
 */
@Service
public class CityService implements ICityService {
    @Autowired
    ICityDao cityDao;

    public void add(City28 city) {
        cityDao.add(city);
    }

    public void delete(int id) {
        City28 city = cityDao.load(id);
        cityDao.delete(city);
    }

    public void delete(City28 city) {
        cityDao.delete(city);
    }

    public void update(City28 city) {
        cityDao.update(city);
    }

    public City28 load(int id) {
        return cityDao.load(id);
    }

    public City28 get(int id) {
        return cityDao.get(id);
    }

    public List<City28> list() {
        String hql = "from City28";
        List<City28> city28s = cityDao.list(hql, null);
        return city28s;
    }
}
