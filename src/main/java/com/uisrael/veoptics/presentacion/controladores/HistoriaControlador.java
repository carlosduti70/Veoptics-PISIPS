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

import com.uisrael.veoptics.aplicacion.casouso.entradas.IHistoriaCasoUso;
import com.uisrael.veoptics.presentacion.dto.request.HistoriaRequestDTO;
import com.uisrael.veoptics.presentacion.dto.response.HistoriaResponseDTO;
import com.uisrael.veoptics.presentacion.mapeadores.IHistoriaDtoMapper;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/historia")
@CrossOrigin(origins = "http://localhost:4200")
public class HistoriaControlador {
	
	
	// dependencias de la arquitectura
		private final IHistoriaCasoUso historiaCasoUso;// casos de uso
		private final IHistoriaDtoMapper mapper;// mapeadores
		
		public HistoriaControlador(IHistoriaCasoUso historiaCasoUso, IHistoriaDtoMapper mapper) {
			
			super();
			this.historiaCasoUso = historiaCasoUso;
			this.mapper = mapper;
			
			}
		
		@GetMapping("/listar")
		public List<HistoriaResponseDTO> listar() {
			return historiaCasoUso.listar().stream().map(mapper::toResponseDto).toList();
			}

			// post
		@PostMapping("/crear")
		@ResponseStatus(HttpStatus.CREATED)
		
		public HistoriaResponseDTO crear(@Valid @RequestBody HistoriaRequestDTO request) {
			return mapper.toResponseDto(historiaCasoUso.crear(mapper.toDomain(request)));
			}

}
