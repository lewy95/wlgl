package cn.xzxy.lewy.service;

import cn.xzxy.lewy.pojo.Employee26;
import cn.xzxy.lewy.util.Page;

import java.util.List;

public interface IEmployeeService {

    public void add(Employee26 employee);

    public void delete(int id);

    public void update(Employee26 employee);

    public Employee26 load(int id);

    public Employee26 get(int id);

    public List<Employee26> list();

    public Page<Employee26> listByPage();
}
