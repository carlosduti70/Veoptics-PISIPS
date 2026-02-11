package com.uisrael.veoptics.infraestructura.persistencia.jpa;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
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
@Table(name = "sv_certificado")

public class CertificadoJpa implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idCertificado;

	@Column(name = "tbl_fecha_emision")
	private LocalDate fechaEmision;

	@Column(name = "tbl_informacion_certificado")
	private String informacionCertificado;

	@Column(name = "tbl_ruta_pdf")
	private String rutaPdf;

	@OneToOne
	@JoinColumn(name = "id_examen_fk", unique = true)
	private ExamenOptometricoJpa examen;

}
