package cn.xzxy.lewy.pojo;

import javax.persistence.*;
import java.util.Date;

public class EmployeeSalary21 {

    private int id;
    private String EmployeeCode;//职员编号
    private Double BasicWage;//基本工资
    private Double StationWage;//岗位工资
    private Double Allowance;//津贴
    private Date Date;//日期
    private String Employee;//职员姓名

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

    public Double getBasicWage() {
        return BasicWage;
    }

    public void setBasicWage(Double basicWage) {
        BasicWage = basicWage;
    }

    public Double getStationWage() {
        return StationWage;
    }

    public void setStationWage(Double stationWage) {
        StationWage = stationWage;
    }

    public Double getAllowance() {
        return Allowance;
    }

    public void setAllowance(Double allowance) {
        Allowance = allowance;
    }

    @Temporal(TemporalType.TIMESTAMP)
    public Date getDate() {
        return Date;
    }

    public void setDate(Date date) {
        Date = date;
    }

    public String getEmployee() {
        return Employee;
    }

    public void setEmployee(String employee) {
        Employee = employee;
    }
}
