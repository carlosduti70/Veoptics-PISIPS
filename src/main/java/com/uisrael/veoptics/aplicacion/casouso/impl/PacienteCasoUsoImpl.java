package com.uisrael.veoptics.aplicacion.casouso.impl;

import java.time.LocalDate;
import java.util.List;

import com.uisrael.veoptics.aplicacion.casouso.entradas.IPacienteCasoUso;
import com.uisrael.veoptics.dominio.entidades.Paciente;
import com.uisrael.veoptics.dominio.repositorios.IPacienteRepositorio;

import jakarta.transaction.Transactional;

public class PacienteCasoUsoImpl implements IPacienteCasoUso {

	private final IPacienteRepositorio repositorio;

	public PacienteCasoUsoImpl(IPacienteRepositorio repositorio) {
		this.repositorio = repositorio;
	}

	@Override
	public Paciente crear(Paciente paciente) {
		if (repositorio.existePorCi(paciente.getCi())) {
			throw new RuntimeException("La cédula ya está registrada");
		}
		if (repositorio.existePorCorreo(paciente.getCorreo())) {
			throw new RuntimeException("El correo ya está registrado");
		}
		if (repositorio.existePorTelefono(paciente.getTelefono())) {
			throw new RuntimeException("El teléfono ya está registrado");
		}
		validarEdadMinima(paciente.getFecNacimiento());

		return repositorio.guardar(paciente);
	}

	@Override
	public Paciente obtenerPorId(int id) {
		return repositorio.buscarPorId(id).orElseThrow(() -> new RuntimeException("Paciente no encontrado"));
	}

	@Override
	public List<Paciente> listar() {
		return repositorio.listarTodos();
	}

	@Override
	public void eliminar(int id) {
		repositorio.eliminar(id);
	}

	@Override
	@Transactional
	public Paciente actualizarDatos(Paciente pacienteWeb) {
		if (repositorio.buscarPorId(pacienteWeb.getIdPaciente()).isEmpty()) {
			throw new RuntimeException("Paciente no encontrado");
		}
		if (repositorio.existePorCiYNoId(pacienteWeb.getCi(), pacienteWeb.getIdPaciente())) {
			throw new RuntimeException("La cédula ya pertenece a otro paciente");
		}
		if (repositorio.existePorCorreoYNoId(pacienteWeb.getCorreo(), pacienteWeb.getIdPaciente())) {
			throw new RuntimeException("El correo ya pertenece a otro paciente");
		}
		if (repositorio.existePorTelefonoYNoId(pacienteWeb.getTelefono(), pacienteWeb.getIdPaciente())) {
			throw new RuntimeException("El teléfono ya pertenece a otro paciente");
		}
		validarEdadMinima(pacienteWeb.getFecNacimiento());

		repositorio.actualizar(pacienteWeb);
		return pacienteWeb;
	}

	private void validarEdadMinima(LocalDate fecNacimiento) {
		LocalDate fechaMinima = LocalDate.now().minusYears(1);
		if (fecNacimiento.isAfter(fechaMinima)) {
			throw new RuntimeException("El paciente debe tener al menos un año de edad");
		}
	}

}
