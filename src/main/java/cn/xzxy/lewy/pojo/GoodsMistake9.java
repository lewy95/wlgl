package cn.xzxy.lewy.pojo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * 货运差错表
 */
@Entity
@Table(name = "t_9_hycc")
public class GoodsMistake9 {

    private int id;
    private String GoodsRevertBillCode;//货运回执单编号
    private String GoodsBillCode;//货运单编号
    private String Customer;//客户名称
    private String GoodsName;//货物名称
    private String MistakeType;//差错类别
    private int PieceAmount;//件数
    private String Size;//规格
    private double GoodsValue;//货物价值

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getGoodsRevertBillCode() {
        return GoodsRevertBillCode;
    }

    public void setGoodsRevertBillCode(String goodsRevertBillCode) {
        GoodsRevertBillCode = goodsRevertBillCode;
    }

    public String getGoodsBillCode() {
        return GoodsBillCode;
    }

    public void setGoodsBillCode(String goodsBillCode) {
        GoodsBillCode = goodsBillCode;
    }

    public String getCustomer() {
        return Customer;
    }

    public void setCustomer(String customer) {
        Customer = customer;
    }

    public String getGoodsName() {
        return GoodsName;
    }

    public void setGoodsName(String goodsName) {
        GoodsName = goodsName;
    }

    public String getMistakeType() {
        return MistakeType;
    }

    public void setMistakeType(String mistakeType) {
        MistakeType = mistakeType;
    }

    public int getPieceAmount() {
        return PieceAmount;
    }

    public void setPieceAmount(int pieceAmount) {
        PieceAmount = pieceAmount;
    }

    public String getSize() {
        return Size;
    }

    public void setSize(String size) {
        Size = size;
    }

    public double getGoodsValue() {
        return GoodsValue;
    }

    public void setGoodsValue(double goodsValue) {
        GoodsValue = goodsValue;
    }

}
