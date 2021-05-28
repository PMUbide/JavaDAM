package com.ExamenEdd;


/**
 * Esta clase representa la estructura de una lista enlazada simple
 * en Java.
 * 
 * @author Ã�lvaro Juan Ciriaco
 */
class ListaEnlazadaSimple {
	private Nodo primerNodo; 	// Puntero al primer nodo de la lista
	private int tamano;			// Almacena el tamano de la lista
	
	public ListaEnlazadaSimple() {
		primerNodo = null;
		tamano = 0;
	}

	public Nodo getPrimerNodo() {
		return primerNodo;
	}

	/**
	 * Pre: ---
	 * Post: actualiza el valor del primer nodo de la lista
	 */
	public void setPrimerNodo(Nodo primerNodo) {
		this.primerNodo = primerNodo;
	}

	/**
	 * Pre: ---
	 * Post: devuelve el tamano de la lista enlazada simple
	 */
	public int getTamano() {
		return tamano;
	}

	/**
	 * Pre: ---
	 * Post: actualiza el valor del tamano de la lista.
	 */
	public void setTamano(int tamano) {
		this.tamano = tamano;
	}
	
	/**
	 * Pre: [nuevoNodo] != null
	 * Post: anade el nodo [nuevoNodo] a la lista enlazada simple.
	 * 		Siempre anade el nodo al final de lista. 
	 */
	public void anadir(Nodo nuevoNodo) {
		if(tamano == 0) {
			primerNodo = nuevoNodo;
		} else {
			Nodo puntero = primerNodo;
			for(int i = 1; i < tamano; i++) {
				puntero = puntero.getSiguiente();
			}
			puntero.setSiguiente(nuevoNodo);
		}
		tamano++;
	}
	
	/**
	 * Pre: ---
	 * Post: elimina el nodo situado en la posicion [indice] de 
	 * 		la lista enlazada simple.
	 */
	public void eliminar(int indice) {
		// Primero mirmaos si la lista tiene algÃºn elemento
		// y ademas comprobamos que el indice del elemento
		// que queremos eliminar se encuentra dentro del tamaÃ±o
		if(tamano > 0 && indice < tamano) {
			// Si el elemento es el primero, simplemente
			// actualizamos el primerNodo.
			if(indice == 0) {
				primerNodo = primerNodo.getSiguiente();
			} else {
				// Si no es el primero, recorremos la lista y
				// actualizamos el siguienteNodo que corresponde
				Nodo puntero = primerNodo;
				for(int i = 1; i < tamano; i++) {
					if(i == indice) {
						puntero.setSiguiente(puntero.
								getSiguiente().getSiguiente());
						break;
					} 
					puntero = puntero.getSiguiente();
				}
			} tamano--;
		}
	}
	
	/**
	 * Pre: ---
	 * Post: devuelve el primer nodo de la lista enlazada simple cuyo
	 * 		contenido sea igual al valor de [contenido] pasado 
	 * 		como parametro. En caso de no existir, devuelve null.
	 */
	public Nodo buscar(int contenido) {
		if(tamano > 0) {
			Nodo puntero = primerNodo;
			for(int i = 1; i < tamano; i++) {
				if(puntero.getContenido() == contenido) {
					return puntero;
				} puntero = puntero.getSiguiente();
			}
		} return null;
	}
	
	public void mostrar() {
		if(tamano > 0) {
			System.out.println("----------------------");
			Nodo puntero = primerNodo;
			for(int i = 0; i < tamano; i++) {
				System.out.println("[ " + i + " ] -> Contenido = " + puntero.getContenido());
				puntero = puntero.getSiguiente();
			}
		}
	}
}
