package com.uisrael.veoptics.presentacion.dto.response;

import java.time.LocalDate;

import jakarta.validation.constraints.NotBlank;

public class HistoriaResponseDTO {

	private String antecedente;
	private String diagnostico;
	private String notasClinica;
	private String motivoConsulta;
	private LocalDate fecha;
	private int idPaciente;
	private int idOptometrista;
	private int idExamen;

	public int getIdExamen() {
		return idExamen;
	}

	public void setIdExamen(int idExamen) {
		this.idExamen = idExamen;
	}

	public String getAntecedente() {
		return antecedente;
	}

	public void setAntecedente(String antecedente) {
		this.antecedente = antecedente;
	}

	public String getDiagnostico() {
		return diagnostico;
	}

	public void setDiagnostico(String diagnostico) {
		this.diagnostico = diagnostico;
	}

	public String getNotasClinica() {
		return notasClinica;
	}

	public void setNotasClinica(String notasClinica) {
		this.notasClinica = notasClinica;
	}

	public String getMotivoConsulta() {
		return motivoConsulta;
	}

	public void setMotivoConsulta(String motivoConsulta) {
		this.motivoConsulta = motivoConsulta;
	}

	public LocalDate getFecha() {
		return fecha;
	}

	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}

	public int getIdPaciente() {
		return idPaciente;
	}

	public void setIdPaciente(int idPaciente) {
		this.idPaciente = idPaciente;
	}

	public int getIdOptometrista() {
		return idOptometrista;
	}

	public void setIdOptometrista(int idOptometrista) {
		this.idOptometrista = idOptometrista;
	}

}
