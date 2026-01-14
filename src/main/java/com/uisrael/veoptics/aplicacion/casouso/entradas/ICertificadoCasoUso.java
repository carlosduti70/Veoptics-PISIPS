package com.uisrael.veoptics.aplicacion.casouso.entradas;

import java.util.List;

import com.uisrael.veoptics.dominio.entidades.Certificado;

public interface ICertificadoCasoUso {
	
	Certificado crear (Certificado certificado);
	Certificado obtenerPorId(int id);
	List<Certificado> listar();
	void eliminar(int id);


}
