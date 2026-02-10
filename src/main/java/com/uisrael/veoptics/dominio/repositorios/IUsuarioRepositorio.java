package com.uisrael.veoptics.dominio.repositorios;

import java.util.List;
import java.util.Optional;

import com.uisrael.veoptics.dominio.entidades.Usuario;

public interface IUsuarioRepositorio {
	
	Usuario guardar (Usuario usuario);
	Optional<Usuario> buscarPorId(int id);
	List<Usuario> listarTodos();
	void eliminar(int id);
	
	void actualizarClave(int idUsuario, String nuevaClave);
	
	Optional<Usuario> findByCorreo(String correo);
	
	boolean existePorCedula(String cedula);
    boolean existePorCorreo(String correo);
    
    Usuario actualizar(Usuario usuario);
    boolean existePorCorreoYNoId(String correo, int idUsuario);
    boolean existePorCedulaYNoId(String cedula, int idUsuario);

}
