package Ejercicio3;

public class Television extends Electrodomestico{
	private int resolucion; // en pulgadas
	private boolean sintonizador; //si tiene o  no sintonizador tdt
	public Television() { //Métotod 
		super();
		// TODO Auto-generated constructor stub
		resolucion = 20;
		sintonizador = false;
	}
	public Television(double precioBase, double peso) {
		super(precioBase, peso);
		// TODO Auto-generated constructor stub
		resolucion = 20;
		sintonizador = false;
//		precio = precioFinal2(precioBase);
	}
	public Television(int precioBase, String color, String consumo, double peso, int resolucion, boolean sintonizador) {
		super(precioBase, color, consumo, peso);
		// TODO Auto-generated constructor stub
		this.resolucion = resolucion;
		this.sintonizador = sintonizador;
		
	}
	public double precioFinal() {
		double precio = super.precioFinal();
		
		if (sintonizador == true) {
			precio += 50;
		}
		if (resolucion > 40) {
			precio = (precio * 0.3) + precio;
		}
		return precio;
		
		
	}
	
	
	public int getResolucion() {
		return resolucion;
	}
	public boolean isSintonizador() {
		return sintonizador;
	}
	
}
