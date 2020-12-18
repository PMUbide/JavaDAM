package Ejercicio3;

public class Lavadora extends Electrodomestico{
	private int carga = 5; // en kg
	
	public Lavadora(double precioBase, String color, String consumo, double peso, int carga) {
		super(precioBase, color, consumo, peso);
		// TODO Auto-generated constructor stub
		this.carga = carga;
	}
	public Lavadora (double precioBase, double peso) {
		super(precioBase, peso);
		// TODO Auto-generated constructor stub
		this.carga = 5;
		
	}
	public Lavadora() {
		super();
		// TODO Auto-generated constructor stub
		this.carga = 5;
	}
	public double precioFinal() {
		double precio = super.precioFinal();
		if (this.carga > 30) {
			precio += 50;
		}
		return precio;
	}
	
	public void setCarga(int carga) {
		this.carga = carga;
	}
	
	public int getCarga() {
		return carga;
	}


	
}
