package com.upc.dto;

public class Categoria {
	
	int categoriaID;
	String nombre_categoria;

	public Categoria() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Categoria(int categoriaID, String nombre_categoria) {
		super();
		this.categoriaID = categoriaID;
		this.nombre_categoria = nombre_categoria;
	}

	public int getCategoriaID() {
		return categoriaID;
	}

	public void setCategoriaID(int categoriaID) {
		this.categoriaID = categoriaID;
	}

	public String getNombre_categoria() {
		return nombre_categoria;
	}

	public void setNombre_categoria(String nombre_categoria) {
		this.nombre_categoria = nombre_categoria;
	}

}
