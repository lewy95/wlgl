package cn.xzxy.lewy.pojo;

import javax.persistence.*;

@Entity
@Table(name = "t_29_cskc")
public class CityExpansion29 {

    private int id;
    private long CityID; //城市ID
    private String RangeCity;//范围城市

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public long getCityID() {
        return CityID;
    }

    public void setCityID(long cityID) {
        CityID = cityID;
    }

    public String getRangeCity() {
        return RangeCity;
    }

    public void setRangeCity(String rangeCity) {
        RangeCity = rangeCity;
    }
}
