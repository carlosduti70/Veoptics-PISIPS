package com.uisrael.veoptics.presentacion.controladores;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

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

import com.uisrael.veoptics.aplicacion.casouso.entradas.IUsuarioCasoUso;
import com.uisrael.veoptics.dominio.entidades.Usuario;
import com.uisrael.veoptics.presentacion.dto.request.UsuarioRequestDTO;
import com.uisrael.veoptics.presentacion.dto.request.UsuarioUpdateDTO;
import com.uisrael.veoptics.presentacion.dto.response.UsuarioResponseDTO;
import com.uisrael.veoptics.presentacion.mapeadores.IUsuarioDtoMapper;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/usuario")
@CrossOrigin(origins = "http://localhost:4200")
public class UsuarioControlador {

	// dependencias de la arquitectura
	private final IUsuarioCasoUso usuarioCasoUso;// casos de uso
	private final IUsuarioDtoMapper mapper;// mapeadores

	public UsuarioControlador(IUsuarioCasoUso usuarioCasoUso, IUsuarioDtoMapper mapper) {
		this.usuarioCasoUso = usuarioCasoUso;
		this.mapper = mapper;
	}

	@GetMapping("/listar")
	public List<UsuarioResponseDTO> listar() {
		return usuarioCasoUso.listar().stream().map(mapper::toResponseDto).toList();
	}

	@GetMapping("/findbyId")
	public ResponseEntity<UsuarioResponseDTO> obtenerPorId(@RequestParam("id") int id) {
		Usuario usuario = usuarioCasoUso.obtenerPorId(id);

		UsuarioResponseDTO respuesta = mapper.toResponseDto(usuario);

		return ResponseEntity.ok(respuesta);
	}

	// post
	@PostMapping("/crear")
	@ResponseStatus(HttpStatus.CREATED)
	public UsuarioResponseDTO crear(@Valid @RequestBody UsuarioRequestDTO request) {
		return mapper.toResponseDto(usuarioCasoUso.crear(mapper.toDomain(request)));
	}

	@PostMapping("/login")
	public ResponseEntity<?> login(@RequestParam("correo") String correo, @RequestParam("clave") String clave) {

		// 1. Llamar al caso de uso directamente con los strings recibidos
		Usuario usuarioLogueado = usuarioCasoUso.login(correo, clave);

		// 2. Convertir a Response
		UsuarioResponseDTO response = mapper.toResponseDto(usuarioLogueado);

		return ResponseEntity.ok(response);

	}

	@PutMapping("/actualizarclave")
	public ResponseEntity<?> actualizarClave(@RequestParam("idUsuario") int idUsuario,
			@RequestParam("nuevaClave") String nuevaClave) {
		try {
			usuarioCasoUso.actualizarClave(idUsuario, nuevaClave);

			Map<String, String> response = new HashMap<>();
			response.put("mensaje", "Contraseña actualizada correctamente. Por favor inicie sesión.");

			return ResponseEntity.ok(response);

		} catch (RuntimeException e) {
			Map<String, String> error = new HashMap<>();
			error.put("error", "Error al actualizar contraseña");
			error.put("detalle", e.getMessage());
			return ResponseEntity.badRequest().body(error);
		}
	}

	@PutMapping("/actualizar")
	public ResponseEntity<UsuarioResponseDTO> actualizarInformacion(@Valid @RequestBody UsuarioUpdateDTO request) {

		Usuario usuarioInput = mapper.toDomain(request);

		Usuario usuarioActualizado = usuarioCasoUso.actualizarInformacion(usuarioInput);

		return ResponseEntity.ok(mapper.toResponseDto(usuarioActualizado));
	}

}
