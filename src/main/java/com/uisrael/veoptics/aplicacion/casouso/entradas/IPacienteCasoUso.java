package com.uisrael.veoptics.aplicacion.casouso.entradas;

import java.util.List;

import com.uisrael.veoptics.dominio.entidades.Paciente;

public interface IPacienteCasoUso {

	Paciente crear(Paciente paciente);

	Paciente obtenerPorId(int id);

	List<Paciente> listar();

	void eliminar(int id);

}
