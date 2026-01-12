package com.uisrael.veoptics.infraestructura.persistencia.mapeadores;
import org.mapstruct.Mapper;

import com.uisrael.veoptics.dominio.entidades.Rol;
import com.uisrael.veoptics.infraestructura.persistencia.jpa.RolJpa;

@Mapper(componentModel = "spring")
public interface IRolJpaMapper {
	
	Rol toDomain(RolJpa entity);
	RolJpa toEntity(Rol rol);
	
}