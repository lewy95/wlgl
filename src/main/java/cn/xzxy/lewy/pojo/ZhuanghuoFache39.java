package cn.xzxy.lewy.pojo;

import javax.persistence.*;

/**
 * Created by yuehailin on 2018/6/6.
 */
@Entity
@Table(name = "t_39_zhfcqd", schema = "wlgl", catalog = "")
public class ZhuanghuoFache39 {
    private String userid;
    private String id;
    private String sendgoodcustomer;
    private String goodsname;
    private String goodscode;
    private String transferdestinatio;
    private String sendgoodscustomertel;
    private Double cashpay;
    private Double pickuppay;
    private Double backcost;
    private String helpacceptfund;
    private String remark;
    private String drivername;
    private String carcardno;
    private String mobile;
    private Integer pieceamount;
    private String goodsrevertbillcode;


    @Column(name = "userid")
    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }


    @Column(name = "sendgoodcustomer")
    public String getSendgoodcustomer() {
        return sendgoodcustomer;
    }

    public void setSendgoodcustomer(String sendgoodcustomer) {
        this.sendgoodcustomer = sendgoodcustomer;
    }


    @Column(name = "goodsname")
    public String getGoodsname() {
        return goodsname;
    }

    public void setGoodsname(String goodsname) {
        this.goodsname = goodsname;
    }


    @Column(name = "goodscode")
    public String getGoodscode() {
        return goodscode;
    }

    public void setGoodscode(String goodscode) {
        this.goodscode = goodscode;
    }


    @Column(name = "transferdestinatio")
    public String getTransferdestinatio() {
        return transferdestinatio;
    }

    public void setTransferdestinatio(String transferdestinatio) {
        this.transferdestinatio = transferdestinatio;
    }


    @Column(name = "sendgoodscustomertel")
    public String getSendgoodscustomertel() {
        return sendgoodscustomertel;
    }

    public void setSendgoodscustomertel(String sendgoodscustomertel) {
        this.sendgoodscustomertel = sendgoodscustomertel;
    }


    @Column(name = "cashpay")
    public Double getCashpay() {
        return cashpay;
    }

    public void setCashpay(Double cashpay) {
        this.cashpay = cashpay;
    }


    @Column(name = "pickuppay")
    public Double getPickuppay() {
        return pickuppay;
    }

    public void setPickuppay(Double pickuppay) {
        this.pickuppay = pickuppay;
    }


    @Column(name = "backcost")
    public Double getBackcost() {
        return backcost;
    }

    public void setBackcost(Double backcost) {
        this.backcost = backcost;
    }


    @Column(name = "helpacceptfund")
    public String getHelpacceptfund() {
        return helpacceptfund;
    }

    public void setHelpacceptfund(String helpacceptfund) {
        this.helpacceptfund = helpacceptfund;
    }


    @Column(name = "remark")
    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    @Column(name = "drivername")
    public String getDrivername() {
        return drivername;
    }

    public void setDrivername(String drivername) {
        this.drivername = drivername;
    }


    @Column(name = "carcardno")
    public String getCarcardno() {
        return carcardno;
    }

    public void setCarcardno(String carcardno) {
        this.carcardno = carcardno;
    }


    @Column(name = "mobile")
    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }


    @Column(name = "pieceamount")
    public Integer getPieceamount() {
        return pieceamount;
    }

    public void setPieceamount(Integer pieceamount) {
        this.pieceamount = pieceamount;
    }


    @Column(name = "goodsrevertbillcode")
    public String getGoodsrevertbillcode() {
        return goodsrevertbillcode;
    }

    public void setGoodsrevertbillcode(String goodsrevertbillcode) {
        this.goodsrevertbillcode = goodsrevertbillcode;
    }
}
