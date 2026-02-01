package com.uisrael.veoptics.presentacion.dto.request;

import java.time.LocalDate;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;


@Data

public class HistoriaRequestDTO {
	
	
	// private  int id_historia;
	
	@NotBlank
	private  String antecedente;
	@NotBlank
	private  String diagnostico;
	@NotBlank
	private  String notasClinica;
	@NotBlank
	private  String motivoConsulta;
	@NotBlank
	private  LocalDate fecha;
	@NotBlank
	private  int idPaciente;
	@NotBlank
	private  int idOptometrista;
	
	

}
