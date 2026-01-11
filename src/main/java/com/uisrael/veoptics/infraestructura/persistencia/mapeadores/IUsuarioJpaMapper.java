package com.uisrael.veoptics.infraestructura.persistencia.mapeadores;

import org.mapstruct.Mapper;

import com.uisrael.veoptics.dominio.entidades.Usuario;
import com.uisrael.veoptics.infraestructura.persistencia.jpa.UsuarioJpa;

@Mapper(componentModel = "spring")
public interface IUsuarioJpaMapper {
	
	Usuario toDomain(UsuarioJpa entity);
	UsuarioJpa toEntity(Usuario usuario);

}
