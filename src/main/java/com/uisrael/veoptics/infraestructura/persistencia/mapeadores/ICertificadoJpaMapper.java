package com.uisrael.veoptics.infraestructura.persistencia.mapeadores;

import org.mapstruct.Mapper;

import com.uisrael.veoptics.dominio.entidades.Certificado;

import com.uisrael.veoptics.infraestructura.persistencia.jpa.CertificadoJpa;



@Mapper(componentModel = "spring")
public interface ICertificadoJpaMapper {
	
	
	Certificado toDomain(CertificadoJpa entity);

	CertificadoJpa toEntity(Certificado certificado);


}
