package cn.xzxy.lewy.pojo;

import javax.persistence.*;

/**
 * Created by yuehailin on 2018/6/6.
 */
@Entity
@Table(name = "t_38_dyzxzt", schema = "wlgl", catalog = "")
public class PrintRoute38 {
    private String loadStation;
    private String dealGoodsStation;
    private Double allCarriageTotal;
    private Double insuranceTotal;
    private Integer times;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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

    @Column(name = "AllCarriageTotal")
    public Double getAllCarriageTotal() {
        return allCarriageTotal;
    }

    public void setAllCarriageTotal(Double allCarriageTotal) {
        this.allCarriageTotal = allCarriageTotal;
    }


    @Column(name = "InsuranceTotal")
    public Double getInsuranceTotal() {
        return insuranceTotal;
    }

    public void setInsuranceTotal(Double insuranceTotal) {
        this.insuranceTotal = insuranceTotal;
    }


    @Column(name = "Times")
    public Integer getTimes() {
        return times;
    }

    public void setTimes(Integer times) {
        this.times = times;
    }

}
