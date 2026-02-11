package com.uisrael.veoptics.infraestructura.repositorios;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.uisrael.veoptics.infraestructura.persistencia.jpa.HistoriaJpa;


public interface IHistoriaJpaRepositorio extends JpaRepository<HistoriaJpa, Integer> {
	
	Optional<HistoriaJpa> findByExamenOptometricoIdExamen(int idExamen);

}
