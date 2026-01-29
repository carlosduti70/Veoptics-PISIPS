package com.uisrael.veoptics.aplicacion.casouso.entradas;

import java.util.List;

import com.uisrael.veoptics.dominio.entidades.Optometrista;

public interface IOptometristaCasoUso {
	
	Optometrista crear(Optometrista optometrista);
	
	Optometrista obtenerPorId(int id);
	
	Optometrista obtenerPorIdUsurio(int idUsuario);
	
	List<Optometrista>listar ();
	
	void eliminar(int id);

}
