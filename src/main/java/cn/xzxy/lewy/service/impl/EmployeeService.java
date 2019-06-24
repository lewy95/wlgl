package cn.xzxy.lewy.service.impl;

import cn.xzxy.lewy.dao.IEmployeeDao;
import cn.xzxy.lewy.pojo.Employee26;
import cn.xzxy.lewy.service.IEmployeeService;
import cn.xzxy.lewy.util.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService implements IEmployeeService {

    @Autowired
    IEmployeeDao employeeDao;

    public void add(Employee26 employee) {
        employeeDao.add(employee);
    }

    public void delete(int id) {
        Employee26 employee = employeeDao.load(id);
        employeeDao.delete(employee);
    }

    public void update(Employee26 employee) {
        employeeDao.update(employee);
    }

    public Employee26 load(int id) {
        return employeeDao.load(id);
    }

    public Employee26 get(int id) {
        return employeeDao.get(id);
    }

    public List<Employee26> list() {
        String hql = "select e from Employee26 e";
        List<Employee26> employees = employeeDao.list(hql,null);
        return employees;
    }

    public Page<Employee26> listByPage() {
        String hql = "from Employee26";
        String countHql = "select count(*)" + hql;
        return employeeDao.page(hql, countHql);
    }
}
