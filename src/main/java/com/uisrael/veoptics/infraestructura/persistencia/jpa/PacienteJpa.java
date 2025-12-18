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
@Table(name = "sv_paciente")
public class PacienteJpa implements Serializable {
	

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idPaciente;
	private String apellido;
	private String ci;
	private LocalDate  fecNacimiento;
	private String direccion;
	private String telefono;
	private String correo;
	private String motivoConsulta;
	private LocalDate fecRegistro;
	private LocalDate fecPrimero;
	private String nombre;
	private char estado;
	

}
