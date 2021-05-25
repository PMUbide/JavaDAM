package Ejercicio3;

public class Nodo {
	private Nodo siguiente; //Puntero al siguiente nodo de la lista enlazada
	private int contenido; //Almacena el entero
	
	/**
	 * Contructor de un nodo con parámetros.
	 * @param contenido
	 * @param siguiente
	 */
	public Nodo(int contenido, Nodo siguiente) {
		this.contenido = contenido;
		this.siguiente = siguiente;
	}
	
	/**
	 * Constructor por defecto
	 * @param contenido
	 */
	public Nodo(int contenido) {
		this.contenido = contenido;
		this.siguiente = null;
	}
	
	public Nodo getSiguiente() {
		return siguiente;
	}
	public void setSiguiente(Nodo siguiente) {
		this.siguiente = siguiente;
	}
	public int getContenido() {
		return contenido;
	}
	public void setContenido(int contenido) {
		this.contenido = contenido;
	}
	
}
