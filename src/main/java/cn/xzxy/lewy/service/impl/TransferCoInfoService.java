package cn.xzxy.lewy.service.impl;

import cn.xzxy.lewy.dao.ITransferCoInfoDao;
import cn.xzxy.lewy.pojo.TransferCoInfo11;
import cn.xzxy.lewy.service.ITransferCoInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by yuehailin on 2018/6/7.
 */
@Service
public class TransferCoInfoService implements ITransferCoInfoService {
    @Autowired
    ITransferCoInfoDao transferCoInfoDao;

    public void add(TransferCoInfo11 transferCoInfo) {
        transferCoInfoDao.add(transferCoInfo);
    }

    public List<TransferCoInfo11> list() {
        String hql = "select tr from TransferCoInfo11 tr";
        List<TransferCoInfo11> transferCoInfos = transferCoInfoDao.list(hql,null);
        return transferCoInfos;
    }
}
