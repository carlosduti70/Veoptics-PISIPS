package com.uisrael.veoptics.presentacion.mapeadores;

import org.mapstruct.Mapper;

import com.uisrael.veoptics.dominio.entidades.HistoriaClinica;
import com.uisrael.veoptics.presentacion.dto.request.HistoriaClinicaRequestDTO;
import com.uisrael.veoptics.presentacion.dto.response.HistoriaCliniciaResponseDTO;

@Mapper(componentModel = "spring")
public interface IHistoriaClinicaDtoMapper {
	HistoriaClinica toDomain(HistoriaClinicaRequestDTO historiasC);
	HistoriaCliniciaResponseDTO toResponseDTO(HistoriaClinica historiaC);
}
