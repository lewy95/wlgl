package cn.xzxy.lewy.service.impl;

import cn.xzxy.lewy.dao.IHyhzdDetailDao;
import cn.xzxy.lewy.pojo.HydHuizhiDetail5;
import cn.xzxy.lewy.service.IHyhzdDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HyhzdDetailService implements IHyhzdDetailService {

    @Autowired
    IHyhzdDetailDao hyhzdDetailDao;

    public void add(HydHuizhiDetail5 hyhzdx) {
        hyhzdDetailDao.add(hyhzdx);
    }

    public void update(HydHuizhiDetail5 hyhzdx) {
        hyhzdDetailDao.update(hyhzdx);
    }

    public HydHuizhiDetail5 load(int id) {
        return hyhzdDetailDao.load(id);
    }

    public HydHuizhiDetail5 get(int id) {
        return hyhzdDetailDao.get(id);
    }

    public List<HydHuizhiDetail5> list() {
        String hql = "from HydHuizhiDetail5";
        List<HydHuizhiDetail5> hydhzxs = hyhzdDetailDao.list(hql, null);
        return hydhzxs;
    }

    public HydHuizhiDetail5 findByHzId(int hzId) {
        return hyhzdDetailDao.findByHzId(hzId);
    }
}
