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
	
	
	
	// Relación: Muchos Certificados (registros) se puede generar a un paciente
	@ManyToOne
	@JoinColumn(name = "fkIdPaciente")
	private PacienteJpa fkIdPaciente;
	
	@OneToMany(mappedBy = "idPaciente", cascade = CascadeType.ALL)
	private List<PacienteJpa> paciente;
	
    @ManyToOne
    @JoinColumn(name = "idOptometrista", nullable = false)
    private OptometristaJpa optometrista;

}
