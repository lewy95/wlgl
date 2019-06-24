package cn.xzxy.lewy.pojo;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "t_3_hydz")
public class HydMain3 {
    private Integer id;
    private String SendGoodsCustomerNO;//发货客户编号
    private String GoodsBillCode;//货运单编号
    private String SendGoodsCustomer;//发货客户
    private String SendGoodsCustomerTel;//发货客户电话
    private String SendGoodsCustomerAddr;//发货客户地址
    private String ReceiveGoodsCustomerCode;//收货客户编号
    private String ReceiveGoodsCustomer;//收货客户
    private String ReceiveGoodsCustomerTel;//收获客户电话
    private String ReceiveGoodsCustomerAddr;//收货客户地址
    private Date SendGoodsDate;//发货日期
    private String SendGoodsAddr;//发货地址
    private String ReceiveGoodsAddr;//收货地址
    private Date PredeliveryDate;//预期交货日期
    private Date FactDealDate;//实际交货日期
    private Double HelpAcceptPayment;//代收货款
    private String AcceptprocedureRate;//代收手续费率
    private String PayMode;//付款方式（1:预付 0：到付）
    private String FetchGoodsMode;//取货方式
    private String WriteBillPerson;//填票人
    private Date WriteDate;//填写日期
    private String Validity;//有效性（1:有效 2:失效）
    private String IfAudit;//是否审核（1:已配车 2:未配车）
    private String IfSettleAccounts;//是否结账（1:已结，即付款方式为运前付 2:未付，即付款方式为到付）
    private String IfTransfer;//是否中转
    private Double TransferFee;//中转费
    private Double ReduceFund;//减款
    private Double PayKickback;//付回扣
    private Double MoneyOfChangePay;//代收货款变更后金额
    private Double Carriage;//运费
    private Double Insurance;//保险费
    private int EmployeeID;//职员id
    private String Remark;//备注
    private String AcceptStation;//接货点
    private String SendGoodsCustomerMobile;//发货客户手机
    private String ReceiveGoodsCustomerMobile;//收货客户手机
    private Double CarryGoodsFee;//送货费

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSendGoodsCustomerNO() {
        return SendGoodsCustomerNO;
    }

    public void setSendGoodsCustomerNO(String sendGoodsCustomerNO) {
        SendGoodsCustomerNO = sendGoodsCustomerNO;
    }

    public String getGoodsBillCode() {
        return GoodsBillCode;
    }

    public void setGoodsBillCode(String goodsBillCode) {
        GoodsBillCode = goodsBillCode;
    }

    public String getSendGoodsCustomer() {
        return SendGoodsCustomer;
    }

    public void setSendGoodsCustomer(String sendGoodsCustomer) {
        SendGoodsCustomer = sendGoodsCustomer;
    }

    public String getSendGoodsCustomerTel() {
        return SendGoodsCustomerTel;
    }

    public void setSendGoodsCustomerTel(String sendGoodsCustomerTel) {
        SendGoodsCustomerTel = sendGoodsCustomerTel;
    }

    public String getSendGoodsCustomerAddr() {
        return SendGoodsCustomerAddr;
    }

    public void setSendGoodsCustomerAddr(String sendGoodsCustomerAddr) {
        SendGoodsCustomerAddr = sendGoodsCustomerAddr;
    }

    public String getReceiveGoodsCustomerCode() {
        return ReceiveGoodsCustomerCode;
    }

    public void setReceiveGoodsCustomerCode(String receiveGoodsCustomerCode) {
        ReceiveGoodsCustomerCode = receiveGoodsCustomerCode;
    }

    public String getReceiveGoodsCustomer() {
        return ReceiveGoodsCustomer;
    }

    public void setReceiveGoodsCustomer(String receiveGoodsCustomer) {
        ReceiveGoodsCustomer = receiveGoodsCustomer;
    }

    public String getReceiveGoodsCustomerTel() {
        return ReceiveGoodsCustomerTel;
    }

    public void setReceiveGoodsCustomerTel(String receiveGoodsCustomerTel) {
        ReceiveGoodsCustomerTel = receiveGoodsCustomerTel;
    }

    public String getReceiveGoodsCustomerAddr() {
        return ReceiveGoodsCustomerAddr;
    }

    public void setReceiveGoodsCustomerAddr(String receiveGoodsCustomerAddr) {
        ReceiveGoodsCustomerAddr = receiveGoodsCustomerAddr;
    }

    @Temporal(TemporalType.TIMESTAMP)
    public Date getSendGoodsDate() {
        return SendGoodsDate;
    }

