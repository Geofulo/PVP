package com.agmcompany.pvp.dao;

public class Carrera {
	private String nombre;
	private String descripcion;
	private String perfil_ingreso;
	private String perfil_egreso;
	private int duracion;
	//private imagen
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public String getPerfil_ingreso() {
		return perfil_ingreso;
	}
	public void setPerfil_ingreso(String perfil_ingreso) {
		this.perfil_ingreso = perfil_ingreso;
	}
	public String getPerfil_egreso() {
		return perfil_egreso;
	}
	public void setPerfil_egreso(String perfil_egreso) {
		this.perfil_egreso = perfil_egreso;
	}
	public int getDuracion() {
		return duracion;
	}
	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}
	
}
