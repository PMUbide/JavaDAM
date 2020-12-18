package coches;

public class Coche {

	private int ruedas; //nº ruedas HAciendola privada, se ENCAPSULA la propiedad. No se podrá modificar fuera de la clase.
	private int largo; //en cm
	private int ancho;	//en cm
	private int motor; //cc del motor
	private int peso; //en kg
	private String color;
	private String color_especial;
	private boolean asientos;
	private boolean climatizador;
	private int precio;
	
	
	public Coche() {
		ruedas = 4;
		largo = 2000;
		ancho = 300;
		motor = 1600;
		peso = 500;
		precio = 20000; //en euros
	}
	
	public int getPrecio() {
		
		if (climatizador == true) {
			this.precio += 500; 
		}
		if (asientos == true) {
			this.precio += 1000;
		}
		return precio;
	}
	
	
	public String getClimatizador() {
		if (climatizador == true) {
			return "Si tiene instalado climatizador";
		}else {
			return "No tiene climatizador";
		}
	}


	public void setClimatizador(String climatizador) {
		if (climatizador.equalsIgnoreCase("si")) {
			this.climatizador = true;
		}else {
			this.climatizador = false;
		}
		
	}


	public void configura_asientos(String asientos_cuero) { //SETTER
		
		if(asientos_cuero.equalsIgnoreCase("si") || asientos_cuero.equalsIgnoreCase("s")  ) {
			asientos = true;
		}
		else {
			asientos = false;
		}
	}

	public String dime_asientos() {
		if (asientos == true) {
			return "El coche tendrá asientos de cuero";
		}
		else {
			return "El coche no tiene asientos especiales.";
		}
	}
	
	
	
	public String dimeTodo() {
		return "El objeto tiene " + ruedas + " ruedas y sus dimensiones son " + largo+ " cm largo, y " + ancho + " cm de ancho.";
	}
	public void setColor(String color_coche, String color_especial) {
		color = color_coche;
		this.color_especial = color_especial;
		
	}
	
	public String getColor() {
		return color +" "+ color_especial;
	}

	public int getRuedas() {
		return ruedas;
	}


	public void setRuedas(int ruedas) {
		this.ruedas = ruedas;
	}


	public int getLargo() {
		return largo;
	}


	public void setLargo(int largo) {
		this.largo = largo;
	}


	public int getAncho() {
		return ancho;
	}


	public void setAncho(int ancho) {
		this.ancho = ancho;
	}


	public int getMotor() {
		return motor;
	}


	public void setMotor(int motor) {
		this.motor = motor;
	}


	public int getPeso() {
		return peso;
	}


	public void setPeso(int peso) {
		this.peso = peso;
	}
	
	
	
	
}
