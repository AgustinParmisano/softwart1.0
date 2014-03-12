package info.ttps.actions;

import java.util.ArrayList;
import java.util.Map;

import org.apache.struts2.ServletActionContext;

import model.dao.api.ModeratorDao;
import info.ttps.model.Moderator;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class ABMModeratorAction extends ActionSupport implements
		ModelDriven<Moderator> {

	private static final long serialVersionUID = 1L;
	private Moderator moderator=new Moderator();
	private ModeratorDao moderatordao;
	private Long mod;
	private ArrayList<Moderator> list=null;


	@Override
	public Moderator getModel() {
		return this.moderator;
	}
	public void setModel(Moderator mod) {
		this.moderator = mod;
	}
	public Long getMod() {
		return mod;
	}

	public void setMod(Long mod) {
		this.mod = mod;
	}
	
	public ArrayList<Moderator> getList() {
		return list;
	}

	public void setList(ArrayList<Moderator> list) {
		this.list = list;
	}
	
	public ModeratorDao getModeratordao() {
		return moderatordao;
	}
	public void setModeratordao(ModeratorDao moderatordao) {
		this.moderatordao = moderatordao;
	}
	
	public String execute(){
		return listModerators();
	}
	public String listModerators(){
		if(verify()){
			setList((ArrayList<Moderator>) moderatordao.findAll());
			return SUCCESS;
		}else{
			return ERROR;
		}
	}

	public String newModerator(){
		if(verify()){
			if((getModel().getName()==null)){
				return INPUT;
			}else{
				if (getModel().getName().equals("") 
						|| getModel().getSurname().equals("")
						|| getModel().getUsername().equals("")
						|| getModel().getPass().equals("")
					) {
					addFieldError("name",
							"Ningun campo debe estar en blanco");
					return INPUT;
				}
				if (moderatordao.findByUsername(getModel().getUsername()) != null) {
					addFieldError("username",
							"El nombre de usuario ingresado ya existe");
					return INPUT;
				}
				
				moderatordao.persist(getModel());
				return SUCCESS;
			}
		}else{
			return ERROR;
		}
	}
	
	public String modifyModerator(){
		if(verify()){
			if((getModel().getName()==null)){
				setModel(moderatordao.find(getMod()));
				return INPUT;
			}else{
				if (getModel().getName().equals("") 
						|| getModel().getSurname().equals("")
						|| getModel().getUsername().equals("")
					) {
					addFieldError("name",
							"Ningun campo debe estar en blanco");
					return INPUT;
				}
				Moderator moderatorToUpdate=moderatordao.find(getModel().getId());
				
				if ((moderatordao.findByUsername(getModel().getUsername()) != null)&&(!moderatorToUpdate.getUsername().equals(getModel().getUsername()) )) {
					addFieldError("username",
							"El nombre de usuario ingresado ya existe");
					return INPUT;
				}else{
					if(getModel().getPass().equals("")){
						getModel().setPass(moderatorToUpdate.getPass());
					}
					moderatordao.update(getModel());
					setModel(new Moderator());
					return SUCCESS;
				}
			}
		}else{
				return ERROR;
			}
	}
	public String deleteModerators(){
		moderatordao.remove(getMod());
		return SUCCESS;
	}
	
	public Boolean verify(){
		Map<String, Object> session = ActionContext.getContext().getSession();
		String profile = ((String)session.get("perfil"));
		if(profile != null){
			if(profile.equals("admin")){
				return true;
			}
		}
		return false;
		}
}
