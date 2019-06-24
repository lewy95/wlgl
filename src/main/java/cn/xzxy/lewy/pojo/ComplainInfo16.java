package cn.xzxy.lewy.pojo;



import javax.persistence.*;

/**
 * Created by yuehailin on 2018/6/4.
 */
@Entity
@Table(name = "t_16_tsxx")
public class ComplainInfo16 {
    private int id;
    private String customer;
    private String goodsBillCode;
    private String appealContent;
    private String appealDate;
    private String ifHandle;
    private String dealDate;
    private String dealResult;
    private String ifCallback;
    private String callBackDate;
    private String dealPerson;
    
    
    
    public ComplainInfo16() {
		super();
	}
    
    
	public ComplainInfo16(String customer, String goodsBillCode, String appealContent, String appealDate,
                          String ifHandle, String dealDate, String dealResult, String ifCallback, String callBackDate,
                          String dealPerson) {
		super();
		this.customer = customer;
		this.goodsBillCode = goodsBillCode;
		this.appealContent = appealContent;
		this.appealDate = appealDate;
		this.ifHandle = ifHandle;
		this.dealDate = dealDate;
		this.dealResult = dealResult;
		this.ifCallback = ifCallback;
		this.callBackDate = callBackDate;
		this.dealPerson = dealPerson;
	}
	
	

	public ComplainInfo16(int id, String customer, String goodsBillCode, String appealContent, String appealDate,
                          String ifHandle, String dealDate, String dealResult, String ifCallback, String callBackDate,
                          String dealPerson) {
		super();
		this.id = id;
		this.customer = customer;
		this.goodsBillCode = goodsBillCode;
		this.appealContent = appealContent;
		this.appealDate = appealDate;
		this.ifHandle = ifHandle;
		this.dealDate = dealDate;
		this.dealResult = dealResult;
		this.ifCallback = ifCallback;
		this.callBackDate = callBackDate;
		this.dealPerson = dealPerson;
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

    
    @Column(name = "AppealContent")
    public String getAppealContent() {
        return appealContent;
    }

    public void setAppealContent(String appealContent) {
        this.appealContent = appealContent;
    }

   
    @Column(name = "AppealDate")
    public String getAppealDate() {
        return appealDate;
    }

    public void setAppealDate(String appealDate) {
        this.appealDate = appealDate;
    }

  
    @Column(name = "IfHandle")
    public String getIfHandle() {
        return ifHandle;
    }

    public void setIfHandle(String ifHandle) {
        this.ifHandle = ifHandle;
    }

 
    @Column(name = "DealDate")
    public String getDealDate() {
        return dealDate;
    }

    public void setDealDate(String dealDate) {
        this.dealDate = dealDate;
    }

   
    @Column(name = "DealResult")
    public String getDealResult() {
        return dealResult;
    }

    public void setDealResult(String dealResult) {
        this.dealResult = dealResult;
    }

  
    @Column(name = "IfCallback")
    public String getIfCallback() {
        return ifCallback;
    }

    public void setIfCallback(String ifCallback) {
        this.ifCallback = ifCallback;
    }

    
    @Column(name = "CallBackDate")
    public String getCallBackDate() {
        return callBackDate;
    }

    public void setCallBackDate(String callBackDate) {
        this.callBackDate = callBackDate;
    }

    
    @Column(name = "DealPerson")
    public String getDealPerson() {
        return dealPerson;
    }

    public void setDealPerson(String dealPerson) {
        this.dealPerson = dealPerson;
    }

  
}
