package com.uisrael.veoptics.presentacion.controladores;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.uisrael.veoptics.aplicacion.casouso.entradas.ICertificadoCasoUso;
import com.uisrael.veoptics.presentacion.dto.request.CertificadoRequestDTO;
import com.uisrael.veoptics.presentacion.dto.response.CertificadoResponseDTO;
import com.uisrael.veoptics.presentacion.mapeadores.ICertificadoDtoMapper;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/certificado")
public class CertificadoControlador {
	

	// dependencias de la arquitectura
		private final ICertificadoCasoUso certificadoCasoUso;// casos de uso
		private final ICertificadoDtoMapper mapper;// mapeadores
		
		public CertificadoControlador(ICertificadoCasoUso certificadoCasoUso, ICertificadoDtoMapper mapper) {
			
			super();
			this.certificadoCasoUso = certificadoCasoUso;
			this.mapper = mapper;
			
			}
		
		@GetMapping("/listar")
		public List<CertificadoResponseDTO> listar() {
			return certificadoCasoUso.listar().stream().map(mapper::toResponseDto).toList();
			}

			// post
		@PostMapping("/crear")
		@ResponseStatus(HttpStatus.CREATED)
		
		public CertificadoResponseDTO crear(@Valid @RequestBody CertificadoRequestDTO request) {
			return mapper.toResponseDto(certificadoCasoUso.crear(mapper.toDomain(request)));
			}

}
