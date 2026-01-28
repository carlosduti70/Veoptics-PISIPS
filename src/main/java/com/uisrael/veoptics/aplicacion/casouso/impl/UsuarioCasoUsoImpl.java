package com.uisrael.veoptics.aplicacion.casouso.impl;

import java.util.List;

import com.uisrael.veoptics.aplicacion.casouso.entradas.IUsuarioCasoUso;
import com.uisrael.veoptics.dominio.entidades.Rol;
import com.uisrael.veoptics.dominio.entidades.Usuario;
import com.uisrael.veoptics.dominio.repositorios.IRolRepositorio;
import com.uisrael.veoptics.dominio.repositorios.IUsuarioRepositorio;

public class UsuarioCasoUsoImpl implements IUsuarioCasoUso{
	
	
	private final IUsuarioRepositorio repositorio;
	private final IRolRepositorio rolRepositorio;

	public UsuarioCasoUsoImpl(IUsuarioRepositorio repositorio, IRolRepositorio rolRepositorio) {
		super();
		this.repositorio = repositorio;
		this.rolRepositorio = rolRepositorio;
	}


	@Override
	public Usuario crear(Usuario usuarioDesdeWeb) {
		System.out.println("ID recibido del DTO: " + usuarioDesdeWeb.getRol().getIdRol());
	    // 1. Buscamos el rol real para asegurar integridad (nuestra fuente de verdad)
	    Rol rolValidado = rolRepositorio.buscarRolPorId(usuarioDesdeWeb.getRol().getIdRol())
	            .orElseThrow(() -> new RuntimeException("El rol especificado no existe"));

	    // Esto "limpia" cualquier dato falso que haya venido en el JSON (como un nombre de rol incorrecto)
	    Usuario usuarioParaPersistir = new Usuario(
	    	usuarioDesdeWeb.getIdUsuario(),
	        usuarioDesdeWeb.getNombre(),
	        usuarioDesdeWeb.getApellido(),
	        usuarioDesdeWeb.getCedula(),
	        usuarioDesdeWeb.getCorreo(),
	        usuarioDesdeWeb.getClave(),
	        usuarioDesdeWeb.getEstado(),
	        rolValidado
	    );

	    // 3. Enviamos a persistencia el objeto garantizado por el dominio
	    return repositorio.guardar(usuarioParaPersistir);
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
