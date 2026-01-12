package com.uisrael.veoptics.presentacion.dto.request;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class RolRequestDTO {
	//private final int idRol;
	
	@NotBlank
	private  String nombreRol;
	@NotBlank
	private  char estado;
}
