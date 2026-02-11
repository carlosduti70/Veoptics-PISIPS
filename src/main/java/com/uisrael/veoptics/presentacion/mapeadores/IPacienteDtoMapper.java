package com.uisrael.veoptics.presentacion.mapeadores;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.uisrael.veoptics.dominio.entidades.Paciente;
import com.uisrael.veoptics.presentacion.dto.request.PacienteRequestDTO;
import com.uisrael.veoptics.presentacion.dto.request.PacienteUpdateDTO;
import com.uisrael.veoptics.presentacion.dto.response.PacienteResponseDTO;

@Mapper(componentModel = "spring")
public interface IPacienteDtoMapper {

	@Mapping(target = "idPaciente", ignore = true)
	@Mapping(target = "fecRegistro", expression = "java(java.time.LocalDate.now())")
	Paciente toDomain(PacienteRequestDTO paciente);

	@Mapping(target = "fecRegistro", ignore = true)
	Paciente toDomainUpdate(PacienteUpdateDTO request);

	PacienteResponseDTO toResponseDto(Paciente paciente);

}
