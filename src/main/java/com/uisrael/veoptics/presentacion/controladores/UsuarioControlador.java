package com.uisrael.veoptics.presentacion.controladores;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.uisrael.veoptics.aplicacion.casouso.entradas.IUsuarioCasoUso;
import com.uisrael.veoptics.presentacion.dto.request.UsuarioRequestDTO;
import com.uisrael.veoptics.presentacion.dto.response.UsuarioResponseDTO;
import com.uisrael.veoptics.presentacion.mapeadores.IUsuarioDtoMapper;

import jakarta.validation.Valid;



@RestController
@RequestMapping("/usuario")
public class UsuarioControlador {
	

	
	// dependencias de la arquitectura
			private final IUsuarioCasoUso usuarioCasoUso;// casos de uso
			private final IUsuarioDtoMapper mapper;// mapeadores
			
			public UsuarioControlador(IUsuarioCasoUso usuarioCasoUso, IUsuarioDtoMapper mapper) {
				super();
				this.usuarioCasoUso = usuarioCasoUso;
				this.mapper = mapper;
			}
			
			@GetMapping("/listar")
			public List<UsuarioResponseDTO> listar() {
				return usuarioCasoUso.listar().stream().map(mapper::toResponseDto).toList();
				}

				// post
			@PostMapping("/crear")
			@ResponseStatus(HttpStatus.CREATED)
			
			public UsuarioResponseDTO crear(@Valid @RequestBody UsuarioRequestDTO request) {
				return mapper.toResponseDto(usuarioCasoUso.crear(mapper.toDomain(request)));
				}
			

}
