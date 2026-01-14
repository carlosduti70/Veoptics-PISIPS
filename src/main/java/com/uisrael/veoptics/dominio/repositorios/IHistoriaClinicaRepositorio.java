package com.uisrael.veoptics.dominio.repositorios;

import java.util.List;
import java.util.Optional;

import com.uisrael.veoptics.dominio.entidades.HistoriaClinica;

public interface IHistoriaClinicaRepositorio {

	HistoriaClinica guardar (HistoriaClinica historiaC);
	Optional<HistoriaClinica> buscarPorID(int id);
	List<HistoriaClinica> listarTodos();
	void eliminar(int id);
}
