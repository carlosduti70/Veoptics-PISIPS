package com.uisrael.veoptics.infraestructura.persistencia.adaptadores;

import java.util.List;
import java.util.Optional;

import com.uisrael.veoptics.dominio.entidades.Optometrista;
import com.uisrael.veoptics.dominio.repositorios.IOptometristaRepositorio;
import com.uisrael.veoptics.infraestructura.persistencia.jpa.OptometristaJpa;
import com.uisrael.veoptics.infraestructura.persistencia.mapeadores.IOptometristaJpaMapper;
import com.uisrael.veoptics.infraestructura.repositorios.IOptometristaJpaRepositorio;

import jakarta.transaction.Transactional;

public class OptometristaRepositorioImpl implements IOptometristaRepositorio {
	private final IOptometristaJpaRepositorio jpaOptometristaRepositorio;
	private final IOptometristaJpaMapper entityOptometristaMapper;

	public OptometristaRepositorioImpl(IOptometristaJpaRepositorio jpaRepositorio,
			IOptometristaJpaMapper entityMapper) {
		this.jpaOptometristaRepositorio = jpaRepositorio;
		this.entityOptometristaMapper = entityMapper;
	}

	@Override
	public Optometrista guardar(Optometrista optometrista) {
		OptometristaJpa entity = entityOptometristaMapper.toEntity(optometrista);
		OptometristaJpa guardado = jpaOptometristaRepositorio.save(entity);
		return entityOptometristaMapper.toDomain(guardado);
	}

	@Override
	public Optional<Optometrista> buscarPorId(int id) {
		return jpaOptometristaRepositorio.findById(id).map(entityOptometristaMapper::toDomain);
	}

	@Override
	public List<Optometrista> listarTodos() {
		return jpaOptometristaRepositorio.findAll().stream().map(entityOptometristaMapper::toDomain).toList();
	}

	@Override
	public void eliminar(int id) {
		jpaOptometristaRepositorio.deleteById(id);

	}

	@Override
	public Optional<Optometrista> buscarPorIdUsuario(int idUsuario) {
		return jpaOptometristaRepositorio.findByUsuarioIdUsuario(idUsuario).map(entityOptometristaMapper::toDomain);
	}

	@Override
	public boolean existePorRegistroProfesional(String registroProfesional) {
		return jpaOptometristaRepositorio.existsByRegistroProfesional(registroProfesional);
	}

	@Override
	public boolean existePorTelefono(String telefono) {
		return jpaOptometristaRepositorio.existsByTelefono(telefono);
	}

	@Override
	@Transactional
	public Optometrista actualizar(Optometrista optometrista) {
		jpaOptometristaRepositorio.actualizarDatos(optometrista.getIdOptometrista(),
				optometrista.getRegistroProfesional(), optometrista.getTelefono(), optometrista.getEstado());

		return optometrista;
	}

	@Override
	public boolean existePorRegistroProfesionalYNoId(String registroProfesional, int idOptometrista) {
		return jpaOptometristaRepositorio.existsByRegistroProfesionalAndIdOptometristaNot(registroProfesional,
				idOptometrista);
	}

	@Override
	public boolean existePorTelefonoYNoId(String telefono, int idOptometrista) {
		return jpaOptometristaRepositorio.existsByTelefonoAndIdOptometristaNot(telefono, idOptometrista);
	}

}
