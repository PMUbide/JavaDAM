package Tarea3;

public class Nodo {
	
	private Nodo siguiente; //Nodo siguiente
	private int contenido; //contenido del nodo
	
	/**
	 * Constructor de un nodo
	 * @param contenido -> Recibe un int del contenido
	 */
	public Nodo(int contenido) {
		this.siguiente = null;
		this.contenido = contenido;
	}

	/**
	 * Contructor de un nodo
	 * @param siguiente -> REcibe un Nodo con el siguiente nodo
	 * @param contenido -> Recibe un int del contenido
	 */
	public Nodo(Nodo siguiente, int contenido) {
		this.siguiente = siguiente;
		this.contenido = contenido;
	}

	/**
	 * Método getter del nodo Siguiente
	 * @return -> Devuelve un Nodo
	 */
	public Nodo getSiguiente() {
		return siguiente;
	}

	/**
	 * Método Setter del nodo siguiente
	 * @param siguiente -> Recibe un nodo
	 */
	public void setSiguiente(Nodo siguiente) {
		this.siguiente = siguiente;
	}

	/**
	 * Método getter del contenido
	 * @return -> Devuelve un int del contenido
	 */
	public int getContenido() {
		return contenido;
	}

	/**
	 * Método setter del contenido
	 * @param contenido -> recibe un int del contenido.
	 */
	public void setContenido(int contenido) {
		this.contenido = contenido;
	}
	
	
}
