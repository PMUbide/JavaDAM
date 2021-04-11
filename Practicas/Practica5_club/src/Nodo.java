import java.io.Serializable;

public class Nodo implements Serializable{
	
	private Socio contenido; //Contenido del nodo que es un socio.
	private Nodo siguiente; //Enlace al nodo siguiente.
	private Nodo anterior; //enlace al nodo anterior.
	
	/**
	 * Constructor de un nodo por defecto.
	 * @param contenido -> Recibe un socio.
	 */
	public Nodo(Socio contenido) {
		this.contenido = contenido;
		anterior = null;
		siguiente = null;
	}

	/**
	 * M�todo getter del contenido del nodo.
	 * @return -> Devuelve un objeto Socio.
	 */
	public Socio getContenido() {
		return contenido;
	}

	/**
	 * M�todo setter del contenido de un nodo.
	 * @param contenido -> Recibe un socio.
	 */
	public void setContenido(Socio contenido) {
		this.contenido = contenido;
	}

	/**
	 * M�todo getter del nodo siguiente.
	 * @return -> devuelve el siguiente nodo.
	 */
	public Nodo getSiguiente() {
		return siguiente;
	}

	/**
	 * M�todo setter del nodo siguiente.
	 * @param siguiente -> Recibe un nodo.
	 */
	public void setSiguiente(Nodo siguiente) {
		this.siguiente = siguiente;
	}

	/**
	 * M�todo getter del anterior.
	 * @return -> Devuelve un nodo.
	 */
	public Nodo getAnterior() {
		return anterior;
	}

	/**
	 * M�todo setter del nodo anterior.
	 * @param anterior -> Recibe un nodo.
	 */
	public void setAnterior(Nodo anterior) {
		this.anterior = anterior;
	}
	
	
	
}
