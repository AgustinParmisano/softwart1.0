package model.dao.impl;

import model.dao.api.PublicationDao;
import info.ttps.dao.util.impl.GenericDaoHibernateJPA;
import info.ttps.model.Publication;

public class PublicationDaoHibernateJPA extends GenericDaoHibernateJPA<Publication> implements
		PublicationDao {

	public PublicationDaoHibernateJPA(){
		super(Publication.class);
	}
	
	
}
