package com.uisrael.veoptics.presentacion.dto.response;

import java.time.LocalDate;

public class PacienteResponseDTO {

	private int idPaciente;
	private String apellido;
	private String ci;
	private LocalDate fecNacimiento;
	private String direccion;
	private String telefono;
	private String correo;
	private String motivoConsulta;
	private LocalDate fecRegistro;
	private LocalDate fecPrimero;
	private String nombre;
	private char estado;

	public int getIdPaciente() {
		return idPaciente;
	}

	public void setIdPaciente(int idPaciente) {
		this.idPaciente = idPaciente;
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

	public LocalDate getFecNacimiento() {
		return fecNacimiento;
	}

	public void setFecNacimiento(LocalDate fecNacimiento) {
		this.fecNacimiento = fecNacimiento;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getMotivoConsulta() {
		return motivoConsulta;
	}

	public void setMotivoConsulta(String motivoConsulta) {
		this.motivoConsulta = motivoConsulta;
	}

	public LocalDate getFecRegistro() {
		return fecRegistro;
	}

	public void setFecRegistro(LocalDate fecRegistro) {
		this.fecRegistro = fecRegistro;
	}

	public LocalDate getFecPrimero() {
		return fecPrimero;
	}

	public void setFecPrimero(LocalDate fecPrimero) {
		this.fecPrimero = fecPrimero;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public char getEstado() {
		return estado;
	}

	public void setEstado(char estado) {
		this.estado = estado;
	}

}
