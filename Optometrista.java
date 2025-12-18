package com.uisrael.veoptics.dominio.entidades;

import java.time.LocalDate;

public final class Optometrista {
	private final int idOptometrista;
	private final String nombre;
	private final String apellido;
	private final String ci;
	private final String registroProfesional;
	private final String telefono;
	private final char estado;

	
	public Optometrista(int idOptometrista, String nombre, String apellido, String ci, String registroProfesional,
			String telefono, char estado) {
		this.idOptometrista = idOptometrista;
		this.nombre = nombre;
		this.apellido = apellido;
		this.ci = ci;
		this.registroProfesional = nombre;
		this.telefono = telefono;
		this.estado = estado;
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

}
