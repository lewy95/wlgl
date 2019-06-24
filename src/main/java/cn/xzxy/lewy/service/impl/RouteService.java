package cn.xzxy.lewy.service.impl;

import cn.xzxy.lewy.dao.IRouteDao;
import cn.xzxy.lewy.pojo.Route30;
import cn.xzxy.lewy.service.IRouteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
/**
 * Created by yuehailin on 2018/6/6.
 */
@Service
public class RouteService implements IRouteService {
    @Autowired
    IRouteDao routeDao;

    public void add(Route30 route30) {
        routeDao.add(route30);
    }

    public void delete(int id) {
        Route30 route = routeDao.load(id);
        routeDao.delete(route);
    }

    public void delete(Route30 route30) {
        routeDao.delete(route30);
    }

    public void update(Route30 route30) {
        routeDao.update(route30);
    }

    public Route30 load(int id) {
        return routeDao.load(id);
    }

    public Route30 get(int id) {
        return routeDao.get(id);
    }

    public List<Route30> list() {
        String hql = "select r from Route30 r";
        List<Route30> route30s = routeDao.list(hql,null);
        return route30s;
    }
}
