package com.uisrael.veoptics.presentacion.dto.request;

import java.time.LocalDate;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class PacienteRequestDTO {

//	private int idPaciente;

	@NotBlank
	private String nombre;
	@NotBlank
	private String apellido;
	@NotBlank
	private String ci;
	@NotBlank
	private LocalDate fecNacimiento;
	@NotBlank
	private String direccion;
	@NotBlank
	private String telefono;
	@NotBlank
	private String correo;
	@NotBlank
	private String motivoConsulta;
	@NotBlank
	private LocalDate fecRegistro;
	@NotBlank
	private LocalDate fecPrimero;
	@NotBlank
	private char estado;

}
