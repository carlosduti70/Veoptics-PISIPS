package com.uisrael.veoptics.presentacion.dto.request;

import java.time.LocalDate;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class PacienteUpdateDTO {
	@NotNull(message = "El ID es obligatorio")
	private Integer idPaciente;

	@NotBlank(message = "El nombre es obligatorio")
	private String nombre;

	@NotBlank(message = "El apellido es obligatorio")
	private String apellido;

	@NotBlank(message = "La cédula es obligatoria")
	private String ci;

	@NotNull(message = "Fecha de nacimiento obligatoria")
	private LocalDate fecNacimiento;

	private String direccion;

	@NotBlank(message = "El teléfono es obligatorio")
	private String telefono;

	@Email
	private String correo;

	// Estado lo manejamos como String en DTO y convertimos a char en Mapper
	private String estado;
}
