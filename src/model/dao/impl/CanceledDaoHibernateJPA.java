package model.dao.impl;

import model.dao.api.CanceledDao;
import info.ttps.dao.util.impl.GenericDaoHibernateJPA;
import info.ttps.model.Canceled;

public class CanceledDaoHibernateJPA extends GenericDaoHibernateJPA<Canceled> implements
		CanceledDao {

	public CanceledDaoHibernateJPA(){
		super(Canceled.class);
	}
	
	
}
