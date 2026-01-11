package com.uisrael.veoptics.infraestructura.persistencia.mapeadores;

import org.mapstruct.Mapper;

import com.uisrael.veoptics.dominio.entidades.Optometrista;
import com.uisrael.veoptics.infraestructura.persistencia.jpa.OptometristaJpa;

@Mapper(componentModel = "spring")
	public interface IOptometristaJpaMapper {

		Optometrista toDomain(OptometristaJpa entity);

		OptometristaJpa toEntity(Optometrista optometrista);

}
