package cn.xzxy.lewy.pojo;

import javax.persistence.*;
import java.util.Date;

/**
 * 财务费用表
 */
@Entity
@Table(name = "t_22_cwfy")
public class FinanceFee22 {
    private int id;
    private double FinanceFee;
    private Date PayoutMonth;
    private Date WriteDate;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getFinanceFee() {
        return FinanceFee;
    }

    public void setFinanceFee(double financeFee) {
        FinanceFee = financeFee;
    }

    @Temporal(TemporalType.TIMESTAMP)
    public Date getPayoutMonth() {
        return PayoutMonth;
    }

    public void setPayoutMonth(Date payoutMonth) {
        PayoutMonth = payoutMonth;
    }

    @Temporal(TemporalType.TIMESTAMP)
    public Date getWriteDate() {
        return WriteDate;
    }

    public void setWriteDate(Date writeDate) {
        WriteDate = writeDate;
    }

    public FinanceFee22(int id, double financeFee, Date payoutMonth, Date writeDate) {
        this.id = id;
        FinanceFee = financeFee;
        PayoutMonth = payoutMonth;
        WriteDate = writeDate;
    }

    public FinanceFee22(double financeFee, Date payoutMonth, Date writeDate) {
        FinanceFee = financeFee;
        PayoutMonth = payoutMonth;
        WriteDate = writeDate;
    }

    public FinanceFee22() {
    }
}
