package com.uisrael.veoptics.dominio.repositorios;

import java.util.List;
import java.util.Optional;

import com.uisrael.veoptics.dominio.entidades.Paciente;

public interface IPacienteRepositorio {

	Paciente guardar(Paciente paciente);

	Optional<Paciente> buscarPorId(int id);

	List<Paciente> listarTodos();

	void eliminar(int id);

}
