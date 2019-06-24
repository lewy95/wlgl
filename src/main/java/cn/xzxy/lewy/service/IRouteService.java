package cn.xzxy.lewy.service;

import cn.xzxy.lewy.pojo.Route30;

import java.util.List;

/**
 * Created by yuehailin on 2018/6/6.
 */
public interface IRouteService {
    public void add(Route30 route);

    public void delete(int id);

    public void  delete(Route30 route30);

    public void update(Route30 route);

    public Route30 load(int id);

    public Route30 get(int id);

    public List<Route30> list();
}
