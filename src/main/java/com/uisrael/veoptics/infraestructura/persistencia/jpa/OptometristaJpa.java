package com.uisrael.veoptics.infraestructura.persistencia.jpa;

import java.io.Serializable;
import java.util.List;

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
@Table(name = "sv_optometrista")
public class OptometristaJpa implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idOptometrista;

	private String registroProfesional;
	private String telefono;
	private char estado;

	// CORRECCIÓN: Relación 1 a 1. Un optometrista es un Usuario.
	@OneToOne
	@JoinColumn(name = "id_usuario_fk", unique = true)
	private UsuarioJpa usuario;

	@OneToMany(mappedBy = "optometrista")
	private List<HistoriaJpa> historias;

	@OneToMany(mappedBy = "optometrista")
	private List<ExamenOptometricoJpa> examenes;

}
