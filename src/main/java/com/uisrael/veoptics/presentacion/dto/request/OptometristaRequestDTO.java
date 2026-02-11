package com.uisrael.veoptics.presentacion.dto.request;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class OptometristaRequestDTO {
//	private int idOptometrista;

	@NotBlank
	private String registroProfesional;
	@NotBlank
	private String telefono;
	@NotBlank
	private char estado;
	@NotBlank
    private Integer idUsuario;

}
