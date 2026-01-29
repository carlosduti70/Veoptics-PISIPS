package com.uisrael.veoptics.infraestructura.repositorios;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.uisrael.veoptics.infraestructura.persistencia.jpa.OptometristaJpa;

public interface IOptometristaJpaRepositorio extends JpaRepository<OptometristaJpa, Integer>{

	Optional<OptometristaJpa> findByUsuarioIdUsuario(int idUsuario);
	
}
