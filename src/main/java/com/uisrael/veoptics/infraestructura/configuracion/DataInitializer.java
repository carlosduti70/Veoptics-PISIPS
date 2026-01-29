//package com.uisrael.veoptics.infraestructura.configuracion;
//
//public class DataInitializer {
//	
//	@Bean
//    CommandLineRunner initDatabase(IRolRepositorio rolRepo, 
//                                   IUsuarioRepositorio usuarioRepo) {
//        return args -> {
//            // 1. CREAR ROLES SI NO EXISTEN
//            // Nota: Aquí usamos los puertos del dominio para mantener la arquitectura limpia
//            if (rolRepo.listarTodos().isEmpty()) {
//                rolRepo.guardar(new Rol(0, "ADMIN"));
//                rolRepo.guardar(new Rol(0, "OPTOMETRISTA"));
//                rolRepo.guardar(new Rol(0, "RECEPCIONISTA"));
//                System.out.println("Roles iniciales creados.");
//            }
//
//            // 2. CREAR USUARIO ADMIN POR DEFECTO
//            if (usuarioRepo.buscarPorCorreo("admin@veoptics.com").isEmpty()) {
//                // Buscamos el objeto Rol que acabamos de crear
//                Rol rolAdmin = rolRepo.listarTodos().stream()
//                        .filter(r -> r.getNombreRol().equals("ADMIN"))
//                        .findFirst()
//                        .orElseThrow();
//
//                Usuario admin = new Usuario(
//                    0,
//                    "Administrador",
//                    "Sistema",
//                    "9999999999",
//                    "admin@veoptics.com",
//                    passwordEncoder.encode("admin123"), // Encriptamos la clave
//                    true,
//                    rolAdmin
//                );
//
//                usuarioRepo.guardar(admin);
//                System.out.println("Usuario administrador por defecto creado: admin@veoptics.com / admin123");
//            }
//        };
//    }
//
//}
