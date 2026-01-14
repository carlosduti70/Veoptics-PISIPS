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
@Table(name = "sv_certificado")

public class CertificadoJpa implements Serializable{
	
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_certificado;
	private LocalDate tbl_fecha_emision;
	private String tbl_informacion_certificado;
	private String tbl_ruta_pdf;
	
	

}
