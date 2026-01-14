package com.uisrael.veoptics.presentacion.dto.response;

import java.time.LocalDate;


public class HistoriaCliniciaResponseDTO {

		private  int idHistoria;
		private  String antecedente;
		private  String diagnostico;
		private  String notasClinica;
		private  LocalDate fecha;
		private  char estado;
		
		public int getIdHistoria() {
			return idHistoria;
		}
		public void setIdHistoria(int idHistoria) {
			this.idHistoria = idHistoria;
		}
		public String getAntecedente() {
			return antecedente;
		}
		public void setAntecedente(String antecedente) {
			this.antecedente = antecedente;
		}
		public String getDiagnostico() {
			return diagnostico;
		}
		public void setDiagnostico(String diagnostico) {
			this.diagnostico = diagnostico;
		}
		public String getNotasClinica() {
			return notasClinica;
		}
		public void setNotasClinica(String notasClinica) {
			this.notasClinica = notasClinica;
		}
		public LocalDate getFecha() {
			return fecha;
		}
		public void setFecha(LocalDate fecha) {
			this.fecha = fecha;
		}
		public char getEstado() {
			return estado;
		}
		public void setEstado(char estado) {
			this.estado = estado;
		}
	
}
