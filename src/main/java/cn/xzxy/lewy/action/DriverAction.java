package cn.xzxy.lewy.action;

import cn.xzxy.lewy.pojo.Driver27;
import cn.xzxy.lewy.pojo.User33;
import cn.xzxy.lewy.service.IDriverService;
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
public class DriverAction extends ActionSupport implements ModelDriven<Driver27> {

    @Autowired
    private IDriverService driverService;

    @Autowired
    IUserService userService;

    private Driver27 driver;

    User33 user;

    public String addInput() {
        return SUCCESS;
    }

    public String add() {

        //添加司机账号
        if (user == null) {
            user = new User33();
        }
        user.setLoginid("d" + driver.getDriverName());
        user.setPassword("123456");
        user.setNickname(driver.getDriverName());
        userService.add(user);

        //添加司机信息
        driverService.add(driver);
        return "redirect";
    }

    public String list() {
        Page<Driver27> datas = driverService.listByPage();
        ActionContext.getContext().put("datas", datas);
        return SUCCESS;
    }

    public Driver27 getModel() {
        if (driver == null) {
            driver = new Driver27();
        }
        return driver;
    }
}
