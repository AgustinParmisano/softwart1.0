package model.dao.api;

import java.io.Serializable;
import java.util.List;

public interface GenericDAO <T>{
	public T persist(T entity);
	public T update(T entity);
	public void remove(T entity);
	public T remove(Serializable id);

	public Boolean exists(Serializable id);
	public T find(Serializable id);
	public List<T> findAll();
	public List<T> findAll(String columnOrder);
}
