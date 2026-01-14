package com.uisrael.veoptics.infraestructura.configuracion;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.uisrael.veoptics.aplicacion.casouso.entradas.IHistoriaClinicaCasoUso;
import com.uisrael.veoptics.aplicacion.casouso.entradas.IOptometristaCasoUso;
import com.uisrael.veoptics.aplicacion.casouso.entradas.IPacienteCasoUso;
import com.uisrael.veoptics.aplicacion.casouso.entradas.IRolCasoUso;
import com.uisrael.veoptics.aplicacion.casouso.entradas.IUsuarioCasoUso;
import com.uisrael.veoptics.aplicacion.casouso.impl.HistoriaClinicaCasoUsoImpl;
import com.uisrael.veoptics.aplicacion.casouso.impl.OptometristaCasoUsoImpl;
import com.uisrael.veoptics.aplicacion.casouso.impl.PacienteCasoUsoImpl;
import com.uisrael.veoptics.aplicacion.casouso.impl.RolCasoUsoImpl;
import com.uisrael.veoptics.aplicacion.casouso.impl.UsuarioCasoUsoImpl;
import com.uisrael.veoptics.dominio.repositorios.IHistoriaClinicaRepositorio;
import com.uisrael.veoptics.dominio.repositorios.IOptometristaRepositorio;
import com.uisrael.veoptics.dominio.repositorios.IPacienteRepositorio;
import com.uisrael.veoptics.dominio.repositorios.IRolRepositorio;
import com.uisrael.veoptics.dominio.repositorios.IUsuarioRepositorio;
import com.uisrael.veoptics.infraestructura.persistencia.adaptadores.HistoriaClinicaRepositorioImpl;
import com.uisrael.veoptics.infraestructura.persistencia.adaptadores.OptometristaRepositorioImpl;
import com.uisrael.veoptics.infraestructura.persistencia.adaptadores.PacienteRepositorioImpl;
import com.uisrael.veoptics.infraestructura.persistencia.adaptadores.RolRepositorioImpl;
import com.uisrael.veoptics.infraestructura.persistencia.adaptadores.UsuarioRepositorioImpl;
import com.uisrael.veoptics.infraestructura.persistencia.mapeadores.IHistoriaClinicaJpaMapper;
import com.uisrael.veoptics.infraestructura.persistencia.mapeadores.IOptometristaJpaMapper;
import com.uisrael.veoptics.infraestructura.persistencia.mapeadores.IPacienteJpaMapper;
import com.uisrael.veoptics.infraestructura.persistencia.mapeadores.IRolJpaMapper;
import com.uisrael.veoptics.infraestructura.persistencia.mapeadores.IUsuarioJpaMapper;
import com.uisrael.veoptics.infraestructura.repositorios.IHistoriaClinicaJpaRepositorio;
import com.uisrael.veoptics.infraestructura.repositorios.IOptometristaJpaRepositorio;
import com.uisrael.veoptics.infraestructura.repositorios.IPacienteJpaRepositorio;
import com.uisrael.veoptics.infraestructura.repositorios.IRolJpaRepositorio;
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
	IOptometristaRepositorio optometristaRepositorio(IOptometristaJpaRepositorio jpaRepositorio, IOptometristaJpaMapper mapper) {
		return new OptometristaRepositorioImpl(jpaRepositorio, mapper);
	};

	@Bean
	IOptometristaCasoUso optometristaCasoUso(IOptometristaRepositorio repositorio) {
		return new OptometristaCasoUsoImpl(repositorio);
	};
	
	@Bean

	IUsuarioRepositorio usuarioRepositorio(IUsuarioJpaRepositorio jpaRepositorio, IUsuarioJpaMapper mapper) {
		return new UsuarioRepositorioImpl(jpaRepositorio, mapper);
	};

	@Bean
	IUsuarioCasoUso usuarioCasoUso(IUsuarioRepositorio repositorio) {
		return new UsuarioCasoUsoImpl(repositorio);
	};
	
	@Bean
	IRolRepositorio rolRepositorio(IRolJpaRepositorio jpaRepositorio, IRolJpaMapper mapper) {
		return new RolRepositorioImpl(jpaRepositorio, mapper);
		
	};
	
	@Bean
	IRolCasoUso rolCasoUso(IRolRepositorio repositorio) {
		return new RolCasoUsoImpl(repositorio);
	};
	
	@Bean
	IHistoriaClinicaRepositorio historiaClinicaRepositorio(IHistoriaClinicaJpaRepositorio jpaRepositorio, IHistoriaClinicaJpaMapper mapper) {
		return new HistoriaClinicaRepositorioImpl(jpaRepositorio, mapper);
	}
	
	@Bean
	IHistoriaClinicaCasoUso historiaClinicaCasoUso(IHistoriaClinicaRepositorio repositorio) {
		return new HistoriaClinicaCasoUsoImpl(repositorio);
	}

}
