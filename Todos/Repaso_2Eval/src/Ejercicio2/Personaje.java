package Ejercicio2;

class Personaje {
	protected String nombre;
	protected double puntosVida;
	
	public Personaje(String nombre) {
		this.nombre = nombre;
		puntosVida = 100;
	}

	public double getPuntosVida() {
		return puntosVida;
	}

	public void restarVida(double puntosVida) {
		this.puntosVida -= puntosVida;
	}
	
	
	
}
