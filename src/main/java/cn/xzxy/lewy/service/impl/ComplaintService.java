package cn.xzxy.lewy.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.xzxy.lewy.dao.IComplaintDao;
import cn.xzxy.lewy.pojo.ComplainInfo16;
import cn.xzxy.lewy.service.IComplaintService;

import java.util.List;

@Service
public class ComplaintService implements IComplaintService {

    @Autowired
    IComplaintDao complaintDao;

    public void add(ComplainInfo16 complaintInfo) {
        complaintDao.add(complaintInfo);
    }

    public void delete(int id) {
        ComplainInfo16 complaintInfo = complaintDao.load(id);
        complaintDao.delete(complaintInfo);
    }

    public void update(ComplainInfo16 complaintInfo) {
        complaintDao.update(complaintInfo);
    }

    public ComplainInfo16 load(int id) {
        return complaintDao.load(id);
    }

    public ComplainInfo16 get(int id) {
        return complaintDao.get(id);
    }

    public List<ComplainInfo16> list() {
        String hql = "from ComplainInfo16";
        List<ComplainInfo16> complainInfos = complaintDao.list(hql,null);
        return complainInfos;
    }
}
