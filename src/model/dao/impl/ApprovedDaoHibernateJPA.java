package model.dao.impl;

import model.dao.api.ApprovedDao;
import info.ttps.dao.util.impl.GenericDaoHibernateJPA;
import info.ttps.model.Approved;

public class ApprovedDaoHibernateJPA extends GenericDaoHibernateJPA<Approved> implements
		ApprovedDao {

	public ApprovedDaoHibernateJPA(){
		super(Approved.class);
	}
	
	
}
