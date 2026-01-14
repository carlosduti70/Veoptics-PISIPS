package com.uisrael.veoptics.dominio.repositorios;

import java.util.List;
import java.util.Optional;

import com.uisrael.veoptics.dominio.entidades.Certificado;

public interface ICertificadoRepositorio {
	
	Certificado guardar(Certificado certificado);

	Optional<Certificado> buscarPorId(int id);

	List<Certificado> listarTodos();

	void eliminar(int id);

}
