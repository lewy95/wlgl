package cn.xzxy.lewy.pojo;

import javax.persistence.*;

@Entity
@Table(name = "t_5_hyhzdx")
public class HydHuizhiDetail5 {

    private Integer id;
    private int GoodsRevertBillID;//货运回执单id
    private int GoodsBillDetailID;//货运单详表
    private int PieceAmount;//件数
    private Double Weight;//重量
    private Double Volume;//体积
    private String PriceMode;//计价方式
    private String PriceStandard;//计费标准
    private Double GoodsValue;//货物价值

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getGoodsRevertBillID() {
        return GoodsRevertBillID;
    }

    public void setGoodsRevertBillID(int goodsRevertBillID) {
        GoodsRevertBillID = goodsRevertBillID;
    }

    public int getGoodsBillDetailID() {
        return GoodsBillDetailID;
    }

    public void setGoodsBillDetailID(int goodsBillDetailID) {
        GoodsBillDetailID = goodsBillDetailID;
    }

    public int getPieceAmount() {
        return PieceAmount;
    }

    public void setPieceAmount(int pieceAmount) {
        PieceAmount = pieceAmount;
    }

    public Double getWeight() {
        return Weight;
    }

    public void setWeight(Double weight) {
        Weight = weight;
    }

    public Double getVolume() {
        return Volume;
    }

    public void setVolume(Double volume) {
        Volume = volume;
    }

    public String getPriceMode() {
        return PriceMode;
    }

    public void setPriceMode(String priceMode) {
        PriceMode = priceMode;
    }

    public String getPriceStandard() {
        return PriceStandard;
    }

    public void setPriceStandard(String priceStandard) {
        PriceStandard = priceStandard;
    }

    public Double getGoodsValue() {
        return GoodsValue;
    }

    public void setGoodsValue(Double goodsValue) {
        GoodsValue = goodsValue;
    }
}
