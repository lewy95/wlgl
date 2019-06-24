package cn.xzxy.lewy.pojo;

import javax.persistence.*;

@Entity
@Table(name = "t_31_gnb")
public class Function31 {
    private Integer id;

    private String pagefunction;

    private String pagename;

    public Function31(Integer id, String pagefunction, String pagename) {
        this.id = id;
        this.pagefunction = pagefunction;
        this.pagename = pagename;
    }

    public Function31() {
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

    public String getPagefunction() {
        return pagefunction;
    }

    public void setPagefunction(String pagefunction) {
        this.pagefunction = pagefunction == null ? null : pagefunction.trim();
    }

    public String getPagename() {
        return pagename;
    }

    public void setPagename(String pagename) {
        this.pagename = pagename == null ? null : pagename.trim();
    }
}