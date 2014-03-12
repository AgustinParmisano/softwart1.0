package info.ttps.actions;

import model.dao.api.GuestDao;
import model.dao.api.StudentDao;
import model.dao.api.AdminDao;
import model.dao.api.ModeratorDao;
import java.util.Map;

import info.ttps.model.*;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;


public class LoginAction extends ActionSupport implements ModelDriven<Person> {

	private static final long serialVersionUID = 1L;
	private Person person = new Person();
	// private PersonDao persondao;
	private StudentDao studentdao;
	private GuestDao guestdao;
	private AdminDao admindao;
	private ModeratorDao moderatordao;
	

	@Override
	public Person getModel() {
		return person;
	}

	public ModeratorDao getModeratordao() {
		return moderatordao;
	}

	public void setModeratordao(ModeratorDao moderatordao) {
		this.moderatordao = moderatordao;
	}

	public StudentDao getStudentdao() {
		return studentdao;
	}

	public void setStudentdao(StudentDao studentdao) {
		this.studentdao = studentdao;
	}

	public GuestDao getGuestdao() {
		return guestdao;
	}

	public void setGuestdao(GuestDao guestdao) {
		this.guestdao = guestdao;
	}

	public AdminDao getAdmindao() {
		return admindao;
	}

	public void setAdmindao(AdminDao admindao) {
		this.admindao = admindao;
	}

	public String execute() {
		if (getModel().getUsername() == null) {
			return INPUT;
		} else {
			if (getModel().getUsername().equals("")
					|| getModel().getPass().equals("")) {
				addFieldError("name", "Ningun campo debe estar en blanco");
				return INPUT;
			}

			Map<String, Object> session = ActionContext.getContext().getSession();
			String personPass = "notDefined";
			Student dataBaseStudent = getStudentdao().findByUsername(
					getModel().getUsername());
			if (dataBaseStudent != null) {
				session.put("perfil", "student");                       //PONGO el ROL en la sesion.
				session.put("username", dataBaseStudent.getUsername());
				personPass = dataBaseStudent.getPass();
			} else {
				Admin dataBaseAdmin = getAdmindao().findByUsername(
						getModel().getUsername());
				if (dataBaseAdmin != null) {
					session.put("perfil", "admin");                       //PONGO el ROL en la sesion.
					session.put("username", dataBaseAdmin.getUsername());
					personPass = dataBaseAdmin.getPass();
				} else {
					Moderator dataBaseModerator = getModeratordao()
							.findByUsername(getModel().getUsername());
					if (dataBaseModerator != null) {
						session.put("perfil", "moderator");                       //PONGO el ROL en la sesion.
						session.put("username", dataBaseModerator.getUsername());
						personPass = dataBaseModerator.getPass();
					} else {
						Guest dataBaseGuest = getGuestdao().findByUsername(
								getModel().getUsername());
						if (dataBaseGuest != null) {
							session.put("perfil", "guest");                       //PONGO el ROL en la sesion.
							session.put("username", dataBaseGuest.getUsername());
							personPass = dataBaseGuest.getPass();
						}
					}

				}
			}
			if (getModel().getPass().equals(personPass)) {
				return "backEnd";
			} else {
				addFieldError("username", "Datos incorrectos.");
				return INPUT;
			}
		}
	}
}
