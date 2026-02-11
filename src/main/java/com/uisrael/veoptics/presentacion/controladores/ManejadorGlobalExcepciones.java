package com.uisrael.veoptics.presentacion.controladores;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ManejadorGlobalExcepciones {
	@ExceptionHandler(RuntimeException.class)
	public ResponseEntity<Map<String, String>> manejarValidaciones(RuntimeException ex) {

		Map<String, String> error = new HashMap<>();
		error.put("tipo", "Error");
		error.put("mensaje", ex.getMessage());

		return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(error);
	}
}
