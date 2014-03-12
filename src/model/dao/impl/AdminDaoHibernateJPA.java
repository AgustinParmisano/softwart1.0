package model.dao.impl;

import javax.persistence.Query;

import model.dao.api.AdminDao;
import model.Admin;


public class AdminDaoHibernateJPA extends GenericDaoHibernateJPA<Admin>
		implements AdminDao {

	public AdminDaoHibernateJPA() {
		super(Admin.class);
	}
	
	public Admin findByUsername(String s){
		Query query = this.getEntityManager().createQuery("select e from "+getPersistentClass().getSimpleName()+" e where e.username = '"+s+"'");
		if(query.getResultList().size() == 0){
			return null;
		}
		return (Admin) query.getResultList().get(0);
	}

}
