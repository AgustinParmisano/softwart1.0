package model.dao.api;


import info.ttps.model.*;

public interface StudentDao extends GenericDAO<Student> {

	public Student findByUsername(String s);
}
