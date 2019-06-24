package cn.xzxy.lewy.action;

import cn.xzxy.lewy.pojo.Employee26;
import cn.xzxy.lewy.service.IEmployeeService;
import cn.xzxy.lewy.util.Page;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
@Scope("prototype")
public class EmployeeAction extends ActionSupport implements ModelDriven<Employee26> {

    @Autowired
    private IEmployeeService employeeService;

    private Employee26 employee;

    public String addInput() {
        return SUCCESS;
    }

    public String add() {
        employeeService.add(employee);
        return "redirect";
    }

    public String list() {
        Page<Employee26> datas = employeeService.listByPage();
        ActionContext.getContext().put("datas",datas);
        return SUCCESS;
    }


    public Employee26 getModel() {

        if (employee == null) {
            employee = new Employee26();
        }
        return employee;
    }
}
