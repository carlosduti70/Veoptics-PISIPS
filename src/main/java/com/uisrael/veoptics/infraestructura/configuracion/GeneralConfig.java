package com.uisrael.veoptics.infraestructura.configuracion;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.uisrael.veoptics.aplicacion.casouso.entradas.IOptometristaCasoUso;
import com.uisrael.veoptics.aplicacion.casouso.entradas.IPacienteCasoUso;
import com.uisrael.veoptics.aplicacion.casouso.impl.OptometristaCasoUsoImpl;
import com.uisrael.veoptics.aplicacion.casouso.impl.PacienteCasoUsoImpl;
import com.uisrael.veoptics.dominio.repositorios.IOptometristaRepositorio;
import com.uisrael.veoptics.dominio.repositorios.IPacienteRepositorio;
import com.uisrael.veoptics.infraestructura.persistencia.adaptadores.OptometristaRepositorioImpl;
import com.uisrael.veoptics.infraestructura.persistencia.adaptadores.PacienteRepositorioImpl;
import com.uisrael.veoptics.infraestructura.persistencia.mapeadores.IOptometristaJpaMapper;
import com.uisrael.veoptics.infraestructura.persistencia.mapeadores.IPacienteJpaMapper;
import com.uisrael.veoptics.infraestructura.repositorios.IOptometristaJpaRepositorio;
import com.uisrael.veoptics.infraestructura.repositorios.IPacienteJpaRepositorio;

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
	IOptometristaRepositorio optometristaRepositorio(IOptometristaJpaRepositorio jpaRepositorio, IOptometristaJpaMapper mapper) {
		return new OptometristaRepositorioImpl(jpaRepositorio, mapper);
	};

	@Bean
	IOptometristaCasoUso optometristaCasoUso(IOptometristaRepositorio repositorio) {
		return new OptometristaCasoUsoImpl(repositorio);
	};

}
