package cn.xzxy.lewy.pojo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * 中转公司信息表
 */
@Entity
@Table(name = "t_11_zzgsxx")
public class TransferCoInfo11 {

	private int id;
	private String City;//城市
	private String CompanyName;//公司名称
	private String LinkPhone;//联系电话
	private String DetailAddress;//详细地址

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCity() {
		return City;
	}

	public void setCity(String city) {
		City = city;
	}

	public String getCompanyName() {
		return CompanyName;
	}

	public void setCompanyName(String companyName) {
		CompanyName = companyName;
	}

	public String getLinkPhone() {
		return LinkPhone;
	}

	public void setLinkPhone(String linkPhone) {
		LinkPhone = linkPhone;
	}

	public String getDetailAddress() {
		return DetailAddress;
	}

	public void setDetailAddress(String detailAddress) {
		DetailAddress = detailAddress;
	}

}
