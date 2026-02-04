package com.uisrael.veoptics.aplicacion.casouso.entradas;

import java.util.List;

import com.uisrael.veoptics.dominio.entidades.Historia;

public interface IHistoriaCasoUso {

	Historia crear(Historia historia);

	Historia obtenerPorId(int id);

	Historia obtenerPorIdExamen(int idExamen);

	List<Historia> listar();

	void eliminar(int id);

}
