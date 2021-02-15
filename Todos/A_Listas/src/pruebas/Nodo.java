package pruebas;

public class Nodo {
	private Nodo siguiente; //Puntero al siguiente nodo de la lista enlazada
	private int contenido; //Almacena el entero
	
	public Nodo(int contenido, Nodo siguiente) {
		this.contenido = contenido;
		this.siguiente = siguiente;
	}
	
	public Nodo getSiguiente() {
		return siguiente;
	}
	public void setSiguiente(Nodo siguiente) {
		this.siguiente = siguiente;
	}
	public Object getContenido() {
		return contenido;
	}
	public void setContenido(int contenido) {
		this.contenido = contenido;
	}
	
}
