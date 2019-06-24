package cn.xzxy.lewy.pojo;

import javax.persistence.*;

@Entity
@Table(name = "t_30_xlxx")
public class Route30 {

    private int id;
    private String StartStation;//起点
    private String EndStation;//终点
    private double Distance;//里程
    private double FetchTime;//抵运时间

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getStartStation() {
        return StartStation;
    }

    public void setStartStation(String startStation) {
        StartStation = startStation;
    }

    public String getEndStation() {
        return EndStation;
    }

    public void setEndStation(String endStation) {
        EndStation = endStation;
    }

    public double getDistance() {
        return Distance;
    }

    public void setDistance(double distance) {
        Distance = distance;
    }

    public double getFetchTime() {
        return FetchTime;
    }

    public void setFetchTime(double fetchTime) {
        FetchTime = fetchTime;
    }
}
