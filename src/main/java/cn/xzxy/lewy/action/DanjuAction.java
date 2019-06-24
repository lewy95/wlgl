package cn.xzxy.lewy.action;

import cn.xzxy.lewy.pojo.DjFenfa1;
import cn.xzxy.lewy.pojo.DjMingxi2;
import cn.xzxy.lewy.service.IDanjuService;
import cn.xzxy.lewy.service.IFenfaService;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import java.util.Date;
import java.util.List;

@Controller
@Scope("prototype")
public class DanjuAction extends ActionSupport implements ModelDriven<DjMingxi2>{

    @Autowired
    IDanjuService danjuService;

    @Autowired
    IFenfaService fenfaService;

    private String billType;
    private String billStartCode;
    private String billEndCode;
    private String receiveBillPerson;
    private String acceptStation;
    private Date receiveBillTime;
    private String releasePerson;

    public String getBillType() {
        return billType;
    }

    public void setBillType(String billType) {
        this.billType = billType;
    }

    public String getBillStartCode() {
        return billStartCode;
    }

    public void setBillStartCode(String billStartCode) {
        this.billStartCode = billStartCode;
    }

    public String getBillEndCode() {
        return billEndCode;
    }

    public void setBillEndCode(String billEndCode) {
        this.billEndCode = billEndCode;
    }

    public String getReceiveBillPerson() {
        return receiveBillPerson;
    }

    public void setReceiveBillPerson(String receiveBillPerson) {
        this.receiveBillPerson = receiveBillPerson;
    }

    public String getAcceptStation() {
        return acceptStation;
    }

    public void setAcceptStation(String acceptStation) {
        this.acceptStation = acceptStation;
    }

    public Date getReceiveBillTime() {
        return receiveBillTime;
    }

    public void setReceiveBillTime(Date receiveBillTime) {
        this.receiveBillTime = receiveBillTime;
    }

    public String getReleasePerson() {
        return releasePerson;
    }

    public void setReleasePerson(String releasePerson) {
        this.releasePerson = releasePerson;
    }

    DjMingxi2 djmx;

    public String yitianDj() {
        List<DjMingxi2> yitianDjs = danjuService.listYtDj();
        ActionContext.getContext().put("yitianDjs",yitianDjs);
        return SUCCESS;
    }

    public String zuofeiDj() {
        List<DjMingxi2> zuofeiDjs = danjuService.listZfDj();
        ActionContext.getContext().put("zuofeiDjs",zuofeiDjs);
        return SUCCESS;
    }

    public String yijieDj() {
        List<DjMingxi2> yijieDjs = danjuService.listYjDj();
        ActionContext.getContext().put("yijieDjs",yijieDjs);
        return SUCCESS;
    }

    public String list() {
        List<DjMingxi2> allDjs = danjuService.list();
        ActionContext.getContext().put("allDjs",allDjs);
        return SUCCESS;
    }

    public String updateInput() {
        System.out.println(djmx.getId());
        DjMingxi2 djmxd = danjuService.findDjById(djmx.getId());
        ActionContext.getContext().put("djmxd",djmxd);
        return SUCCESS;
    }

    public String update() {
        danjuService.update(djmx);
        return "redirect";
    }

    public String addIn(){
        return SUCCESS;
    }

    public String add(){
        DjFenfa1 djFenfa1 = new DjFenfa1();
        djFenfa1.setAcceptStation(acceptStation);
        djFenfa1.setBillEndCode(billEndCode);
        djFenfa1.setBillStartCode(billStartCode);
        djFenfa1.setBillType(billType);
        djFenfa1.setReceiveBillPerson(receiveBillPerson);
        djFenfa1.setReleasePerson(releasePerson);
        djFenfa1.setReceiveBillTime(receiveBillTime);
        fenfaService.add(djFenfa1);
        return SUCCESS;
    }

    //删除单据(即将单据状态设置为0作废)
    public String delete() {
        danjuService.updateDjState(djmx.getId(),"0");
        return "redirect";
    }

    public DjMingxi2 getModel() {
        if (djmx == null) {
            djmx = new DjMingxi2();
        }
        return djmx;
    }
}
