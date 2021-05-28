package bloque4;

public class Nodo {
	private Nodo siguiente; //variable señala al Nodo siguiente
	private int contenido; //Variable del contenido del Nodo
	

	/**
	 * Constructor de un Nodo enviandole un contenido
	 * @param contenido -> int con el número
	 */
	public Nodo(int contenido) {
		this.contenido = contenido;
		this.siguiente = null;
	}


	/**
	 * @return el siguiente
	 */
	public Nodo getSiguiente() {
		return siguiente;
	}


	/**
	 * @param siguiente hace setter
	 */
	public void setSiguiente(Nodo siguiente) {
		this.siguiente = siguiente;
	}


	/**
	 * @return el contenido
	 */
	public int getContenido() {
		return contenido;
	}


	/**
	 * @param contenido hace setter
	 */
	public void setContenido(int contenido) {
		this.contenido = contenido;
	}

	
	
	
	
	
	
}
