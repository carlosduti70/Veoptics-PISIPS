package com.uisrael.veoptics.dominio.repositorios;

import java.util.List;
import java.util.Optional;

import com.uisrael.veoptics.dominio.entidades.Optometrista;

public interface IOptometristaRepositorio {

	Optometrista guardar(Optometrista optometrista);

	Optional<Optometrista> buscarPorId(int id);

	Optional<Optometrista> buscarPorIdUsuario(int idUsuario);

	List<Optometrista> listarTodos();

	void eliminar(int id);

	boolean existePorRegistroProfesional(String registroProfesional);

	boolean existePorTelefono(String telefono);

	Optometrista actualizar(Optometrista optometrista);

	boolean existePorRegistroProfesionalYNoId(String registroProfesional, int idOptometrista);

	boolean existePorTelefonoYNoId(String telefono, int idOptometrista);
}
