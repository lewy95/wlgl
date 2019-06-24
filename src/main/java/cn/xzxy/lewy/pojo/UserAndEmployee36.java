package cn.xzxy.lewy.pojo;

import javax.persistence.*;

@Entity
@Table(name = "t_36_zyyhgx")
public class UserAndEmployee36 {
    private Integer id;

    private Integer employerid;

    private Integer userid;

    public UserAndEmployee36(Integer id, Integer employerid, Integer userid) {
        this.id = id;
        this.employerid = employerid;
        this.userid = userid;
    }

    public UserAndEmployee36() {
        super();
    }

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getEmployerid() {
        return employerid;
    }

    public void setEmployerid(Integer employerid) {
        this.employerid = employerid;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }
}