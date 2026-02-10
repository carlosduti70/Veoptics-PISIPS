package com.uisrael.veoptics.aplicacion.casouso.entradas;

import java.util.List;


import com.uisrael.veoptics.dominio.entidades.Usuario;

public interface IUsuarioCasoUso {

	
	Usuario crear (Usuario usuario);
	Usuario obtenerPorId(int id);
	List<Usuario> listar();
	void eliminar(int id);
	
	Usuario login(String correo, String clave);
	
	void actualizarClave(int idUsuario, String nuevaClave);

}


