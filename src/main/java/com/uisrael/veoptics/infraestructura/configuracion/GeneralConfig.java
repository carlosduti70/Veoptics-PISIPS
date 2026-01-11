package com.uisrael.veoptics.infraestructura.configuracion;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.uisrael.veoptics.aplicacion.casouso.entradas.IPacienteCasoUso;
import com.uisrael.veoptics.aplicacion.casouso.entradas.IUsuarioCasoUso;
import com.uisrael.veoptics.aplicacion.casouso.impl.PacienteCasoUsoImpl;
import com.uisrael.veoptics.aplicacion.casouso.impl.UsuarioCasoUsoImpl;
import com.uisrael.veoptics.dominio.repositorios.IPacienteRepositorio;
import com.uisrael.veoptics.dominio.repositorios.IUsuarioRepositorio;
import com.uisrael.veoptics.infraestructura.persistencia.adaptadores.PacienteRepositorioImpl;
import com.uisrael.veoptics.infraestructura.persistencia.adaptadores.UsuarioRepositorioImpl;
import com.uisrael.veoptics.infraestructura.persistencia.mapeadores.IPacienteJpaMapper;
import com.uisrael.veoptics.infraestructura.persistencia.mapeadores.IUsuarioJpaMapper;
import com.uisrael.veoptics.infraestructura.repositorios.IPacienteJpaRepositorio;
import com.uisrael.veoptics.infraestructura.repositorios.IUsuarioJpaRepositorio;

@Configuration
public class GeneralConfig {

	@Bean
	IPacienteRepositorio pacienteRepositorio(IPacienteJpaRepositorio jpaRepositorio, IPacienteJpaMapper mapper) {
		return new PacienteRepositorioImpl(jpaRepositorio, mapper);
	};

	@Bean
	IPacienteCasoUso pacienteCasoUso(IPacienteRepositorio repositorio) {
		return new PacienteCasoUsoImpl(repositorio);
	};
	
	@Bean
	IUsuarioRepositorio usuarioRepositorio(IUsuarioJpaRepositorio jpaRepositorio, IUsuarioJpaMapper mapper) {
		return new UsuarioRepositorioImpl(jpaRepositorio, mapper);
	};

	@Bean
	IUsuarioCasoUso usuarioCasoUso(IUsuarioRepositorio repositorio) {
		return new UsuarioCasoUsoImpl(repositorio);
	};
	

}
