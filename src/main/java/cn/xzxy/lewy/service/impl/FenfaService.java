package cn.xzxy.lewy.service.impl;

import cn.xzxy.lewy.dao.IFenfaDao;
import cn.xzxy.lewy.pojo.DjFenfa1;
import cn.xzxy.lewy.service.IFenfaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FenfaService implements IFenfaService{
    @Autowired
    private IFenfaDao fenfaDao;

    public void add(DjFenfa1 djFenfa1) {
        fenfaDao.add(djFenfa1);
    }
}
