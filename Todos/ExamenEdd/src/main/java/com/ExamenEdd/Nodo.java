package com.ExamenEdd;

/**
 * Es clase representa la estructura de un Nodo. Se utiliza
 * en la implementación de la lista enlazada simple.
 * 
 * @author Álvaro Juan Ciriaco
 */
public class Nodo {
	private int contenido; // Almacena el entero 
	private Nodo siguiente;	// Puntero al siguiente nodo de la lista enlazada
	
	public Nodo(int contenido, Nodo siguiente) {
		this.contenido = contenido;
		this.siguiente = siguiente;
	}

	/**
	 * Pre: ---
	 * Post: devuelve el contenido del nodo.
	 */
	public int getContenido() {
		return contenido;
	}

	/**
	 * Pre: ---
	 * Post: actualiza el valor del contenido del nodo.
	 */
	public void setContenido(int contenido) {
		this.contenido = contenido;
	}

	/**
	 * Pre: ---
	 * Post: devuelve el nodo siguiente.
	 */
	public Nodo getSiguiente() {
		return siguiente;
	}

	/**
	 * Pre: ---
	 * Post: actualiza el valor del nodo siguiente de la lista.
	 */
	public void setSiguiente(Nodo siguiente) {
		this.siguiente = siguiente;
	}
	
	
}
