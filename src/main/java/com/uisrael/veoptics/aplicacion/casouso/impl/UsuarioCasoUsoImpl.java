package com.uisrael.veoptics.aplicacion.casouso.impl;

import java.util.List;

import com.uisrael.veoptics.aplicacion.casouso.entradas.IUsuarioCasoUso;
import com.uisrael.veoptics.dominio.entidades.Rol;
import com.uisrael.veoptics.dominio.entidades.Usuario;
import com.uisrael.veoptics.dominio.repositorios.IPasswordEncoderPort;
import com.uisrael.veoptics.dominio.repositorios.IRolRepositorio;
import com.uisrael.veoptics.dominio.repositorios.IUsuarioRepositorio;

public class UsuarioCasoUsoImpl implements IUsuarioCasoUso {

	private final IUsuarioRepositorio repositorio;
	private final IRolRepositorio rolRepositorio;
	private final IPasswordEncoderPort passwordEncoder;

	public UsuarioCasoUsoImpl(IUsuarioRepositorio repositorio, IRolRepositorio rolRepositorio,
			IPasswordEncoderPort passwordEncoder) {
		this.repositorio = repositorio;
		this.rolRepositorio = rolRepositorio;
		this.passwordEncoder = passwordEncoder;
	}

	@Override
	public Usuario crear(Usuario usuarioDesdeWeb) {
		System.out.println("ID recibido del DTO: " + usuarioDesdeWeb.getRol().getIdRol());

		Rol rolValidado = rolRepositorio.buscarRolPorId(usuarioDesdeWeb.getRol().getIdRol())
				.orElseThrow(() -> new RuntimeException("El rol especificado no existe"));

		String claveEncriptada = passwordEncoder.encode(usuarioDesdeWeb.getClave());

		Usuario usuarioParaPersistir = new Usuario(usuarioDesdeWeb.getIdUsuario(), usuarioDesdeWeb.getNombre(),
				usuarioDesdeWeb.getApellido(), usuarioDesdeWeb.getCedula(), usuarioDesdeWeb.getCorreo(),
				claveEncriptada, usuarioDesdeWeb.getEstado(), rolValidado);

		return repositorio.guardar(usuarioParaPersistir);
	}

	@Override
	public Usuario obtenerPorId(int id) {

		return repositorio.buscarPorId(id).orElseThrow(() -> new RuntimeException("Usuario no encontrado"));
	}

	@Override
	public List<Usuario> listar() {
		return repositorio.listarTodos();
	}

	@Override
	public void eliminar(int id) {
		repositorio.eliminar(id);

	}

	@Override
	public Usuario login(String correo, String clave) {
		Usuario usuarioEncontrado = repositorio.findByCorreo(correo)
				.orElseThrow(() -> new RuntimeException("Usuario incorrecto"));

		if (!passwordEncoder.matches(clave, usuarioEncontrado.getClave())) {
			throw new RuntimeException("Contraseña incorrecta");
		}

		return usuarioEncontrado;
	}

}
