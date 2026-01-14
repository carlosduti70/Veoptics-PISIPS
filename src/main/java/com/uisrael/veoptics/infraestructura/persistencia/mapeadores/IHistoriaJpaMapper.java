package com.uisrael.veoptics.infraestructura.persistencia.mapeadores;

import org.mapstruct.Mapper;

import com.uisrael.veoptics.dominio.entidades.Historia;
import com.uisrael.veoptics.dominio.entidades.Optometrista;
import com.uisrael.veoptics.infraestructura.persistencia.jpa.HistoriaJpa;
import com.uisrael.veoptics.infraestructura.persistencia.jpa.OptometristaJpa;

@Mapper(componentModel = "spring")
public interface IHistoriaJpaMapper {

	Historia toDomain(HistoriaJpa entity);
	HistoriaJpa toEntity(Historia historia);
	
	
	
}
