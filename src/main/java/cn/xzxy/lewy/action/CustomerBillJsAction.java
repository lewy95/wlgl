package cn.xzxy.lewy.action;

import cn.xzxy.lewy.pojo.CustomerBillJs13;
import cn.xzxy.lewy.pojo.HydMain3;
import cn.xzxy.lewy.service.ICustomerBillJsService;
import cn.xzxy.lewy.service.IHydService;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

@Controller
@Scope("prototype")
public class CustomerBillJsAction extends ActionSupport implements ModelDriven<CustomerBillJs13>{

    @Autowired
    ICustomerBillJsService customerBillJsService;

    @Autowired
    IHydService hydService;

    CustomerBillJs13 customerBillJs;

    public String customerJsInput() {
        //System.out.println(customerBillJs.getId());
        HydMain3 wjHydDetail = hydService.get(customerBillJs.getId());
        ActionContext.getContext().put("wjHydDetail", wjHydDetail);
        return SUCCESS;
    }

    public String customerJs() {

        double costMoney = customerBillJs.getBillMoney()
                + customerBillJs.getInsurance() - customerBillJs.getCarriageReduceFund();
        double receiveMoney = customerBillJs.getReceivedMoney();

        if (costMoney == receiveMoney) {
            customerBillJsService.add(customerBillJs);
            //修改货运单的是否结算字段为1
            hydService.updateIfJs(customerBillJs.getGoodsBillCode());
        }

        return "redirect";
    }

    public CustomerBillJs13 getModel() {
        if (customerBillJs == null) {
            customerBillJs = new CustomerBillJs13();
        }
        return customerBillJs;
    }

}
