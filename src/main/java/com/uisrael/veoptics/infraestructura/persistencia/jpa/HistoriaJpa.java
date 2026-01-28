package com.uisrael.veoptics.infraestructura.persistencia.jpa;

import java.io.Serializable;
import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "sv_historia")

public class HistoriaJpa implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idHistoria;

	// CORRECCIÓN: Nombres de atributos limpios, mapeados a columnas con nombres
	// específicos si lo deseas
	@Column(name = "tbl_antecedente")
	private String antecedente;

	@Column(name = "tbl_diagnostico")
	private String diagnostico;

	@Column(name = "tbl_notas_clinica")
	private String notasClinica;

	@Column(name = "tbl_fecha")
	private LocalDate fecha;

	// CORRECCIÓN: El motivo de consulta pertenece a la visita específica
	private String motivoConsulta;

	@ManyToOne
	@JoinColumn(name = "id_paciente_fk")
	private PacienteJpa paciente;

	@ManyToOne
	@JoinColumn(name = "id_optometrista_fk")
	private OptometristaJpa optometrista;

}
