package com.uisrael.veoptics.dominio.entidades;

import java.time.LocalDate;

public class ExamenOptometrico {
	private final int idExamen;
	private final LocalDate fecha;

	// Ojo Derecho (OD)
	private final String esferaOd;
	private final String cilindroOd;
	private final String ejeOd;
	private final String adicionOd;
	private final String agudezaVisualLejosOd;
	private final String agudezaVisualCercaOd;
	private final String alturaOd;

	// Ojo Izquierdo (OI)
	private final String esferaOi;
	private final String cilindroOi;
	private final String ejeOi;
	private final String adicionOi;
	private final String agudezaVisualLejosOi;
	private final String agudezaVisualCercaOi;
	private final String alturaOi;

	// RELACIONES
	private final Paciente paciente;
	private final Optometrista optometrista;

	public ExamenOptometrico(int idExamen, LocalDate fecha, String esferaOd, String cilindroOd, String ejeOd,
			String adicionOd, String agudezaVisualLejosOd, String agudezaVisualCercaOd, String alturaOd,
			String esferaOi, String cilindroOi, String ejeOi, String adicionOi, String agudezaVisualLejosOi,
			String agudezaVisualCercaOi, String alturaOi, Paciente paciente, Optometrista optometrista) {
		super();
		this.idExamen = idExamen;
		this.fecha = fecha;
		this.esferaOd = esferaOd;
		this.cilindroOd = cilindroOd;
		this.ejeOd = ejeOd;
		this.adicionOd = adicionOd;
		this.agudezaVisualLejosOd = agudezaVisualLejosOd;
		this.agudezaVisualCercaOd = agudezaVisualCercaOd;
		this.alturaOd = alturaOd;
		this.esferaOi = esferaOi;
		this.cilindroOi = cilindroOi;
		this.ejeOi = ejeOi;
		this.adicionOi = adicionOi;
		this.agudezaVisualLejosOi = agudezaVisualLejosOi;
		this.agudezaVisualCercaOi = agudezaVisualCercaOi;
		this.alturaOi = alturaOi;
		this.paciente = paciente;
		this.optometrista = optometrista;
	}

	public int getIdExamen() {
		return idExamen;
	}

	public LocalDate getFecha() {
		return fecha;
	}

	public String getEsferaOd() {
		return esferaOd;
	}

	public String getCilindroOd() {
		return cilindroOd;
	}

	public String getEjeOd() {
		return ejeOd;
	}

	public String getAdicionOd() {
		return adicionOd;
	}

	public String getAgudezaVisualLejosOd() {
		return agudezaVisualLejosOd;
	}

	public String getAgudezaVisualCercaOd() {
		return agudezaVisualCercaOd;
	}

	public String getAlturaOd() {
		return alturaOd;
	}

	public String getEsferaOi() {
		return esferaOi;
	}

	public String getCilindroOi() {
		return cilindroOi;
	}

	public String getEjeOi() {
		return ejeOi;
	}

	public String getAdicionOi() {
		return adicionOi;
	}

	public String getAgudezaVisualLejosOi() {
		return agudezaVisualLejosOi;
	}

	public String getAgudezaVisualCercaOi() {
		return agudezaVisualCercaOi;
	}

	public String getAlturaOi() {
		return alturaOi;
	}

	public Paciente getPaciente() {
		return paciente;
	}

	public Optometrista getOptometrista() {
		return optometrista;
	}

}
