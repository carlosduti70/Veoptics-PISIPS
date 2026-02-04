package com.uisrael.veoptics.infraestructura.configuracion;

import com.uisrael.veoptics.dominio.entidades.Rol;
import com.uisrael.veoptics.dominio.entidades.Usuario;
import com.uisrael.veoptics.dominio.repositorios.IRolRepositorio;
import com.uisrael.veoptics.dominio.repositorios.IUsuarioRepositorio;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DataInitializer {

	@Bean
	CommandLineRunner initDatabase(IRolRepositorio rolRepo, IUsuarioRepositorio usuarioRepo) {
		return args -> {
			if (rolRepo.listarTodos().isEmpty()) {
				rolRepo.guardar(new Rol(0, "ADMIN"));
				rolRepo.guardar(new Rol(0, "MEDICO"));
				rolRepo.guardar(new Rol(0, "RECEPCIONISTA"));
			}

			if (usuarioRepo.buscarPorId(1).isEmpty()) {

				Rol rolAdmin = new Rol(1, "ADMIN");

				Usuario admin = new Usuario(0,
						"Administrador", "Sistema", "9999999999", "admin@veoptics.com", "admin123",
						true,
						rolAdmin);

				usuarioRepo.guardar(admin);
				System.out.println("Usuario ADMIN con ID 1 creado (Clave: admin123)");
			}
		};
	}
}