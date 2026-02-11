package com.uisrael.veoptics.dominio.repositorios;

import java.util.List;
import java.util.Optional;

import com.uisrael.veoptics.dominio.entidades.ExamenOptometrico;

public interface IExamenOptometricoRepositorio {
	
	ExamenOptometrico guardar(ExamenOptometrico examenoptometrico);

	Optional<ExamenOptometrico> buscarPorId(int id);
	
	List<ExamenOptometrico> buscarPorIdPaciente(int idPaciente);

	List<ExamenOptometrico> listarTodos();

	void eliminar(int id);

}
