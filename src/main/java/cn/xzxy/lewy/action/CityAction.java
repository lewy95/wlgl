package cn.xzxy.lewy.action;

import cn.xzxy.lewy.pojo.City28;
import cn.xzxy.lewy.service.ICityService;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import java.util.List;

/**
 * Created by yuehailin on 2018/6/7.
 */

@Controller
@Scope("prototype")
public class CityAction extends ActionSupport implements ModelDriven<City28> {

    @Autowired
    private ICityService cityService;

    private City28 city;

    public String addInput() {
        return SUCCESS;
    }

    public String add() {
       cityService.add(city);
        return "redirect";
    }

    public String list() {
        List<City28> city28s = cityService.list();
        ActionContext.getContext().put("city28s",city28s);
        return SUCCESS;
    }

    public String delete(){
        cityService.delete(city);
        return "redirect";
    }

    public String updateInput(){
        return SUCCESS;
    }

    public String update(){
        cityService.update(city);
        return "redirect";
    }

    public City28 getModel() {
        if (city == null) {
            city = new City28();
        }
        return city;
    }
}
