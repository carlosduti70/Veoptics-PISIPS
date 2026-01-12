package com.uisrael.veoptics.dominio.repositorios;

import java.util.List;
import java.util.Optional;

import com.uisrael.veoptics.dominio.entidades.Rol;

public interface IRolRepositorio {
	Rol guardar(Rol rol);
	Optional<Rol> buscarPorId(int id);
	List<Rol> listarTodos();
	void eliminar(int id);

}
