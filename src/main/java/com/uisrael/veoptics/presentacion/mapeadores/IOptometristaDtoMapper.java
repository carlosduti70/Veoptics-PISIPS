package com.uisrael.veoptics.presentacion.mapeadores;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.uisrael.veoptics.dominio.entidades.Optometrista;
import com.uisrael.veoptics.presentacion.dto.request.OptometristaRequestDTO;
import com.uisrael.veoptics.presentacion.dto.response.OptometristaResponseDTO;

@Mapper(componentModel = "spring")
public interface IOptometristaDtoMapper {
	@Mapping(target = "usuario.idUsuario", source = "idUsuario")
	Optometrista toDomain(OptometristaRequestDTO optometrista);
	
	@Mapping(target = "idUsuario", source = "usuario.idUsuario")
	OptometristaResponseDTO toResponseDto(Optometrista optometrista);
	
}
