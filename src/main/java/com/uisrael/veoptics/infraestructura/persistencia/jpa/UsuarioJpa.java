package com.uisrael.veoptics.infraestructura.persistencia.jpa;

import java.io.Serializable;

import com.uisrael.veoptics.dominio.entidades.Rol;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity

public class UsuarioJpa implements Serializable {

	
	private static final long serialVersionUID = -4889039407626541762L;
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private int idUsuario;
	private String nombre;
	private String apellido;
	private String cedula;
	private String correo;
	private String clave;
	private Boolean estado;
	private Rol rol;
	
}
