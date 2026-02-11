package com.uisrael.veoptics.infraestructura.repositorios;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.uisrael.veoptics.infraestructura.persistencia.jpa.OptometristaJpa;

public interface IOptometristaJpaRepositorio extends JpaRepository<OptometristaJpa, Integer> {

	Optional<OptometristaJpa> findByUsuarioIdUsuario(int idUsuario);

	boolean existsByRegistroProfesional(String registroProfesional);

	boolean existsByTelefono(String telefono);

	boolean existsByRegistroProfesionalAndIdOptometristaNot(String registroProfesional, int idOptometrista);

	boolean existsByTelefonoAndIdOptometristaNot(String telefono, int idOptometrista);

	@Modifying
	@Query("UPDATE OptometristaJpa u SET " + "u.registroProfesional = :registroProfesional, "
			+ "u.telefono = :telefono, " + "u.estado = :estado " + "WHERE u.idOptometrista = :idOptometrista")
	void actualizarDatos(@Param("idOptometrista") int idOptometrista,
			@Param("registroProfesional") String registroProfesional,
			@Param("telefono") String telefono, 
			@Param("estado") char estado);

}
