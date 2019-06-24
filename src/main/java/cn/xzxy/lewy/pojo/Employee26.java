package cn.xzxy.lewy.pojo;

import javax.persistence.*;
import java.util.Date;


@Entity
@Table(name = "t_26_zyxx")
public class Employee26 {

    private int id;
    private String EmployeeCode;//职员编号
    private String Employee;//职员姓名
    private String Department;//部门
    private String Position;//职位
    private String Gender;//性别
    private Date Birthday;//出生日期

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmployeeCode() {
        return EmployeeCode;
    }

    public void setEmployeeCode(String employeeCode) {
        EmployeeCode = employeeCode;
    }

    public String getEmployee() {
        return Employee;
    }

    public void setEmployee(String employee) {
        Employee = employee;
    }

    public String getDepartment() {
        return Department;
    }

    public void setDepartment(String department) {
        Department = department;
    }

    public String getPosition() {
        return Position;
    }

    public void setPosition(String position) {
        Position = position;
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String gender) {
        Gender = gender;
    }

    @Temporal(TemporalType.TIMESTAMP)
    public Date getBirthday() {
        return Birthday;
    }

    public void setBirthday(Date birthday) {
        Birthday = birthday;
    }
}