    public void setSendGoodsDate(Date sendGoodsDate) {
        SendGoodsDate = sendGoodsDate;
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

    @Temporal(TemporalType.TIMESTAMP)
    public Date getPredeliveryDate() {
        return PredeliveryDate;
    }

    public void setPredeliveryDate(Date predeliveryDate) {
        PredeliveryDate = predeliveryDate;
    }

    @Temporal(TemporalType.TIMESTAMP)
    public Date getFactDealDate() {
        return FactDealDate;
    }

    public void setFactDealDate(Date factDealDate) {
        FactDealDate = factDealDate;
    }

    public Double getHelpAcceptPayment() {
        return HelpAcceptPayment;
    }

    public void setHelpAcceptPayment(Double helpAcceptPayment) {
        HelpAcceptPayment = helpAcceptPayment;
    }

    public String getAcceptprocedureRate() {
        return AcceptprocedureRate;
    }

    public void setAcceptprocedureRate(String acceptprocedureRate) {
        AcceptprocedureRate = acceptprocedureRate;
    }

    public String getPayMode() {
        return PayMode;
    }

    public void setPayMode(String payMode) {
        PayMode = payMode;
    }

    public String getFetchGoodsMode() {
        return FetchGoodsMode;
    }

    public void setFetchGoodsMode(String fetchGoodsMode) {
        FetchGoodsMode = fetchGoodsMode;
    }

    public String getWriteBillPerson() {
        return WriteBillPerson;
    }

    public void setWriteBillPerson(String writeBillPerson) {
        WriteBillPerson = writeBillPerson;
    }

    @Temporal(TemporalType.TIMESTAMP)
    public Date getWriteDate() {
        return WriteDate;
    }

    public void setWriteDate(Date writeDate) {
        WriteDate = writeDate;
    }

    public String getValidity() {
        return Validity;
    }

    public void setValidity(String validity) {
        Validity = validity;
    }

    public String getIfAudit() {
        return IfAudit;
    }

    public void setIfAudit(String ifAudit) {
        IfAudit = ifAudit;
    }

    public String getIfSettleAccounts() {
        return IfSettleAccounts;
    }

    public void setIfSettleAccounts(String ifSettleAccounts) {
        IfSettleAccounts = ifSettleAccounts;
    }

    public String getIfTransfer() {
        return IfTransfer;
    }

    public void setIfTransfer(String ifTransfer) {
        IfTransfer = ifTransfer;
    }

    public Double getTransferFee() {
        return TransferFee;
    }

    public void setTransferFee(Double transferFee) {
        TransferFee = transferFee;
    }

    public Double getReduceFund() {
        return ReduceFund;
    }

    public void setReduceFund(Double reduceFund) {
        ReduceFund = reduceFund;
    }

    public Double getPayKickback() {
        return PayKickback;
    }

    public void setPayKickback(Double payKickback) {
        PayKickback = payKickback;
    }

    public Double getMoneyOfChangePay() {
        return MoneyOfChangePay;
    }

    public void setMoneyOfChangePay(Double moneyOfChangePay) {
        MoneyOfChangePay = moneyOfChangePay;
    }

    public Double getCarriage() {
        return Carriage;
    }

    public void setCarriage(Double carriage) {
        Carriage = carriage;
    }

    public Double getInsurance() {
        return Insurance;
    }

    public void setInsurance(Double insurance) {
        Insurance = insurance;
    }

    public int getEmployeeID() {
        return EmployeeID;
    }

    public void setEmployeeID(int employeeID) {
        EmployeeID = employeeID;
    }

    public String getRemark() {
        return Remark;
    }

    public void setRemark(String remark) {
        Remark = remark;
    }

    public String getAcceptStation() {
        return AcceptStation;
    }

    public void setAcceptStation(String acceptStation) {
        AcceptStation = acceptStation;
    }

    public String getSendGoodsCustomerMobile() {
        return SendGoodsCustomerMobile;
    }

    public void setSendGoodsCustomerMobile(String sendGoodsCustomerMobile) {
        SendGoodsCustomerMobile = sendGoodsCustomerMobile;
    }

    public String getReceiveGoodsCustomerMobile() {
        return ReceiveGoodsCustomerMobile;
    }

    public void setReceiveGoodsCustomerMobile(String receiveGoodsCustomerMobile) {
        ReceiveGoodsCustomerMobile = receiveGoodsCustomerMobile;
    }

    public Double getCarryGoodsFee() {
        return CarryGoodsFee;
    }

    public void setCarryGoodsFee(Double carryGoodsFee) {
        CarryGoodsFee = carryGoodsFee;
    }
}
