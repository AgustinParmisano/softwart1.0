package info.ttps.actions;

import java.util.Map;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ActionContext;


public class BackendAction extends ActionSupport {

	private static final long serialVersionUID = 1L;
	
	public String execute() {
		
		Map<String, Object> session = ActionContext.getContext().getSession();
		String profile = (String)session.get("perfil");

		return profile;
	}
}
