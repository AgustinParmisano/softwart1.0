package model.dao.impl;

import model.dao.api.TagDao;
import info.ttps.dao.util.impl.GenericDaoHibernateJPA;
import info.ttps.model.Tag;

public class TagDaoHibernateJPA extends GenericDaoHibernateJPA<Tag> implements
		TagDao {

	public TagDaoHibernateJPA(){
		super(Tag.class);
	}
	
	
}
