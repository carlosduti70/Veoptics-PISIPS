package com.uisrael.veoptics.presentacion.mapeadores;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.uisrael.veoptics.dominio.entidades.ExamenOptometrico;
import com.uisrael.veoptics.presentacion.dto.request.ExamenOptometricoRequestDTO;
import com.uisrael.veoptics.presentacion.dto.response.ExamenOptometricoResponseDTO;

@Mapper(componentModel = "spring")
public interface IExamenOptometricoDtoMapper {
	@Mapping(target = "paciente.idPaciente", source = "idPaciente")
	@Mapping(target = "optometrista.idOptometrista", source = "idOptometrista")
	ExamenOptometrico toDomain(ExamenOptometricoRequestDTO examenoptometrico);

	@Mapping(target = "idPaciente", source = "paciente.idPaciente")
	@Mapping(target = "idOptometrista", source = "optometrista.idOptometrista")
	ExamenOptometricoResponseDTO toResponseDto(ExamenOptometrico examenoptometrico);

}
