package com.uisrael.veoptics.infraestructura.configuracion;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.CorsConfigurationSource;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;

import java.util.Arrays;
import java.util.List;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

	@Bean
	public PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}

	@Bean
	public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
		http
				// 1. AQUI ACTIVAMOS LA CONFIGURACIÓN CORS QUE DEFINIMOS ABAJO
				.cors(cors -> cors.configurationSource(corsConfigurationSource()))

				.csrf(csrf -> csrf.disable()) // Deshabilitar CSRF para APIs REST
				.authorizeHttpRequests(auth -> auth.anyRequest().permitAll() // Permitir todo (por ahora)
				);
		return http.build();
	}

	// 2. DEFINICIÓN DETALLADA DE CORS
	@Bean
	public CorsConfigurationSource corsConfigurationSource() {
	    CorsConfiguration configuration = new CorsConfiguration();

	    // 1. AGREGA AQUÍ TUS URLS DE VERCEL
	    configuration.setAllowedOrigins(Arrays.asList(
	        "http://localhost:4200",
	        "https://veoptics-pisips-front-jeriq35cu-carlosduti70s-projects.vercel.app",
	        "https://veoptics-pisips-front.vercel.app"
	    ));

	    // 2. Mantenemos el resto igual
	    configuration.setAllowedMethods(Arrays.asList("GET", "POST", "PUT", "DELETE", "OPTIONS"));
	    configuration.setAllowedHeaders(Arrays.asList("*"));
	    configuration.setAllowCredentials(true);

	    UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
	    source.registerCorsConfiguration("/**", configuration);
	    return source;
	}
}