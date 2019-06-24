package cn.xzxy.lewy.action;

import cn.xzxy.lewy.pojo.HydMain3;
import cn.xzxy.lewy.pojo.TransferInfo10;
import cn.xzxy.lewy.service.IHydService;
import cn.xzxy.lewy.service.ITransferInfoService;
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
public class TransferInfoAction extends ActionSupport implements ModelDriven<TransferInfo10> {
    @Autowired
    ITransferInfoService transferInfoService;

    @Autowired
    IHydService hydService;

    TransferInfo10 transferInfo;

    public String addInput() {
        System.out.println(transferInfo.getId());
        HydMain3 needTransferHyd = hydService.get(transferInfo.getId());
        ActionContext.getContext().put("needTransferHyd",needTransferHyd);
        return SUCCESS;
    }

    public String add() {
        transferInfoService.add(transferInfo);
        return "redirect";
    }

    public String list() {
        List<TransferInfo10> transferInfo10s = transferInfoService.list();
        ActionContext.getContext().put("transferInfo10s",transferInfo10s);
        return SUCCESS;
    }

    public String transferHyd() {
        List<HydMain3> ntHyds = hydService.findByIfTransfer();
        ActionContext.getContext().put("ntHyds",ntHyds);
        return SUCCESS;
    }

    public TransferInfo10 getModel() {
        if (transferInfo== null) {
           transferInfo = new TransferInfo10();
        }
        return transferInfo;
    }
    }

