package com.uisrael.veoptics.dominio.entidades;

import java.time.LocalDate;


public class HistoriaClinica {

	private final int idHistoria;
	private final String antecedente;
	private final String diagnostico;
	private final String notasClinica;
	private final LocalDate fecha;
	private final char estado;
	
	//Llaves foraneas
	private final Paciente paciente;
	private final Optometrista optometrista;
	
	//Relacion 1:M con consultas
	//private final List<ConsultaHistorial> consultas;
	
	public HistoriaClinica(int idHistoria, String antecedente, String diagnostico, String notasClinica, LocalDate fecha,
			Paciente paciente, Optometrista optometrista,char estado) {
		
		this.idHistoria = idHistoria;
		this.antecedente = antecedente;
		this.diagnostico = diagnostico;
		this.notasClinica = notasClinica;
		this.fecha = fecha;
		this.estado = estado;
		this.paciente = paciente;
		this.optometrista = optometrista;
	}

	
	public int getIdHistoria() {
		return idHistoria;
	}

	public String getAntecedente() {
		return antecedente;
	}

	public String getDiagnostico() {
		return diagnostico;
	}

	public String getNotasClinica() {
		return notasClinica;
	}

	public LocalDate getFecha() {
		return fecha;
	}

	public Paciente getPaciente() {
		return paciente;
	}

	public Optometrista getOptometrista() {
		return optometrista;
	}

	
	public char getEstado() {
		return estado;
	}


	@Override
	public String toString() {
		return "HistoriaClinica [idHistoria=" + idHistoria + ", antecedente=" + antecedente + ", diagnostico="
				+ diagnostico + ", notasClinica=" + notasClinica + ", fecha=" + fecha + ", estado=" + estado
				+ ", paciente=" + paciente + ", optometrista=" + optometrista + "]";
	}
	
}
