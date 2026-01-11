package com.uisrael.veoptics.presentacion.mapeadores;

import org.mapstruct.Mapper;

import com.uisrael.veoptics.dominio.entidades.Optometrista;
import com.uisrael.veoptics.presentacion.dto.request.OptometristaRequestDTO;
import com.uisrael.veoptics.presentacion.dto.response.OptometristaResponseDTO;

@Mapper(componentModel = "spring")
public interface IOptometristaDtoMapper {
	Optometrista toDomain(OptometristaRequestDTO optometrista);
	OptometristaResponseDTO toResponseDto(Optometrista optometrista);
	

}
