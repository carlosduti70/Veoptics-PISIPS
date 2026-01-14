package com.uisrael.veoptics.infraestructura.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import com.uisrael.veoptics.infraestructura.persistencia.jpa.HistoriaClinicaJpa;

public interface IHistoriaClinicaJpaRepositorio extends JpaRepository<HistoriaClinicaJpa, Integer> {

}
