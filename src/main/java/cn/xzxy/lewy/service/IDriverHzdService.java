package cn.xzxy.lewy.service;

import cn.xzxy.lewy.pojo.GoodsHuizhiInfo8;
import cn.xzxy.lewy.util.Page;

import java.util.List;

public interface IDriverHzdService {

    public void add(GoodsHuizhiInfo8 driverHzd);

    public void delete(int id);

    public void update(GoodsHuizhiInfo8 driverHzd);

    public GoodsHuizhiInfo8 load(int id);

    public GoodsHuizhiInfo8 get(int id);

    public List<GoodsHuizhiInfo8> list();
}
