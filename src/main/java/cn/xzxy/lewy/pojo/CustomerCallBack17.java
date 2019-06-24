package cn.xzxy.lewy.pojo;



import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by yuehailin on 2018/6/4.
 */
@Entity
@Table(name = "t_17_khhg")
public class CustomerCallBack17 {
    private int id;
    private Integer goodsBillPkid;
    private Boolean ifCallback;
    
    
    public CustomerCallBack17() {
		super();
	}
    
    
	public CustomerCallBack17(Integer goodsBillPkid, Boolean ifCallback) {
		super();
		this.goodsBillPkid = goodsBillPkid;
		this.ifCallback = ifCallback;
	}
	
	

	public CustomerCallBack17(int id, Integer goodsBillPkid, Boolean ifCallback) {
		super();
		this.id = id;
		this.goodsBillPkid = goodsBillPkid;
		this.ifCallback = ifCallback;
	}


	@Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "GoodsBillPKID")
    public Integer getGoodsBillPkid() {
        return goodsBillPkid;
    }

    public void setGoodsBillPkid(Integer goodsBillPkid) {
        this.goodsBillPkid = goodsBillPkid;
    }

    @Basic
    @Column(name = "IfCallback")
    public Boolean getIfCallback() {
        return ifCallback;
    }

    public void setIfCallback(Boolean ifCallback) {
        this.ifCallback = ifCallback;
    }

   
}
