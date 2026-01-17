package com.uisrael.veoptics.infraestructura.persistencia.adaptadores;

import java.util.List;
import java.util.Optional;

import com.uisrael.veoptics.dominio.entidades.ExamenOptometrico;
import com.uisrael.veoptics.dominio.repositorios.IExamenOptometricoRepositorio;
import com.uisrael.veoptics.infraestructura.persistencia.jpa.ExamenOptometricoJpa;
import com.uisrael.veoptics.infraestructura.persistencia.mapeadores.IExamenOptometricoJpaMapper;
import com.uisrael.veoptics.infraestructura.repositorios.IExamenOptometricoJpaRepositorio;

public class ExamenOptometricoRepositorioImpl implements IExamenOptometricoRepositorio {
	private final IExamenOptometricoJpaRepositorio jpaExamenOptometricoRepositorio;
	private final IExamenOptometricoJpaMapper entityExamenOptometricoMapper;

	public ExamenOptometricoRepositorioImpl(IExamenOptometricoJpaRepositorio jpaRepositorio, IExamenOptometricoJpaMapper entityMapper) {
		this.jpaExamenOptometricoRepositorio = jpaRepositorio;
		this.entityExamenOptometricoMapper = entityMapper;
	}

	@Override
	public ExamenOptometrico guardar(ExamenOptometrico examenoptometrico) {
		ExamenOptometricoJpa entity = entityExamenOptometricoMapper.toEntity(examenoptometrico);
		ExamenOptometricoJpa guardado = jpaExamenOptometricoRepositorio.save(entity);
		return entityExamenOptometricoMapper.toDomain(guardado);
	}

	@Override
	public Optional<ExamenOptometrico> buscarPorId(int id) {
		return jpaExamenOptometricoRepositorio.findById(id).map(entityExamenOptometricoMapper:: toDomain);
	}

	@Override
	public List<ExamenOptometrico> listarTodos() {
		return jpaExamenOptometricoRepositorio.findAll().stream().map(entityExamenOptometricoMapper::toDomain).toList();
	}

	@Override
	public void eliminar(int id) {
		jpaExamenOptometricoRepositorio.deleteById(id);

	}

}
