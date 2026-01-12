package com.uisrael.veoptics.presentacion.mapeadores;

import org.mapstruct.Mapper;

import com.uisrael.veoptics.dominio.entidades.Rol;
import com.uisrael.veoptics.presentacion.dto.request.RolRequestDTO;
import com.uisrael.veoptics.presentacion.dto.response.RolResponseDTO;

@Mapper(componentModel = "spring")
public interface IRolDtoMapper {

	Rol toDomain(RolRequestDTO rol);
	RolResponseDTO toResponseDto(Rol rol);
}

