package com.uisrael.veoptics.infraestructura.persistencia.jpa;

import java.io.Serializable;
import java.time.LocalDate;
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
@Table(name = "sv_paciente")
public class PacienteJpa implements Serializable {
	

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idPaciente;
	private String apellido;
	private String ci;
	private LocalDate  fecNacimiento;
	private String direccion;
	private String telefono;
	private String correo;
	private String motivoConsulta;
	private LocalDate fecRegistro;
	private LocalDate fecPrimero;
	private String nombre;
	private char estado;
	
	// Relación: Muchos Pacientes (registros) pertenecen a un Usuario
    // En la imagen, sv_paciente tiene la FK "id_usuario"
    @ManyToOne
    @JoinColumn(name = "id_usuario")
    private UsuarioJpa usuario;
	
    
 // Relación: Un Pacientes (registros) pertenecen a muchos Certificado
    @OneToMany(mappedBy = "fkIdPaciente")
    private List<CertificadoJpa> certificados;
   
   


}
