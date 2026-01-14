package com.uisrael.veoptics.aplicacion.casouso.entradas;

import java.util.List;

import com.uisrael.veoptics.dominio.entidades.HistoriaClinica;

public interface IHistoriaClinicaCasoUso {
	HistoriaClinica crear(HistoriaClinica historiaC);

	HistoriaClinica obtenerPorId(int id);

	List<HistoriaClinica> listar();

	void eliminar(int id);
}
