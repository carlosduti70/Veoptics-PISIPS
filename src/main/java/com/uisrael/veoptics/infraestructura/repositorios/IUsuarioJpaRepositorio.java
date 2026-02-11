package com.uisrael.veoptics.infraestructura.repositorios;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.uisrael.veoptics.infraestructura.persistencia.jpa.RolJpa;
import com.uisrael.veoptics.infraestructura.persistencia.jpa.UsuarioJpa;

public interface IUsuarioJpaRepositorio extends JpaRepository<UsuarioJpa, Integer> {

	@Override
	@EntityGraph(attributePaths = { "rol" }) // Esto fuerza el JOIN con la tabla sv_rol
	List<UsuarioJpa> findAll();

	Optional<UsuarioJpa> findByCorreo(String correo);

	@Modifying
	@Query("UPDATE UsuarioJpa u SET u.clave = :nuevaClave, u.indicador = 'A' WHERE u.idUsuario = :idUsuario")
	void actualizarClave(@Param("idUsuario") int idUsuario, @Param("nuevaClave") String nuevaClave);

	boolean existsByCedula(String cedula);

	boolean existsByCorreo(String correo);

	boolean existsByCorreoAndIdUsuarioNot(String correo, int idUsuario);

	boolean existsByCedulaAndIdUsuarioNot(String cedula, int idUsuario);

	@Modifying
	@Query("UPDATE UsuarioJpa u SET " + "u.nombre = :nombre, " + "u.apellido = :apellido, " + "u.cedula = :cedula, "
			+ "u.correo = :correo, " + "u.estado = :estado, " + "u.rol = :rol " +
			"WHERE u.idUsuario = :idUsuario")
	void actualizarDatosGenerales(@Param("idUsuario") int idUsuario, @Param("nombre") String nombre,
			@Param("apellido") String apellido, @Param("cedula") String cedula, @Param("correo") String correo,
			@Param("estado") boolean estado, @Param("rol") RolJpa rol
	);

}
