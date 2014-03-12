package model.dao.api;


import model.*;

public interface AdminDao extends GenericDAO<Admin> {
	
	public Admin findByUsername(String s);
}
