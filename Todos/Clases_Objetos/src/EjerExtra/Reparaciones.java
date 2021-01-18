package EjerExtra;

public class Reparaciones extends Trabajo {

	private double precioMaterial = 0;  //piezas o pinturas
	private boolean finalizar = false; 
	private int tipo;
	
	public Reparaciones() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Reparaciones(String descripcion, double horas, boolean finalizado, int tipo) {
		super(descripcion, horas, finalizado);
		// TODO Auto-generated constructor stub
	}
	
	

	public Reparaciones(String descripcion, double horas, boolean finalizado, int tipo, double precioMaterial) {
		super(descripcion, horas, finalizado);
		// TODO Auto-generated constructor stub
		if(tipo == 1) {
			this.precio += precioMaterial * 1.1;
		}
		else if(tipo == 2) {
			this.precio += precioMaterial * 1.3;
		}
	}

	
	
	
	
	public boolean isFinalizar() {
		return finalizar;
	}

	public void setFinalizar(boolean finalizar) {
		this.finalizar = finalizar;
	}

	public double getPrecioMaterial() {
		return precioMaterial;
	}

	public void setPrecioMaterial(double precioMaterial) {
		if(!finalizar) {
			this.precioMaterial += precioMaterial;
		}
	}
	
	
	
	
	
	
}


