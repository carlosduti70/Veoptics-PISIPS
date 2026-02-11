package com.uisrael.veoptics.presentacion.dto.request;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class OptometristaUpdateDTO {
	@NotNull(message = "El ID es obligatorio")
    private Integer idOptometrista;

    @NotBlank(message = "El registro es obligatorio")
    private String registroProfesional;

    @NotBlank(message = "El teléfono es obligatorio")
    private String telefono;

    private char estado;
}
