package com.uisrael.veoptics.aplicacion.casouso.entradas;

import java.util.List;


import com.uisrael.veoptics.dominio.entidades.Historia;


public interface IHistoriaCasoUso {

	Historia crear (Historia historia);
	Historia obtenerPorId(int id);
	List<Historia> listar();
	void eliminar(int id);

	
}
