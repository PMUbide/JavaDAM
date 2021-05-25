package Ejercicio1;

public class Tupla {
	private String palabra; //almacena la palabra encontrada
	private int linea; //Almacena la línea donde la ha encontrado
	
	/**
	 * Constructor tupla, para palabra encontrada y su línea.
	 * @param palabra
	 * @param linea
	 */
	public Tupla(String palabra, int linea) {
		this.palabra = palabra;
		this.linea = linea;
	}

	/**
	 * @return the palabra
	 */
	public String getPalabra() {
		return palabra;
	}

	/**
	 * @param palabra the palabra to set
	 */
	public void setPalabra(String palabra) {
		this.palabra = palabra;
	}

	/**
	 * @return the linea
	 */
	public int getLinea() {
		return linea;
	}

	/**
	 * @param linea the linea to set
	 */
	public void setLinea(int linea) {
		this.linea = linea;
	}

	@Override
	public String toString() {
		return "Palabra: '" + palabra + "' , en la linea " + linea;
	}
	
	
}
