package cn.xzxy.lewy.action;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

import cn.xzxy.lewy.pojo.ComplainInfo16;
import cn.xzxy.lewy.pojo.HydMain3;
import cn.xzxy.lewy.service.IComplaintService;

@Controller
@Scope("prototype")
public class ComplaintAction extends ActionSupport implements ModelDriven<ComplainInfo16>{

	@Autowired
	private IComplaintService complaintService;
	
	private ComplainInfo16 complaintInfo;
	
	public ComplainInfo16 getModel() {
		if (complaintInfo == null) {
			complaintInfo = new ComplainInfo16();
			complaintInfo.setIfHandle("否");
			complaintInfo.setDealDate("暂无");
			complaintInfo.setDealResult("暂无");
			complaintInfo.setIfCallback("否");
			complaintInfo.setCallBackDate("暂无");
			complaintInfo.setDealPerson("暂无");
        }
        return complaintInfo;
	}

	public String register() {
		return SUCCESS;
	}
	
	public String add() {
        complaintService.add(complaintInfo);
        return "redirect";
    }
	
	public String list() {
		List<ComplainInfo16> complaints = complaintService.list();
		ActionContext.getContext().put("complaints",complaints);
        return SUCCESS;
	}
	
	public String listComplaint() {
		List<ComplainInfo16> complaints = complaintService.list();
		ActionContext.getContext().put("complaints",complaints);
        return SUCCESS;
	}
	
	public String updateComplaint() {
		System.out.println(complaintInfo.getIfHandle());
		complaintService.update(complaintInfo);
		return "redirect";
	}
	
	public String checkDetail(){
        int complaintId = complaintInfo.getId();
        ComplainInfo16 complaint = complaintService.get(complaintId);
        ActionContext.getContext().getSession().put("complaint",complaint);
        return SUCCESS;
    }
}
