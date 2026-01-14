package com.uisrael.veoptics.infraestructura.persistencia.jpa;

import java.io.Serializable;
import java.time.LocalDate;

//import com.uisrael.veoptics.dominio.entidades.Optometrista;
//import com.uisrael.veoptics.dominio.entidades.Paciente;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
//import jakarta.persistence.JoinColumn;
//import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="sv_HistoriaClinica")
public class HistoriaClinicaJpa implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private final int idHistoria;
	private final String antecedente;
	private final String diagnostico;
	private final String notasClinica;
	private final LocalDate fecha;
	private char estado;
	
	//Muchas Historia Clinicas pertenecen a un paciente
	//@ManyToOne
   // @JoinColumn(name = "idPaciente") 
    //private Paciente paciente;
	
	//Muchas Historia Clinicas pueden ser creadas por optometrista
	//@ManyToOne
   // @JoinColumn(name = "idOptometrista")
  //  private Optometrista optometrista;
}
