package com.uisrael.veoptics.dominio.entidades;

import java.util.List;

public final class Usuario {
	
	private final int idUsuario;
	private final String nombre;
	private final String apellido;
	private final String cedula;
	private final String correo;
	private final String clave;
	private final Boolean estado;
	private final Rol rol;
	private final List<Optometrista> optometristas;
	
	public Usuario(int idUsuario, String nombre, String apellido, String cedula, String correo, String clave,
			Boolean estado, Rol rol, List<Optometrista> optometristas) {
		
		this.idUsuario = idUsuario;
		this.nombre = nombre;
		this.apellido = apellido;
		this.cedula = cedula;
		this.correo = correo;
		this.clave = clave;
		this.estado = estado;
		this.rol = rol;
		this.optometristas=optometristas;
	}

	public int getIdUsuario() {
		return idUsuario;
	}

	public String getNombre() {
		return nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public String getCedula() {
		return cedula;
	}

	public String getCorreo() {
		return correo;
	}

	public String getClave() {
		return clave;
	}

	public Boolean getEstado() {
		return estado;
	}

	public Rol getRol() {
		return rol;
	}

	public List<Optometrista> getOptometristas() {
		return optometristas;
	}

	@Override
	public String toString() {
		return "Usuario [idUsuario=" + idUsuario + ", nombre=" + nombre + ", apellido=" + apellido + ", cedula="
				+ cedula + ", correo=" + correo + ", clave=" + clave + ", estado=" + estado + ", rol=" + rol + "]";
	}

	

}
