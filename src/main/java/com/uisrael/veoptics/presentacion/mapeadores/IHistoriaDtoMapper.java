package com.uisrael.veoptics.presentacion.mapeadores;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.uisrael.veoptics.dominio.entidades.Historia;
import com.uisrael.veoptics.presentacion.dto.request.HistoriaRequestDTO;
import com.uisrael.veoptics.presentacion.dto.response.HistoriaResponseDTO;

@Mapper(componentModel = "spring")
public interface IHistoriaDtoMapper {

	@Mapping(target = "paciente.idPaciente", source = "idPaciente")
	@Mapping(target = "optometrista.idOptometrista", source = "idOptometrista")
	@Mapping(target = "examen.idExamen", source = "idExamen")
	Historia toDomain(HistoriaRequestDTO historia);

	@Mapping(target = "idPaciente", source = "paciente.idPaciente")
	@Mapping(target = "idOptometrista", source = "optometrista.idOptometrista")
	@Mapping(target = "idExamen", source = "examen.idExamen")
	HistoriaResponseDTO toResponseDto(Historia historia);

}
