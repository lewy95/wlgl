package cn.xzxy.lewy.pojo;

import javax.persistence.*;

/**
 * 损益月报临时表
 */
@Entity
@Table(name = "t_45_syybls")
public class BalanceMonthsShort45 {
    private int id;
    private Double Income;
    private Double Payout;
    private Double BizIncome;
    private Double CarriageMoney;
    private Double InsuranceMoney;
    private String UnbizIncome_Name_1;
    private Double UnbizIncome_Money_1;
    private String UnbizIncome_Name_2;
    private Double UnbizIncome_Money_2;
    private String UnbizIncome_Name_3;
    private Double UnbizIncome_Money_3;
    private String UnbizIncome_Name_4;
    private Double UnbizIncome_Money_4;
    private String UnbizIncome_Name_5;
    private Double UnbizIncome_Money_5;
    private String UnbizIncome_Name_6;
    private Double UnbizIncome_Money_6;
    private String UnbizIncome_Name_7;
    private Double UnbizIncome_Money_7;
    private String UnbizIncome_Name_8;
    private Double UnbizIncome_Money_8;
    private Double BizFee;
    private Double CarCarriage;
    private Double AmendsFund;
    private Double BadDestroyGoods;
    private Double ConveyWage;
    private Double ManageFee;
    private Double OfficeFee;
    private Double HouseRent;
    private Double WaterElecFee;
    private Double PhoneFee;
    private Double Other;
    private Double FinanceFee;
    private Double Profit;

    public BalanceMonthsShort45() {
    }

    public BalanceMonthsShort45(int id, Double income, Double payout, Double bizIncome, Double carriageMoney, Double insuranceMoney, String unbizIncome_Name_1, Double unbizIncome_Money_1, String unbizIncome_Name_2, Double unbizIncome_Money_2, String unbizIncome_Name_3, Double unbizIncome_Money_3, String unbizIncome_Name_4, Double unbizIncome_Money_4, String unbizIncome_Name_5, Double unbizIncome_Money_5, String unbizIncome_Name_6, Double unbizIncome_Money_6, String unbizIncome_Name_7, Double unbizIncome_Money_7, String unbizIncome_Name_8, Double unbizIncome_Money_8, Double bizFee, Double carCarriage, Double amendsFund, Double badDestroyGoods, Double conveyWage, Double manageFee, Double officeFee, Double houseRent, Double waterElecFee, Double phoneFee, Double other, Double financeFee, Double profit) {
        this.id = id;
        Income = income;
        Payout = payout;
        BizIncome = bizIncome;
        CarriageMoney = carriageMoney;
        InsuranceMoney = insuranceMoney;
        UnbizIncome_Name_1 = unbizIncome_Name_1;
        UnbizIncome_Money_1 = unbizIncome_Money_1;
        UnbizIncome_Name_2 = unbizIncome_Name_2;
        UnbizIncome_Money_2 = unbizIncome_Money_2;
        UnbizIncome_Name_3 = unbizIncome_Name_3;
        UnbizIncome_Money_3 = unbizIncome_Money_3;
        UnbizIncome_Name_4 = unbizIncome_Name_4;
        UnbizIncome_Money_4 = unbizIncome_Money_4;
        UnbizIncome_Name_5 = unbizIncome_Name_5;
        UnbizIncome_Money_5 = unbizIncome_Money_5;
        UnbizIncome_Name_6 = unbizIncome_Name_6;
        UnbizIncome_Money_6 = unbizIncome_Money_6;
        UnbizIncome_Name_7 = unbizIncome_Name_7;
        UnbizIncome_Money_7 = unbizIncome_Money_7;
        UnbizIncome_Name_8 = unbizIncome_Name_8;
        UnbizIncome_Money_8 = unbizIncome_Money_8;
        BizFee = bizFee;
        CarCarriage = carCarriage;
        AmendsFund = amendsFund;
        BadDestroyGoods = badDestroyGoods;
        ConveyWage = conveyWage;
        ManageFee = manageFee;
        OfficeFee = officeFee;
        HouseRent = houseRent;
        WaterElecFee = waterElecFee;
        PhoneFee = phoneFee;
        Other = other;
        FinanceFee = financeFee;
        Profit = profit;
    }

