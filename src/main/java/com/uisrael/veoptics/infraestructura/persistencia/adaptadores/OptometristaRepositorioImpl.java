package com.uisrael.veoptics.infraestructura.persistencia.adaptadores;

import java.util.List;
import java.util.Optional;

import com.uisrael.veoptics.dominio.entidades.Optometrista;
import com.uisrael.veoptics.dominio.repositorios.IOptometristaRepositorio;
import com.uisrael.veoptics.infraestructura.persistencia.jpa.OptometristaJpa;
import com.uisrael.veoptics.infraestructura.persistencia.mapeadores.IOptometristaJpaMapper;
import com.uisrael.veoptics.infraestructura.repositorios.IOptometristaJpaRepositorio;

public class OptometristaRepositorioImpl implements IOptometristaRepositorio {
	private final IOptometristaJpaRepositorio jpaOptometristaRepositorio;
	private final IOptometristaJpaMapper entityOptometristaMapper;

	public OptometristaRepositorioImpl(IOptometristaJpaRepositorio jpaRepositorio, IOptometristaJpaMapper entityMapper) {
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
		return jpaOptometristaRepositorio.findById(id).map(entityOptometristaMapper:: toDomain);
	}

	@Override
	public List<Optometrista> listarTodos() {
		return jpaOptometristaRepositorio.findAll().stream().map(entityOptometristaMapper::toDomain).toList();
	}

	@Override
	public void eliminar(int id) {
		jpaOptometristaRepositorio.deleteById(id);

	}

}
