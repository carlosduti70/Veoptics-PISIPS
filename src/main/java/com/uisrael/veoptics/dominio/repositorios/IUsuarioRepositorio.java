package com.uisrael.veoptics.dominio.repositorios;

import java.util.List;
import java.util.Optional;

import com.uisrael.veoptics.dominio.entidades.Usuario;

public interface IUsuarioRepositorio {
	
	Usuario guardar (Usuario usuario);
	Optional<Usuario> buscarPorId(int id);
	List<Usuario> listarTodos();
	void eliminar(int id);
	
	Optional<Usuario> findByCorreo(String correo);

}
