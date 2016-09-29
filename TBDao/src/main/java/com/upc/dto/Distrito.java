package com.upc.dto;

public class Distrito {
	int distritoID;
	String nombre_distrito;

	public Distrito() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Distrito(int distritoID, String nombre_distrito) {
		super();
		this.distritoID = distritoID;
		this.nombre_distrito = nombre_distrito;
	}

	public int getDistritoID() {
		return distritoID;
	}

	public void setDistritoID(int distritoID) {
		this.distritoID = distritoID;
	}

	public String getNombre_distrito() {
		return nombre_distrito;
	}

	public void setNombre_distrito(String nombre_distrito) {
		this.nombre_distrito = nombre_distrito;
	}

}
