package com.uisrael.veoptics.infraestructura.persistencia.mapeadores;

import org.mapstruct.Mapper;

import com.uisrael.veoptics.dominio.entidades.Paciente;
import com.uisrael.veoptics.infraestructura.persistencia.jpa.PacienteJpa;

@Mapper(componentModel = "spring")
public interface IPacienteJpaMapper {

	Paciente toDomain(PacienteJpa entity);

	PacienteJpa toEntity(Paciente paciente);

}
