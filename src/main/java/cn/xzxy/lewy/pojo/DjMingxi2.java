package cn.xzxy.lewy.pojo;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "t_2_djmx")
public class DjMingxi2 {
    private Integer id;
    private String BillType;//单据类型
    private String BillCode;//单据编号
    private String BillState;//单据状态
    private Date WriteDate;//填写日期
    private String AcceptStation;//接货点
    private String HydCode;//货运单或货运回执单编号

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

    public String getBillCode() {
        return BillCode;
    }

    public void setBillCode(String billCode) {
        BillCode = billCode;
    }

    public String getBillState() {
        return BillState;
    }

    public void setBillState(String billState) {
        BillState = billState;
    }

    @Temporal(TemporalType.TIMESTAMP)
    public Date getWriteDate() {
        return WriteDate;
    }

    public void setWriteDate(Date writeDate) {
        WriteDate = writeDate;
    }

    public String getAcceptStation() {
        return AcceptStation;
    }

    public void setAcceptStation(String acceptStation) {
        AcceptStation = acceptStation;
    }

    public String getHydCode() {
        return HydCode;
    }

    public void setHydCode(String hydCode) {
        HydCode = hydCode;
    }
}

