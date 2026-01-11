package com.uisrael.veoptics.aplicacion.casouso.impl;

import java.util.List;

import com.uisrael.veoptics.aplicacion.casouso.entradas.IPacienteCasoUso;
import com.uisrael.veoptics.dominio.entidades.Paciente;
import com.uisrael.veoptics.dominio.repositorios.IPacienteRepositorio;

public class PacienteCasoUsoImpl implements IPacienteCasoUso {

	private final IPacienteRepositorio repositorio;

	public PacienteCasoUsoImpl(IPacienteRepositorio repositorio) {
		this.repositorio = repositorio;
	}

	@Override
	public Paciente crear(Paciente paciente) {
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

}
