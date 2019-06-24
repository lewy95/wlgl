package cn.xzxy.lewy.action;

import cn.xzxy.lewy.pojo.*;
import cn.xzxy.lewy.service.IDriverHzdService;
import cn.xzxy.lewy.service.IDriverService;
import cn.xzxy.lewy.service.IHyhzdDetailService;
import cn.xzxy.lewy.service.IHyhzdMainService;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import org.apache.struts2.ServletActionContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
@Scope("prototype")
public class DriverHzdAction extends ActionSupport implements ModelDriven<GoodsHuizhiInfo8>{

    @Autowired
    IDriverHzdService driverHzdService;

    @Autowired
    IHyhzdMainService hyhzdMainService;

    @Autowired
    IHyhzdDetailService hyhzdDetailService;

    @Autowired
    IDriverService driverService;

    GoodsHuizhiInfo8 driverHzd;

    public String listDriverHz() {
        //查出发货客户的信息
        User33 user = (User33) ServletActionContext.getRequest()
                .getSession().getAttribute("loginUser");
        Driver27 driver = driverService.findByName(user.getNickname());
        System.out.println(driver.getId());

        //根据司机id查询已发车的回执单
        List<HydHuizhiMain6> driverHzs = hyhzdMainService.listByDriverId(driver.getId());
        ActionContext.getContext().put("driverHzs",driverHzs);
        return SUCCESS;
    }

    public String driverHzInput() {
        HydHuizhiMain6 hzdm = hyhzdMainService.get(driverHzd.getId());
        ActionContext.getContext().put("hzdm",hzdm);
        return SUCCESS;
    }

    public String driverHzAdd() {
        driverHzdService.add(driverHzd);

        //修改Execute的状态为2(车已到，货物已送达)
        HydHuizhiMain6 hyhzd = hyhzdMainService.findByCode(driverHzd.getGoodsRevertCode());
        hyhzdMainService.updateExecute(hyhzd.getId(),"2");

        //根据是否验证，判断是否进入差错信息填写页面
        if (driverHzd.getCheckGoodsRecord().equals("0")) {
            HydHuizhiDetail5 hyhzdx = hyhzdDetailService.findByHzId(hyhzd.getId());
            ActionContext.getContext().put("hyhzdx",hyhzdx);
            return "mistake";
        } else {
            return "redirect";
        }
    }

    public String list() {
        List<GoodsHuizhiInfo8> driverHzds = driverHzdService.list();
        ActionContext.getContext().put("driverHzds",driverHzds);
        return SUCCESS;
    }

    public GoodsHuizhiInfo8 getModel() {
        if (driverHzd == null) {
            driverHzd = new GoodsHuizhiInfo8();
        }
        return driverHzd;
    }
}
