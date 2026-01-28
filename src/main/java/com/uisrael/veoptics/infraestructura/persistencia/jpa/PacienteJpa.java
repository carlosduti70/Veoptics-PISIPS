package com.uisrael.veoptics.infraestructura.persistencia.jpa;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

import jakarta.persistence.Column;
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

    private String nombre;
    private String apellido;
    
    @Column(unique = true)
    private String ci;
    
    private LocalDate fecNacimiento;
    private String direccion;
    private String telefono;
    private String correo;
    
    private LocalDate fecRegistro;
    private char estado;

    @OneToMany(mappedBy = "paciente")
    private List<ExamenOptometricoJpa> examenes;

    @OneToMany(mappedBy = "paciente")
    private List<HistoriaJpa> historias;

}
