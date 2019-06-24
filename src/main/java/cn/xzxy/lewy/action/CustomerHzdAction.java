package cn.xzxy.lewy.action;

import cn.xzxy.lewy.pojo.CustomerHuizhiInfo7;
import cn.xzxy.lewy.pojo.HydMain3;
import cn.xzxy.lewy.pojo.User33;
import cn.xzxy.lewy.service.ICustomerHzdService;
import cn.xzxy.lewy.service.impl.HydService;
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
public class CustomerHzdAction extends ActionSupport implements ModelDriven<CustomerHuizhiInfo7> {

    @Autowired
    ICustomerHzdService customerHzdService;

    @Autowired
    HydService hydService;

    CustomerHuizhiInfo7 customerHzd;

    //根据司机id查询所有运单
    public String listCustomerHz() {
        //查出发货客户的信息
        User33 user = (User33) ServletActionContext.getRequest()
                .getSession().getAttribute("loginUser");
        System.out.println(user.getLoginid());

        List<HydMain3> customerHyds = hydService.listByCustomer(user.getLoginid());
        ActionContext.getContext().put("customerHyds",customerHyds);

        return SUCCESS;
    }

    //进入填写回执单界面
    public String customerHzInput() {
        System.out.println(customerHzd.getId());
        HydMain3 cHyd = hydService.get(customerHzd.getId());
        ActionContext.getContext().put("cHyd",cHyd);
        return SUCCESS;
    }

    public String customerHzAdd(){

        customerHzdService.add(customerHzd);

        //如果已验收，修改货运单Validity的字段
        if (customerHzd.getCheckGoodsRecord().equals("1")) {
            System.out.println("已验证");
            System.out.println(customerHzd.getGoodsBillCode());
            hydService.updateValidity(customerHzd.getGoodsBillCode());
        }
        return "redirect";
    }

    public String list() {
        List<CustomerHuizhiInfo7> customerHzds = customerHzdService.list();
        ActionContext.getContext().put("customerHzds",customerHzds);
        return SUCCESS;
    }


    public CustomerHuizhiInfo7 getModel() {
        if (customerHzd == null) {
            customerHzd = new CustomerHuizhiInfo7();
        }
        return customerHzd;
    }
}
