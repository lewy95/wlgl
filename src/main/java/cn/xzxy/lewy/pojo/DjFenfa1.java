package cn.xzxy.lewy.pojo;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "t_1_djff")
public class DjFenfa1 {

    private Integer id;
    private String BillType;//单据类型
    private String BillStartCode;//单据开始编号
    private String BillEndCode;//单据结束编号
    private String ReceiveBillPerson;//领票人
    private String AcceptStation;//接货点
    private Date ReceiveBillTime;//领票时间
    private String ReleasePerson;//分发人

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBillType() {
        return BillType;
    }

    public void setBillType(String billType) {
        BillType = billType;
    }

    public String getBillStartCode() {
        return BillStartCode;
    }

    public void setBillStartCode(String billStartCode) {
        BillStartCode = billStartCode;
    }

    public String getBillEndCode() {
        return BillEndCode;
    }

    public void setBillEndCode(String billEndCode) {
        BillEndCode = billEndCode;
    }

    public String getReceiveBillPerson() {
        return ReceiveBillPerson;
    }

    public void setReceiveBillPerson(String receiveBillPerson) {
        ReceiveBillPerson = receiveBillPerson;
    }

    public String getAcceptStation() {
        return AcceptStation;
    }

    public void setAcceptStation(String acceptStation) {
        AcceptStation = acceptStation;
    }

    @Temporal(value = TemporalType.TIMESTAMP)
    public Date getReceiveBillTime() {
        return ReceiveBillTime;
    }

    public void setReceiveBillTime(Date receiveBillTime) {
        ReceiveBillTime = receiveBillTime;
    }

    public String getReleasePerson() {
        return ReleasePerson;
    }

    public void setReleasePerson(String releasePerson) {
        ReleasePerson = releasePerson;
    }
}
