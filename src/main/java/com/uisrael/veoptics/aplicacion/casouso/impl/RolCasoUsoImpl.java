package com.uisrael.veoptics.aplicacion.casouso.impl;
import java.util.List;


import com.uisrael.veoptics.aplicacion.casouso.entradas.IRolCasoUso;
import com.uisrael.veoptics.dominio.entidades.Rol;
import com.uisrael.veoptics.dominio.repositorios.IRolRepositorio;

public class RolCasoUsoImpl implements IRolCasoUso {
	
	private final IRolRepositorio repositorio;
	

	public RolCasoUsoImpl(IRolRepositorio repositorio) {
		this.repositorio = repositorio;
	}

	@Override
	public Rol crear(Rol rol) {
		
		return repositorio.guardar(rol);
	}

	@Override
	public Rol obtenerPorId(int id) {
		
		return repositorio.buscarRolPorId(id).orElseThrow(()->new RuntimeException("Rol no encontrado"));
	}

	@Override
	public List<Rol> listar() {
	
		return repositorio.listarTodos();
	}

	@Override
	public void eliminar(int id) {
		repositorio.eliminar(id);
		
	}

}
