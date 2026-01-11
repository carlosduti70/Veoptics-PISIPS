package com.uisrael.veoptics.infraestructura.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import com.uisrael.veoptics.infraestructura.persistencia.jpa.PacienteJpa;

public interface IPacienteJpaRepositorio extends JpaRepository<PacienteJpa, Integer> {

}
