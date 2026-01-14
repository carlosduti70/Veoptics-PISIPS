package com.uisrael.veoptics.infraestructura.persistencia.mapeadores;

import org.mapstruct.Mapper;

import com.uisrael.veoptics.dominio.entidades.HistoriaClinica;
import com.uisrael.veoptics.infraestructura.persistencia.jpa.HistoriaClinicaJpa;

@Mapper(componentModel = "spring")
public interface IHistoriaClinicaJpaMapper {

	HistoriaClinica toDomain (HistoriaClinicaJpa entity);
	HistoriaClinicaJpa toEntity(HistoriaClinica historiaC);
}
