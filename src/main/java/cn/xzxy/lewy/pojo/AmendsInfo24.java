package cn.xzxy.lewy.pojo;

import javax.persistence.*;
import java.util.Date;

/**
 * 赔偿信息表
 */
@Entity
@Table(name = "t_24_pcxx")
public class AmendsInfo24 {
    private int id;
    private Double Amends;
    private String Customer;
    private Date AmendsTime;
    private String Remark;
    private int ReceiveStationID;
    private Double BadDestroyGoods;
    private String ReceiveStationName;
    private Date WriteDate;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Double getAmends() {
        return Amends;
    }

    public void setAmends(Double amends) {
        Amends = amends;
    }

    public String getCustomer() {
        return Customer;
    }

    public void setCustomer(String customer) {
        Customer = customer;
    }

    @Temporal(TemporalType.TIMESTAMP)
    public Date getAmendsTime() {
        return AmendsTime;
    }

    public void setAmendsTime(Date amendsTime) {
        AmendsTime = amendsTime;
    }

    public String getRemark() {
        return Remark;
    }

    public void setRemark(String remark) {
        Remark = remark;
    }

    public int getReceiveStationID() {
        return ReceiveStationID;
    }

    public void setReceiveStationID(int receiveStationID) {
        ReceiveStationID = receiveStationID;
    }

    public Double getBadDestroyGoods() {
        return BadDestroyGoods;
    }

    public void setBadDestroyGoods(Double badDestroyGoods) {
        BadDestroyGoods = badDestroyGoods;
    }

    public String getReceiveStationName() {
        return ReceiveStationName;
    }

    public void setReceiveStationName(String receiveStationName) {
        ReceiveStationName = receiveStationName;
    }

    @Temporal(TemporalType.TIMESTAMP)
    public Date getWriteDate() {
        return WriteDate;
    }

    public void setWriteDate(Date writeDate) {
        WriteDate = writeDate;
    }

    public AmendsInfo24(Double amends, String customer, Date amendsTime, String remark, int receiveStationID, Double badDestroyGoods, String receiveStationName, Date writeDate) {
        Amends = amends;
        Customer = customer;
        AmendsTime = amendsTime;
        Remark = remark;
        ReceiveStationID = receiveStationID;
        BadDestroyGoods = badDestroyGoods;
        ReceiveStationName = receiveStationName;
        WriteDate = writeDate;
    }

    public AmendsInfo24(int id, Double amends, String customer, Date amendsTime, String remark, int receiveStationID, Double badDestroyGoods, String receiveStationName, Date writeDate) {
        this.id = id;
        Amends = amends;
        Customer = customer;
        AmendsTime = amendsTime;
        Remark = remark;
        ReceiveStationID = receiveStationID;
        BadDestroyGoods = badDestroyGoods;
        ReceiveStationName = receiveStationName;
        WriteDate = writeDate;
    }

    public AmendsInfo24() {
    }
}
