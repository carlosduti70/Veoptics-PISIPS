package com.uisrael.veoptics.dominio.entidades;

public final class Usuario {
	
	private final int idUsuario;
	private final String nombre;
	private final String apellido;
	private final String cedula;
	private final String correo;
	private final String clave;
	private final Boolean estado;
	private final int id_rol;
	
	public Usuario(int idUsuario, String nombre, String apellido, String cedula, String correo, String clave,
			Boolean estado, int id_rol) {
		
		this.idUsuario = idUsuario;
		this.nombre = nombre;
		this.apellido = apellido;
		this.cedula = cedula;
		this.correo = correo;
		this.clave = clave;
		this.estado = estado;
		this.id_rol = id_rol;
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

	public int getId_rol() {
		return id_rol;
	}

	@Override
	public String toString() {
		return "Usuario [idUsuario=" + idUsuario + ", nombre=" + nombre + ", apellido=" + apellido + ", cedula="
				+ cedula + ", correo=" + correo + ", clave=" + clave + ", estado=" + estado + ", rol=" + id_rol + "]";
	}

	

	

}
