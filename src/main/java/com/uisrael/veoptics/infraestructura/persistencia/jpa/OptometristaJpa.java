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
@Table(name = "sv_optometrista")
public class OptometristaJpa implements Serializable  {
	
	
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idOptometrista;
	private String nombre;
	private String apellido;
	private String  ci;
	private String registroProfesional;
	private String telefono;
	private char estado;
	
	// Relación: Muchos registros de Optometrista pertenecen a un Usuario
    // En la imagen, sv_optometrista tiene la FK "id_usuario"
	@ManyToOne
    @JoinColumn(name = "id_usuario")
    private UsuarioJpa usuario;


    @OneToMany(mappedBy = "optometrista")
    private List<ExamenOptometricoJpa> examenoptometrico;
    
    @OneToMany(mappedBy = "optometrista")
    private List<CertificadoJpa> certificado;
}
