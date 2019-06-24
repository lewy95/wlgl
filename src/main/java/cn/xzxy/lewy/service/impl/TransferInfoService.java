package cn.xzxy.lewy.service.impl;

import cn.xzxy.lewy.dao.ITransferInfoDao;
import cn.xzxy.lewy.pojo.TransferInfo10;
import cn.xzxy.lewy.service.ITransferInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by yuehailin on 2018/6/7.
 */
@Repository
public class TransferInfoService implements ITransferInfoService {

    @Autowired
    ITransferInfoDao transferInfoDao;

    public void add(TransferInfo10 transferInfo) {
        transferInfoDao.add(transferInfo);
    }

    public void delete(int id) {
        TransferInfo10 transferInfo = transferInfoDao.load(id);
        transferInfoDao.delete(transferInfo);
    }

    public void update(TransferInfo10 transferInfo) {
        transferInfoDao.update(transferInfo);
    }

    public TransferInfo10 load(int id) {
        return transferInfoDao.load(id);
    }

    public TransferInfo10 get(int id) {
        return transferInfoDao.get(id);
    }

    public List<TransferInfo10> list() {
        String hql = "select r from TransferInfo10 r";
        List<TransferInfo10> transferInfo10s = transferInfoDao.list(hql,null);
        return transferInfo10s;
    }
}
