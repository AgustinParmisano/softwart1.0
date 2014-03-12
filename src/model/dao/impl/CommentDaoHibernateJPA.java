package model.dao.impl;

import model.dao.api.CommentDao;
import info.ttps.dao.util.impl.GenericDaoHibernateJPA;
import info.ttps.model.Comment;

public class CommentDaoHibernateJPA extends GenericDaoHibernateJPA<Comment> implements
		CommentDao {

	public CommentDaoHibernateJPA(){
		super(Comment.class);
	}
	
	
}
