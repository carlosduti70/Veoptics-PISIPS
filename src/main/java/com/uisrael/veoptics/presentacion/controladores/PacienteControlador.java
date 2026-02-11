package com.uisrael.veoptics.presentacion.controladores;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.uisrael.veoptics.aplicacion.casouso.entradas.IPacienteCasoUso;
import com.uisrael.veoptics.dominio.entidades.Paciente;
import com.uisrael.veoptics.presentacion.dto.request.PacienteRequestDTO;
import com.uisrael.veoptics.presentacion.dto.request.PacienteUpdateDTO;
import com.uisrael.veoptics.presentacion.dto.response.PacienteResponseDTO;
import com.uisrael.veoptics.presentacion.mapeadores.IPacienteDtoMapper;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/paciente")
@CrossOrigin(origins = "http://localhost:4200")
public class PacienteControlador {

	// dependencias de la arquitectura
	private final IPacienteCasoUso pacienteCasoUso;// casos de uso
	private final IPacienteDtoMapper mapper;// mapeadores

	public PacienteControlador(IPacienteCasoUso pacienteCasoUso, IPacienteDtoMapper mapper) {
		super();
		this.pacienteCasoUso = pacienteCasoUso;
		this.mapper = mapper;
	}

	@GetMapping("/listar")
	public List<PacienteResponseDTO> listar() {
		return pacienteCasoUso.listar().stream().map(mapper::toResponseDto).toList();
	}

	// post
	@PostMapping("/crear")
	@ResponseStatus(HttpStatus.CREATED)
	public PacienteResponseDTO crear(@Valid @RequestBody PacienteRequestDTO request) {
		return mapper.toResponseDto(pacienteCasoUso.crear(mapper.toDomain(request)));
	}

	@PutMapping("/actualizar")
	public ResponseEntity<PacienteResponseDTO> actualizar(@Valid @RequestBody PacienteUpdateDTO request) {
		Paciente pacienteInput = mapper.toDomainUpdate(request);

		Paciente pacienteActualizado = pacienteCasoUso.actualizarDatos(pacienteInput);

		return ResponseEntity.ok(mapper.toResponseDto(pacienteActualizado));
	}

}
