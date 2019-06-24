package cn.xzxy.lewy.action;

import cn.xzxy.lewy.pojo.DriverJsMain12;
import cn.xzxy.lewy.pojo.HydHuizhiMain6;
import cn.xzxy.lewy.service.IDriverJsMainService;
import cn.xzxy.lewy.service.IHyhzdMainService;
import cn.xzxy.lewy.util.RandomStringUtil;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
@Scope("prototype")
public class DriverBillJsAction extends ActionSupport implements ModelDriven<DriverJsMain12> {

    @Autowired
    IDriverJsMainService driverJsMainService;

    @Autowired
    IHyhzdMainService hyhzdMainService;

    DriverJsMain12 driverJsMain;

    public String driverJsInput() {
        HydHuizhiMain6 wjHzdDetail = hyhzdMainService.get(driverJsMain.getId());
        ActionContext.getContext().put("wjHzdDetail", wjHzdDetail);
        return SUCCESS;
    }

    public String driverJs(){

        double costMoney = driverJsMain.getBindInsurance()
                + driverJsMain.getAddCarriage() + driverJsMain.getCarryFee();

        double receiveMoney = driverJsMain.getPayedMoney();

        if (costMoney == receiveMoney) {
            driverJsMainService.add(driverJsMain);
            //修改货运回执表的是否结算字段为1
            hyhzdMainService.updateIfBalance(driverJsMain.getBackBillCode());
        }

        return "redirect";
    }

    public DriverJsMain12 getModel() {
        if (driverJsMain == null) {
            driverJsMain = new DriverJsMain12();
        }
        return driverJsMain;
    }
}
