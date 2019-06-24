package cn.xzxy.lewy.action;

import cn.xzxy.lewy.pojo.DjMingxi2;
import cn.xzxy.lewy.pojo.HydHuizhiDetail5;
import cn.xzxy.lewy.service.IDanjuService;
import cn.xzxy.lewy.service.IHydService;
import cn.xzxy.lewy.service.IHyhzdDetailService;
import cn.xzxy.lewy.util.RandomStringUtil;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import java.util.Date;

@Controller
@Scope("prototype")
public class HyhzdDetailAction extends ActionSupport implements ModelDriven<HydHuizhiDetail5> {

    @Autowired
    IHyhzdDetailService hyhzdDetailService;

    @Autowired
    IHydService hydService;

    private HydHuizhiDetail5 hyhzdx;

    public String hyhzdDetailAdd(){

        hyhzdDetailService.add(hyhzdx);

        //将货运单的是否审核设置为1(即已配车)
        hydService.updateAudit(hyhzdx.getGoodsBillDetailID());

        return SUCCESS;
    }

    public HydHuizhiDetail5 getModel() {
        if (hyhzdx == null) {
            hyhzdx = new HydHuizhiDetail5();
        }
        return hyhzdx;
    }
}
