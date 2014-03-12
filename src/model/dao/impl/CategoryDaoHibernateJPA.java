package model.dao.impl;

import model.dao.api.CategoryDao;
import info.ttps.dao.util.impl.GenericDaoHibernateJPA;
import info.ttps.model.Category;

public class CategoryDaoHibernateJPA extends GenericDaoHibernateJPA<Category> implements
		CategoryDao {

	public CategoryDaoHibernateJPA(){
		super(Category.class);
	}
	
	
}
