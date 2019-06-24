package cn.xzxy.lewy.service;

import cn.xzxy.lewy.pojo.TransferInfo10;

import java.util.List;

/**
 * Created by yuehailin on 2018/6/7.
 */
public interface ITransferInfoService {
    public void add(TransferInfo10 transferInfo);

    public void delete(int id);

    public void update(TransferInfo10 transferInfo);

    public TransferInfo10 load(int id);

    public TransferInfo10 get(int id);

    public List<TransferInfo10> list();
}
