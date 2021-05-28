package Repaso3;

public class Nodo {
	private int contenido;
	private Nodo siguiente;
	private Nodo anterior;
	
	public Nodo(int contenido) {
		this.contenido = contenido;
		anterior = null;
		siguiente = null;
	}

	public int getContenido() {
		return contenido;
	}

	public void setContenido(int contenido) {
		this.contenido = contenido;
	}

	public Nodo getSiguiente() {
		return siguiente;
	}

	public void setSiguiente(Nodo siguiente) {
		this.siguiente = siguiente;
	}

	public Nodo getAnterior() {
		return anterior;
	}

	public void setAnterior(Nodo anterior) {
		this.anterior = anterior;
	}
	
	
	
}
