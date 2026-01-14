package com.uisrael.veoptics.presentacion.dto.response;

import java.time.LocalDate;


public class HistoriaResponseDTO {

		private  int id_historia;
		private  String tbl_antecedente;
		private  String tbl_diagnostico;
		private  String tbl_notas_clinica;
		private  LocalDate tbl_fecha;
		public int getId_historia() {
			return id_historia;
		}
		public void setId_historia(int id_historia) {
			this.id_historia = id_historia;
		}
		public String getTbl_antecedente() {
			return tbl_antecedente;
		}
		public void setTbl_antecedente(String tbl_antecedente) {
			this.tbl_antecedente = tbl_antecedente;
		}
		public String getTbl_diagnostico() {
			return tbl_diagnostico;
		}
		public void setTbl_diagnostico(String tbl_diagnostico) {
			this.tbl_diagnostico = tbl_diagnostico;
		}
		public String getTbl_notas_clinica() {
			return tbl_notas_clinica;
		}
		public void setTbl_notas_clinica(String tbl_notas_clinica) {
			this.tbl_notas_clinica = tbl_notas_clinica;
		}
		public LocalDate getTbl_fecha() {
			return tbl_fecha;
		}
		public void setTbl_fecha(LocalDate tbl_fecha) {
			this.tbl_fecha = tbl_fecha;
		}
		
	
}
