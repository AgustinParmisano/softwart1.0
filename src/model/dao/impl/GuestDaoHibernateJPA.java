package model.dao.impl;

import javax.persistence.Query;

import model.dao.api.GuestDao;
import info.ttps.dao.util.impl.GenericDaoHibernateJPA;
import info.ttps.model.Guest;


public class GuestDaoHibernateJPA extends GenericDaoHibernateJPA<Guest> implements
		GuestDao {

	public GuestDaoHibernateJPA(){
		super(Guest.class);
	}

	public Guest findByUsername(String s){
		Query query = this.getEntityManager().createQuery("select e from "+getPersistentClass().getSimpleName()+" e where e.username = '"+s+"'");
		if(query.getResultList().size() == 0){
			return null;
		}
		return (Guest) query.getResultList().get(0);
	}
	
}