    public BalanceMonthsShort45(Double income, Double payout, Double bizIncome, Double carriageMoney, Double insuranceMoney, String unbizIncome_Name_1, Double unbizIncome_Money_1, String unbizIncome_Name_2, Double unbizIncome_Money_2, String unbizIncome_Name_3, Double unbizIncome_Money_3, String unbizIncome_Name_4, Double unbizIncome_Money_4, String unbizIncome_Name_5, Double unbizIncome_Money_5, String unbizIncome_Name_6, Double unbizIncome_Money_6, String unbizIncome_Name_7, Double unbizIncome_Money_7, String unbizIncome_Name_8, Double unbizIncome_Money_8, Double bizFee, Double carCarriage, Double amendsFund, Double badDestroyGoods, Double conveyWage, Double manageFee, Double officeFee, Double houseRent, Double waterElecFee, Double phoneFee, Double other, Double financeFee, Double profit) {
        Income = income;
        Payout = payout;
        BizIncome = bizIncome;
        CarriageMoney = carriageMoney;
        InsuranceMoney = insuranceMoney;
        UnbizIncome_Name_1 = unbizIncome_Name_1;
        UnbizIncome_Money_1 = unbizIncome_Money_1;
        UnbizIncome_Name_2 = unbizIncome_Name_2;
        UnbizIncome_Money_2 = unbizIncome_Money_2;
        UnbizIncome_Name_3 = unbizIncome_Name_3;
        UnbizIncome_Money_3 = unbizIncome_Money_3;
        UnbizIncome_Name_4 = unbizIncome_Name_4;
        UnbizIncome_Money_4 = unbizIncome_Money_4;
        UnbizIncome_Name_5 = unbizIncome_Name_5;
        UnbizIncome_Money_5 = unbizIncome_Money_5;
        UnbizIncome_Name_6 = unbizIncome_Name_6;
        UnbizIncome_Money_6 = unbizIncome_Money_6;
        UnbizIncome_Name_7 = unbizIncome_Name_7;
        UnbizIncome_Money_7 = unbizIncome_Money_7;
        UnbizIncome_Name_8 = unbizIncome_Name_8;
        UnbizIncome_Money_8 = unbizIncome_Money_8;
        BizFee = bizFee;
        CarCarriage = carCarriage;
        AmendsFund = amendsFund;
        BadDestroyGoods = badDestroyGoods;
        ConveyWage = conveyWage;
        ManageFee = manageFee;
        OfficeFee = officeFee;
        HouseRent = houseRent;
        WaterElecFee = waterElecFee;
        PhoneFee = phoneFee;
        Other = other;
        FinanceFee = financeFee;
        Profit = profit;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Double getIncome() {
        return Income;
    }

    public void setIncome(Double income) {
        Income = income;
    }

    public Double getPayout() {
        return Payout;
    }

    public void setPayout(Double payout) {
        Payout = payout;
    }

    public Double getBizIncome() {
        return BizIncome;
    }

    public void setBizIncome(Double bizIncome) {
        BizIncome = bizIncome;
    }

    public Double getCarriageMoney() {
        return CarriageMoney;
    }

    public void setCarriageMoney(Double carriageMoney) {
        CarriageMoney = carriageMoney;
    }

    public Double getInsuranceMoney() {
        return InsuranceMoney;
    }

    public void setInsuranceMoney(Double insuranceMoney) {
        InsuranceMoney = insuranceMoney;
    }

    public String getUnbizIncome_Name_1() {
        return UnbizIncome_Name_1;
    }

    public void setUnbizIncome_Name_1(String unbizIncome_Name_1) {
        UnbizIncome_Name_1 = unbizIncome_Name_1;
    }

    public Double getUnbizIncome_Money_1() {
        return UnbizIncome_Money_1;
    }

    public void setUnbizIncome_Money_1(Double unbizIncome_Money_1) {
        UnbizIncome_Money_1 = unbizIncome_Money_1;
    }

    public String getUnbizIncome_Name_2() {
        return UnbizIncome_Name_2;
    }

    public void setUnbizIncome_Name_2(String unbizIncome_Name_2) {
        UnbizIncome_Name_2 = unbizIncome_Name_2;
    }

    public Double getUnbizIncome_Money_2() {
        return UnbizIncome_Money_2;
    }

    public void setUnbizIncome_Money_2(Double unbizIncome_Money_2) {
        UnbizIncome_Money_2 = unbizIncome_Money_2;
    }

    public String getUnbizIncome_Name_3() {
        return UnbizIncome_Name_3;
    }

    public void setUnbizIncome_Name_3(String unbizIncome_Name_3) {
        UnbizIncome_Name_3 = unbizIncome_Name_3;
    }

    public Double getUnbizIncome_Money_3() {
        return UnbizIncome_Money_3;
    }

    public void setUnbizIncome_Money_3(Double unbizIncome_Money_3) {
        UnbizIncome_Money_3 = unbizIncome_Money_3;
    }

    public String getUnbizIncome_Name_4() {
        return UnbizIncome_Name_4;
    }

    public void setUnbizIncome_Name_4(String unbizIncome_Name_4) {
        UnbizIncome_Name_4 = unbizIncome_Name_4;
    }

    public Double getUnbizIncome_Money_4() {
        return UnbizIncome_Money_4;
    }

    public void setUnbizIncome_Money_4(Double unbizIncome_Money_4) {
        UnbizIncome_Money_4 = unbizIncome_Money_4;
    }

    public String getUnbizIncome_Name_5() {
        return UnbizIncome_Name_5;
    }

    public void setUnbizIncome_Name_5(String unbizIncome_Name_5) {
        UnbizIncome_Name_5 = unbizIncome_Name_5;
    }

    public Double getUnbizIncome_Money_5() {
        return UnbizIncome_Money_5;
    }

    public void setUnbizIncome_Money_5(Double unbizIncome_Money_5) {
        UnbizIncome_Money_5 = unbizIncome_Money_5;
    }

    public String getUnbizIncome_Name_6() {
        return UnbizIncome_Name_6;
    }

    public void setUnbizIncome_Name_6(String unbizIncome_Name_6) {
        UnbizIncome_Name_6 = unbizIncome_Name_6;
    }

    public Double getUnbizIncome_Money_6() {
        return UnbizIncome_Money_6;
    }

    public void setUnbizIncome_Money_6(Double unbizIncome_Money_6) {
        UnbizIncome_Money_6 = unbizIncome_Money_6;
    }

    public String getUnbizIncome_Name_7() {
        return UnbizIncome_Name_7;
    }

    public void setUnbizIncome_Name_7(String unbizIncome_Name_7) {
        UnbizIncome_Name_7 = unbizIncome_Name_7;
    }

    public Double getUnbizIncome_Money_7() {
        return UnbizIncome_Money_7;
    }

    public void setUnbizIncome_Money_7(Double unbizIncome_Money_7) {
        UnbizIncome_Money_7 = unbizIncome_Money_7;
    }

    public String getUnbizIncome_Name_8() {
        return UnbizIncome_Name_8;
    }

    public void setUnbizIncome_Name_8(String unbizIncome_Name_8) {
        UnbizIncome_Name_8 = unbizIncome_Name_8;
    }

    public Double getUnbizIncome_Money_8() {
        return UnbizIncome_Money_8;
    }

    public void setUnbizIncome_Money_8(Double unbizIncome_Money_8) {
        UnbizIncome_Money_8 = unbizIncome_Money_8;
    }

    public Double getBizFee() {
        return BizFee;
    }

    public void setBizFee(Double bizFee) {
        BizFee = bizFee;
    }

    public Double getCarCarriage() {
        return CarCarriage;
    }

    public void setCarCarriage(Double carCarriage) {
        CarCarriage = carCarriage;
    }

    public Double getAmendsFund() {
        return AmendsFund;
    }

    public void setAmendsFund(Double amendsFund) {
        AmendsFund = amendsFund;
    }

    public Double getBadDestroyGoods() {
        return BadDestroyGoods;
    }

    public void setBadDestroyGoods(Double badDestroyGoods) {
        BadDestroyGoods = badDestroyGoods;
    }

    public Double getConveyWage() {
        return ConveyWage;
    }

    public void setConveyWage(Double conveyWage) {
        ConveyWage = conveyWage;
    }

    public Double getManageFee() {
        return ManageFee;
    }

    public void setManageFee(Double manageFee) {
        ManageFee = manageFee;
    }

    public Double getOfficeFee() {
        return OfficeFee;
    }

    public void setOfficeFee(Double officeFee) {
        OfficeFee = officeFee;
    }

    public Double getHouseRent() {
        return HouseRent;
    }

    public void setHouseRent(Double houseRent) {
        HouseRent = houseRent;
    }

    public Double getWaterElecFee() {
        return WaterElecFee;
    }

    public void setWaterElecFee(Double waterElecFee) {
        WaterElecFee = waterElecFee;
    }

    public Double getPhoneFee() {
        return PhoneFee;
    }

    public void setPhoneFee(Double phoneFee) {
        PhoneFee = phoneFee;
    }

    public Double getOther() {
        return Other;
    }

    public void setOther(Double other) {
        Other = other;
    }

    public Double getFinanceFee() {
        return FinanceFee;
    }

    public void setFinanceFee(Double financeFee) {
        FinanceFee = financeFee;
    }

    public Double getProfit() {
        return Profit;
    }

    public void setProfit(Double profit) {
        Profit = profit;
    }
}
