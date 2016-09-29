package com.upc.factory;

import com.upc.service.ICategoriaService;
import com.upc.service.IEventoService;
import com.upc.service.IUsuarioService;
import com.upc.service.impl.CategoriaServiceImpl;
import com.upc.service.impl.EventoServiceImpl;
import com.upc.service.impl.UsuarioServiceImpl;

public class Factory {

	//Implementacion de singleton
	private static Factory fac;
	
	private Factory(){
		
	}
	
	public static Factory getInstance(){
		if (fac == null) 
			fac = new Factory();
		return fac;
	}
	//fin de implementacion singleton
	
	//Se definen los servicios
	public IEventoService getEventoService(){
		return new EventoServiceImpl();
		
	}
	public IUsuarioService getUsuarioService(){
		return new UsuarioServiceImpl();
		
	}
	
	public ICategoriaService getCategoriaService(){
		return new CategoriaServiceImpl();
	}
		
}
