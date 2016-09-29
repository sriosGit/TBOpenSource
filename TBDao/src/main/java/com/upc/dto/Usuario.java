package com.upc.dto;


import java.util.ArrayList;
import java.util.List;

public class Usuario {

	int id;
	String nombres;
	String apellidos;
	String DNI;
	String sexo;
	int tipo_usuario;
	String urlImg;
	String direccion;
	String email;
	String password;
	int distritoID;
	List<Integer> listInteres = new ArrayList<Integer>();
	
	List<Evento> listEventosPart = new ArrayList<Evento>();

	public Usuario() {
		super();
		// TODO Auto-generated constructor stub
	}

	

	public Usuario(int id, String nombres, String apellidos, String DNI, String sexo, int tipo_usuario) {
		super();
		this.id = id;
		this.nombres = nombres;
		this.apellidos = apellidos;
		this.DNI = DNI;
		this.sexo = sexo;
		this.tipo_usuario = tipo_usuario;
	}


	public int getTipo_usuario() {
		return tipo_usuario;
	}



	public void setTipo_usuario(int tipo_usuario) {
		this.tipo_usuario = tipo_usuario;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombres() {
		return nombres;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getDNI() {
		return DNI;
	}

	public void setDNI(String DNI) {
		this.DNI = DNI;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}



	public String getUrlImg() {
		return urlImg;
	}



	public void setUrlImg(String urlImg) {
		this.urlImg = urlImg;
	}



	public String getDireccion() {
		return direccion;
	}



	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	public String getPassword() {
		return password;
	}



	public void setPassword(String password) {
		this.password = password;
	}



	public int getDistritoID() {
		return distritoID;
	}



	public void setDistritoID(int distritoID) {
		this.distritoID = distritoID;
	}

	



		
}
