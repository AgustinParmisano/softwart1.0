package model.dao.impl;

import model.dao.api.PersonDao;
import info.ttps.dao.util.impl.GenericDaoHibernateJPA;
import info.ttps.model.Person;

import javax.persistence.Query;

public class PersonDaoHibernateJPA extends GenericDaoHibernateJPA<Person>
		implements PersonDao {

	public PersonDaoHibernateJPA() {
		super(Person.class);
	}
	
	public Person findByUsername(String s){
		Query query = this.getEntityManager().createQuery("select e from "+getPersistentClass().getSimpleName()+" e where e.username = '"+s+"'");
		if(query.getResultList().size() == 0){
			return null;
		}
		return (Person) query.getResultList().get(0);
	}

}
