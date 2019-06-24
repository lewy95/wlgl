package cn.xzxy.lewy.action;

import cn.xzxy.lewy.pojo.Route30;
import cn.xzxy.lewy.service.ICityService;
import cn.xzxy.lewy.service.IRouteService;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import java.util.List;

/**
 * Created by yuehailin on 2018/6/6.
 */
@Controller
@Scope("prototype")
public class RouteAction extends ActionSupport implements ModelDriven<Route30> {
    @Autowired
    private IRouteService routeService;

    @Autowired
    private ICityService cityService;

    private Route30 route;

    public String addInput() {
        ActionContext.getContext().put("city28s",cityService.list());
        return SUCCESS;
    }


    public String updateInput(){

        return  SUCCESS;
    }
    public String update(){
        routeService.update(route);
        return "redirect";
    }

    public String delete(){
        routeService.delete(route);
        return "redirect";

    }

    public String add() {
        routeService.add(route);
        return "redirect";
    }

    public String list() {
        List<Route30> route30s = routeService.list();
        ActionContext.getContext().put("route30s",route30s);
        return SUCCESS;
    }

    public Route30 getModel() {
        if (route == null) {
            route = new Route30();
        }
        return route;
    }
}
