package cn.xzxy.lewy.service;

import cn.xzxy.lewy.pojo.GoodsMistake9;

import java.util.List;

public interface IHzdMistakeService {

    public void add(GoodsMistake9 mistake);

    public void delete(int id);

    public void update(GoodsMistake9 mistake);

    public GoodsMistake9 load(int id);

    public GoodsMistake9 get(int id);

    public List<GoodsMistake9> list();
}
