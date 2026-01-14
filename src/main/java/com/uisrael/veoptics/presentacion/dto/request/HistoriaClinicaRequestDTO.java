package com.uisrael.veoptics.presentacion.dto.request;

import java.time.LocalDate;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;
@Data
public class HistoriaClinicaRequestDTO {
	
	// private  int idHistoria;
	@NotBlank
	private  String antecedente;
	@NotBlank
	private  String diagnostico;
	@NotBlank
	private  String notasClinica;
	@NotBlank
	private  LocalDate fecha;
	@NotBlank
	private  char estado;
}
