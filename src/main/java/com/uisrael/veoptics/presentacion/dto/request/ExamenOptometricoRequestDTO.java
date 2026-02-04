package com.uisrael.veoptics.presentacion.dto.request;

import java.time.LocalDate;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class ExamenOptometricoRequestDTO {

	@NotBlank
	private int idExamen;
	@NotBlank
	private LocalDate fecha;
	@NotBlank
	private String esferaOd;
	@NotBlank
	private String cilindroOd;
	@NotBlank
	private String ejeOd;
	@NotBlank
	private String adicionOd;
	@NotBlank
	private String agudezaVisualLejosOd;
	@NotBlank
	private String agudezaVisualCercaOd;
	@NotBlank
	private String dnpOd;
	@NotBlank
	private String alturaOd;
	@NotBlank
	private String esferaOi;
	@NotBlank
	private String cilindroOi;
	@NotBlank
	private String ejeOi;
	@NotBlank
	private String adicionOi;
	@NotBlank
	private String agudezaVisualLejosOi;
	@NotBlank
	private String agudezaVisualCercaOi;
	@NotBlank
	private String dnpOi;
	@NotBlank
	private String alturaOi;
	@NotBlank
	private String diagnostico;
	@NotBlank
	private String visionCercana;
	@NotBlank
	private String visionLejana;
	@NotBlank
	private String percepcionColores;
	@NotBlank
	private String coloresVisibles;

	@NotNull(message = "El ID del paciente es obligatorio")
	private int idPaciente;
	@NotNull(message = "El ID del optometrista es obligatorio")
	private int idOptometrista;

}
