package com.uisrael.veoptics.dominio.entidades;

import java.time.LocalDate;

public final class Paciente {

	private final int idPaciente;
	private final String nombre;
	private final String apellido;
	private final String ci;
	private final LocalDate fecNacimiento;
	private final String direccion;
	private final String telefono;
	private final String correo;
	private final LocalDate fecRegistro;
	private final char estado;

	public Paciente(int idPaciente, String nombre, String apellido, String ci, LocalDate fecNacimiento,
			String direccion, String telefono, String correo, LocalDate fecRegistro, char estado) {
		super();
		this.idPaciente = idPaciente;
		this.nombre = nombre;
		this.apellido = apellido;
		this.ci = ci;
		this.fecNacimiento = fecNacimiento;
		this.direccion = direccion;
		this.telefono = telefono;
		this.correo = correo;
		this.fecRegistro = fecRegistro;
		this.estado = estado;
	}

	public int getIdPaciente() {
		return idPaciente;
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

	public LocalDate getFecNacimiento() {
		return fecNacimiento;
	}

	public String getDireccion() {
		return direccion;
	}

	public String getTelefono() {
		return telefono;
	}

	public String getCorreo() {
		return correo;
	}

	public LocalDate getFecRegistro() {
		return fecRegistro;
	}

	public char getEstado() {
		return estado;
	}

}
