package com.uisrael.veoptics.aplicacion.casouso.entradas;

public interface IExamenOptometricoCasoUso {
	
	ExamenOptometrico crear(ExamenOptometrico examenoptometrico);
	
	ExamenOptometrico obtenerPorId(int id);
	
	List<ExamenOptometrico>listar ();
	
	void eliminar(int id);
}

