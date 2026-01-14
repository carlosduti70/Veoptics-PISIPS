package com.uisrael.veoptics.infraestructura.persistencia.jpa;

import java.io.Serializable;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table (name = "sv_usuarios")

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
	
	// Relación: Muchos Usuarios pertenecen a un Rol
    // En la imagen, sv_usuarios tiene la FK "id_rol"
    @ManyToOne
    @JoinColumn(name = "id_rol")
    private RolJpa rol;
    
 //Relación: Un Usuario puede estar vinculado a un registro de Optometrista
    @OneToMany(mappedBy = "usuario")
    private List<OptometristaJpa> optometristas;
    
 // Relación: Un Usuario puede estar vinculado a un registro de Paciente
    @OneToMany(mappedBy = "usuario")
    private List<PacienteJpa> pacientes;
	
}
