package cn.xzxy.lewy.pojo;



import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by yuehailin on 2018/6/4.
 */
@Entity
@Table(name = "t_18_hgxx")
public class CallBackInfo18 {
    private int id;
    private String dialNo;
    private String type;
    private String content;
    private Timestamp writeTime;
    private String writer;
    private Timestamp finallyDialTime;
    private Boolean success;
    private Boolean locked;
    private String billId;
    private String billType;
    
    public CallBackInfo18() {
		super();
	}
    
    
	public CallBackInfo18(String dialNo, String type, String content, Timestamp writeTime, String writer,
                          Timestamp finallyDialTime, Boolean success, Boolean locked, String billId, String billType) {
		super();
		this.dialNo = dialNo;
		this.type = type;
		this.content = content;
		this.writeTime = writeTime;
		this.writer = writer;
		this.finallyDialTime = finallyDialTime;
		this.success = success;
		this.locked = locked;
		this.billId = billId;
		this.billType = billType;
	}
	
	

	public CallBackInfo18(int id, String dialNo, String type, String content, Timestamp writeTime, String writer,
                          Timestamp finallyDialTime, Boolean success, Boolean locked, String billId, String billType) {
		super();
		this.id = id;
		this.dialNo = dialNo;
		this.type = type;
		this.content = content;
		this.writeTime = writeTime;
		this.writer = writer;
		this.finallyDialTime = finallyDialTime;
		this.success = success;
		this.locked = locked;
		this.billId = billId;
		this.billType = billType;
	}


	@Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    
    @Column(name = "DialNO")
    public String getDialNo() {
        return dialNo;
    }

    public void setDialNo(String dialNo) {
        this.dialNo = dialNo;
    }

   
    @Column(name = "Type")
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

  
    @Column(name = "Content")
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    
    @Column(name = "WriteTime")
    public Timestamp getWriteTime() {
        return writeTime;
    }

    public void setWriteTime(Timestamp writeTime) {
        this.writeTime = writeTime;
    }

    @Basic
    @Column(name = "Writer")
    public String getWriter() {
        return writer;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }

    
    @Column(name = "FinallyDialTime")
    public Timestamp getFinallyDialTime() {
        return finallyDialTime;
    }

    public void setFinallyDialTime(Timestamp finallyDialTime) {
        this.finallyDialTime = finallyDialTime;
    }

  
    @Column(name = "Success")
    public Boolean getSuccess() {
        return success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }

   
    @Column(name = "Locked")
    public Boolean getLocked() {
        return locked;
    }

    public void setLocked(Boolean locked) {
        this.locked = locked;
    }


    @Column(name = "BillID")
    public String getBillId() {
        return billId;
    }

    public void setBillId(String billId) {
        this.billId = billId;
    }

  
    @Column(name = "BillType")
    public String getBillType() {
        return billType;
    }

    public void setBillType(String billType) {
        this.billType = billType;
    }

  
}
