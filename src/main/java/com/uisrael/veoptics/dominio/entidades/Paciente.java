package com.uisrael.veoptics.dominio.entidades;

import java.time.LocalDate;

public final class Paciente {
	
	private final int idPaciente;
	private final String apellido;
	private final String ci;
	private final LocalDate  fecNacimiento;
	private final String direccion;
	private final String telefono;
	private final String correo;
	private final String motivoConsulta;
	private final LocalDate fecRegistro;
	private final LocalDate fecPrimero;
	private final String nombre;
	private final char estado;
	
	
	
	public Paciente(int idPaciente, String apellido, String ci, LocalDate fecNacimiento, String direccion,
			String telefono, String correo, String motivoConsulta, LocalDate fecRegistro, LocalDate fecPrimero,
			String nombre, char estado) {
		this.idPaciente = idPaciente;
		this.apellido = apellido;
		this.ci = ci;
		this.fecNacimiento = fecNacimiento;
		this.direccion = direccion;
		this.telefono = telefono;
		this.correo = correo;
		this.motivoConsulta = motivoConsulta;
		this.fecRegistro = fecRegistro;
		this.fecPrimero = fecPrimero;
		this.nombre = nombre;
		this.estado = estado;
	}
	
	
	public int getIdPaciente() {
		return idPaciente;
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
	public String getMotivoConsulta() {
		return motivoConsulta;
	}
	public LocalDate getFecRegistro() {
		return fecRegistro;
	}
	public LocalDate getFecPrimero() {
		return fecPrimero;
	}
	public String getNombre() {
		return nombre;
	}
	public char getEstado() {
		return estado;
	}
	
	

}
