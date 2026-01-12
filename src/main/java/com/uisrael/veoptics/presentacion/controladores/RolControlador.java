package com.uisrael.veoptics.presentacion.controladores;


import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.uisrael.veoptics.aplicacion.casouso.entradas.IRolCasoUso;
import com.uisrael.veoptics.presentacion.dto.request.RolRequestDTO;
import com.uisrael.veoptics.presentacion.dto.response.RolResponseDTO;
import com.uisrael.veoptics.presentacion.mapeadores.IRolDtoMapper;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/rol")
public class RolControlador {
	
	private final IRolCasoUso rolCasoUso;
	private final IRolDtoMapper mapper;
	
	public RolControlador(IRolCasoUso rolCasoUso, IRolDtoMapper mapper) {
		this.rolCasoUso = rolCasoUso;
		this.mapper = mapper;
	}
	
	@GetMapping("/listar")
	public List<RolResponseDTO> listar() {
		return rolCasoUso.listar().stream().map(mapper::toResponseDto).toList();
	}
	
	@PostMapping("/crear")
	@ResponseStatus(HttpStatus.CREATED)
	public RolResponseDTO crear(@Valid @RequestBody RolRequestDTO request) {
		return mapper.toResponseDto(rolCasoUso.crear(mapper.toDomain(request)));
	}
	
}
