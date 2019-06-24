package cn.xzxy.lewy.pojo;



import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Date;

/**
 * Created by yuehailin on 2018/6/4.
 */
@Entity
@Table(name = "t_13_khydjs")
public class CustomerBillJs13 {
    private int id;
    private String customer;
    private String goodsBillCode;
    private Double billMoney;
    private Double moneyReceivable;
    private Double receivedMoney;
    private Double prepayMoney;
    private Double carriageReduceFund;
    private Double balance;
    private Date balanceTime;
    private Double insurance;
    private Double payKickback;
    private Double carryGoodsFee;
    private String balanceType;
    
    
    public CustomerBillJs13() {
		super();
	}
    
    
	public CustomerBillJs13(String customer, String goodsBillCode, Double billMoney, Double moneyReceivable,
                            Double receivedMoney, Double prepayMoney, Double carriageReduceFund, Double balance, Date balanceTime,
                            Double insurance, Double payKickback, Double carryGoodsFee, String balanceType) {
		super();
		this.customer = customer;
		this.goodsBillCode = goodsBillCode;
		this.billMoney = billMoney;
		this.moneyReceivable = moneyReceivable;
		this.receivedMoney = receivedMoney;
		this.prepayMoney = prepayMoney;
		this.carriageReduceFund = carriageReduceFund;
		this.balance = balance;
		this.balanceTime = balanceTime;
		this.insurance = insurance;
		this.payKickback = payKickback;
		this.carryGoodsFee = carryGoodsFee;
		this.balanceType = balanceType;
	}
	
	

	public CustomerBillJs13(int id, String customer, String goodsBillCode, Double billMoney, Double moneyReceivable,
                            Double receivedMoney, Double prepayMoney, Double carriageReduceFund, Double balance, Date balanceTime,
                            Double insurance, Double payKickback, Double carryGoodsFee, String balanceType) {
		super();
		this.id = id;
		this.customer = customer;
		this.goodsBillCode = goodsBillCode;
		this.billMoney = billMoney;
		this.moneyReceivable = moneyReceivable;
		this.receivedMoney = receivedMoney;
		this.prepayMoney = prepayMoney;
		this.carriageReduceFund = carriageReduceFund;
		this.balance = balance;
		this.balanceTime = balanceTime;
		this.insurance = insurance;
		this.payKickback = payKickback;
		this.carryGoodsFee = carryGoodsFee;
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

    
    @Column(name = "BillMoney")
    public Double getBillMoney() {
        return billMoney;
    }

    public void setBillMoney(Double billMoney) {
        this.billMoney = billMoney;
    }

    
    @Column(name = "MoneyReceivable")
    public Double getMoneyReceivable() {
        return moneyReceivable;
    }

    public void setMoneyReceivable(Double moneyReceivable) {
        this.moneyReceivable = moneyReceivable;
    }

   
    @Column(name = "ReceivedMoney")
    public Double getReceivedMoney() {
        return receivedMoney;
    }

    public void setReceivedMoney(Double receivedMoney) {
        this.receivedMoney = receivedMoney;
    }

    
    @Column(name = "PrepayMoney")
    public Double getPrepayMoney() {
        return prepayMoney;
    }

    public void setPrepayMoney(Double prepayMoney) {
        this.prepayMoney = prepayMoney;
    }

    
    @Column(name = "CarriageReduceFund")
    public Double getCarriageReduceFund() {
        return carriageReduceFund;
    }

    public void setCarriageReduceFund(Double carriageReduceFund) {
        this.carriageReduceFund = carriageReduceFund;
    }

    
    @Column(name = "Balance")
    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

   
    @Column(name = "BalanceTime")
    @Temporal(TemporalType.TIMESTAMP)
    public Date getBalanceTime() {
        return balanceTime;
    }

    public void setBalanceTime(Date balanceTime) {
        this.balanceTime = balanceTime;
    }

    
    @Column(name = "Insurance")
    public Double getInsurance() {
        return insurance;
    }

    public void setInsurance(Double insurance) {
        this.insurance = insurance;
    }

    
    @Column(name = "PayKickback")
    public Double getPayKickback() {
        return payKickback;
    }

    public void setPayKickback(Double payKickback) {
        this.payKickback = payKickback;
    }

  
    @Column(name = "CarryGoodsFee")
    public Double getCarryGoodsFee() {
        return carryGoodsFee;
    }

    public void setCarryGoodsFee(Double carryGoodsFee) {
        this.carryGoodsFee = carryGoodsFee;
    }

   
    @Column(name = "BalanceType")
    public String getBalanceType() {
        return balanceType;
    }

    public void setBalanceType(String balanceType) {
        this.balanceType = balanceType;
    }

   
   
}
