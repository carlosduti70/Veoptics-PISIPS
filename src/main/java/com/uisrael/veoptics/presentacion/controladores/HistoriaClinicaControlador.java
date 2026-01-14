package com.uisrael.veoptics.presentacion.controladores;

import java.util.List;

import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.uisrael.veoptics.aplicacion.casouso.entradas.IHistoriaClinicaCasoUso;
import com.uisrael.veoptics.presentacion.dto.request.HistoriaClinicaRequestDTO;
import com.uisrael.veoptics.presentacion.dto.response.HistoriaCliniciaResponseDTO;
import com.uisrael.veoptics.presentacion.mapeadores.IHistoriaClinicaDtoMapper;

@RestController
@RequestMapping("/historiaC")
public class HistoriaClinicaControlador {

	private final IHistoriaClinicaCasoUso historiaCasoUso;
	private final IHistoriaClinicaDtoMapper mapper;
	
	public HistoriaClinicaControlador(IHistoriaClinicaCasoUso historiaCasoUso, IHistoriaClinicaDtoMapper mapper) {
	
		this.historiaCasoUso = historiaCasoUso;
		this.mapper = mapper;
	}
	
	@GetMapping("/listar")
	public List<HistoriaCliniciaResponseDTO> listar(){
		return historiaCasoUso.listar().stream().map(mapper::toResponseDTO).toList();
	}
	
	@PostMapping("/crear")
	public HistoriaCliniciaResponseDTO crear(@Validated @RequestBody HistoriaClinicaRequestDTO request) {
		return mapper.toResponseDTO(historiaCasoUso.crear(mapper.toDomain(request)));
	}
	
}
