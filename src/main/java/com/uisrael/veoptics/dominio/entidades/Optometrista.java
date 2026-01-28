package com.uisrael.veoptics.dominio.entidades;

public final class Optometrista {
	private final int idOptometrista;
	private final String registroProfesional;
	private final String telefono;
	private final char estado;

	private final Usuario usuario;

	public Optometrista(int idOptometrista, String registroProfesional, String telefono, char estado, Usuario usuario) {
		super();
		this.idOptometrista = idOptometrista;
		this.registroProfesional = registroProfesional;
		this.telefono = telefono;
		this.estado = estado;
		this.usuario = usuario;
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

	public Usuario getUsuario() {
		return usuario;
	}

}
