package com.uisrael.veoptics.presentacion.mapeadores;

import org.mapstruct.Mapper;


import com.uisrael.veoptics.dominio.entidades.Usuario;
import com.uisrael.veoptics.presentacion.dto.request.UsuarioRequestDTO;
import com.uisrael.veoptics.presentacion.dto.response.UsuarioResponseDTO;


@Mapper(componentModel = "spring")
public interface IUsuarioDtoMapper {
	
	
	Usuario toDomain(UsuarioRequestDTO usuario);

	UsuarioResponseDTO toResponseDTO(Usuario usuario);
	



}
