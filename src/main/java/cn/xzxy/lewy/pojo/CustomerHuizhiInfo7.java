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
 * 客户回执信息表
 * */
@Entity
@Table(name = "t_7_khhzxx")
public class CustomerHuizhiInfo7 {

	private int id;
	private String GoodsBillCode;//货运单编号
	private String Customer;//客户名称
	private String CheckGoodsRecord;//验收货物记录
	private String ReceiveGoodsPerson;//收货人
	private Date ReceiveGoodsDate;//收货日期
	private int CarryBillEventID;//运单事件ID

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getGoodsBillCode() {
		return GoodsBillCode;
	}

	public void setGoodsBillCode(String goodsBillCode) {
		GoodsBillCode = goodsBillCode;
	}

	public String getCustomer() {
		return Customer;
	}

	public void setCustomer(String customer) {
		Customer = customer;
	}

	public String getCheckGoodsRecord() {
		return CheckGoodsRecord;
	}

	public void setCheckGoodsRecord(String checkGoodsRecord) {
		CheckGoodsRecord = checkGoodsRecord;
	}

	public String getReceiveGoodsPerson() {
		return ReceiveGoodsPerson;
	}

	public void setReceiveGoodsPerson(String receiveGoodsPerson) {
		ReceiveGoodsPerson = receiveGoodsPerson;
	}

	@Temporal(value = TemporalType.TIMESTAMP)
	public Date getReceiveGoodsDate() {
		return ReceiveGoodsDate;
	}

	public void setReceiveGoodsDate(Date receiveGoodsDate) {
		ReceiveGoodsDate = receiveGoodsDate;
	}

	public int getCarryBillEventID() {
		return CarryBillEventID;
	}

	public void setCarryBillEventID(int carryBillEventID) {
		CarryBillEventID = carryBillEventID;
	}

}
