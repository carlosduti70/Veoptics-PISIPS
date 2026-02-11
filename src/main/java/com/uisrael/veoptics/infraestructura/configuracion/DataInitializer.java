package com.uisrael.veoptics.infraestructura.configuracion;

import com.uisrael.veoptics.dominio.entidades.Rol;
import com.uisrael.veoptics.dominio.entidades.Usuario;
import com.uisrael.veoptics.dominio.repositorios.IPasswordEncoderPort;
import com.uisrael.veoptics.dominio.repositorios.IRolRepositorio;
import com.uisrael.veoptics.dominio.repositorios.IUsuarioRepositorio;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DataInitializer {

    @Bean
    // Agregamos IPasswordEncoderPort como argumento para que Spring lo inyecte
    CommandLineRunner initDatabase(IRolRepositorio rolRepo, IUsuarioRepositorio usuarioRepo, IPasswordEncoderPort passwordEncoder) {
        return args -> {
            
            // 1. Crear Roles si no existen
            if (rolRepo.listarTodos().isEmpty()) {
                rolRepo.guardar(new Rol(0, "ADMIN"));
                rolRepo.guardar(new Rol(0, "MEDICO"));
                rolRepo.guardar(new Rol(0, "RECEPCIONISTA"));
                System.out.println("Roles iniciales creados.");
            }

            // 2. Crear Usuario Admin si no existe
            // Nota: Asegúrate de que tu lógica de buscarPorId(1) sea consistente con el ID que genera la BD
            if (usuarioRepo.buscarPorId(1).isEmpty()) {

                Rol rolAdmin = new Rol(1, "ADMIN"); // Asumimos que el ID 1 es ADMIN

                // AQUÍ ESTÁ LA MAGIA: Encriptamos la clave antes de crear el objeto
                String claveEncriptada = passwordEncoder.encode("admin123");

                Usuario admin = new Usuario(0,
                        "Administrador", 
                        "Sistema", 
                        "9999999999", 
                        "admin@veoptics.com", 
                        claveEncriptada,
                        true,
                        "N",
                        rolAdmin);

                usuarioRepo.guardar(admin);
                System.out.println("Usuario ADMIN creado exitosamente.");
                System.out.println(" > Correo: admin@veoptics.com");
                System.out.println(" > Clave: admin123");
            }
        };
    }
}