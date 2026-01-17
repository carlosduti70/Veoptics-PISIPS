package com.uisrael.veoptics.presentacion.dto.request;

import java.time.LocalDate;

import jakarta.validation.constraints.NotBlank;

public class ExamenOptometricoRequestDTO {
	
	@NotBlank
	private LocalDate fecha;
	@NotBlank
	private String esfera_od;
	@NotBlank
	private String cilindro_od;
	@NotBlank
	private String eje_od;
	@NotBlank
	private String esfera_oi;
	@NotBlank
	private String cilindro_oi;
	@NotBlank
	private String eje_oi;
	@NotBlank
	private String adicion_od;
	@NotBlank
	private String adicion_oi;
	@NotBlank
	private String agudeza_visual_cerca_oi;
	@NotBlank
	private String agudeza_visual_lejos_oi;
	@NotBlank
	private String agudeza_visual_lejos_od;
	@NotBlank
	private String agudeza_visual_cerca_od;
	@NotBlank
	private String altura_oi;
	@NotBlank
	private String altura_od;

}
