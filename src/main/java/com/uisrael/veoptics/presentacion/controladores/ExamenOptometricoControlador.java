package com.uisrael.veoptics.presentacion.controladores;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.uisrael.veoptics.aplicacion.casouso.entradas.IExamenOptometricoCasoUso;
import com.uisrael.veoptics.presentacion.dto.request.ExamenOptometricoRequestDTO;
import com.uisrael.veoptics.presentacion.dto.response.ExamenOptometricoResponseDTO;
import com.uisrael.veoptics.presentacion.mapeadores.IExamenOptometricoDtoMapper;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/examenoptometrico")
@CrossOrigin(origins = "http://localhost:4200")
public class ExamenOptometricoControlador {
	// dependencias de la arquitectura
			private final IExamenOptometricoCasoUso examenoptometricoCasoUso;// casos de uso
			private final IExamenOptometricoDtoMapper mapper;// mapeadores
			
			public ExamenOptometricoControlador(IExamenOptometricoCasoUso examenoptometricoCasoUso, IExamenOptometricoDtoMapper mapper) {
				
				super();
				this.examenoptometricoCasoUso = examenoptometricoCasoUso;
				this.mapper = mapper;
				
				}
			
			@GetMapping("/listar")
			public List<ExamenOptometricoResponseDTO> listar() {
				return examenoptometricoCasoUso.listar().stream().map(mapper::toResponseDto).toList();
				}

				// post
			@PostMapping("/crear")
			@ResponseStatus(HttpStatus.CREATED)
			
			public ExamenOptometricoResponseDTO crear(@Valid @RequestBody ExamenOptometricoRequestDTO request) {
				return mapper.toResponseDto(examenoptometricoCasoUso.crear(mapper.toDomain(request)));
				}

}
