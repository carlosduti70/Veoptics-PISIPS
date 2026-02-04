package com.uisrael.veoptics.infraestructura.persistencia.adaptadores;

import java.util.List;
import java.util.Optional;

import com.uisrael.veoptics.dominio.entidades.Historia;
import com.uisrael.veoptics.dominio.repositorios.IHistoriaRepositorio;
import com.uisrael.veoptics.infraestructura.persistencia.jpa.HistoriaJpa;
import com.uisrael.veoptics.infraestructura.persistencia.mapeadores.IHistoriaJpaMapper;
import com.uisrael.veoptics.infraestructura.repositorios.IHistoriaJpaRepositorio;

public class HistoriaRepositorioImpl implements IHistoriaRepositorio {

	
	private final IHistoriaJpaRepositorio jpaRepositorio;
	private final IHistoriaJpaMapper entityMapper;
	

	
	public HistoriaRepositorioImpl(IHistoriaJpaRepositorio jpaRepositorio, IHistoriaJpaMapper entityMapper) {
		this.jpaRepositorio = jpaRepositorio;
		this.entityMapper = entityMapper;
	}

	@Override
	public Historia guardar(Historia historia) {
		HistoriaJpa entity = entityMapper.toEntity(historia);
		HistoriaJpa guardado = jpaRepositorio.save(entity);

		return entityMapper.toDomain(guardado);
	}

	@Override
	public Optional<Historia> buscarPorId(int id) {
		return jpaRepositorio.findById(id) .map(entityMapper::toDomain);
	}

	@Override
	public List<Historia> listarTodos() {
		return jpaRepositorio.findAll().stream().map(entityMapper::toDomain).toList();
	}

	@Override
	public void eliminar(int id) {
		jpaRepositorio.deleteById(id);
		
	}

	@Override
	public Optional<Historia> buscarPorIdExamen(int idExamen) {
		// TODO Auto-generated method stub
		return jpaRepositorio.findByExamenOptometricoIdExamen(idExamen) .map(entityMapper::toDomain);
	}

	
	
	
}
