package cn.xzxy.lewy.pojo;

import javax.persistence.*;

@Entity
@Table(name = "t_28_dqcs")
public class City28 {

    private int id;
    private String City;//城市

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String city) {
        City = city;
    }
}
