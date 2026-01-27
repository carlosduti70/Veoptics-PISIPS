package com.uisrael.veoptics.dominio.entidades; 

public final class Optometrista {
	private final int idOptometrista;

	private final String registroProfesional;
	private final String telefono;
	private final char estado;

	
	
	
	public Optometrista(int idOptometrista, String registroProfesional,
			String telefono, char estado) {
		this.idOptometrista = idOptometrista;
		this.registroProfesional = registroProfesional;
		this.telefono = telefono;
		this.estado = estado;
	}


	public int getIdOptometrista() {
		return idOptometrista;
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


}
