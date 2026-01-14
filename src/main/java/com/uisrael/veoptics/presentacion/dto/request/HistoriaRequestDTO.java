package com.uisrael.veoptics.presentacion.dto.request;

import java.time.LocalDate;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;


@Data

public class HistoriaRequestDTO {
	
	
	// private  int id_historia;
	
	@NotBlank
	private  String tbl_antecedente;
	@NotBlank
	private  String tbl_diagnostico;
	@NotBlank
	private  String tbl_notas_clinica;
	@NotBlank
	private  LocalDate tbl_fecha;
	

}
