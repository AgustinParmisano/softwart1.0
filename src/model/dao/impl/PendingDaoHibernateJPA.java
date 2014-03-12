package model.dao.impl;

import model.dao.api.PendingDao;
import info.ttps.dao.util.impl.GenericDaoHibernateJPA;
import info.ttps.model.Pending;

public class PendingDaoHibernateJPA extends GenericDaoHibernateJPA<Pending> implements
		PendingDao {

	public PendingDaoHibernateJPA(){
		super(Pending.class);
	}
	
	
}
