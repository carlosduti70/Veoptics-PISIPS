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
		if (repositorio.existePorRegistroProfesional(optometristaDesdeWeb.getRegistroProfesional())) {
			throw new RuntimeException("Registro profesional ya registrado");
		}
		if(repositorio.existePorTelefono(optometristaDesdeWeb.getTelefono())) {
			throw new RuntimeException("Teléfono ya registrado");
		}

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
		return repositorio.buscarPorIdUsuario(idUsuario)
				.orElseThrow(() -> new RuntimeException("Optometrista con idUsuario " + idUsuario + " No encontrado"));
	}

	@Override
	public List<Optometrista> listar() {
		return repositorio.listarTodos();
	}

	@Override
	public void eliminar(int id) {
		repositorio.eliminar(id);
	}

	@Override
	public Optometrista actualizarDatos(Optometrista optometristaweb) {

		if (repositorio.buscarPorId(optometristaweb.getIdOptometrista()).isEmpty()) {
			throw new RuntimeException("Optometrista no encontrado");
		}
		if (repositorio.existePorRegistroProfesionalYNoId(optometristaweb.getRegistroProfesional(),
				optometristaweb.getIdOptometrista())) {
			throw new RuntimeException("Es registro profesional ya está registrado por otro usuario");
		}
		if (repositorio.existePorTelefonoYNoId(optometristaweb.getTelefono(), optometristaweb.getIdOptometrista())) {
			throw new RuntimeException("El teléfono ya está registrado por otro usuario");
		}

		return repositorio.actualizar(optometristaweb);
	}

}
