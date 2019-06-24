package cn.xzxy.lewy.service.impl;

import cn.xzxy.lewy.dao.IHzdMistakeDao;
import cn.xzxy.lewy.pojo.GoodsMistake9;
import cn.xzxy.lewy.service.IHzdMistakeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HzdMistakeService implements IHzdMistakeService {

    @Autowired
    IHzdMistakeDao hzdMistakeDao;

    public void add(GoodsMistake9 mistake) {
        hzdMistakeDao.add(mistake);
    }

    public void delete(int id) {
        GoodsMistake9 driverHzd = hzdMistakeDao.load(id);
        hzdMistakeDao.delete(driverHzd);
    }

    public void update(GoodsMistake9 mistake) {
        hzdMistakeDao.update(mistake);
    }

    public GoodsMistake9 load(int id) {
        return hzdMistakeDao.load(id);
    }

    public GoodsMistake9 get(int id) {
        return hzdMistakeDao.get(id);
    }

    public List<GoodsMistake9> list() {
        String hql = "from GoodsMistake9";
        List<GoodsMistake9> mistakes = hzdMistakeDao.list(hql,null);
        return mistakes;
    }
}
