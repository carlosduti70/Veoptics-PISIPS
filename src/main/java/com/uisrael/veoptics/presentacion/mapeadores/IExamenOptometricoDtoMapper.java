package com.uisrael.veoptics.presentacion.mapeadores;

import org.mapstruct.Mapper;

import com.uisrael.veoptics.dominio.entidades.ExamenOptometrico;
import com.uisrael.veoptics.presentacion.dto.request.ExamenOptometricoRequestDTO;
import com.uisrael.veoptics.presentacion.dto.response.ExamenOptometricoResponseDTO;

@Mapper(componentModel = "spring")
public interface IExamenOptometricoDtoMapper {
	
	ExamenOptometrico toDomain(ExamenOptometricoRequestDTO examenoptometrico);

	ExamenOptometricoResponseDTO toResponseDto(ExamenOptometrico examenoptometrico);

}
