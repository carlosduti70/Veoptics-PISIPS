package com.uisrael.veoptics.infraestructura.persistencia.adaptadores;

import java.util.List;
import java.util.Optional;

import com.uisrael.veoptics.dominio.entidades.HistoriaClinica;
import com.uisrael.veoptics.dominio.repositorios.IHistoriaClinicaRepositorio;
import com.uisrael.veoptics.infraestructura.persistencia.jpa.HistoriaClinicaJpa;
import com.uisrael.veoptics.infraestructura.persistencia.mapeadores.IHistoriaClinicaJpaMapper;
import com.uisrael.veoptics.infraestructura.repositorios.IHistoriaClinicaJpaRepositorio;

public class HistoriaClinicaRepositorioImpl implements IHistoriaClinicaRepositorio {

	private final IHistoriaClinicaJpaRepositorio jpaHistoriaRepositorio;
	private final IHistoriaClinicaJpaMapper entityHistoriaMapper;
		
	public HistoriaClinicaRepositorioImpl(IHistoriaClinicaJpaRepositorio jpaRepositorio,
			IHistoriaClinicaJpaMapper entityMapper) {
		this.jpaHistoriaRepositorio = jpaRepositorio;
		this.entityHistoriaMapper = entityMapper;
	}

	@Override
	public HistoriaClinica guardar(HistoriaClinica historiaC) {
		HistoriaClinicaJpa entity = entityHistoriaMapper.toEntity(historiaC);
		HistoriaClinicaJpa guardado = jpaHistoriaRepositorio.save(entity);
		return entityHistoriaMapper.toDomain(guardado);
	}

	@Override
	public Optional<HistoriaClinica> buscarPorID(int id) {
		
		return jpaHistoriaRepositorio.findById(id).map(entityHistoriaMapper:: toDomain);
	}

	@Override
	public List<HistoriaClinica> listarTodos() {
		
		return jpaHistoriaRepositorio.findAll().stream().map(entityHistoriaMapper::toDomain).toList();

	}

	@Override
	public void eliminar(int id) {
		jpaHistoriaRepositorio.deleteById(id);
	}
	

}
