package com.uisrael.veoptics.dominio.entidades;

import java.time.LocalDateTime;

public class ExamenOptometrico {
	private final int idExamen;
	private final LocalDateTime fecha;

	// Ojo Derecho (OD)
	private final String esferaOd;
	private final String cilindroOd;
	private final String ejeOd;
	private final String adicionOd;
	private final String agudezaVisualLejosOd;
	private final String agudezaVisualCercaOd;
	private final String dnpOd;
	private final String alturaOd;

	// Ojo Izquierdo (OI)
	private final String esferaOi;
	private final String cilindroOi;
	private final String ejeOi;
	private final String adicionOi;
	private final String agudezaVisualLejosOi;
	private final String agudezaVisualCercaOi;
	private final String dnpOi;
	private final String alturaOi;

	private final String diagnostico;
	private final String visionCercana;
	private final String visionLejana;
	private final String percepcionColores;
	private final String coloresVisibles;

	// RELACIONES
	private final Paciente paciente;
	private final Optometrista optometrista;

	public ExamenOptometrico(int idExamen, LocalDateTime fecha, String esferaOd, String cilindroOd, String ejeOd,
			String adicionOd, String agudezaVisualLejosOd, String agudezaVisualCercaOd, String dnpOd, String alturaOd,
			String esferaOi, String cilindroOi, String ejeOi, String adicionOi, String agudezaVisualLejosOi,
			String agudezaVisualCercaOi, String dnpOi, String alturaOi, String diagnostico, String visionCercana,
			String visionLejana, String percepcionColores, String coloresVisibles, Paciente paciente,
			Optometrista optometrista) {
		super();
		this.idExamen = idExamen;
		this.fecha = fecha;
		this.esferaOd = esferaOd;
		this.cilindroOd = cilindroOd;
		this.ejeOd = ejeOd;
		this.adicionOd = adicionOd;
		this.agudezaVisualLejosOd = agudezaVisualLejosOd;
		this.agudezaVisualCercaOd = agudezaVisualCercaOd;
		this.dnpOd = dnpOd;
		this.alturaOd = alturaOd;
		this.esferaOi = esferaOi;
		this.cilindroOi = cilindroOi;
		this.ejeOi = ejeOi;
		this.adicionOi = adicionOi;
		this.agudezaVisualLejosOi = agudezaVisualLejosOi;
		this.agudezaVisualCercaOi = agudezaVisualCercaOi;
		this.dnpOi = dnpOi;
		this.alturaOi = alturaOi;
		this.diagnostico = diagnostico;
		this.visionCercana = visionCercana;
		this.visionLejana = visionLejana;
		this.percepcionColores = percepcionColores;
		this.coloresVisibles = coloresVisibles;
		this.paciente = paciente;
		this.optometrista = optometrista;
	}

	public int getIdExamen() {
		return idExamen;
	}

	public LocalDateTime getFecha() {
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

	public String getDnpOd() {
		return dnpOd;
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

	public String getDnpOi() {
		return dnpOi;
	}

	public String getAlturaOi() {
		return alturaOi;
	}

	public String getDiagnostico() {
		return diagnostico;
	}

	public String getVisionCercana() {
		return visionCercana;
	}

	public String getVisionLejana() {
		return visionLejana;
	}

	public String getPercepcionColores() {
		return percepcionColores;
	}

	public String getColoresVisibles() {
		return coloresVisibles;
	}

	public Paciente getPaciente() {
		return paciente;
	}

	public Optometrista getOptometrista() {
		return optometrista;
	}

}
