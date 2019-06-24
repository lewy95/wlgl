package cn.xzxy.lewy.pojo;



import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Date;

/**
 * Created by yuehailin on 2018/6/4.
 */
@Entity
@Table(name = "t_14_dshkjs")
public class DaishouGoodsJs14 {
    private int id;
    private String customer;
    private String goodsBillCode;
    private Double accountReceivable;
    private Double factReceiveFund;
    private Double goodsPayChange;
    private Double commisionRate;
    private Double commisionReceivable;
    private Double receivedCommision;
    private Date balanceDate;
    
    
    
    public DaishouGoodsJs14() {
		super();
	}
    
    

	public DaishouGoodsJs14(String customer, String goodsBillCode, Double accountReceivable, Double factReceiveFund,
                            Double goodsPayChange, Double commisionRate, Double commisionReceivable, Double receivedCommision,
                            Date balanceDate) {
		super();
		this.customer = customer;
		this.goodsBillCode = goodsBillCode;
		this.accountReceivable = accountReceivable;
		this.factReceiveFund = factReceiveFund;
		this.goodsPayChange = goodsPayChange;
		this.commisionRate = commisionRate;
		this.commisionReceivable = commisionReceivable;
		this.receivedCommision = receivedCommision;
		this.balanceDate = balanceDate;
	}

	

	public DaishouGoodsJs14(int id, String customer, String goodsBillCode, Double accountReceivable,
                            Double factReceiveFund, Double goodsPayChange, Double commisionRate, Double commisionReceivable,
                            Double receivedCommision, Date balanceDate) {
		super();
		this.id = id;
		this.customer = customer;
		this.goodsBillCode = goodsBillCode;
		this.accountReceivable = accountReceivable;
		this.factReceiveFund = factReceiveFund;
		this.goodsPayChange = goodsPayChange;
		this.commisionRate = commisionRate;
		this.commisionReceivable = commisionReceivable;
		this.receivedCommision = receivedCommision;
		this.balanceDate = balanceDate;
	}



	@Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Column(name = "Customer")
    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    
    @Column(name = "GoodsBillCode")
    public String getGoodsBillCode() {
        return goodsBillCode;
    }

    public void setGoodsBillCode(String goodsBillCode) {
        this.goodsBillCode = goodsBillCode;
    }

    
    @Column(name = "AccountReceivable")
    public Double getAccountReceivable() {
        return accountReceivable;
    }

    public void setAccountReceivable(Double accountReceivable) {
        this.accountReceivable = accountReceivable;
    }

  
    @Column(name = "FactReceiveFund")
    public Double getFactReceiveFund() {
        return factReceiveFund;
    }

    public void setFactReceiveFund(Double factReceiveFund) {
        this.factReceiveFund = factReceiveFund;
    }

 
    @Column(name = "GoodsPayChange")
    public Double getGoodsPayChange() {
        return goodsPayChange;
    }

    public void setGoodsPayChange(Double goodsPayChange) {
        this.goodsPayChange = goodsPayChange;
    }

   
    @Column(name = "CommisionRate")
    public Double getCommisionRate() {
        return commisionRate;
    }

    public void setCommisionRate(Double commisionRate) {
        this.commisionRate = commisionRate;
    }

 
    @Column(name = "CommisionReceivable")
    public Double getCommisionReceivable() {
        return commisionReceivable;
    }

    public void setCommisionReceivable(Double commisionReceivable) {
        this.commisionReceivable = commisionReceivable;
    }

    
    @Column(name = "ReceivedCommision")
    public Double getReceivedCommision() {
        return receivedCommision;
    }

    public void setReceivedCommision(Double receivedCommision) {
        this.receivedCommision = receivedCommision;
    }

  
    @Column(name = "BalanceDate")
    @Temporal(TemporalType.TIMESTAMP)
    public Date getBalanceDate() {
        return balanceDate;
    }

    public void setBalanceDate(Date balanceDate) {
        this.balanceDate = balanceDate;
    }

}
