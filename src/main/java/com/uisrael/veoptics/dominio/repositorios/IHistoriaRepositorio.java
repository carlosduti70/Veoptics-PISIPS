package com.uisrael.veoptics.dominio.repositorios;

import java.util.List;
import java.util.Optional;

import com.uisrael.veoptics.dominio.entidades.Historia;

public interface IHistoriaRepositorio {

	Historia guardar(Historia historia);

	Optional<Historia> buscarPorId(int id);
	
	Optional<Historia> buscarPorIdExamen(int idExamen);

	List<Historia> listarTodos();

	void eliminar(int id);

}
