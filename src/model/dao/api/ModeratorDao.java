package model.dao.api;


import info.ttps.model.*;

public interface ModeratorDao extends GenericDAO<Moderator> {

	public Moderator findByUsername(String s);
}
