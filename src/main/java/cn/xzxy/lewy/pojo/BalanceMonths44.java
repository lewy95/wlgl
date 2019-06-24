package cn.xzxy.lewy.pojo;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "t_44_syyb")
public class BalanceMonths44 {

    private int id;
    private String Category;//大类
    private String MidCategory;//中类
    private String SubType;//小类
    private double Money;//金额
    private Date StatStartDate;//统计起始日期
    private Date StatEndDate;//统计结束日期
    private Date BalanceDate;//结算日期

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCategory() {
        return Category;
    }

    public void setCategory(String category) {
        Category = category;
    }

    public String getMidCategory() {
        return MidCategory;
    }

    public void setMidCategory(String midCategory) {
        MidCategory = midCategory;
    }

    public String getSubType() {
        return SubType;
    }

    public void setSubType(String subType) {
        SubType = subType;
    }

    public double getMoney() {
        return Money;
    }

    public void setMoney(double money) {
        Money = money;
    }

    @Temporal(value = TemporalType.TIMESTAMP)
    public Date getStatStartDate() {
        return StatStartDate;
    }

    public void setStatStartDate(Date statStartDate) {
        StatStartDate = statStartDate;
    }

    @Temporal(value = TemporalType.TIMESTAMP)
    public Date getStatEndDate() {
        return StatEndDate;
    }

    public void setStatEndDate(Date statEndDate) {
        StatEndDate = statEndDate;
    }

    @Temporal(value = TemporalType.TIMESTAMP)
    public Date getBalanceDate() {
        return BalanceDate;
    }

    public void setBalanceDate(Date balanceDate) {
        BalanceDate = balanceDate;
    }
}
