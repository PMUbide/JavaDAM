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
		this.tipo = tipo;
	}
	
	

	public Reparaciones(String descripcion, double horas, boolean finalizado, int tipo, double precioMaterial) {
		super(descripcion, horas, finalizado);
		// TODO Auto-generated constructor stub
		
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

	public int getTipo() {
		return tipo;
	}
	public void setPrecioMaterial(double precioMaterial) {
		if(!finalizar) {
			if(this.tipo == 1) {
				this.precioMaterial += precioMaterial * 1.1;
			}
			else if(this.tipo == 2) {
				this.precioMaterial += precioMaterial * 1.3;
			}
		}
		else {
			System.out.println("Ese trabajo est� finalizado.");
		}
		this.precio += this.precioMaterial;
	}
	
	
	
	
	
	
}


