package com.uisrael.veoptics.presentacion.mapeadores;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.uisrael.veoptics.dominio.entidades.Usuario;
import com.uisrael.veoptics.presentacion.dto.request.UsuarioRequestDTO;
import com.uisrael.veoptics.presentacion.dto.response.UsuarioResponseDTO;

@Mapper(componentModel = "spring")
public interface IUsuarioDtoMapper {

	// Aquí le decimos: "Toma el idRol del DTO y ponlo en
	// usuario.getRol().setIdRol()"
	@Mapping(target = "rol.idRol", source = "idRol")
	Usuario toDomain(UsuarioRequestDTO usuario);

	@Mapping(target = "nombreRol", source = "rol.nombreRol")
	UsuarioResponseDTO toResponseDto(Usuario usuario);

}
