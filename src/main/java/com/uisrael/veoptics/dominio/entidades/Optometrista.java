package com.uisrael.veoptics.dominio.entidades; 

public final class Optometrista {
	private final int idOptometrista;
	private final String nombre;
	private final String apellido;
	private final String ci;
	private final String registroProfesional;
	private final String telefono;
	private final char estado;
	private final Usuario usuario;

	
	
	
	public Optometrista(int idOptometrista, String nombre, String apellido, String ci, String registroProfesional,
			String telefono, char estado, Usuario usuario) {
		this.idOptometrista = idOptometrista;
		this.nombre = nombre;
		this.apellido = apellido;
		this.ci = ci;
		this.registroProfesional = registroProfesional;
		this.telefono = telefono;
		this.estado = estado;
		this.usuario=usuario;
	}


	public int getIdOptometrista() {
		return idOptometrista;
	}


	public String getNombre() {
		return nombre;
	}


	public String getApellido() {
		return apellido;
	}


	public String getCi() {
		return ci;
	}


	public String getRegistroProfesional() {
		return registroProfesional;
	}


	public String getTelefono() {
		return telefono;
	}


	public char getEstado() {
		return estado;
	}


	public Usuario getUsuario() {
		return usuario;
	}

}
