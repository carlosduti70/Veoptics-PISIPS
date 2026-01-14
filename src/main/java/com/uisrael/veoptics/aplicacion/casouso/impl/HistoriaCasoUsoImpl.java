package com.uisrael.veoptics.aplicacion.casouso.impl;

import java.util.List;


import com.uisrael.veoptics.aplicacion.casouso.entradas.IHistoriaCasoUso;
import com.uisrael.veoptics.dominio.entidades.Historia;
import com.uisrael.veoptics.dominio.repositorios.IHistoriaRepositorio;

public class HistoriaCasoUsoImpl implements IHistoriaCasoUso{

	private final IHistoriaRepositorio repositorio;
	
	
	public HistoriaCasoUsoImpl(IHistoriaRepositorio repositorio) {
	
		this.repositorio = repositorio;
	}


	@Override
	public Historia crear(Historia historia) {
		return repositorio.guardar(historia);
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
