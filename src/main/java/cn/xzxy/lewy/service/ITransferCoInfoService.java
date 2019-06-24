package cn.xzxy.lewy.service;

import cn.xzxy.lewy.pojo.TransferCoInfo11;

import java.util.List;

/**
 * Created by yuehailin on 2018/6/7.
 */
public interface ITransferCoInfoService {
    public void add(TransferCoInfo11 transferCoInfo);

    public List<TransferCoInfo11> list();
}
