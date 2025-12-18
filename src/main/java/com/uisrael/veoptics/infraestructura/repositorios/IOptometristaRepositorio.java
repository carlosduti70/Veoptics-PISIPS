package com.uisrael.veoptics.infraestructura.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import com.uisrael.veoptics.infraestructura.persistencia.jpa.OptometristaJpa;

public interface IOptometristaRepositorio extends JpaRepository<OptometristaJpa, Integer>{

}
