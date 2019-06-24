package cn.xzxy.lewy.service;

import cn.xzxy.lewy.pojo.ComplainInfo16;

import java.util.List;

public interface IComplaintService {

    public void add(ComplainInfo16 complaintInfo);

    public void delete(int id);

    public void update(ComplainInfo16 complaintInfo);

    public ComplainInfo16 load(int id);

    public ComplainInfo16 get(int id);

    public List<ComplainInfo16> list();
}
