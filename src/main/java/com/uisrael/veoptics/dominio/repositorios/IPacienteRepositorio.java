package com.uisrael.veoptics.dominio.repositorios;

import java.util.List;
import java.util.Optional;

import com.uisrael.veoptics.dominio.entidades.Paciente;

public interface IPacienteRepositorio {

	Paciente guardar(Paciente paciente);

	Optional<Paciente> buscarPorId(int id);

	List<Paciente> listarTodos();

	void eliminar(int id);

	boolean existePorCi(String ci);

	boolean existePorCorreo(String correo);

	boolean existePorTelefono(String telefono);

	boolean existePorCiYNoId(String ci, int idPaciente);

	boolean existePorCorreoYNoId(String correo, int idPaciente);

	boolean existePorTelefonoYNoId(String telefono, int idPaciente);

	Paciente actualizar(Paciente paciente);
}
