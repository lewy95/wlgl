package cn.xzxy.lewy.pojo;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * 司机结算主表
 * */
@Entity
@Table(name="t_12_sjjs")
public class DriverJsMain12 {

	private int id;
	private String DriverName;//司机名称
	private String BalanceType;//结算类型
	private String BackBillCode;//回执单编号
	private double NeedPayment;//应付金额
	private double CarryFee;//承运费
	private double PrepayMoney;//预付金额
	private double BindInsurance;//订装保证金
	private double AddCarriage;//加运费
	private double PayedMoney;//已付金额
	private double Balance;//余额
	private Date BalanceTime;//结算时间
	private double DispatchServiceFee;//配载服务费
	private double Insurance;//保险费

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDriverName() {
		return DriverName;
	}

	public void setDriverName(String driverName) {
		DriverName = driverName;
	}

	public String getBalanceType() {
		return BalanceType;
	}

	public void setBalanceType(String balanceType) {
		BalanceType = balanceType;
	}

	public String getBackBillCode() {
		return BackBillCode;
	}

	public void setBackBillCode(String backBillCode) {
		BackBillCode = backBillCode;
	}

	public double getNeedPayment() {
		return NeedPayment;
	}

	public void setNeedPayment(double needPayment) {
		NeedPayment = needPayment;
	}

	public double getCarryFee() {
		return CarryFee;
	}

	public void setCarryFee(double carryFee) {
		CarryFee = carryFee;
	}

	public double getPrepayMoney() {
		return PrepayMoney;
	}

	public void setPrepayMoney(double prepayMoney) {
		PrepayMoney = prepayMoney;
	}

	public double getBindInsurance() {
		return BindInsurance;
	}

	public void setBindInsurance(double bindInsurance) {
		BindInsurance = bindInsurance;
	}

	public double getAddCarriage() {
		return AddCarriage;
	}

	public void setAddCarriage(double addCarriage) {
		AddCarriage = addCarriage;
	}

	public double getPayedMoney() {
		return PayedMoney;
	}

	public void setPayedMoney(double payedMoney) {
		PayedMoney = payedMoney;
	}

	public double getBalance() {
		return Balance;
	}

	public void setBalance(double balance) {
		Balance = balance;
	}

	@Temporal(value = TemporalType.TIMESTAMP)
	public Date getBalanceTime() {
		return BalanceTime;
	}

	public void setBalanceTime(Date balanceTime) {
		BalanceTime = balanceTime;
	}

	public double getDispatchServiceFee() {
		return DispatchServiceFee;
	}

	public void setDispatchServiceFee(double dispatchServiceFee) {
		DispatchServiceFee = dispatchServiceFee;
	}

	public double getInsurance() {
		return Insurance;
	}

	public void setInsurance(double insurance) {
		Insurance = insurance;
	}

}
