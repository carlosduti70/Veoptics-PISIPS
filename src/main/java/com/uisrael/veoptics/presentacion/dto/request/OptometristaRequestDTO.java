package com.uisrael.veoptics.presentacion.dto.request;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class OptometristaRequestDTO {
//	private int idOptometrista;

	@NotBlank
	private String nombre;
	@NotBlank
	private String apellido;
	@NotBlank
	private String ci;
	@NotBlank
	private String registroProfesional;
	@NotBlank
	private String telefono;
	@NotBlank
	private String estado;

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
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}


}
