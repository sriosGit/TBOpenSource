package com.upc.service;

import java.sql.ResultSet;

//Transformar Datos(ResultSet)--->Objetos (T)
public interface IRowmapper<T> {
	
	T mapRow(ResultSet rs) throws Exception;

}
