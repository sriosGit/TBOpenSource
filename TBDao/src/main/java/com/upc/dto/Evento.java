package com.upc.dto;

import java.awt.Image;
import java.util.ArrayList;
import java.util.List;

public class Evento {
	
	int id;
	String nombre_evento;
	String fechaInicio;
	String fechaFin;
	String hora;
	String direccion;
	float coorX, coorY;
	String urlImg;
	float precio;
	List<Integer> listIDInteres = new ArrayList<Integer>();
	
	public Evento() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Evento(int id, String nombre_evento, String fechaInicio, String fechaFin, String hora, String direccion,
			float coorX, float coorY, Image imgEvento, String urlImg, float precio) {
		super();
		this.id = id;
		this.nombre_evento = nombre_evento;
		this.fechaInicio = fechaInicio;
		this.fechaFin = fechaFin;
		this.hora = hora;
		this.direccion = direccion;
		this.coorX = coorX;
		this.coorY = coorY;
		this.urlImg = urlImg;
		this.precio = precio;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre_evento() {
		return nombre_evento;
	}

	public void setNombre_evento(String nombre_evento) {
		this.nombre_evento = nombre_evento;
	}

	public String getFechaInicio() {
		return fechaInicio;
	}

	public void setFechaInicio(String fechaInicio) {
		this.fechaInicio = fechaInicio;
	}

	public String getFechaFin() {
		return fechaFin;
	}

	public void setFechaFin(String fechaFin) {
		this.fechaFin = fechaFin;
	}

	public String getHora() {
		return hora;
	}

	public void setHora(String hora) {
		this.hora = hora;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public float getCoorX() {
		return coorX;
	}

	public void setCoorX(float coorX) {
		this.coorX = coorX;
	}

	public float getCoorY() {
		return coorY;
	}

	public void setCoorY(float coorY) {
		this.coorY = coorY;
	}

	public String getUrlImg() {
		return urlImg;
	}

	public void setUrlImg(String urlImg) {
		this.urlImg = urlImg;
	}

	public float getPrecio() {
		return precio;
	}

	public void setPrecio(float precio) {
		this.precio = precio;
	}

			
}
