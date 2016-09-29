package com.upc.service;

import java.util.List;

//Metodos del CRUD
public interface ICrudservice<T> {
	void create(T o) throws Exception;

	void update(T o) throws Exception;

	void delete(int codigo) throws Exception;

	T get(int codigo) throws Exception;

	List<T> getAll() throws Exception;

}
