package com.uisrael.veoptics.presentacion.dto.request;

import com.uisrael.veoptics.dominio.entidades.Rol;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;


@Data
public class UsuarioRequestDTO {
	
	//private  int idUsuario;
	
	@NotBlank
	private  String nombre;
	@NotBlank
	private  String apellido;
	@NotBlank
	private  String cedula;
	@NotBlank
	private  String correo;
	@NotBlank
	private  String clave;
	@NotBlank
	private  Boolean estado;
	@NotBlank
	private  Rol rol;
	
	

}
