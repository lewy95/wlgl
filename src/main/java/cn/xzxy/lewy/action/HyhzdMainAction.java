package cn.xzxy.lewy.action;

import cn.xzxy.lewy.pojo.DjMingxi2;
import cn.xzxy.lewy.pojo.Driver27;
import cn.xzxy.lewy.pojo.HydHuizhiMain6;
import cn.xzxy.lewy.pojo.User33;
import cn.xzxy.lewy.service.IDanjuService;
import cn.xzxy.lewy.service.IDriverService;
import cn.xzxy.lewy.service.IHyhzdMainService;
import cn.xzxy.lewy.util.RandomStringUtil;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import org.apache.struts2.ServletActionContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import java.util.Date;
import java.util.List;

@Controller
@Scope("prototype")
public class HyhzdMainAction extends ActionSupport implements ModelDriven<HydHuizhiMain6> {

    @Autowired
    IHyhzdMainService hyhzdMainService;

    @Autowired
    IDanjuService danjuService;

    @Autowired
    IDriverService driverService;

    private HydHuizhiMain6 hyhzdm;

    private DjMingxi2 djmx;

    public String hyhzdMainAdd(){
        //添加货运回执单主表
        hyhzdm.setIfBalance("0");//是否结算设置为未结算
        hyhzdm.setExecute("0");//执行字段设为0(未发车)
        hyhzdm.setBackBillState("1");//回执单状态设为1(未完成)
        hyhzdMainService.add(hyhzdm);

        //通过货运回执单主表编号获取到该对象
        HydHuizhiMain6 hydhzm = hyhzdMainService.findByCode(hyhzdm.getGoodsRevertBillCode());
        ActionContext.getContext().put("hydhzm",hydhzm);

        //添加单据信息
        if (djmx == null) {
            djmx = new DjMingxi2();
        }
        String djCode = RandomStringUtil.getRandomCode(8,0);
        djmx.setBillCode(djCode);
        djmx.setBillState("1");//单据状态设置为已填
        djmx.setWriteDate(new Date());
        djmx.setAcceptStation(hyhzdm.getAcceptStation());
        djmx.setHydCode(hyhzdm.getGoodsRevertBillCode());//设置单据的关联的货运单或回执单的id
        danjuService.add(djmx);

        return SUCCESS;
    }

    //司机前台功能
    public String daifaHyhzd() {
        //查出发货客户的信息
        User33 user = (User33) ServletActionContext.getRequest()
                .getSession().getAttribute("loginUser");
        Driver27 driver = driverService.findByName(user.getNickname());
        //ActionContext.getContext().getSession().put("driver",driver);

        System.out.println(driver.getId());
        List<HydHuizhiMain6> daifaHyhzds = hyhzdMainService.listByExecute("0",driver.getId());
        ActionContext.getContext().put("daifaHyhzds",daifaHyhzds);
        return SUCCESS;
    }

    public String updateExecute() {
        System.out.println(hyhzdm.getId());
        hyhzdMainService.updateExecute(hyhzdm.getId(),"1");
        return SUCCESS;
    }

    //查询未出回执单(执行0且状态1)
    public String weichuHyhzd() {
        List<HydHuizhiMain6> wcHyhzds = hyhzdMainService.findWcHyhzd();
        ActionContext.getContext().put("wcHyhzds",wcHyhzds);
        return SUCCESS;
    }

    //查询未到回执单(执行1且状态1)
    public String weidaoHyhzd() {
        List<HydHuizhiMain6> wdHyhzds = hyhzdMainService.findWdHyhzd();
        ActionContext.getContext().put("wdHyhzds",wdHyhzds);
        return SUCCESS;
    }

    //查询未到回执单(执行2且状态1)
    public String yidaoHyhzd() {
        List<HydHuizhiMain6> ydHyhzds = hyhzdMainService.listByExecute();
        ActionContext.getContext().put("ydHyhzds",ydHyhzds);
        return SUCCESS;
    }

    //查询已结回执单(结算1且状态1)
    public String yijieHyhzd() {
        List<HydHuizhiMain6> yjHyhzds = hyhzdMainService.findYjHyhzd();
        ActionContext.getContext().put("yjHyhzds",yjHyhzds);
        return SUCCESS;
    }

    //查询未结回执单(结算0且状态1)
    public String weijieHyhzd() {
        List<HydHuizhiMain6> wjHyhzds = hyhzdMainService.findWjHyhzd();
        ActionContext.getContext().put("wjHyhzds",wjHyhzds);
        return SUCCESS;
    }

    //查询所有合同
    public String listHyhzd() {
        List<HydHuizhiMain6> allHyhzds = hyhzdMainService.list();
        ActionContext.getContext().put("allHyhzds",allHyhzds);
        return SUCCESS;
    }

    public HydHuizhiMain6 getModel() {
        if (hyhzdm == null) {
            hyhzdm = new HydHuizhiMain6();
        }
        return hyhzdm;
    }
}
