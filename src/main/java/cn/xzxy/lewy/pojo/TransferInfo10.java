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
 * 中转信息表
 */
@Entity
@Table(name = "t_10_zzxx")
public class TransferInfo10 {

	private int id;
	private String GoodsBillCode;//货运单编号
	private String TransferStation;//中转地
	private String TransferCheck;//中转验收人
	private Date CheckTime;//验收时间
	private String Description;//描述
	private String TransferCompany;//中转公司名
	private String TransferAddr;//中转地址
	private String TransferStationTel;//中转地电话
	private String TransferFee;//中转费
	private String AfterTransferBill;//中转后单号

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

	public String getTransferStation() {
		return TransferStation;
	}

	public void setTransferStation(String transferStation) {
		TransferStation = transferStation;
	}

	public String getTransferCheck() {
		return TransferCheck;
	}

	public void setTransferCheck(String transferCheck) {
		TransferCheck = transferCheck;
	}

	@Temporal(value = TemporalType.TIMESTAMP)
	public Date getCheckTime() {
		return CheckTime;
	}

	public void setCheckTime(Date checkTime) {
		CheckTime = checkTime;
	}

	public String getDescription() {
		return Description;
	}

	public void setDescription(String description) {
		Description = description;
	}

	public String getTransferCompany() {
		return TransferCompany;
	}

	public void setTransferCompany(String transferCompany) {
		TransferCompany = transferCompany;
	}

	public String getTransferAddr() {
		return TransferAddr;
	}

	public void setTransferAddr(String transferAddr) {
		TransferAddr = transferAddr;
	}

	public String getTransferStationTel() {
		return TransferStationTel;
	}

	public void setTransferStationTel(String transferStationTel) {
		TransferStationTel = transferStationTel;
	}

	public String getTransferFee() {
		return TransferFee;
	}

	public void setTransferFee(String transferFee) {
		TransferFee = transferFee;
	}

	public String getAfterTransferBill() {
		return AfterTransferBill;
	}

	public void setAfterTransferBill(String afterTransferBill) {
		AfterTransferBill = afterTransferBill;
	}

}
