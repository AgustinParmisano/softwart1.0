package model.dao.impl;

import javax.persistence.Query;

import model.dao.api.StudentDao;
import info.ttps.dao.util.impl.GenericDaoHibernateJPA;
import info.ttps.model.Student;

public class StudentDaoHibernateJPA extends GenericDaoHibernateJPA<Student> implements
		StudentDao {

	public StudentDaoHibernateJPA(){
		super(Student.class);
	}
	
	public Student findByUsername(String s){
		Query query = this.getEntityManager().createQuery("select e from "+getPersistentClass().getSimpleName()+" e where e.username = '"+s+"'");
		if(query.getResultList().size() == 0){
			return null;
		}
		return (Student) query.getResultList().get(0);
	}
}
