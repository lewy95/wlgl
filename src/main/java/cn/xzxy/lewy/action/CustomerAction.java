package cn.xzxy.lewy.action;

import cn.xzxy.lewy.pojo.Customer25;
import cn.xzxy.lewy.pojo.User33;
import cn.xzxy.lewy.service.ICustomerService;
import cn.xzxy.lewy.service.IUserService;
import cn.xzxy.lewy.util.Page;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

@Controller
@Scope("prototype")
public class CustomerAction extends ActionSupport implements ModelDriven<Customer25>{

    @Autowired
    private ICustomerService customerService;

    @Autowired
    IUserService userService;

    User33 user;

    private Customer25 customer;

    public String addInput() {
        return SUCCESS;
    }

    public String add() {

        //添加客户账号
        if (user == null) {
            user = new User33();
        }
        user.setLoginid(customer.getCustomerCode());
        user.setPassword("123456");
        user.setNickname(customer.getCustomer());
        userService.add(user);
        
        //添加客户信息
        customerService.add(customer);
        return "redirect";
    }

    public String list() {
        Page<Customer25> datas = customerService.listByPage();
        ActionContext.getContext().put("datas",datas);
        return SUCCESS;
    }

    public Customer25 getModel() {
        if (customer == null) {
            customer = new Customer25();
        }
        return customer;
    }
}
