package cn.xzxy.lewy.service;

import cn.xzxy.lewy.pojo.DjMingxi2;

import java.util.List;

public interface IDanjuService {

    public void add(DjMingxi2 djmx);

    public void delete(int id);

    public void update(DjMingxi2 djmx);

    public DjMingxi2 load(int id);

    public DjMingxi2 get(int id);

    public List<DjMingxi2> list();

    //查询已填票据
    public List<DjMingxi2> listYtDj();

    //查询作废票据
    public List<DjMingxi2> listZfDj();

    //查询结账票据
    public List<DjMingxi2> listYjDj();

    //根据id查询单据
    public DjMingxi2 findDjById(int id);

    //根据id修改单据状态
    public void updateDjState(int id, String state);

}
