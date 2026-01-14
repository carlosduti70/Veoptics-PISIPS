package com.uisrael.veoptics.aplicacion.casouso.entradas;

import com.uisrael.veoptics.dominio.entidades.ExamenOptometrico;

public interface IExamenOptometricoCasoUso {
	
	ExamenOptometrico crear(ExamenOptometrico examenoptometrico);
	
	ExamenOptometrico obtenerPorId(int id);
	
	List<ExamenOptometrico>listar ();
	
	void eliminar(int id);
}

