package com.uisrael.veoptics.dominio.entidades;

import java.time.LocalDate;

public final class Historia {

	private final int idHistoria;
	private final String antecedente;
	private final String diagnostico;
	private final String notasClinica;
	private final LocalDate fecha;
	private final String motivoConsulta;
	// RELACIONES
	private final Paciente paciente;
	private final Optometrista optometrista;

	public Historia(int idHistoria, String antecedente, String diagnostico, String notasClinica, LocalDate fecha,
			String motivoConsulta, Paciente paciente, Optometrista optometrista) {
		super();
		this.idHistoria = idHistoria;
		this.antecedente = antecedente;
		this.diagnostico = diagnostico;
		this.notasClinica = notasClinica;
		this.fecha = fecha;
		this.motivoConsulta = motivoConsulta;
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

	public String getMotivoConsulta() {
		return motivoConsulta;
	}

	public Paciente getPaciente() {
		return paciente;
	}

	public Optometrista getOptometrista() {
		return optometrista;
	}

}
