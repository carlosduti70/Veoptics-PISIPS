package com.uisrael.veoptics.infraestructura.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import com.uisrael.veoptics.infraestructura.persistencia.jpa.ExamenOptometricoJpa;

public interface IExamenOptometricoJpaRepositorio extends JpaRepository<ExamenOptometricoJpa, Integer>{
	

}
