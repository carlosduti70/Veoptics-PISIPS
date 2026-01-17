package com.uisrael.veoptics.presentacion.dto.response;



public class RolResponseDTO {

	private int id_rol;
	private  String nombreRol;
	private  char estado;
	
	
	public int getIdRol() {
		return id_rol;
	}
	public void setIdRol(int idRol) {
		this.id_rol = idRol;
	}
	public String getNombreRol() {
		return nombreRol;
	}
	public void setNombreRol(String nombreRol) {
		this.nombreRol = nombreRol;
	}
	public char getEstado() {
		return estado;
	}
	public void setEstado(char estado) {
		this.estado = estado;
	}
	
	
}
