package cn.xzxy.lewy.pojo;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "t_6_hyhzdz")
public class HydHuizhiMain6 {
    private Integer id;
    private String GoodsRevertBillCode;//货运回执单编号
    private String LoadStation;//装货地点
    private Date StartCarryTime;//起运时间
    private String DealGoodsStation;//交货地点
    private Date ArriveTime;//到达时间
    private String ReceiveGoodsLinkman;//收货联系人
    private String LinkmanPhone;//联系人电话
    private String LinkmanMobile;//联系人手机
    private String ReceiveGoodsDetailAddr;//收货详细地址
    private String CarriageBanlanceMode;//运费结算方式
    private String Remark;//备注
    private int DriverID;//司机id
    private String IfBalance;//是否结算
    private String BackBillState;//回执单状态
    private Double StartAdvance;//起运时的预付费用
    private Double CarryGoodsBillDeposit;//送货单回执押金
    private Double CarryGoodsInsurance;//承运人订装货物保证金
    private Double DispatchServiceFee;//配载服务费
    private Double AllCarriage;//总运费
    private Double Insurance;//保险费
    private Date SignTime;//签定时间
    private String AcceptStation;//接货点
    private String CarriageMode;//运费计价方式
    private String Execute;//执行(是否发车 1已发车 0未发车)

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getGoodsRevertBillCode() {
        return GoodsRevertBillCode;
    }

    public void setGoodsRevertBillCode(String goodsRevertBillCode) {
        GoodsRevertBillCode = goodsRevertBillCode;
    }

    public String getLoadStation() {
        return LoadStation;
    }

    public void setLoadStation(String loadStation) {
        LoadStation = loadStation;
    }

    @Temporal(TemporalType.TIMESTAMP)
    public Date getStartCarryTime() {
        return StartCarryTime;
    }

    public void setStartCarryTime(Date startCarryTime) {
        StartCarryTime = startCarryTime;
    }

    public String getDealGoodsStation() {
        return DealGoodsStation;
    }

    public void setDealGoodsStation(String dealGoodsStation) {
        DealGoodsStation = dealGoodsStation;
    }

    @Temporal(TemporalType.TIMESTAMP)
    public Date getArriveTime() {
        return ArriveTime;
    }

    public void setArriveTime(Date arriveTime) {
        ArriveTime = arriveTime;
    }

    public String getReceiveGoodsLinkman() {
        return ReceiveGoodsLinkman;
    }

    public void setReceiveGoodsLinkman(String receiveGoodsLinkman) {
        ReceiveGoodsLinkman = receiveGoodsLinkman;
    }

    public String getLinkmanPhone() {
        return LinkmanPhone;
    }

    public void setLinkmanPhone(String linkmanPhone) {
        LinkmanPhone = linkmanPhone;
    }

    public String getLinkmanMobile() {
        return LinkmanMobile;
    }

    public void setLinkmanMobile(String linkmanMobile) {
        LinkmanMobile = linkmanMobile;
    }

    public String getReceiveGoodsDetailAddr() {
        return ReceiveGoodsDetailAddr;
    }

    public void setReceiveGoodsDetailAddr(String receiveGoodsDetailAddr) {
        ReceiveGoodsDetailAddr = receiveGoodsDetailAddr;
    }

    public String getCarriageBanlanceMode() {
        return CarriageBanlanceMode;
    }

    public void setCarriageBanlanceMode(String carriageBanlanceMode) {
        CarriageBanlanceMode = carriageBanlanceMode;
    }

    public String getRemark() {
        return Remark;
    }

    public void setRemark(String remark) {
        Remark = remark;
    }

    public int getDriverID() {
        return DriverID;
    }

    public void setDriverID(int driverID) {
        DriverID = driverID;
    }

    public String getIfBalance() {
        return IfBalance;
    }

    public void setIfBalance(String ifBalance) {
        IfBalance = ifBalance;
    }

    public String getBackBillState() {
        return BackBillState;
    }

    public void setBackBillState(String backBillState) {
        BackBillState = backBillState;
    }

    public Double getStartAdvance() {
        return StartAdvance;
    }

    public void setStartAdvance(Double startAdvance) {
        StartAdvance = startAdvance;
    }

    public Double getCarryGoodsBillDeposit() {
        return CarryGoodsBillDeposit;
    }

    public void setCarryGoodsBillDeposit(Double carryGoodsBillDeposit) {
        CarryGoodsBillDeposit = carryGoodsBillDeposit;
    }

    public Double getCarryGoodsInsurance() {
        return CarryGoodsInsurance;
    }

    public void setCarryGoodsInsurance(Double carryGoodsInsurance) {
        CarryGoodsInsurance = carryGoodsInsurance;
    }

    public Double getDispatchServiceFee() {
        return DispatchServiceFee;
    }

    public void setDispatchServiceFee(Double dispatchServiceFee) {
        DispatchServiceFee = dispatchServiceFee;
    }

    public Double getAllCarriage() {
        return AllCarriage;
    }

    public void setAllCarriage(Double allCarriage) {
        AllCarriage = allCarriage;
    }

    public Double getInsurance() {
        return Insurance;
    }

    public void setInsurance(Double insurance) {
        Insurance = insurance;
    }

    @Temporal(TemporalType.TIMESTAMP)
    public Date getSignTime() {
        return SignTime;
    }

    public void setSignTime(Date signTime) {
        SignTime = signTime;
    }

    public String getAcceptStation() {
        return AcceptStation;
    }

    public void setAcceptStation(String acceptStation) {
        AcceptStation = acceptStation;
    }

    public String getCarriageMode() {
        return CarriageMode;
    }

    public void setCarriageMode(String carriageMode) {
        CarriageMode = carriageMode;
    }

    public String getExecute() {
        return Execute;
    }

    public void setExecute(String execute) {
        Execute = execute;
    }
}
