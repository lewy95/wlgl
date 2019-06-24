package cn.xzxy.lewy.pojo;

import javax.persistence.*;

@Entity
@Table(name = "t_32_yhzb")
public class Group32 {
    private Integer id;

    private String groupname;

    private String description;

    public Group32(Integer id, String groupname, String description) {
        this.id = id;
        this.groupname = groupname;
        this.description = description;
    }

    public Group32() {
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

    public String getGroupname() {
        return groupname;
    }

    public void setGroupname(String groupname) {
        this.groupname = groupname == null ? null : groupname.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }
}