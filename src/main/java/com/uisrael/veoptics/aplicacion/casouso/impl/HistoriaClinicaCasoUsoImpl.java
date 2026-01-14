package com.uisrael.veoptics.aplicacion.casouso.impl;

import java.util.List;

import com.uisrael.veoptics.aplicacion.casouso.entradas.IHistoriaClinicaCasoUso;
import com.uisrael.veoptics.dominio.entidades.HistoriaClinica;
import com.uisrael.veoptics.dominio.repositorios.IHistoriaClinicaRepositorio;

public class HistoriaClinicaCasoUsoImpl implements IHistoriaClinicaCasoUso {

	private final IHistoriaClinicaRepositorio repositorio;
	
	public HistoriaClinicaCasoUsoImpl(IHistoriaClinicaRepositorio repositorio) {
		this.repositorio = repositorio;
	}

	@Override
	public HistoriaClinica crear(HistoriaClinica historiaC) {
		return repositorio.guardar(historiaC);
	}

	@Override
	public HistoriaClinica obtenerPorId(int id) {
		return repositorio.buscarPorID(id).orElseThrow(() -> new RuntimeException("Historia Clinica no encontrado"));
	}
	

	@Override
	public List<HistoriaClinica> listar() {
		
		return repositorio.listarTodos() ;
	}

	@Override
	public void eliminar(int id) {
		repositorio.eliminar(id);
	}

}
