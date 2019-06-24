package cn.xzxy.lewy.action;

import cn.xzxy.lewy.pojo.GoodsMistake9;
import cn.xzxy.lewy.service.IHzdMistakeService;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
@Scope("prototype")
public class HzdMistakeAction extends ActionSupport implements ModelDriven<GoodsMistake9> {

    @Autowired
    IHzdMistakeService hzdMistakeService;

    GoodsMistake9 mistake;

    public String mistakeAdd() {
        hzdMistakeService.add(mistake);
        return "redirect";
    }

    public String list() {
        List<GoodsMistake9> mistakes = hzdMistakeService.list();
        ActionContext.getContext().put("mistakes",mistakes);
        return SUCCESS;
    }

    public GoodsMistake9 getModel() {
        if (mistake == null) {
            mistake = new GoodsMistake9();
        }
        return mistake;
    }
}
