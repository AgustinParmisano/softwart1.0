package model.dao.impl;

import javax.persistence.Query;

import model.dao.api.ModeratorDao;
import info.ttps.dao.util.impl.GenericDaoHibernateJPA;
import info.ttps.model.Moderator;


public class ModeratorDaoHibernateJPA extends GenericDaoHibernateJPA<Moderator> implements
		ModeratorDao {

	public ModeratorDaoHibernateJPA(){
		super(Moderator.class);
	}
	
	public Moderator findByUsername(String s){
		Query query = this.getEntityManager().createQuery("select e from "+getPersistentClass().getSimpleName()+" e where e.username = '"+s+"'");
		if(query.getResultList().size() == 0){
			return null;
		}
		return (Moderator) query.getResultList().get(0);
	}
}
