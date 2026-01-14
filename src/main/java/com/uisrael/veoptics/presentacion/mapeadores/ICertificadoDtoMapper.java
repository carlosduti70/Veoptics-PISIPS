package com.uisrael.veoptics.presentacion.mapeadores;

import org.mapstruct.Mapper;

import com.uisrael.veoptics.dominio.entidades.Certificado;
import com.uisrael.veoptics.dominio.entidades.Optometrista;
import com.uisrael.veoptics.presentacion.dto.request.CertificadoRequestDTO;
import com.uisrael.veoptics.presentacion.dto.response.CertificadoResponseDTO;


@Mapper(componentModel = "spring")
public interface ICertificadoDtoMapper {
	
	Certificado toDomain(CertificadoRequestDTO certificado);
	CertificadoResponseDTO toResponseDto(Certificado certificado);

}


