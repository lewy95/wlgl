package cn.xzxy.lewy.pojo;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "t_4_hydsj")
public class HydEvent4 {

    private Integer id;
    private int GoodsBillID;//货运单id
    private String EventName;//事件名称
    private String Remark;//备注
    private Date OccurTime;//发生时间

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getGoodsBillID() {
        return GoodsBillID;
    }

    public void setGoodsBillID(int goodsBillID) {
        GoodsBillID = goodsBillID;
    }

    public String getEventName() {
        return EventName;
    }

    public void setEventName(String eventName) {
        EventName = eventName;
    }

    public String getRemark() {
        return Remark;
    }

    public void setRemark(String remark) {
        Remark = remark;
    }

    @Temporal(TemporalType.TIMESTAMP)
    public Date getOccurTime() {
        return OccurTime;
    }

    public void setOccurTime(Date occurTime) {
        OccurTime = occurTime;
    }
}
