package cn.xzxy.lewy.dao;

import cn.xzxy.lewy.util.Page;

import java.util.List;

public interface IBaseDao<T> {
    public void add(T t);
    public void delete(T t);
    public void update(T t);
    public T load(int id);
    public T get(int id);
    public List<T> list(String hql, Object args[]);
    public Page<T> page(String hql, String countHql);
}
