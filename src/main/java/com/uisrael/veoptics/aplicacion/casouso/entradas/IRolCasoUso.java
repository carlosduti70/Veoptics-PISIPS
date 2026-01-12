package com.uisrael.veoptics.aplicacion.casouso.entradas;

import java.util.List;

import com.uisrael.veoptics.dominio.entidades.Rol;

public interface IRolCasoUso {

	Rol crear(Rol rol);
	Rol obtenerPorId(int id);
	List<Rol> listar();
	void eliminar(int id);

}
