package cn.xzxy.lewy.pojo;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by yuehailin on 2018/6/6.
 */
@Entity
@Table(name = "t_42_dyclcb")
public class PrintCarCost42 {
    private String driverName;
    private String carNo;
    private String carType;
    private String allowCarryWeight;
    private String carWidth;
    private String goodsHeight;
    private Double carryFeeTotal;
    private Double addCarriageTotal;
    private Double factCarriageTotal;
    private String loadStation;
    private String dealGoodsStation;
    private String backBillCode;
    private Date balanceTime;


    @Column(name = "DriverName")
    public String getDriverName() {
        return driverName;
    }

    public void setDriverName(String driverName) {
        this.driverName = driverName;
    }


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CarNO")
    public String getCarNo() {
        return carNo;
    }

    public void setCarNo(String carNo) {
        this.carNo = carNo;
    }


    @Column(name = "CarType")
    public String getCarType() {
        return carType;
    }

    public void setCarType(String carType) {
        this.carType = carType;
    }


    @Column(name = "AllowCarryWeight")
    public String getAllowCarryWeight() {
        return allowCarryWeight;
    }

    public void setAllowCarryWeight(String allowCarryWeight) {
        this.allowCarryWeight = allowCarryWeight;
    }

    @Column(name = "CarWidth")
    public String getCarWidth() {
        return carWidth;
    }

    public void setCarWidth(String carWidth) {
        this.carWidth = carWidth;
    }


    @Column(name = "GoodsHeight")
    public String getGoodsHeight() {
        return goodsHeight;
    }

    public void setGoodsHeight(String goodsHeight) {
        this.goodsHeight = goodsHeight;
    }

    @Column(name = "CarryFeeTotal")
    public Double getCarryFeeTotal() {
        return carryFeeTotal;
    }

    public void setCarryFeeTotal(Double carryFeeTotal) {
        this.carryFeeTotal = carryFeeTotal;
    }


    @Column(name = "AddCarriageTotal")
    public Double getAddCarriageTotal() {
        return addCarriageTotal;
    }

    public void setAddCarriageTotal(Double addCarriageTotal) {
        this.addCarriageTotal = addCarriageTotal;
    }

    @Column(name = "FactCarriageTotal")
    public Double getFactCarriageTotal() {
        return factCarriageTotal;
    }

    public void setFactCarriageTotal(Double factCarriageTotal) {
        this.factCarriageTotal = factCarriageTotal;
    }


    @Column(name = "LoadStation")
    public String getLoadStation() {
        return loadStation;
    }

    public void setLoadStation(String loadStation) {
        this.loadStation = loadStation;
    }


    @Column(name = "DealGoodsStation")
    public String getDealGoodsStation() {
        return dealGoodsStation;
    }

    public void setDealGoodsStation(String dealGoodsStation) {
        this.dealGoodsStation = dealGoodsStation;
    }


    @Column(name = "BackBillCode")
    public String getBackBillCode() {
        return backBillCode;
    }

    public void setBackBillCode(String backBillCode) {
        this.backBillCode = backBillCode;
    }


    @Column(name = "BalanceTime")
    @Temporal(TemporalType.TIMESTAMP)
    public Date getBalanceTime() {
        return balanceTime;
    }

    public void setBalanceTime(Date balanceTime) {
        this.balanceTime = balanceTime;
    }

}
