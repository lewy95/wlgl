package cn.xzxy.lewy.pojo;

import javax.persistence.*;
import java.util.Date;

/**
 * 营业外收入
 */
@Entity
@Table(name = "t_20_yywsr")
public class IncomeOutside20 {
    private int id;
    private String Name;
    private Double Money;
    private Date IncomeMonth;
    private Date WriteDate;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public Double getMoney() {
        return Money;
    }

    public void setMoney(Double money) {
        Money = money;
    }
    @Temporal(TemporalType.TIMESTAMP)
    public Date getIncomeMonth() {
        return IncomeMonth;
    }

    public void setIncomeMonth(Date incomeMonth) {
        IncomeMonth = incomeMonth;
    }

    @Temporal(TemporalType.TIMESTAMP)
    public Date getWriteDate() {
        return WriteDate;
    }

    public void setWriteDate(Date writeDate) {
        WriteDate = writeDate;
    }

    public IncomeOutside20(int id, String name, Double money, Date incomeMonth, Date writeDate) {
        this.id = id;
        Name = name;
        Money = money;
        IncomeMonth = incomeMonth;
        WriteDate = writeDate;
    }

    public IncomeOutside20(String name, Double money, Date incomeMonth, Date writeDate) {
        Name = name;
        Money = money;
        IncomeMonth = incomeMonth;
        WriteDate = writeDate;
    }

    public IncomeOutside20() {
    }
}
