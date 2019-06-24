package cn.xzxy.lewy.pojo;

import javax.persistence.*;

/**
 * Created by yuehailin on 2018/6/6.
 */
@Entity
@Table(name = "t_41_dyywtjrb", schema = "wlgl", catalog = "")
public class PrintServieTotal41 {
    private String pickupStation;
    private String receiveGoodsAddr1;
    private String moneyReceivable1;
    private String receivedMoney1;
    private String balance1;
    private String pieceCountReceivable1;
    private String receivedPieceCount1;
    private String remainPieceCount1;
    private String receiveGoodsAddr2;
    private String moneyReceivable2;
    private String receivedMoney2;
    private String balance2;
    private String pieceCountReceivable2;
    private String receivedPieceCount2;
    private String remainPieceCount2;
    private String receiveGoodsAddr3;
    private String moneyReceivable3;
    private String receivedMoney3;
    private String balance3;
    private String pieceCountReceivable3;
    private String receivedPieceCount3;
    private String remainPieceCount3;


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "PickupStation")
    public String getPickupStation() {
        return pickupStation;
    }

    public void setPickupStation(String pickupStation) {
        this.pickupStation = pickupStation;
    }


    @Column(name = "ReceiveGoodsAddr1")
    public String getReceiveGoodsAddr1() {
        return receiveGoodsAddr1;
    }

    public void setReceiveGoodsAddr1(String receiveGoodsAddr1) {
        this.receiveGoodsAddr1 = receiveGoodsAddr1;
    }


    @Column(name = "MoneyReceivable1")
    public String getMoneyReceivable1() {
        return moneyReceivable1;
    }

    public void setMoneyReceivable1(String moneyReceivable1) {
        this.moneyReceivable1 = moneyReceivable1;
    }


    @Column(name = "ReceivedMoney1")
    public String getReceivedMoney1() {
        return receivedMoney1;
    }

    public void setReceivedMoney1(String receivedMoney1) {
        this.receivedMoney1 = receivedMoney1;
    }


    @Column(name = "Balance1")
    public String getBalance1() {
        return balance1;
    }

    public void setBalance1(String balance1) {
        this.balance1 = balance1;
    }


    @Column(name = "PieceCountReceivable1")
    public String getPieceCountReceivable1() {
        return pieceCountReceivable1;
    }

    public void setPieceCountReceivable1(String pieceCountReceivable1) {
        this.pieceCountReceivable1 = pieceCountReceivable1;
    }


    @Column(name = "ReceivedPieceCount1")
    public String getReceivedPieceCount1() {
        return receivedPieceCount1;
    }

    public void setReceivedPieceCount1(String receivedPieceCount1) {
        this.receivedPieceCount1 = receivedPieceCount1;
    }


    @Column(name = "RemainPieceCount1")
    public String getRemainPieceCount1() {
        return remainPieceCount1;
    }

    public void setRemainPieceCount1(String remainPieceCount1) {
        this.remainPieceCount1 = remainPieceCount1;
    }


    @Column(name = "ReceiveGoodsAddr2")
    public String getReceiveGoodsAddr2() {
        return receiveGoodsAddr2;
    }

    public void setReceiveGoodsAddr2(String receiveGoodsAddr2) {
        this.receiveGoodsAddr2 = receiveGoodsAddr2;
    }


    @Column(name = "MoneyReceivable2")
    public String getMoneyReceivable2() {
        return moneyReceivable2;
    }

    public void setMoneyReceivable2(String moneyReceivable2) {
        this.moneyReceivable2 = moneyReceivable2;
    }


    @Column(name = "ReceivedMoney2")
    public String getReceivedMoney2() {
        return receivedMoney2;
    }

    public void setReceivedMoney2(String receivedMoney2) {
        this.receivedMoney2 = receivedMoney2;
    }


    @Column(name = "Balance2")
    public String getBalance2() {
        return balance2;
    }

    public void setBalance2(String balance2) {
        this.balance2 = balance2;
    }


    @Column(name = "PieceCountReceivable2")
    public String getPieceCountReceivable2() {
        return pieceCountReceivable2;
    }

    public void setPieceCountReceivable2(String pieceCountReceivable2) {
        this.pieceCountReceivable2 = pieceCountReceivable2;
    }
   @Column(name = "ReceivedPieceCount2")
    public String getReceivedPieceCount2() {
        return receivedPieceCount2;
    }

    public void setReceivedPieceCount2(String receivedPieceCount2) {
        this.receivedPieceCount2 = receivedPieceCount2;
    }

    @Column(name = "RemainPieceCount2")
    public String getRemainPieceCount2() {
        return remainPieceCount2;
    }

    public void setRemainPieceCount2(String remainPieceCount2) {
        this.remainPieceCount2 = remainPieceCount2;
    }


    @Column(name = "ReceiveGoodsAddr3")
    public String getReceiveGoodsAddr3() {
        return receiveGoodsAddr3;
    }

    public void setReceiveGoodsAddr3(String receiveGoodsAddr3) {
        this.receiveGoodsAddr3 = receiveGoodsAddr3;
    }


    @Column(name = "MoneyReceivable3")
    public String getMoneyReceivable3() {
        return moneyReceivable3;
    }

    public void setMoneyReceivable3(String moneyReceivable3) {
        this.moneyReceivable3 = moneyReceivable3;
    }


    @Column(name = "ReceivedMoney3")
    public String getReceivedMoney3() {
        return receivedMoney3;
    }

    public void setReceivedMoney3(String receivedMoney3) {
        this.receivedMoney3 = receivedMoney3;
    }


    @Column(name = "Balance3")
    public String getBalance3() {
        return balance3;
    }

    public void setBalance3(String balance3) {
        this.balance3 = balance3;
    }


    @Column(name = "PieceCountReceivable3")
    public String getPieceCountReceivable3() {
        return pieceCountReceivable3;
    }

    public void setPieceCountReceivable3(String pieceCountReceivable3) {
        this.pieceCountReceivable3 = pieceCountReceivable3;
    }


    @Column(name = "ReceivedPieceCount3")
    public String getReceivedPieceCount3() {
        return receivedPieceCount3;
    }

    public void setReceivedPieceCount3(String receivedPieceCount3) {
        this.receivedPieceCount3 = receivedPieceCount3;
    }


    @Column(name = "RemainPieceCount3")
    public String getRemainPieceCount3() {
        return remainPieceCount3;
    }

    public void setRemainPieceCount3(String remainPieceCount3) {
        this.remainPieceCount3 = remainPieceCount3;
    }
}
