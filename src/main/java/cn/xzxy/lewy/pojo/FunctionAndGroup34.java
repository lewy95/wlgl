package cn.xzxy.lewy.pojo;

import javax.persistence.*;

@Entity
@Table(name = "t_34_gnyzb", schema = "wlgl", catalog = "")
public class FunctionAndGroup34 {
    private Integer id;

    private Integer functionid;

    private Integer groupid;

    public FunctionAndGroup34(Integer id, Integer functionid, Integer groupid) {
        this.id = id;
        this.functionid = functionid;
        this.groupid = groupid;
    }

    public FunctionAndGroup34() {
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

    public Integer getFunctionid() {
        return functionid;
    }

    public void setFunctionid(Integer functionid) {
        this.functionid = functionid;
    }

    public Integer getGroupid() {
        return groupid;
    }

    public void setGroupid(Integer groupid) {
        this.groupid = groupid;
    }
}