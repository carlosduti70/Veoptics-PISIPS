package com.uisrael.veoptics.infraestructura.repositorios;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.uisrael.veoptics.infraestructura.persistencia.jpa.UsuarioJpa;

public interface IUsuarioJpaRepositorio extends JpaRepository<UsuarioJpa, Integer> {

	@Override
	@EntityGraph(attributePaths = { "rol" }) // Esto fuerza el JOIN con la tabla sv_rol
	List<UsuarioJpa> findAll();

	Optional<UsuarioJpa> findByCorreo(String correo);

	@Modifying
	@Query("UPDATE UsuarioJpa u SET u.clave = :nuevaClave, u.indicador = 'A' WHERE u.idUsuario = :idUsuario")
	void actualizarClave(@Param("idUsuario") int idUsuario, @Param("nuevaClave") String nuevaClave);

}
