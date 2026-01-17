package com.uisrael.veoptics.infraestructura.persistencia.mapeadores;

import org.mapstruct.Mapper;

import com.uisrael.veoptics.dominio.entidades.ExamenOptometrico;
import com.uisrael.veoptics.infraestructura.persistencia.jpa.ExamenOptometricoJpa;

@Mapper(componentModel = "spring")
public interface IExamenOptometricoJpaMapper {

	ExamenOptometrico toDomain(ExamenOptometricoJpa entity);

	ExamenOptometricoJpa toEntity(ExamenOptometrico examenoptometrico);

}
