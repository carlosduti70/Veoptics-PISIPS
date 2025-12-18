package com.uisrael.veoptics.infraestructura.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import com.uisrael.veoptics.infraestructura.persistencia.jpa.RolJpa;

public interface IRolRepositorio extends JpaRepository<RolJpa,Integer> {
	

}
