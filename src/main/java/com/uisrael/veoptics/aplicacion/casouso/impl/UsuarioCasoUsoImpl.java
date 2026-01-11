package com.uisrael.veoptics.aplicacion.casouso.impl;

import java.util.List;
import java.util.Optional;

import com.uisrael.veoptics.aplicacion.casouso.entradas.IUsuarioCasoUso;
import com.uisrael.veoptics.dominio.entidades.Usuario;
import com.uisrael.veoptics.dominio.repositorios.IUsuarioRepositorio;

public class UsuarioCasoUsoImpl implements IUsuarioCasoUso{
	
	
	private final IUsuarioRepositorio repositorio;
	
	

	public UsuarioCasoUsoImpl(IUsuarioRepositorio repositorio) {
		
		this.repositorio = repositorio;
	}



	@Override
	public Usuario crear(Usuario usuario) {
	
		return repositorio.guardar(usuario);
	}



	@Override
	public Usuario obtenerPorId(int id) {
		
		return repositorio.buscarPorId(id).orElseThrow(() -> new RuntimeException("Paciente no encontrado"));
	}



	@Override
	public List<Usuario> listar() {
		
		return repositorio.listarTodos();
	}



	@Override
	public void eliminar(int id) {
		repositorio.eliminar(id);
		
	}



}
