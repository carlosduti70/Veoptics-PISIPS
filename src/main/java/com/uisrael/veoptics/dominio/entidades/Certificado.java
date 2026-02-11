package com.uisrael.veoptics.dominio.entidades;

import java.time.LocalDate;

public final class Certificado {

	private final int idCertificado;
	private final LocalDate fechaEmision;
	private final String informacionCertificado;
	private final String rutaPdf;
	// El certificado "contiene" un examen
	private final ExamenOptometrico examen;

	public Certificado(int idCertificado, LocalDate fechaEmision, String informacionCertificado, String rutaPdf,
			ExamenOptometrico examen) {
		super();
		this.idCertificado = idCertificado;
		this.fechaEmision = fechaEmision;
		this.informacionCertificado = informacionCertificado;
		this.rutaPdf = rutaPdf;
		this.examen = examen;
	}

	public int getIdCertificado() {
		return idCertificado;
	}

	public LocalDate getFechaEmision() {
		return fechaEmision;
	}

	public String getInformacionCertificado() {
		return informacionCertificado;
	}

	public String getRutaPdf() {
		return rutaPdf;
	}

	public ExamenOptometrico getExamen() {
		return examen;
	}

}
