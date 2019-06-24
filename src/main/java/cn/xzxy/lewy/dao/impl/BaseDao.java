package cn.xzxy.lewy.dao.impl;

import cn.xzxy.lewy.dao.IBaseDao;
import cn.xzxy.lewy.util.Page;
import cn.xzxy.lewy.util.SystemContext;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;

import java.lang.reflect.ParameterizedType;
import java.util.List;

public class BaseDao<T> implements IBaseDao<T> {

    @Autowired
    private SessionFactory sessionFactory;

    public Session openSession(){
        return this.sessionFactory.getCurrentSession();
    }

    private Class<?> clz;
    private Class<?> getClz() {
        if(clz == null) {
            clz = (Class<?>) ((ParameterizedType)this.getClass()
                    .getGenericSuperclass()).getActualTypeArguments()[0];
        }
        return clz;
    }

    public void add(T t) {
        openSession().save(t);
    }

    public void delete(T t) {
        openSession().delete(t);
    }

    public void update(T t) {
        openSession().update(t);
    }

    public T load(int id) {
        T t = (T) openSession().load(getClz(), id);
        return t;
    }

    public T get(int id) {
        T t = (T) openSession().get(getClz(), id);
        return t;
    }

    public List<T> list(String hql, Object[] args) {
        // TODO Auto-generated method stub
        Query query = openSession().createQuery(hql);
        if(args != null) {
            for(int i = 0; i < args.length; i++) {
                query.setParameter(i, args[i]);
            }
        }
        List<T> ts = query.list();
        return ts;
    }

    public Page<T> page(String hql, String countHql) {
        // TODO Auto-generated method stub
        int pageIndex = SystemContext.getPageIndex();
        int pageSize = SystemContext.getPageSize();
        int start = (pageIndex - 1)*pageSize;
        Page<T> datas = new Page<T>();
        List<T> pages = openSession().createQuery(hql)
                .setFirstResult(start).setMaxResults(pageSize).list();
        long totalRecord = (Long) openSession().createQuery(countHql).uniqueResult();
        int totalPage = ((int)totalRecord - 1) /pageSize + 1;
        datas.setPageIndex(pageIndex);
        datas.setPages(pages);
        datas.setPageSize(pageSize);
        datas.setTotalPage(totalPage);
        datas.setTotalRecord((int)totalRecord);
        return datas;
    }
}
