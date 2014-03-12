package info.ttps.actions;


import java.util.Map;

import model.dao.api.GuestDao;

import info.ttps.model.Guest;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class SignUpAction  extends ActionSupport implements ModelDriven<Guest>{
	/**
	 * 
	 */
	private static final long serialVersionUID = 3587036323887572447L;
	private Guest guest = new Guest();
	private GuestDao guestdao;
	
	public GuestDao getGuestdao() {
		return guestdao;
	}

	public void setGuestdao(GuestDao guestdao) {
		this.guestdao = guestdao;
	}

	@Override
	public Guest getModel() {
		return guest;
	}

	public String execute() {
		if (getModel().getUsername() == null) {
			return INPUT;
		} else {
			return validateUserRegistered();
		}
	}

	public String validateUserRegistered() {
		if (getModel().getName().equals("") 
				|| getModel().getSurname().equals("")
				|| getModel().getUsername().equals("")
				|| getModel().getPass().equals("")
				|| getModel().getEmail().equals("")
				|| getModel().getBirth().equals("")
				|| getModel().getGender().equals("")
				|| getModel().getNationality().equals("")
				|| getModel().getJob().equals("")
			) {
			addFieldError("name",
					"Ningun campo debe estar en blanco");
			return INPUT;
		}
		if (getGuestdao().findByUsername(getModel().getUsername()) != null) {
			addFieldError("username",
					"El nombre de usuario ingresado ya existe");
			return INPUT;
		}
		getGuestdao().persist(getModel());
		Map<String, Object> session = ActionContext.getContext().getSession();
		session.put("perfil", "guest");
		return SUCCESS;
	}

}
