package com.uisrael.veoptics.infraestructura.persistencia.jpa;

import java.io.Serializable;
import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

  
@Data
@Entity
@Table(name = "sv_historia")

public class HistoriaJpa implements Serializable {

	
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private  int id_historia;
	private  String tbl_antecedente;
	private  String tbl_diagnostico;
	private  String tbl_notas_clinica;
	private  LocalDate tbl_fecha;
	

}
