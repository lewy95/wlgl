package cn.xzxy.lewy.action;

import cn.xzxy.lewy.pojo.TransferCoInfo11;
import cn.xzxy.lewy.service.ITransferCoInfoService;
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
public class TransferCoInfoAction extends ActionSupport implements ModelDriven<TransferCoInfo11> {
    @Autowired
    private ITransferCoInfoService transferCoInfoService;

    private TransferCoInfo11 transferCoInfo;

    public String addInput() {
        return SUCCESS;
    }

    public String add() {
        transferCoInfoService.add(transferCoInfo);
        return "redirect";
    }

    public String list() {
        List<TransferCoInfo11> transferCoInfo11s = transferCoInfoService.list();
        ActionContext.getContext().put("transferCoInfo11s",transferCoInfo11s);
        return SUCCESS;
    }

    public TransferCoInfo11 getModel() {
        if (transferCoInfo == null) {
            transferCoInfo = new TransferCoInfo11();
        }
        return transferCoInfo;
    }
}
