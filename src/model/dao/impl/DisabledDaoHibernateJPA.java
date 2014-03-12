package model.dao.impl;

import model.dao.api.DisabledDao;
import info.ttps.dao.util.impl.GenericDaoHibernateJPA;
import info.ttps.model.Disabled;

public class DisabledDaoHibernateJPA extends GenericDaoHibernateJPA<Disabled> implements
		DisabledDao {

	public DisabledDaoHibernateJPA(){
		super(Disabled.class);
	}
	
	
}
