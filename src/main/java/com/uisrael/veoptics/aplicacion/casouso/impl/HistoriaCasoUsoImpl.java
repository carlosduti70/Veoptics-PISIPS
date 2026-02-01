package com.uisrael.veoptics.aplicacion.casouso.impl;

import java.util.List;

import com.uisrael.veoptics.aplicacion.casouso.entradas.IHistoriaCasoUso;
import com.uisrael.veoptics.dominio.entidades.Historia;
import com.uisrael.veoptics.dominio.entidades.Optometrista;
import com.uisrael.veoptics.dominio.entidades.Paciente;
import com.uisrael.veoptics.dominio.repositorios.IHistoriaRepositorio;
import com.uisrael.veoptics.dominio.repositorios.IOptometristaRepositorio;
import com.uisrael.veoptics.dominio.repositorios.IPacienteRepositorio;

public class HistoriaCasoUsoImpl implements IHistoriaCasoUso {

	private final IHistoriaRepositorio repositorio;
	private final IPacienteRepositorio pacienteRepositorio;
	private final IOptometristaRepositorio optometristaRepositorio;

	public HistoriaCasoUsoImpl(IHistoriaRepositorio repositorio, IPacienteRepositorio pacienteRepositorio,
			IOptometristaRepositorio optometristaRepositorio) {		this.repositorio = repositorio;
		this.pacienteRepositorio = pacienteRepositorio;
		this.optometristaRepositorio = optometristaRepositorio;
	}

	@Override
	public Historia crear(Historia historiaDesdeWeb) {
		Paciente pacienteEnviado = pacienteRepositorio.buscarPorId(historiaDesdeWeb.getPaciente().getIdPaciente())
				.orElseThrow(() -> new RuntimeException("El rol especificado no existe"));
		Optometrista optometristaEnviado = optometristaRepositorio
				.buscarPorId(historiaDesdeWeb.getOptometrista().getIdOptometrista())
				.orElseThrow(() -> new RuntimeException("El rol especificado no existe"));

		Historia historiaFinal = new Historia(historiaDesdeWeb.getIdHistoria(), historiaDesdeWeb.getAntecedente(),
				historiaDesdeWeb.getDiagnostico(), historiaDesdeWeb.getNotasClinica(), historiaDesdeWeb.getFecha(),
				historiaDesdeWeb.getMotivoConsulta(), pacienteEnviado, optometristaEnviado);

		return repositorio.guardar(historiaFinal);
	}

	@Override
	public Historia obtenerPorId(int id) {
		return repositorio.buscarPorId(id).orElseThrow(() -> new RuntimeException("Historia no encontrada"));
	}

	@Override
	public List<Historia> listar() {
		return repositorio.listarTodos();
	}

	@Override
	public void eliminar(int id) {
		repositorio.eliminar(id);

	}

}
