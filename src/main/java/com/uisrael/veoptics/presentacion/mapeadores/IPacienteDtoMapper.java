package com.uisrael.veoptics.presentacion.mapeadores;

import org.mapstruct.Mapper;

import com.uisrael.veoptics.dominio.entidades.Paciente;
import com.uisrael.veoptics.presentacion.dto.request.PacienteRequestDTO;
import com.uisrael.veoptics.presentacion.dto.response.PacienteResponseDTO;

@Mapper(componentModel = "spring")
public interface IPacienteDtoMapper {

	Paciente toDomain(PacienteRequestDTO paciente);

	PacienteResponseDTO toResponseDto(Paciente paciente);

}
