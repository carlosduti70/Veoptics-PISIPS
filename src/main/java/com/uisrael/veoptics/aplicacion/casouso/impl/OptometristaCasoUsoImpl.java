package com.uisrael.veoptics.aplicacion.casouso.impl;

import java.util.List;

import com.uisrael.veoptics.aplicacion.casouso.entradas.IOptometristaCasoUso;
import com.uisrael.veoptics.dominio.entidades.Optometrista;
import com.uisrael.veoptics.dominio.entidades.Usuario;
import com.uisrael.veoptics.dominio.repositorios.IOptometristaRepositorio;
import com.uisrael.veoptics.dominio.repositorios.IUsuarioRepositorio;

public class OptometristaCasoUsoImpl implements IOptometristaCasoUso {

	private final IOptometristaRepositorio repositorio;
	private final IUsuarioRepositorio usuarioRepositorio;

	public OptometristaCasoUsoImpl(IOptometristaRepositorio repositorio, IUsuarioRepositorio usuarioRepositorio) {
		super();
		this.repositorio = repositorio;
		this.usuarioRepositorio = usuarioRepositorio;
	}

	@Override
	public Optometrista crear(Optometrista optometristaDesdeWeb) {
		Usuario usuarioValidado = usuarioRepositorio.buscarPorId(optometristaDesdeWeb.getUsuario().getIdUsuario())
				.orElseThrow(() -> new RuntimeException("El Usuario especificado no existe"));
		repositorio.buscarPorIdUsuario(optometristaDesdeWeb.getUsuario().getIdUsuario()).ifPresent(o -> {
			throw new RuntimeException(
					"El usuario " + usuarioValidado.getNombre() + " ya tiene asignado un perfil de Optometrista.");
		});

		Optometrista optometristaFinal = new Optometrista(optometristaDesdeWeb.getIdOptometrista(),
				optometristaDesdeWeb.getRegistroProfesional(), optometristaDesdeWeb.getTelefono(),
				optometristaDesdeWeb.getEstado(), usuarioValidado);
		return repositorio.guardar(optometristaFinal);
	}

	@Override
	public Optometrista obtenerPorId(int id) {
		return repositorio.buscarPorId(id).orElseThrow(() -> new RuntimeException("Optometrista no encontrado"));
	}
	
	@Override
	public Optometrista obtenerPorIdUsurio(int idUsuario) {
		return repositorio.buscarPorIdUsuario(idUsuario).orElseThrow(() -> new RuntimeException("Optometrista con idUsuario " + idUsuario + " No encontrado"));
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
