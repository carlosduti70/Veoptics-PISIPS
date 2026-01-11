package com.uisrael.veoptics.infraestructura.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import com.uisrael.veoptics.infraestructura.persistencia.jpa.UsuarioJpa;

public interface IUsuarioJpaRepositorio extends JpaRepository<UsuarioJpa, Integer>{

}
