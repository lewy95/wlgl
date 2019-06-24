package cn.xzxy.lewy.action;

import cn.xzxy.lewy.pojo.Customer25;
import cn.xzxy.lewy.pojo.User33;
import cn.xzxy.lewy.service.ICustomerService;
import cn.xzxy.lewy.service.IUserService;
import com.opensymphony.xwork2.ActionContext;
import org.apache.struts2.ServletActionContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

@Controller
@Scope("prototype")
public class LoginAction {

    @Autowired
    private IUserService userService;

    private String loginid;
    private String password;

    public String getLoginid() {
        return loginid;
    }

    public void setLoginid(String loginid) {
        this.loginid = loginid;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;

    }

    /**
     * 用户登录方法：
     * 管理员登录以后,角色为1
     * 客户登录以后,角色为2
     * 司机登录以后,角色为3
     */

    public String login() {
        User33 loginUser = userService.login(loginid, password);
        //把登录用户添加到session中
        ServletActionContext.getRequest().getSession().setAttribute("loginUser", loginUser);

        //以a开头,说明登录用户是管理员,角色为1
        //以c开头,说明登录用户是客户,角色为2
        //以d开头,说明登录用户是司机,角色为3
        if (loginid.startsWith("a")) {
            //把登录用户角色添加到session中
            ServletActionContext.getRequest().getSession().setAttribute("role", 1);
        }else if(loginid.startsWith("c")){
            //把登录用户角色添加到session中
            ServletActionContext.getRequest().getSession().setAttribute("role", 2);
        }else if(loginid.startsWith("d")){
            //把登录用户角色添加到session中
            ServletActionContext.getRequest().getSession().setAttribute("role", 3);
        }

        return "success";
    }

    /**
     * 跳转到页面顶部方法
     */
    public String top() {
        return "success";
    }

    /**
     * 跳转到页面左部方法
     */
    public String left() {
        int role = (Integer) ServletActionContext
                .getRequest().getSession().getAttribute("role");
        //管理员
        if (role == 1) {
            return "left1";
        }
        //客户
        else if (role == 2) {
            return "left2";
        }
        //司机
        else if (role == 3) {
            return "left3";
        } else {
            return null;
        }
    }

    /**
     * 跳转到欢迎界面方法
     */
    public String welcome() {
        return "success";
    }

    /**
     * 退出
     */
    public String logout() {
        //清空session
        ServletActionContext.getRequest().getSession().invalidate();
        return "success";
    }
}
