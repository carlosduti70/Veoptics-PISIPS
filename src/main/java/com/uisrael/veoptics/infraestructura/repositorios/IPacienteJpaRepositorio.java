package com.uisrael.veoptics.infraestructura.repositorios;

import java.time.LocalDate;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.uisrael.veoptics.infraestructura.persistencia.jpa.PacienteJpa;

public interface IPacienteJpaRepositorio extends JpaRepository<PacienteJpa, Integer> {

    boolean existsByCi(String ci);
    boolean existsByCorreo(String correo);
    boolean existsByTelefono(String telefono);

    boolean existsByCiAndIdPacienteNot(String ci, Integer idPaciente);
    boolean existsByCorreoAndIdPacienteNot(String correo, Integer idPaciente);
    boolean existsByTelefonoAndIdPacienteNot(String telefono, Integer idPaciente);
    
    @Modifying
    @Query("UPDATE PacienteJpa p SET " +
           "p.nombre = :nombre, " +
           "p.apellido = :apellido, " +
           "p.ci = :ci, " +
           "p.fecNacimiento = :fecNacimiento, " +
           "p.direccion = :direccion, " +
           "p.telefono = :telefono, " +
           "p.correo = :correo, " +
           "p.estado = :estado " +
           "WHERE p.idPaciente = :idPaciente")
    void actualizarDatos(
            @Param("idPaciente") int idPaciente,
            @Param("nombre") String nombre,
            @Param("apellido") String apellido,
            @Param("ci") String ci,
            @Param("fecNacimiento") LocalDate fecNacimiento,
            @Param("direccion") String direccion,
            @Param("telefono") String telefono,
            @Param("correo") String correo,
            @Param("estado") char estado
    );
}
