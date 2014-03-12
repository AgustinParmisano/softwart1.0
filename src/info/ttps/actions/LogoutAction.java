package info.ttps.actions;

import java.util.Map;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class LogoutAction extends ActionSupport {

	private static final long serialVersionUID = 1L;

	public String execute() {
		
		Map<String, Object> session = ActionContext.getContext().getSession();
		session.remove("perfil");
		session.remove("username");
		
		return SUCCESS;
	}
}
