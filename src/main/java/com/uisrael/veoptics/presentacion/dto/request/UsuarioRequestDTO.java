package com.uisrael.veoptics.presentacion.dto.request;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
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
	
	@NotNull(message = "El ID del rol es obligatorio")
    private int idRol;
	

}
