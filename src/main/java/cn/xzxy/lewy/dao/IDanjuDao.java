package cn.xzxy.lewy.dao;

import cn.xzxy.lewy.pojo.DjMingxi2;

import java.util.List;

public interface IDanjuDao extends IBaseDao<DjMingxi2> {

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
