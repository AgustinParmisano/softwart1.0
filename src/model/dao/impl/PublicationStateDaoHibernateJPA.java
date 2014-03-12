package model.dao.impl;

import model.dao.api.PublicationStateDao;
import info.ttps.dao.util.impl.GenericDaoHibernateJPA;
import info.ttps.model.PublicationState;

public class PublicationStateDaoHibernateJPA extends GenericDaoHibernateJPA<PublicationState> implements
		PublicationStateDao {

	public PublicationStateDaoHibernateJPA(){
		super(PublicationState.class);
	}
	
	
}
