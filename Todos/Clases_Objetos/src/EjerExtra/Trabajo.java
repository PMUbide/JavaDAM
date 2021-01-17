package EjerExtra;

public class Trabajo {
	protected int identificador;
	private static int idInicial = 0;
	protected String descripcion;
	protected double horas = 0;
	protected boolean finalizado = false;
	protected double precio;
	
	
	public Trabajo(String descripcion, double horas, boolean finalizado) {
		this.identificador = idInicial;
		idInicial++;
		this.descripcion = descripcion;
		this.horas += horas;
		this.finalizado = finalizado;
		this.precio = horas * 30;
	}
	
	public Trabajo() {
		
	}
	
	
	public int getPrecio() {
		return identificador;
	}

	public int getIdentificador() {
		return identificador;
	}

	public void setIdentificador(int identificador) {
		this.identificador = identificador;
	}

	public int getIdInicial() {
		return idInicial;
	}


	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public double getHoras() {
		return horas;
	}

	public void setHoras(double horas) {
		if(!finalizado) {
			this.horas += horas;
		}
	}

	public boolean isFinalizado() {
		return finalizado;
	}

	public void setFinalizado(boolean finalizado) {
		this.finalizado = finalizado;
	}
	
	public String ToString() {
		
		return "El id: " + identificador + " numero horas " + horas + "finalizado " + ((finalizado) ? "si" : "no" ) + " precio = " + precio; 
	}
	
	
	

}
