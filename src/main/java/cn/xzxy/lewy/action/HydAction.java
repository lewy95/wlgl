package cn.xzxy.lewy.action;

import cn.xzxy.lewy.pojo.Customer25;
import cn.xzxy.lewy.pojo.DjMingxi2;
import cn.xzxy.lewy.pojo.HydMain3;
import cn.xzxy.lewy.pojo.User33;
import cn.xzxy.lewy.service.ICustomerService;
import cn.xzxy.lewy.service.IDanjuService;
import cn.xzxy.lewy.service.IHydService;
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
public class HydAction extends ActionSupport implements ModelDriven<HydMain3> {

    @Autowired
    IHydService hydService;

    @Autowired
    ICustomerService customerService;

    @Autowired
    IDanjuService danjuService;

    private HydMain3 hyd;

    private DjMingxi2 djmx;

    //前台功能
    public String hydAddInput(){
        //查出发货客户的信息
        User33 user = (User33) ServletActionContext.getRequest()
                .getSession().getAttribute("loginUser");
        Customer25 customer = customerService.findByCode(user.getLoginid());
        ActionContext.getContext().put("cus",customer);
        return SUCCESS;
    }

    public String hydAdd(){
        hyd.setIfAudit("0");//设置运单是否审核
        hyd.setValidity("1");//设置运单的有效性
        hyd.setIfSettleAccounts("0");//设置运单是否结算
        hydService.add(hyd);

        //添加单据信息
        if (djmx == null) {
            djmx = new DjMingxi2();
        }
        String djCode = RandomStringUtil.getRandomCode(8,0);
        djmx.setBillCode(djCode);
        djmx.setBillState("1");//单据状态设置为已填
        djmx.setWriteDate(hyd.getWriteDate());
        djmx.setAcceptStation(hyd.getAcceptStation());
        djmx.setHydCode(hyd.getGoodsBillCode());//设置单据的关联的货运单或回执单的id
        danjuService.add(djmx);

        return SUCCESS;
    }

    //后台功能
    public String checkList(){
        List<HydMain3> noAuditHyds = hydService.findNoAuditHyd();//查出未审核货运单
        ActionContext.getContext().put("noAuditHyds",noAuditHyds);
        return SUCCESS;
    }

    public String checkDetail(){
        int hydId = hyd.getId();
        System.out.println(hydId);
        HydMain3 hydCheck = hydService.get(hydId);
        ActionContext.getContext().getSession().put("hydCheck",hydCheck);
        return SUCCESS;
    }

    public String showDetail(){
        int hydId = hyd.getId();
        HydMain3 hydCheck = hydService.get(hydId);
        ActionContext.getContext().getSession().put("hydCheck",hydCheck);
        return SUCCESS;
    }

    public String hydUpdate(){
        hyd.setIfAudit("0");//设置运单是否审核
        hyd.setValidity("1");//设置运单的有效性
        hyd.setIfSettleAccounts("0");//设置运单是否结算
        hydService.update(hyd);
        return "forCar";
    }

    //查询未发运单（有效，未配车）
    public String daifaHyd() {
        List<HydMain3> daifaHyds = hydService.findDaifaHyd();
        ActionContext.getContext().put("daifaHyds",daifaHyds);
        return SUCCESS;
    }

    //查询未到运单（有效，已配车）
    public String weidaoHyd() {
        List<HydMain3> weidaoHyds = hydService.findWeidaoHyd();
        ActionContext.getContext().put("weidaoHyds",weidaoHyds);
        return SUCCESS;
    }

    //查询未结运单（有效，未结款）
    public String weijieHyd() {
        List<HydMain3> weijieHyds = hydService.findWeijieHyd();
        ActionContext.getContext().put("weijieHyds",weijieHyds);
        return SUCCESS;
    }

    //查询已结运单（有效，已结款）
    public String yijieHyd() {
        List<HydMain3> yijieHyds = hydService.findyijieHyd();
        ActionContext.getContext().put("yijieHyds",yijieHyds);
        return SUCCESS;
    }

    //查询所有运单
    public String listHyd() {
        List<HydMain3> allHyds = hydService.list();
        ActionContext.getContext().put("allHyds",allHyds);
        return SUCCESS;
    }

    public HydMain3 getModel() {
        if (hyd == null) {
            hyd = new HydMain3();
        }
        return hyd;
    }
}
