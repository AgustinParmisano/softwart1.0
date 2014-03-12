package model.dao.api;

import info.ttps.model.Person;

public interface PersonDao extends GenericDAO<Person> {

	public Person findByUsername(String s);
}
