package com.uisrael.veoptics.infraestructura.persistencia.jpa;

import java.io.Serializable;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "sv_usuario")

public class UsuarioJpa implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idUsuario;

	private String nombre;
	private String apellido;

//	@Column(unique = true)
	private String cedula;

//	@Column(unique = true)
	private String correo;

	private String clave;
	private Boolean estado;

	// Relación: Muchos Usuarios pertenecen a un Rol
	@ManyToOne
	@JoinColumn(name = "id_rol_fk")
	private RolJpa rol; // Nombre de variable limpio

	// Usamos mappedBy para indicar que la FK está en la tabla Optometrista
	@OneToOne(mappedBy = "usuario")
	private OptometristaJpa optometrista;

}
