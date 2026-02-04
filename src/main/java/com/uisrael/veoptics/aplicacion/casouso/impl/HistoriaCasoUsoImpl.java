package com.uisrael.veoptics.aplicacion.casouso.impl;

import java.util.List;

import com.uisrael.veoptics.aplicacion.casouso.entradas.IHistoriaCasoUso;
import com.uisrael.veoptics.dominio.entidades.ExamenOptometrico;
import com.uisrael.veoptics.dominio.entidades.Historia;
import com.uisrael.veoptics.dominio.entidades.Optometrista;
import com.uisrael.veoptics.dominio.entidades.Paciente;
import com.uisrael.veoptics.dominio.repositorios.IExamenOptometricoRepositorio;
import com.uisrael.veoptics.dominio.repositorios.IHistoriaRepositorio;
import com.uisrael.veoptics.dominio.repositorios.IOptometristaRepositorio;
import com.uisrael.veoptics.dominio.repositorios.IPacienteRepositorio;

public class HistoriaCasoUsoImpl implements IHistoriaCasoUso {

	private final IHistoriaRepositorio repositorio;
	private final IPacienteRepositorio pacienteRepositorio;
	private final IOptometristaRepositorio optometristaRepositorio;
	private final IExamenOptometricoRepositorio examenRepositorio;

	public HistoriaCasoUsoImpl(IHistoriaRepositorio repositorio, IPacienteRepositorio pacienteRepositorio,
			IOptometristaRepositorio optometristaRepositorio, IExamenOptometricoRepositorio examenRepositorio) {
		super();
		this.repositorio = repositorio;
		this.pacienteRepositorio = pacienteRepositorio;
		this.optometristaRepositorio = optometristaRepositorio;
		this.examenRepositorio = examenRepositorio;
	}

	@Override
	public Historia crear(Historia historiaDesdeWeb) {
		System.out.println("Id del examen que se envia = " + historiaDesdeWeb.getExamen().getIdExamen());
		Paciente pacienteEnviado = pacienteRepositorio.buscarPorId(historiaDesdeWeb.getPaciente().getIdPaciente())
				.orElseThrow(() -> new RuntimeException("El paciente especificado no existe"));
		Optometrista optometristaEnviado = optometristaRepositorio
				.buscarPorId(historiaDesdeWeb.getOptometrista().getIdOptometrista())
				.orElseThrow(() -> new RuntimeException("El optometrista especificado no existe"));

		int idExamenSolicitado = historiaDesdeWeb.getExamen().getIdExamen();
		ExamenOptometrico examenEnviado = examenRepositorio.buscarPorId(idExamenSolicitado)
				.orElseThrow(() -> new RuntimeException("El Examen no fue encontrado"));
		
		repositorio.buscarPorIdExamen(idExamenSolicitado).ifPresent(o -> {
			throw new RuntimeException(
					"El examen  ya tiene asignado una historia.");
		});

		Historia historiaFinal = new Historia(historiaDesdeWeb.getIdHistoria(), historiaDesdeWeb.getAntecedente(),
				historiaDesdeWeb.getDiagnostico(), historiaDesdeWeb.getNotasClinica(), historiaDesdeWeb.getFecha(),
				historiaDesdeWeb.getMotivoConsulta(), pacienteEnviado, optometristaEnviado, examenEnviado);
		
		System.out.println("Examen Enviado a base = " + historiaFinal.getExamen().getIdExamen());

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

	@Override
	public Historia obtenerPorIdExamen(int idExamen) {
		// TODO Auto-generated method stub
		return repositorio.buscarPorIdExamen(idExamen)
				.orElseThrow(() -> new RuntimeException("Historia no encontrada por examen"));
	}

}
