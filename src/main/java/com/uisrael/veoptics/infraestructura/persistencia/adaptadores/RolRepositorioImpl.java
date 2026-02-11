package com.uisrael.veoptics.infraestructura.persistencia.adaptadores;

import java.util.List;
import java.util.Optional;

import com.uisrael.veoptics.dominio.entidades.Rol;
import com.uisrael.veoptics.dominio.repositorios.IRolRepositorio;
import com.uisrael.veoptics.infraestructura.persistencia.jpa.RolJpa;
import com.uisrael.veoptics.infraestructura.persistencia.mapeadores.IRolJpaMapper;
import com.uisrael.veoptics.infraestructura.repositorios.IRolJpaRepositorio;


public class RolRepositorioImpl implements IRolRepositorio {
	
	private final IRolJpaRepositorio jpaRolRepositorio;
	private final IRolJpaMapper entityRolMapper;
	
	
	public RolRepositorioImpl(IRolJpaRepositorio jpaRepositorio, IRolJpaMapper entityMapper) {
		
		this.jpaRolRepositorio = jpaRepositorio;
		this.entityRolMapper = entityMapper;
	}

	@Override
	public Rol guardar(Rol rol) {
		RolJpa entity= entityRolMapper.toEntity(rol);
		RolJpa guardado= jpaRolRepositorio.save(entity);
		return entityRolMapper.toDomain(guardado);
	}

	@Override
	public Optional<Rol> buscarRolPorId(int id) {
		
		return jpaRolRepositorio.findById(id).map(entityRolMapper::toDomain);
	}

	@Override
	public List<Rol> listarTodos() {
		
		return jpaRolRepositorio.findAll().stream().map(entityRolMapper::toDomain).toList();
	}

	@Override
	public void eliminar(int id) {
		jpaRolRepositorio.deleteById(id);
		
	}

}
