package com.uisrael.veoptics.aplicacion.casouso.impl;

import java.util.List;

import com.uisrael.veoptics.aplicacion.casouso.entradas.IExamenOptometricoCasoUso;
import com.uisrael.veoptics.dominio.entidades.ExamenOptometrico;
import com.uisrael.veoptics.dominio.entidades.Optometrista;
import com.uisrael.veoptics.dominio.entidades.Paciente;
import com.uisrael.veoptics.dominio.repositorios.IExamenOptometricoRepositorio;
import com.uisrael.veoptics.dominio.repositorios.IOptometristaRepositorio;
import com.uisrael.veoptics.dominio.repositorios.IPacienteRepositorio;

public class ExamenOptometricoCasoUsoImpl implements IExamenOptometricoCasoUso {
	private final IExamenOptometricoRepositorio repositorio;
	private final IPacienteRepositorio pacienteRepositorio;
	private final IOptometristaRepositorio optometristaRepositorio;

	public ExamenOptometricoCasoUsoImpl(IExamenOptometricoRepositorio repositorio,
			IPacienteRepositorio pacienteRepositorio, IOptometristaRepositorio optometristaRepositorio) {
		this.repositorio = repositorio;
		this.pacienteRepositorio = pacienteRepositorio;
		this.optometristaRepositorio = optometristaRepositorio;
	}

	@Override
	public ExamenOptometrico crear(ExamenOptometrico examenoptometricoDesdeWeb) {
		Paciente pacienteEnviado = pacienteRepositorio
				.buscarPorId(examenoptometricoDesdeWeb.getPaciente().getIdPaciente())
				.orElseThrow(() -> new RuntimeException("El paciente especificado no existe"));
		Optometrista optometristaEnviado = optometristaRepositorio
				.buscarPorId(examenoptometricoDesdeWeb.getOptometrista().getIdOptometrista())
				.orElseThrow(() -> new RuntimeException("El optometrista especificado no existe"));

		ExamenOptometrico examenFinal = new ExamenOptometrico(examenoptometricoDesdeWeb.getIdExamen(),
				examenoptometricoDesdeWeb.getFecha(), examenoptometricoDesdeWeb.getEsferaOd(),
				examenoptometricoDesdeWeb.getCilindroOd(), examenoptometricoDesdeWeb.getEjeOd(),
				examenoptometricoDesdeWeb.getAdicionOd(), examenoptometricoDesdeWeb.getAgudezaVisualLejosOd(),
				examenoptometricoDesdeWeb.getAgudezaVisualCercaOd(), examenoptometricoDesdeWeb.getAlturaOd(),
				examenoptometricoDesdeWeb.getEsferaOi(), examenoptometricoDesdeWeb.getCilindroOi(),
				examenoptometricoDesdeWeb.getEjeOi(), examenoptometricoDesdeWeb.getAdicionOi(),
				examenoptometricoDesdeWeb.getAgudezaVisualLejosOi(),
				examenoptometricoDesdeWeb.getAgudezaVisualCercaOi(), examenoptometricoDesdeWeb.getAlturaOi(),
				examenoptometricoDesdeWeb.getDnpOi(), examenoptometricoDesdeWeb.getAlturaOi(),
				examenoptometricoDesdeWeb.getDiagnostico(), examenoptometricoDesdeWeb.getVisionCercana(),
				examenoptometricoDesdeWeb.getVisionLejana(), examenoptometricoDesdeWeb.getPercepcionColores(),
				examenoptometricoDesdeWeb.getColoresVisibles(), pacienteEnviado, optometristaEnviado);

		return repositorio.guardar(examenFinal);
	}

	@Override
	public ExamenOptometrico obtenerPorId(int id) {
		return repositorio.buscarPorId(id).orElseThrow(() -> new RuntimeException("ExamenOptometrico no encontrado"));
	}

	@Override
	public List<ExamenOptometrico> listar() {
		return repositorio.listarTodos();
	}

	@Override
	public void eliminar(int id) {
		repositorio.eliminar(id);
	}

}
