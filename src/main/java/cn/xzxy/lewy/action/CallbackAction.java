package cn.xzxy.lewy.action;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

import cn.xzxy.lewy.pojo.CallBackInfo18;
import cn.xzxy.lewy.pojo.HydHuizhiMain6;
import cn.xzxy.lewy.service.ICallbackService;
import cn.xzxy.lewy.service.IHyhzdMainService;

@Controller
@Scope("prototype")
public class CallbackAction extends ActionSupport implements ModelDriven<CallBackInfo18>{

	@Autowired
	private ICallbackService callbackService;
	
	@Autowired
	private IHyhzdMainService hydService;
	
	private CallBackInfo18 callbackInfo;
	
	public CallBackInfo18 getModel() {
		if (callbackInfo == null) {
			callbackInfo = new CallBackInfo18();
        }
        return callbackInfo;
	}

	public String listHyd1() {
		List<HydHuizhiMain6> hyds = hydService.list();
		ActionContext.getContext().put("hyds",hyds);
		return SUCCESS;
	}
	
	public String listHyd2() {
		List<HydHuizhiMain6> hyds = hydService.list();
		ActionContext.getContext().put("hyds",hyds);
		return SUCCESS;
	}
	
	public String listHyd3() {
		List<HydHuizhiMain6> hyds = hydService.list();
		ActionContext.getContext().put("hyds",hyds);
		return SUCCESS;
	}
	
	public String listHyd4() {
		List<HydHuizhiMain6> hyds = hydService.list();
		ActionContext.getContext().put("hyds",hyds);
		return SUCCESS;
	}
	
	public String listHyd5() {
		List<HydHuizhiMain6> hyds = hydService.list();
		ActionContext.getContext().put("hyds",hyds);
		return SUCCESS;
	}
	
	public String listHyd6() {
		List<HydHuizhiMain6> hyds = hydService.list();
		ActionContext.getContext().put("hyds",hyds);
		return SUCCESS;
	}
	
	public String pickUpCallback() {
		int hydId = callbackInfo.getId();
		HydHuizhiMain6 hyd = hydService.get(hydId);
		ActionContext.getContext().put("hyd",hyd);
		callbackInfo = new CallBackInfo18();
		return SUCCESS;
	}
	
	public String arriveCallback() {
		int hydId = callbackInfo.getId();
		HydHuizhiMain6 hyd = hydService.get(hydId);
		ActionContext.getContext().put("hyd",hyd);
		callbackInfo = new CallBackInfo18();
		return SUCCESS;
	}
	
	public String pickedCallback() {
		int hydId = callbackInfo.getId();
		HydHuizhiMain6 hyd = hydService.get(hydId);
		ActionContext.getContext().put("hyd",hyd);
		callbackInfo = new CallBackInfo18();
		return SUCCESS;
	}
	
	public String agencyCallback() {
		int hydId = callbackInfo.getId();
		HydHuizhiMain6 hyd = hydService.get(hydId);
		ActionContext.getContext().put("hyd",hyd);
		callbackInfo = new CallBackInfo18();
		return SUCCESS;
	}
	
	public String deliveryCallback() {
		int hydId = callbackInfo.getId();
		HydHuizhiMain6 hyd = hydService.get(hydId);
		ActionContext.getContext().put("hyd",hyd);
		callbackInfo = new CallBackInfo18();
		return SUCCESS;
	}
	
	public String consigneeCallback() {
		int hydId = callbackInfo.getId();
		HydHuizhiMain6 hyd = hydService.get(hydId);
		ActionContext.getContext().put("hyd",hyd);
		callbackInfo = new CallBackInfo18();
		return SUCCESS;
	}
	
	public String addPickUp() {
		callbackService.add(callbackInfo);
		return "redirect";
	}
	
	public String list() {
		List<CallBackInfo18> callbacks = callbackService.list();
		ActionContext.getContext().put("callbacks",callbacks);
        return SUCCESS;
	}
}
