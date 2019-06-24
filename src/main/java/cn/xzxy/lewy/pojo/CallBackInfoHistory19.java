package cn.xzxy.lewy.pojo;

import javax.persistence.*;
import java.util.Date;

/**
 * 回告信息历史表
 */
@Entity
@Table(name = "t_19_hgxxls")
public class CallBackInfoHistory19 {
    private int id;
    private String DialNo; //拨出号码
    private String Type; //类别
    private String Content; //内容
    private Date WriteTime; //填写时间
    private String Writer;  //填写人
    private Date  FinallyDialTime; //最后播出时间
    private Boolean Success;//成功
    private Boolean Locked;//锁定
    private String BillID;//单据号
    private String BillType;//单据类型

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDialNo() {
        return DialNo;
    }

    public void setDialNo(String dialNo) {
        DialNo = dialNo;
    }

    public String getType() {
        return Type;
    }

    public void setType(String type) {
        Type = type;
    }

    public String getContent() {
        return Content;
    }

    public void setContent(String content) {
        Content = content;
    }

    @Temporal(TemporalType.TIMESTAMP)
    public Date getWriteTime() {
        return WriteTime;
    }

    public void setWriteTime(Date writeTime) {
        WriteTime = writeTime;
    }

    public String getWriter() {
        return Writer;
    }

    public void setWriter(String writer) {
        Writer = writer;
    }

    @Temporal(TemporalType.TIMESTAMP)
    public Date getFinallyDialTime() {
        return FinallyDialTime;
    }

    public void setFinallyDialTime(Date finallyDialTime) {
        FinallyDialTime = finallyDialTime;
    }

    public Boolean getSuccess() {
        return Success;
    }

    public void setSuccess(Boolean success) {
        Success = success;
    }

    public Boolean getLocked() {
        return Locked;
    }

    public void setLocked(Boolean locked) {
        Locked = locked;
    }

    public String getBillID() {
        return BillID;
    }

    public void setBillID(String billID) {
        BillID = billID;
    }

    public String getBillType() {
        return BillType;
    }

    public void setBillType(String billType) {
        BillType = billType;
    }
}
