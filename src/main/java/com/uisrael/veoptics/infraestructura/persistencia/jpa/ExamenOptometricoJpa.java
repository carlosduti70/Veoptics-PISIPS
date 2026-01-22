package com.uisrael.veoptics.infraestructura.persistencia.jpa;

import java.io.Serializable;
import java.time.LocalDate;

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
@Table(name = "sv_examen_optometrico")
public class ExamenOptometricoJpa implements Serializable{
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	private int idexamen;
	private LocalDate fecha;
	private String esfera_od;
	private String cilindro_od;
	private String eje_od;
	private String esfera_oi;
	private String cilindro_oi;
	private String eje_oi;
	private String adicion_od;
	private String adicion_oi;
	private String agudeza_visual_cerca_oi;
	private String agudeza_visual_lejos_oi;
	private String agudeza_visual_lejos_od;
	private String agudeza_visual_cerca_od;
	private String altura_oi;
	private String altura_od;
	
	 // Relación: Muchos Examenes optometricos (registros) pertenecen a un paciente
    @ManyToOne
    @JoinColumn(name = "fkIdPaciente")
    private PacienteJpa fkIdPaciente;
    
    @ManyToOne
    @JoinColumn(name = "id_paciente")
    private PacienteJpa paciente;
    
    @ManyToOne
    @JoinColumn(name = "id_optometrista")
    private OptometristaJpa optometrista;

}
