package Ejercicio3;


public class Electrodomestico {
	protected double precioBase;
	protected String color; //colores blanco, negro, rojo, azul y gris.
	protected String consumo; // Letra entre A y F
	protected double peso; //En kg
	protected static int idNuevo = 1;
	private int id;
	
	public Electrodomestico() {
		this.id = idNuevo;
		idNuevo++;
		this.color = "blanco";
		this.consumo = "F";
		this.peso = 5;
	}
	public Electrodomestico(double precioBase, double peso) {
		this.id = idNuevo;
		idNuevo++;
		this.color = "blanco";
		this.consumo = "F";
		this.peso = peso;
		this.precioBase = precioBase;
	}
	public Electrodomestico(double precioBase, String color, String consumo, double peso) {
		this.id = idNuevo;
		idNuevo++;
		this.color = comprobarColor(color);
		this.consumo = comprobarConsumoEnergetico(consumo);
		this.peso = peso;
		this.precioBase = precioBase;
	}
	
	public String comprobarConsumoEnergetico (String letra) {
		if ( letra.equalsIgnoreCase("A") || letra.equalsIgnoreCase("B") || letra.equalsIgnoreCase("C") ||
				letra.equalsIgnoreCase("D") || letra.equalsIgnoreCase("E") || letra.equalsIgnoreCase("F")) {
			return letra;
		}
		else {
			return "F"; 
		}
	}
	public String comprobarColor (String color) {
		if (color.equalsIgnoreCase("blanco") || color.equalsIgnoreCase("azul") ||
				color.equalsIgnoreCase("negro") || color.equalsIgnoreCase("rojo") || color.equalsIgnoreCase("gris") ) {
			return color;
		}
		else {
			return "blanco";
		}
	}
	public double precioFinal () {
		double incremento = 0;
		if (consumo.equalsIgnoreCase("A")) {
			incremento += 100;
		}
		else if (consumo.equalsIgnoreCase("B")) {
			incremento += 80;
		}
		else if (consumo.equalsIgnoreCase("C")) {
			incremento += 60;
		}
		else if (consumo.equalsIgnoreCase("D")) {
			incremento += 50;
		}
		else if (consumo.equalsIgnoreCase("E")) {
			incremento += 30;
		}
		else if (consumo.equalsIgnoreCase("F")) {
			incremento += 10;
		}
		if (peso <=19) {
			incremento +=10;
		}
		else if (peso > 19 && peso <=49) {
			incremento +=50;
		}
		else if (peso > 49 && peso <=79) {
			incremento +=80;
		}
		else if (peso >= 80) {
			incremento +=100;
		}
		return precioBase + incremento;
	}
	
	public int getId() {
		return id;
	}
	public double getPrecioBase() {
		//precioFinal();
		return precioBase;
	}
	public void setPrecioBase(int precioBase) {
		this.precioBase = precioBase;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getConsumo() {
		return consumo;
	}
	public void setConsumo(String consumo) {
		this.consumo = consumo;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}

	
	

	
	
	
}
