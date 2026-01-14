package com.uisrael.veoptics.presentacion.dto.response;

import java.time.LocalDate;



public class CertificadoResponseDTO {
	
	
	private  int id_certificado;
	private  LocalDate tbl_fecha_emision;
	private  String tbl_informacion_certificado;
	private  String tbl_ruta_pdf;
	public int getId_certificado() {
		return id_certificado;
	}
	public void setId_certificado(int id_certificado) {
		this.id_certificado = id_certificado;
	}
	public LocalDate getTbl_fecha_emision() {
		return tbl_fecha_emision;
	}
	public void setTbl_fecha_emision(LocalDate tbl_fecha_emision) {
		this.tbl_fecha_emision = tbl_fecha_emision;
	}
	public String getTbl_informacion_certificado() {
		return tbl_informacion_certificado;
	}
	public void setTbl_informacion_certificado(String tbl_informacion_certificado) {
		this.tbl_informacion_certificado = tbl_informacion_certificado;
	}
	public String getTbl_ruta_pdf() {
		return tbl_ruta_pdf;
	}
	public void setTbl_ruta_pdf(String tbl_ruta_pdf) {
		this.tbl_ruta_pdf = tbl_ruta_pdf;
	}
	
	
	

}
