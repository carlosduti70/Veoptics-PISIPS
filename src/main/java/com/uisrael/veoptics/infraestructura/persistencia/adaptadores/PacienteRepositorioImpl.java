package com.uisrael.veoptics.infraestructura.persistencia.adaptadores;

import java.util.List;
import java.util.Optional;

import com.uisrael.veoptics.dominio.entidades.Paciente;
import com.uisrael.veoptics.dominio.repositorios.IPacienteRepositorio;
import com.uisrael.veoptics.infraestructura.persistencia.jpa.PacienteJpa;
import com.uisrael.veoptics.infraestructura.persistencia.mapeadores.IPacienteJpaMapper;
import com.uisrael.veoptics.infraestructura.repositorios.IPacienteJpaRepositorio;

public class PacienteRepositorioImpl implements IPacienteRepositorio {

	private final IPacienteJpaRepositorio jpaPacienteRepositorio;
	private final IPacienteJpaMapper entityPacienteMapper;

	public PacienteRepositorioImpl(IPacienteJpaRepositorio jpaRepositorio, IPacienteJpaMapper entityMapper) {
		this.jpaPacienteRepositorio = jpaRepositorio;
		this.entityPacienteMapper = entityMapper;
	}

	@Override
	public Paciente guardar(Paciente paciente) {
		PacienteJpa entity = entityPacienteMapper.toEntity(paciente);
		PacienteJpa guardado = jpaPacienteRepositorio.save(entity);
		return entityPacienteMapper.toDomain(guardado);
	}

	@Override
	public Optional<Paciente> buscarPorId(int id) {
		return jpaPacienteRepositorio.findById(id).map(entityPacienteMapper:: toDomain);
	}

	@Override
	public List<Paciente> listarTodos() {
		return jpaPacienteRepositorio.findAll().stream().map(entityPacienteMapper::toDomain).toList();
	}

	@Override
	public void eliminar(int id) {
		jpaPacienteRepositorio.deleteById(id);

	}

}
