package com.uisrael.veoptics.presentacion.controladores;

import java.util.List;
import java.util.Optional;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.uisrael.veoptics.aplicacion.casouso.entradas.IOptometristaCasoUso;
import com.uisrael.veoptics.dominio.entidades.Optometrista;
import com.uisrael.veoptics.presentacion.dto.request.OptometristaRequestDTO;
import com.uisrael.veoptics.presentacion.dto.request.OptometristaUpdateDTO;
import com.uisrael.veoptics.presentacion.dto.response.OptometristaResponseDTO;
import com.uisrael.veoptics.presentacion.mapeadores.IOptometristaDtoMapper;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/optometrista")
@CrossOrigin(origins = "https://veoptics-pisips-front-jeriq35cu-carlosduti70s-projects.vercel.app")
public class OptometristaControlador {
	// dependencias de la arquitectura
	private final IOptometristaCasoUso optometristaCasoUso;// casos de uso
	private final IOptometristaDtoMapper mapper;// mapeadores

	public OptometristaControlador(IOptometristaCasoUso optometristaCasoUso, IOptometristaDtoMapper mapper) {
		this.optometristaCasoUso = optometristaCasoUso;
		this.mapper = mapper;

	}

	@GetMapping("/listar")
	public List<OptometristaResponseDTO> listar() {
		return optometristaCasoUso.listar().stream().map(mapper::toResponseDto).toList();
	}

	@GetMapping("/buscarUsuario")
	public ResponseEntity<OptometristaResponseDTO> buscarPorUsuario(@RequestParam("id") int idUsuario) {
		Optometrista optometrista = optometristaCasoUso.obtenerPorIdUsurio(idUsuario);

		OptometristaResponseDTO respuesta = mapper.toResponseDto(optometrista);

		return ResponseEntity.ok(respuesta);
	}

	// post
	@PostMapping("/crear")
	@ResponseStatus(HttpStatus.CREATED)

	public OptometristaResponseDTO crear(@Valid @RequestBody OptometristaRequestDTO request) {
		return mapper.toResponseDto(optometristaCasoUso.crear(mapper.toDomain(request)));
	}

	@PutMapping("/actualizar")
	public OptometristaResponseDTO actualizarinformacion(@Valid @RequestBody OptometristaUpdateDTO request) {
		return mapper.toResponseDto(optometristaCasoUso.actualizarDatos(mapper.toDomain(request)));
	}

}
