package cn.xzxy.lewy.pojo;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "t_43_dywlyw")
public class PrintServiceHistory43 {

    private String SendGoodsCustomer;//发货客户
    private String GoodsBillCode;//货运单编号
    private String SendGoodsAddr;//发货地址
    private String ReceiveGoodsAddr;//收货地址
    private double Carriage;//运费
    private double Insurance;//保险费
    private double BillMoney;//本单金额
    private double MoneyReceivable;//应收金额
    private double ReceivedMoney;//已收金额
    private double Balance;//余额
    private Date SendGoodsDate;//发货日期

    public String getSendGoodsCustomer() {
        return SendGoodsCustomer;
    }

    public void setSendGoodsCustomer(String sendGoodsCustomer) {
        SendGoodsCustomer = sendGoodsCustomer;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public String getGoodsBillCode() {
        return GoodsBillCode;
    }

    public void setGoodsBillCode(String goodsBillCode) {
        GoodsBillCode = goodsBillCode;
    }

    public String getSendGoodsAddr() {
        return SendGoodsAddr;
    }

    public void setSendGoodsAddr(String sendGoodsAddr) {
        SendGoodsAddr = sendGoodsAddr;
    }

    public String getReceiveGoodsAddr() {
        return ReceiveGoodsAddr;
    }

    public void setReceiveGoodsAddr(String receiveGoodsAddr) {
        ReceiveGoodsAddr = receiveGoodsAddr;
    }

    public double getCarriage() {
        return Carriage;
    }

    public void setCarriage(double carriage) {
        Carriage = carriage;
    }

    public double getInsurance() {
        return Insurance;
    }

    public void setInsurance(double insurance) {
        Insurance = insurance;
    }

    public double getBillMoney() {
        return BillMoney;
    }

    public void setBillMoney(double billMoney) {
        BillMoney = billMoney;
    }

    public double getMoneyReceivable() {
        return MoneyReceivable;
    }

    public void setMoneyReceivable(double moneyReceivable) {
        MoneyReceivable = moneyReceivable;
    }

    public double getReceivedMoney() {
        return ReceivedMoney;
    }

    public void setReceivedMoney(double receivedMoney) {
        ReceivedMoney = receivedMoney;
    }

    public double getBalance() {
        return Balance;
    }

    public void setBalance(double balance) {
        Balance = balance;
    }

    @Temporal(value = TemporalType.TIMESTAMP)
    public Date getSendGoodsDate() {
        return SendGoodsDate;
    }

    public void setSendGoodsDate(Date sendGoodsDate) {
        SendGoodsDate = sendGoodsDate;
    }
}
