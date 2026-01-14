package com.uisrael.veoptics.presentacion.mapeadores;

import org.mapstruct.Mapper;

import com.uisrael.veoptics.dominio.entidades.Historia;
import com.uisrael.veoptics.presentacion.dto.request.HistoriaRequestDTO;
import com.uisrael.veoptics.presentacion.dto.response.HistoriaResponseDTO;


@Mapper(componentModel = "spring")
public interface IHistoriaDtoMapper {
	
	Historia toDomain(HistoriaRequestDTO historia);
	HistoriaResponseDTO toResponseDto(Historia historia);

}
