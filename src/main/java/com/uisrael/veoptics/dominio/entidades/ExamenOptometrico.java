package com.uisrael.veoptics.dominio.entidades;

import java.time.LocalDate;


public class ExamenOptometrico {
		private final int idexamen;
		private final int idpaciente;
		private final int idcertificado;
		private final LocalDate fecha;
		private final String esfera_od;
		private final String cilindro_od;
		private final String eje_od;
		private final String esfera_oi;
		private final String cilindro_oi;
		private final String eje_oi;
		private final String adicion_od;
		private final int idoptometrista;
		private final String adicion_oi;
		private final String agudeza_visual_cerca_oi;
		private final String agudeza_visual_lejos_oi;
		private final String agudeza_visual_lejos_od;
		private final String agudeza_visual_cerca_od;
		private final String altura_oi;
		private final String altura_od;
		
		public ExamenOptometrico(int idexamen, int idpaciente, int idcertificado, LocalDate fecha, String esfera_od,
				String cilindro_od, String eje_od, String esfera_oi, String cilindro_oi, String eje_oi, String adicion_od,
				int idoptometrista, String adicion_oi, String agudeza_visual_cerca_oi, String agudeza_visual_lejos_oi,
				String agudeza_visual_lejos_od, String agudeza_visual_cerca_od, String altura_oi, String altura_od) {
			
			this.idexamen = idexamen;
			this.idpaciente = idpaciente;
			this.idcertificado = idcertificado;
			this.fecha = fecha;
			this.esfera_od = esfera_od;
			this.cilindro_od = cilindro_od;
			this.eje_od = eje_od;
			this.esfera_oi = esfera_oi;
			this.cilindro_oi = cilindro_oi;
			this.eje_oi = eje_oi;
			this.adicion_od = adicion_od;
			this.idoptometrista = idoptometrista;
			this.adicion_oi = adicion_oi;
			this.agudeza_visual_cerca_oi = agudeza_visual_cerca_oi;
			this.agudeza_visual_lejos_oi = agudeza_visual_lejos_oi;
			this.agudeza_visual_lejos_od = agudeza_visual_lejos_od;
			this.agudeza_visual_cerca_od = agudeza_visual_cerca_od;
			this.altura_oi = altura_oi;
			this.altura_od = altura_od;
		}
		

		
		public int getIdexamen() {
			return idexamen;
		}

		public int getIdpaciente() {
			return idpaciente;
		}

		public int getIdcertificado() {
			return idcertificado;
		}

		public LocalDate getFecha() {
			return fecha;
		}

		public String getEsfera_od() {
			return esfera_od;
		}

		public String getCilindro_od() {
			return cilindro_od;
		}

		public String getEje_od() {
			return eje_od;
		}

		public String getEsfera_oi() {
			return esfera_oi;
		}

		public String getCilindro_oi() {
			return cilindro_oi;
		}

		public String getEje_oi() {
			return eje_oi;
		}

		public String getAdicion_od() {
			return adicion_od;
		}

		public int getIdoptometrista() {
			return idoptometrista;
		}

		public String getAdicion_oi() {
			return adicion_oi;
		}

		public String getAgudeza_visual_cerca_oi() {
			return agudeza_visual_cerca_oi;
		}

		public String getAgudeza_visual_lejos_oi() {
			return agudeza_visual_lejos_oi;
		}

		public String getAgudeza_visual_lejos_od() {
			return agudeza_visual_lejos_od;
		}

		public String getAgudeza_visual_cerca_od() {
			return agudeza_visual_cerca_od;
		}

		public String getAltura_oi() {
			return altura_oi;
		}

		public String getAltura_od() {
			return altura_od;
		}

}
