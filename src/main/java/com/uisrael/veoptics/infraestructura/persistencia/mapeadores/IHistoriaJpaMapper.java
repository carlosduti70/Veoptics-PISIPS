package com.uisrael.veoptics.infraestructura.persistencia.mapeadores;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.uisrael.veoptics.dominio.entidades.Historia;
import com.uisrael.veoptics.infraestructura.persistencia.jpa.HistoriaJpa;

@Mapper(componentModel = "spring")
public interface IHistoriaJpaMapper {

	@Mapping(target = "examen", source = "examenOptometrico")
	Historia toDomain(HistoriaJpa entity);

	@Mapping(target = "examenOptometrico", source = "examen")
	HistoriaJpa toEntity(Historia historia);

}
