package cn.xzxy.lewy.pojo;

import javax.persistence.*;
import java.util.Date;

/**
 * 管理费用表
 */
@Entity
@Table(name = "t_23_glfy")
public class OfficeFee23 {
    private int id;
    private Double OfficeFee;
    private Double HouseRent;
    private Double WaterElecFee;
    private Double PhoneFee;
    private Double OtherPayout;
    private Date PayoutMonth;
    private Date WriteDate;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public Double getOtherPayout() {
        return OtherPayout;
    }

    public void setOtherPayout(Double otherPayout) {
        OtherPayout = otherPayout;
    }

    @Temporal(TemporalType.TIMESTAMP)
    public Date getPayoutMonth() {
        return PayoutMonth;
    }

    public void setPayoutMonth(Date payoutMonth) {
        PayoutMonth = payoutMonth;
    }

    @Temporal(TemporalType.TIMESTAMP)
    public Date getWriteDate() {
        return WriteDate;
    }

    public void setWriteDate(Date writeDate) {
        WriteDate = writeDate;
    }

    public OfficeFee23(int id, Double officeFee, Double houseRent, Double waterElecFee, Double phoneFee, Double otherPayout, Date payoutMonth, Date writeDate) {
        this.id = id;
        OfficeFee = officeFee;
        HouseRent = houseRent;
        WaterElecFee = waterElecFee;
        PhoneFee = phoneFee;
        OtherPayout = otherPayout;
        PayoutMonth = payoutMonth;
        WriteDate = writeDate;
    }

    public OfficeFee23(Double officeFee, Double houseRent, Double waterElecFee, Double phoneFee, Double otherPayout, Date payoutMonth, Date writeDate) {
        OfficeFee = officeFee;
        HouseRent = houseRent;
        WaterElecFee = waterElecFee;
        PhoneFee = phoneFee;
        OtherPayout = otherPayout;
        PayoutMonth = payoutMonth;
        WriteDate = writeDate;
    }

    public OfficeFee23() {
    }
}
