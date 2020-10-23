package ar.edu.ArqSoft.rentService.Common.dao;

import java.util.List;
import java.io.Serializable;

public interface genericDao <E, ID extends Serializable> {

	public void insert(E entity);
	
	public void saveOrUpdate(E entity);

	public void update(E entity);

	public void remove(E entity);

	public E load(ID key);

	public List<E> getAll();

}
