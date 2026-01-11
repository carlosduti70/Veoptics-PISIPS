package com.uisrael.veoptics.aplicacion.casouso.entradas;

import java.util.List;
import java.util.Optional;

import com.uisrael.veoptics.dominio.entidades.Usuario;

public interface IUsuarioCasoUso {

	
	Usuario crear (Usuario usuario);
	Usuario obtenerPorId(int id);
	List<Usuario> listar();
	void eliminar(int id);

}
