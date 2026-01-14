package com.uisrael.veoptics.aplicacion.casouso.impl;

import java.util.List;

import com.uisrael.veoptics.aplicacion.casouso.entradas.ICertificadoCasoUso;
import com.uisrael.veoptics.dominio.entidades.Certificado;
import com.uisrael.veoptics.dominio.repositorios.ICertificadoRepositorio;


public class CertificadoCasoUsoImpl implements ICertificadoCasoUso {
	
	
	private final ICertificadoRepositorio repositorio;
	

	public CertificadoCasoUsoImpl(ICertificadoRepositorio repositorio) {
		this.repositorio = repositorio;
	}

	@Override
	public Certificado crear(Certificado certificado) {
		return repositorio.guardar(certificado);

	}

	@Override
	public Certificado obtenerPorId(int id) {
		return repositorio.buscarPorId(id).orElseThrow(() -> new RuntimeException("Certificado no encontrado"));
	}

	@Override
	public List<Certificado> listar() {
		return repositorio.listarTodos();
	}

	@Override
	public void eliminar(int id) {
		repositorio.eliminar(id);
		
	}

}
