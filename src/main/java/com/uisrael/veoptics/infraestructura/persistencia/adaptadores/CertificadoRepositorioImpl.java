package com.uisrael.veoptics.infraestructura.persistencia.adaptadores;

import java.util.List;
import java.util.Optional;

import com.uisrael.veoptics.dominio.entidades.Certificado;
import com.uisrael.veoptics.dominio.repositorios.ICertificadoRepositorio;
import com.uisrael.veoptics.infraestructura.persistencia.jpa.CertificadoJpa;
import com.uisrael.veoptics.infraestructura.persistencia.mapeadores.ICertificadoJpaMapper;
import com.uisrael.veoptics.infraestructura.repositorios.ICertificadoJpaRepositorio;


public class CertificadoRepositorioImpl implements ICertificadoRepositorio{

	
	private final ICertificadoJpaRepositorio jpaRepositorio;
	private final ICertificadoJpaMapper entityMapper;
	
	
	
	public CertificadoRepositorioImpl(ICertificadoJpaRepositorio jpaRepositorio, ICertificadoJpaMapper entityMapper) {
		super();
		this.jpaRepositorio = jpaRepositorio;
		this.entityMapper = entityMapper;
	}

	@Override
	public Certificado guardar(Certificado certificado) {
		CertificadoJpa entity = entityMapper.toEntity(certificado);
		CertificadoJpa guardado = jpaRepositorio.save(entity);

		return entityMapper.toDomain(guardado);
	}

	@Override
	public Optional<Certificado> buscarPorId(int id) {
		return jpaRepositorio.findById(id) .map(entityMapper::toDomain);
	}

	@Override
	public List<Certificado> listarTodos() {
		return jpaRepositorio.findAll().stream().map(entityMapper::toDomain).toList();
	}

	@Override
	public void eliminar(int id) {
		jpaRepositorio.deleteById(id);
		
	}
	
	
	
	

}
