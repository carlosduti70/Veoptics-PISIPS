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
		return jpaPacienteRepositorio.findById(id).map(entityPacienteMapper::toDomain);
	}

	@Override
	public List<Paciente> listarTodos() {
		return jpaPacienteRepositorio.findAll().stream().map(entityPacienteMapper::toDomain).toList();
	}

	@Override
	public void eliminar(int id) {
		jpaPacienteRepositorio.deleteById(id);

	}

	@Override
	public boolean existePorCi(String ci) {
		return jpaPacienteRepositorio.existsByCi(ci);
	}

	@Override
	public boolean existePorCorreo(String correo) {
		return jpaPacienteRepositorio.existsByCorreo(correo);
	}

	@Override
	public boolean existePorCiYNoId(String ci, int idPaciente) {
		return jpaPacienteRepositorio.existsByCiAndIdPacienteNot(ci, idPaciente);
	}

	@Override
	public boolean existePorCorreoYNoId(String correo, int idPaciente) {
		return jpaPacienteRepositorio.existsByCorreoAndIdPacienteNot(correo, idPaciente);
	}

	@Override
	public Paciente actualizar(Paciente paciente) {
		jpaPacienteRepositorio.actualizarDatos(paciente.getIdPaciente(), paciente.getNombre(), paciente.getApellido(),
				paciente.getCi(), paciente.getFecNacimiento(), paciente.getDireccion(), paciente.getTelefono(),
				paciente.getCorreo(), paciente.getEstado());
		return paciente;
	}

	@Override
	public boolean existePorTelefono(String telefono) {
		return jpaPacienteRepositorio.existsByTelefono(telefono);
	}

	@Override
	public boolean existePorTelefonoYNoId(String telefono, int idPaciente) {
		return jpaPacienteRepositorio.existsByTelefonoAndIdPacienteNot(telefono, idPaciente);
	}

}
