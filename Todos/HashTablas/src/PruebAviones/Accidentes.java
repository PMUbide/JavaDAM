package PruebAviones;

public class Accidentes {
	
		private String fecha;
		private String lugar;
		private String hora;
		private String tipoAvion;
		
		public Accidentes(String fecha, String lugar, String hora, String tipo) {
			this.fecha = fecha;
			this.lugar = lugar;
			this.hora = hora;
			this.tipoAvion = tipo;
		}

		public String toString() {
			return "Fecha " + fecha + ". hora: " + hora + ". lugar " + lugar + " AVION: "+ tipoAvion;
		}
		
		
		public String getFecha() {
			return fecha;
		}

		public void setFecha(String fecha) {
			this.fecha = fecha;
		}

		public String getLugar() {
			return lugar;
		}

		public void setLugar(String lugar) {
			this.lugar = lugar;
		}

		public String getHora() {
			return hora;
		}

		public void setHora(String hora) {
			this.hora = hora;
		}

		public String getTipoAvion() {
			return tipoAvion;
		}

		public void setTipoAvion(String tipo) {
			this.tipoAvion = tipo;
		}
		
}
