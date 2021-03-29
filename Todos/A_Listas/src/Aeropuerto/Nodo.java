package Aeropuerto;

public class Nodo {
	private Nodo siguiente;
	private Pasajero contenido;
	
	public Nodo(Pasajero contenido) {
		this.siguiente = null;
		this.contenido = contenido;
	}
	
	public Nodo() {
		this.siguiente = null;
		this.contenido = null;
	}
	

	public Nodo getSiguiente() {
		return siguiente;
	}

	public void setSiguiente(Nodo siguiente) {
		this.siguiente = siguiente;
	}

	public Pasajero getContenido() {
		return contenido;
	}

	public void setPasajero(Pasajero c) {
		this.contenido = c;
	}

	
	
	
	
}
