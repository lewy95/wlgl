package cn.xzxy.lewy.action;

import cn.xzxy.lewy.pojo.User33;
import cn.xzxy.lewy.service.IUserService;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import org.apache.struts2.ServletActionContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

@Controller
@Scope("prototype")
public class UpdatePasswordAction extends ActionSupport implements ModelDriven<User33>{
    private User33 loginUser;
    @Autowired
    private IUserService userService;
    private String newPassword;

    public String getNewPassword() {
        return newPassword;
    }

    public void setNewPassword(String newPassword) {
        this.newPassword = newPassword;
    }

    public IUserService getUserService() {
        return userService;
    }

    public void setUserService(IUserService userService) {
        this.userService = userService;
    }



    public User33 getLoginUser() {
        return loginUser;
    }

    public void setLoginUser(User33 loginUser) {
        this.loginUser = loginUser;
    }

    public String updateIn(){
        return "success";
    }

    public String update(){
        loginUser = (User33)ServletActionContext.getRequest().getSession().getAttribute("loginUser");
        loginUser.setPassword(newPassword);
        userService.update(loginUser);
        return "success";
    }

    public User33 getModel() {
        if(loginUser == null){
            loginUser = new User33();
        }
        return loginUser;
    }
}
