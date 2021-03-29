package Pilas;

public class Nodo {
	private Nodo siguiente;
	//private Nodo anterior;
	private int contenido;
	
	public Nodo(int contenido, Nodo siguiente) {
		this.siguiente = siguiente;
		this.contenido = contenido;
	}
	
	public Nodo(int contenido) {
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

	public void setAlumno(int c) {
		this.contenido = c;
	}

	
	
	
	
}
