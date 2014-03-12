package model.dao.api;


import info.ttps.model.*;

public interface GuestDao extends GenericDAO<Guest> {

	public Guest findByUsername(String s);
}
