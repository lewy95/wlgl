package cn.xzxy.lewy.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.xzxy.lewy.dao.ICallbackDao;
import cn.xzxy.lewy.pojo.CallBackInfo18;
import cn.xzxy.lewy.service.ICallbackService;

@Service
public class CallbackService implements ICallbackService{
	
	@Autowired
	ICallbackDao callbackDao;

	public void add(CallBackInfo18 callback) {
		callbackDao.add(callback);
	}

	public void delete(int id) {
		CallBackInfo18 callbackInfo = callbackDao.load(id);
		callbackDao.delete(callbackInfo);
	}

	public void update(CallBackInfo18 callback) {
		callbackDao.update(callback);
	}

	public CallBackInfo18 load(int id) {
		return callbackDao.load(id);
	}

	public CallBackInfo18 get(int id) {
		return callbackDao.get(id);
	}

	public List<CallBackInfo18> list() {
		String hql = "from CallBackInfo18";
        List<CallBackInfo18> callbackInfos = callbackDao.list(hql,null);
		return callbackInfos;
	}

}
