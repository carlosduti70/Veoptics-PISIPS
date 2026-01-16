package com.uisrael.veoptics.aplicacion.casouso.impl;

import java.util.List;

import com.uisrael.veoptics.aplicacion.casouso.entradas.IExamenOptometricoCasoUso;

public class ExamenOptometricoCasoUsoImpl implements IExamenOptometricoCasoUso {
	
	private final IExamenOptometricoRepositorio repositorio;

	public ExamenOptometricoCasoUsoImpl(IExamenOptometricoRepositorio repositorio) {
		this.repositorio = repositorio;
	}
	@Override
	public ExamenOptometrico crear(ExamenOptometrico examenoptometrico) {
		return repositorio.guardar(examenoptometrico);
	}
	@Override
	public ExamenOptometrico obtenerPorId(int id) {
		return repositorio.buscarPorId(id).orElseThrow(() -> new RuntimeException("Dato no encontrado"));
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
