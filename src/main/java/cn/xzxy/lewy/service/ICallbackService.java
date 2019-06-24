package cn.xzxy.lewy.service;

import java.util.List;

import cn.xzxy.lewy.pojo.CallBackInfo18;
import cn.xzxy.lewy.util.Page;

public interface ICallbackService {

	public void add(CallBackInfo18 callback);

    public void delete(int id);

    public void update(CallBackInfo18 callback);

    public CallBackInfo18 load(int id);

    public CallBackInfo18 get(int id);

    public List<CallBackInfo18> list();
}
