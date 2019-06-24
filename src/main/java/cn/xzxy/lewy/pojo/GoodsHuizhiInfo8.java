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
 * 货物回执信息表
 */
@Entity
@Table(name = "t_8_hwhzxx")
public class GoodsHuizhiInfo8 {

	private int id;
	private String GoodsRevertCode;//货运回执编号
	private String DriverName;//司机名称
	private String CheckGoodsRecord;//验收货物记录
	private String ReceiveGoodsPerson;//收货人
	private Date ReceiveGoodsDate;//收货日期

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getGoodsRevertCode() {
		return GoodsRevertCode;
	}

	public void setGoodsRevertCode(String goodsRevertCode) {
		GoodsRevertCode = goodsRevertCode;
	}

	public String getDriverName() {
		return DriverName;
	}

	public void setDriverName(String driverName) {
		DriverName = driverName;
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

}
