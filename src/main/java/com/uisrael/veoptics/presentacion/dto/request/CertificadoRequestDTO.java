package com.uisrael.veoptics.presentacion.dto.request;

import java.time.LocalDate;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data

public class CertificadoRequestDTO {
	
	
	// private  int id_certificado;
	
	@NotBlank
	private  LocalDate tbl_fecha_emision;
	@NotBlank
	private  String tbl_informacion_certificado;
	@NotBlank
	private  String tbl_ruta_pdf;
	

}
