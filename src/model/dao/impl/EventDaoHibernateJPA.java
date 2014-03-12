package model.dao.impl;

import model.dao.api.EventDao;
import info.ttps.dao.util.impl.GenericDaoHibernateJPA;
import info.ttps.model.Event;

public class EventDaoHibernateJPA extends GenericDaoHibernateJPA<Event> implements
		EventDao {

	public EventDaoHibernateJPA(){
		super(Event.class);
	}
	
	
}
