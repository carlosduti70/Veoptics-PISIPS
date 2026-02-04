package com.uisrael.veoptics.infraestructura.persistencia.jpa;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "sv_examen_optometrico")
public class ExamenOptometricoJpa implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idExamen;

	private LocalDate fecha;

	// Ojo Derecho (OD)
	private String esferaOd;
	private String cilindroOd;
	private String ejeOd;
	private String adicionOd;
	private String agudezaVisualLejosOd;
	private String agudezaVisualCercaOd;
	private String alturaOd;

	// Ojo Izquierdo (OI)
	private String esferaOi;
	private String cilindroOi;
	private String ejeOi;
	private String adicionOi;
	private String agudezaVisualLejosOi;
	private String agudezaVisualCercaOi;
	private String alturaOi;

	private String diagnostico;
	private String visionCercana;
	private String visionLejana;
	private String percepcionColores;
	private String coloresVisibles;

	@ManyToOne
	@JoinColumn(name = "id_paciente_fk")
	private PacienteJpa paciente;

	@ManyToOne
	@JoinColumn(name = "id_optometrista_fk")
	private OptometristaJpa optometrista;

	// Historia
	@OneToOne(mappedBy = "examenOptometrico")
	private HistoriaJpa historia;

}
