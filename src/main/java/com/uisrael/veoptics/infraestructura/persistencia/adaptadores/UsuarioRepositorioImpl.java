package com.uisrael.veoptics.infraestructura.persistencia.adaptadores;

import java.util.List;
import java.util.Optional;

import com.uisrael.veoptics.dominio.entidades.Usuario;
import com.uisrael.veoptics.dominio.repositorios.IUsuarioRepositorio;
import com.uisrael.veoptics.infraestructura.persistencia.jpa.RolJpa;
import com.uisrael.veoptics.infraestructura.persistencia.jpa.UsuarioJpa;
import com.uisrael.veoptics.infraestructura.persistencia.mapeadores.IUsuarioJpaMapper;
import com.uisrael.veoptics.infraestructura.repositorios.IUsuarioJpaRepositorio;

import jakarta.transaction.Transactional;

public class UsuarioRepositorioImpl implements IUsuarioRepositorio {

	// dependencia
	private final IUsuarioJpaRepositorio jpaRepositorio;
	private final IUsuarioJpaMapper entityMapper;

	// constructor
	public UsuarioRepositorioImpl(IUsuarioJpaRepositorio jpaRepositorio, IUsuarioJpaMapper entityMapper) {

		this.jpaRepositorio = jpaRepositorio;
		this.entityMapper = entityMapper;
	}

	@Override
	public Usuario guardar(Usuario usuario) {

		UsuarioJpa entity = entityMapper.toEntity(usuario);
		UsuarioJpa guardado = jpaRepositorio.save(entity);

		return entityMapper.toDomain(guardado);
	}

	@Override
	public Optional<Usuario> buscarPorId(int id) {

		return jpaRepositorio.findById(id).map(entityMapper::toDomain);
	}

	@Override
	public List<Usuario> listarTodos() {

		return jpaRepositorio.findAll().stream().map(entityMapper::toDomain).toList();
	}

	@Override
	public void eliminar(int id) {
		jpaRepositorio.deleteById(id);

	}

	@Override
	public Optional<Usuario> findByCorreo(String correo) {
		return jpaRepositorio.findByCorreo(correo).map(entityMapper::toDomain);
	}

	@Override
	public void actualizarClave(int idUsuario, String nuevaClave) {
		Optional<UsuarioJpa> usuarioOptional = jpaRepositorio.findById(idUsuario);

		if (usuarioOptional.isPresent()) {
			UsuarioJpa usuarioJpa = usuarioOptional.get();

			usuarioJpa.setClave(nuevaClave);

			usuarioJpa.setIndicador("A");

			jpaRepositorio.save(usuarioJpa);
		} else {
			throw new RuntimeException("No se encontró el usuario con ID: " + idUsuario);
		}

	}

	@Override
	public boolean existePorCedula(String cedula) {
		return jpaRepositorio.existsByCedula(cedula);
	}

	@Override
	public boolean existePorCorreo(String correo) {
		return jpaRepositorio.existsByCorreo(correo);
	}

	@Override
	@Transactional
	public Usuario actualizar(Usuario usuarioDomain) {
		RolJpa rolJpa = new RolJpa();
		rolJpa.setIdRol(usuarioDomain.getRol().getIdRol());
		jpaRepositorio.actualizarDatosGenerales(usuarioDomain.getIdUsuario(), usuarioDomain.getNombre(),
				usuarioDomain.getApellido(), usuarioDomain.getCedula(), usuarioDomain.getCorreo(),
				usuarioDomain.getEstado(),
				rolJpa);
		return usuarioDomain;
	}

	@Override
	public boolean existePorCorreoYNoId(String correo, int idUsuario) {
		return jpaRepositorio.existsByCorreoAndIdUsuarioNot(correo, idUsuario);
	}

	@Override
	public boolean existePorCedulaYNoId(String cedula, int idUsuario) {
		return jpaRepositorio.existsByCedulaAndIdUsuarioNot(cedula, idUsuario);
	}

}
