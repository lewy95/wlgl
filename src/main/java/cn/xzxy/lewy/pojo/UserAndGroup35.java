package cn.xzxy.lewy.pojo;

import javax.persistence.*;

@Entity
@Table(name = "t_35_yhyzb", schema = "wlgl", catalog = "")
public class UserAndGroup35 {
    private Integer id;

    private Integer userid;

    private Integer groupid;

    public UserAndGroup35(Integer id, Integer userid, Integer groupid) {
        this.id = id;
        this.userid = userid;
        this.groupid = groupid;
    }

    public UserAndGroup35() {
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

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public Integer getGroupid() {
        return groupid;
    }

    public void setGroupid(Integer groupid) {
        this.groupid = groupid;
    }
}