package com.uisrael.veoptics.presentacion.controladores;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.uisrael.veoptics.aplicacion.casouso.entradas.IOptometristaCasoUso;
import com.uisrael.veoptics.presentacion.dto.request.OptometristaRequestDTO;
import com.uisrael.veoptics.presentacion.dto.response.OptometristaResponseDTO;
import com.uisrael.veoptics.presentacion.mapeadores.IOptometristaDtoMapper;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/optometrista")
public class OptometristaControlador {
	// dependencias de la arquitectura
		private final IOptometristaCasoUso optometristaCasoUso;// casos de uso
		private final IOptometristaDtoMapper mapper;// mapeadores

		public OptometristaControlador(IOptometristaCasoUso optometristaCasoUso, IOptometristaDtoMapper mapper) {
			super();
			this.optometristaCasoUso = optometristaCasoUso;
			this.mapper = mapper;
		}

		@GetMapping("/listar")
		public List<OptometristaResponseDTO> listar() {
			return optometristaCasoUso.listar().stream().map(mapper::toResponseDto).toList();
		}

		// post
		@PostMapping("/crear")
		@ResponseStatus(HttpStatus.CREATED)
		public OptometristaResponseDTO crear(@Valid @RequestBody OptometristaRequestDTO request) {
			return mapper.toResponseDto(optometristaCasoUso.crear(mapper.toDomain(request)));
		}

}
