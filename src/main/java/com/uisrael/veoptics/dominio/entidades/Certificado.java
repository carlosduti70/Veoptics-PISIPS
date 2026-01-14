package com.uisrael.veoptics.dominio.entidades;

import java.time.LocalDate;

public final class Certificado {
	
	
	
	public Certificado(int id_certificado, LocalDate tbl_fecha_emision, String tbl_informacion_certificado,
			String tbl_ruta_pdf) {
		super();
		this.id_certificado = id_certificado;
		this.tbl_fecha_emision = tbl_fecha_emision;
		this.tbl_informacion_certificado = tbl_informacion_certificado;
		this.tbl_ruta_pdf = tbl_ruta_pdf;
	}
	
	private final int id_certificado;
	private final LocalDate tbl_fecha_emision;
	private final String tbl_informacion_certificado;
	private final String tbl_ruta_pdf;
	public int getId_certificado() {
		return id_certificado;
	}
	public LocalDate getTbl_fecha_emision() {
		return tbl_fecha_emision;
	}
	public String getTbl_informacion_certificado() {
		return tbl_informacion_certificado;
	}
	public String getTbl_ruta_pdf() {
		return tbl_ruta_pdf;
	}
	@Override
	public String toString() {
		return "Certificado [id_certificado=" + id_certificado + ", tbl_fecha_emision=" + tbl_fecha_emision
				+ ", tbl_informacion_certificado=" + tbl_informacion_certificado + ", tbl_ruta_pdf=" + tbl_ruta_pdf
				+ "]";
	}
	
	
	
}
