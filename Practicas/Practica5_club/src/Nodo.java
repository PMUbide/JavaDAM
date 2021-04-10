

public class Nodo {
	
	private Socio contenido;
	private Nodo siguiente;
	private Nodo anterior;
	
	public Nodo(Socio contenido) {
		this.contenido = contenido;
		anterior = null;
		siguiente = null;
	}

	
	public Socio getContenido() {
		return contenido;
	}

	public void setContenido(Socio contenido) {
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
