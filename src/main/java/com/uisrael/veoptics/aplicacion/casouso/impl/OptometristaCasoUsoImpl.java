package com.uisrael.veoptics.aplicacion.casouso.impl;

import java.util.List;

import com.uisrael.veoptics.aplicacion.casouso.entradas.IOptometristaCasoUso;
import com.uisrael.veoptics.dominio.entidades.Optometrista;
import com.uisrael.veoptics.infraestructura.repositorios.IOptometristaRepositorio;

public class OptometristaCasoUsoImpl implements IOptometristaCasoUso {
	
	private final IOptometristaRepositorio repositorio;
	
	public OptometristaCasoUsoImpl(IOptometristaRepositorio repositorio) {
		this.repositorio=repositorio;		
	}
	@Override
	public Optometrista crear (Optometrista optometrista) {
		return repositorio.guardar(optometrista);
	}
	@Override
	public Optometrista obtenerPorId(int id) {
		return repositorio.buscarPorId(id).orElseThrow(() -> new RuntimeException("Optometrista no encontrado"));
	}
	@Override
	public List<Optometrista> listar() {
		return repositorio.listarTodos();
	}

	@Override
	public void eliminar(int id) {
		repositorio.eliminar(id);
	}
	

}
