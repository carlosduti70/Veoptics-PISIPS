package com.uisrael.veoptics.presentacion.dto.request;

import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class UsuarioUpdateDTO {
	@NotNull
	private Integer idUsuario;
	private String nombre;
	private String apellido;
	private String cedula;
	private String correo;
	private Boolean estado;
	private Integer idRol;
}
