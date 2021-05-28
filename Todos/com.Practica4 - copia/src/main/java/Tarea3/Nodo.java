package Tarea3;

public class Nodo {
	
	private Nodo siguiente;
	private int contenido;
	
	public Nodo(int contenido) {
		this.siguiente = null;
		this.contenido = contenido;
	}

	public Nodo(Nodo siguiente, int contenido) {
		this.siguiente = siguiente;
		this.contenido = contenido;
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
