package com.uisrael.veoptics.presentacion.dto.response;

public class OptometristaResponseDTO {
	private int idOptometrista;
	private String registroProfesional;
	private String telefono;
	private char estado;
	private int idUsuario;

	public int getIdOptometrista() {
		return idOptometrista;
	}

	public void setIdOptometrista(int idOptometrista) {
		this.idOptometrista = idOptometrista;
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

	public char getEstado() {
		return estado;
	}

	public void setEstado(char estado) {
		this.estado = estado;
	}

	public int getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}

}
