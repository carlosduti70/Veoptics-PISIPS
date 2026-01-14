package com.uisrael.veoptics.presentacion.dto.response;

public class OptometristaResponseDTO {
	private int idOptometrista;
	private String nombre;
	private String apellido;
	private String ci;
	private String registroProfesional;
	private String telefono;
	private Boolean estado;
	
	
	public int getIdOptometrista() {
		return idOptometrista;
	}
	public void setIdOptometrista(int idOptometrista) {
		this.idOptometrista = idOptometrista;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getCi() {
		return ci;
	}
	public void setCi(String ci) {
		this.ci = ci;
	}
	public String getRegistroProfesional() {
		return registroProfesional;
	}
	public void setRegistroProfesional(String registroProfesional) {
		this.registroProfesional = registroProfesional;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public Boolean getEstado() {
		return estado;
	}
	public void setEstado(Boolean estado) {
		this.estado = estado;
	}
	
	
	

	
	

}
