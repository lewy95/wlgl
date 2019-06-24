package cn.xzxy.lewy.pojo;



import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Date;

/**
 * Created by yuehailin on 2018/6/4.
 */
@Entity
@Table(name = "t_15_zfjs")
public class ZahuoJs15 {
    private int id;
    private String subjectName;
    private Double balanceMoney;
    private String remark;
    private Date balanceDate;
    private String balanceType;
    
    public ZahuoJs15() {
		super();
	}
    
    
	public ZahuoJs15(String subjectName, Double balanceMoney, String remark, Date balanceDate, String balanceType) {
		super();
		this.subjectName = subjectName;
		this.balanceMoney = balanceMoney;
		this.remark = remark;
		this.balanceDate = balanceDate;
		this.balanceType = balanceType;
	}
	
	

	public ZahuoJs15(int id, String subjectName, Double balanceMoney, String remark, Date balanceDate,
                     String balanceType) {
		super();
		this.id = id;
		this.subjectName = subjectName;
		this.balanceMoney = balanceMoney;
		this.remark = remark;
		this.balanceDate = balanceDate;
		this.balanceType = balanceType;
	}


	@Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    
    @Column(name = "SubjectName")
    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

   
    @Column(name = "BalanceMoney")
    public Double getBalanceMoney() {
        return balanceMoney;
    }

    public void setBalanceMoney(Double balanceMoney) {
        this.balanceMoney = balanceMoney;
    }

   
    @Column(name = "Remark")
    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

   
    @Column(name = "BalanceDate")
    @Temporal(TemporalType.TIMESTAMP)
    public Date getBalanceDate() {
        return balanceDate;
    }

    public void setBalanceDate(Date balanceDate) {
        this.balanceDate = balanceDate;
    }

    
    @Column(name = "BalanceType")
    public String getBalanceType() {
        return balanceType;
    }

    public void setBalanceType(String balanceType) {
        this.balanceType = balanceType;
    }

   
}
