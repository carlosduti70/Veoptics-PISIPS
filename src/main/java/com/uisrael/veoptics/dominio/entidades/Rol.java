package com.uisrael.veoptics.dominio.entidades;

public final class Rol {

	private final int idRol;
	private final String nombreRol;

	public Rol(int idRol, String nombreRol) {
		this.idRol = idRol;
		this.nombreRol = nombreRol;
	}

	public int getIdRol() {
		return idRol;
	}

	public String getNombreRol() {
		return nombreRol;
	}

}
