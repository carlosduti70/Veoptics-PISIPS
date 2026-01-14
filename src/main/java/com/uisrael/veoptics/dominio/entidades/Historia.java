package com.uisrael.veoptics.dominio.entidades;

import java.time.LocalDate;

public final class Historia {
	
	private final int id_historia;
	private final String tbl_antecedente;
	private final String tbl_diagnostico;
	private final String tbl_notas_clinica;
	private final LocalDate tbl_fecha;
	
	
	public Historia(int id_historia, String tbl_antecedente, String tbl_diagnostico, String tbl_notas_clinica,
			LocalDate tbl_fecha) {
		
		this.id_historia = id_historia;
		this.tbl_antecedente = tbl_antecedente;
		this.tbl_diagnostico = tbl_diagnostico;
		this.tbl_notas_clinica = tbl_notas_clinica;
		this.tbl_fecha = tbl_fecha;
	}


	public int getId_historia() {
		return id_historia;
	}


	public String getTbl_antecedente() {
		return tbl_antecedente;
	}


	public String getTbl_diagnostico() {
		return tbl_diagnostico;
	}


	public String getTbl_notas_clinica() {
		return tbl_notas_clinica;
	}


	public LocalDate getTbl_fecha() {
		return tbl_fecha;
	}


	@Override
	public String toString() {
		return "HistoriaClinica [id_historia=" + id_historia + ", tbl_antecedente=" + tbl_antecedente
				+ ", tbl_diagnostico=" + tbl_diagnostico + ", tbl_notas_clinica=" + tbl_notas_clinica + ", tbl_fecha="
				+ tbl_fecha + "]";
	}

	
	
	
}
