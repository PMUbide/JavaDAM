package bloque4;

public class Pila {
	
	private int size; //Número elementos en la pila
	private Nodo ultimo; //nodo ultimo añadido
	
	/**
	 * Constructor por defecto de la pila que crea los 2 nodos y establece
	 * el size en 2.
	 */
	public Pila() {
		size = 2;
		ultimo = new Nodo(0);
		ultimo.setSiguiente(new Nodo(0));
	}

	/**
	 * Método para añadir un Nodo a la pila
	 * @param n -> Recibe un Nodo
	 */
	public void push(Nodo n) {
		if(n.getContenido() > 2 && n.getContenido() < 50) {
			if(isEmpty()) {
				ultimo = n;
			}else {
				n.setSiguiente(ultimo);
				ultimo = n;
			}
			size++;
		}
	}
	
	/*
	 * Método que quita de la lista el ultimo nodo
	 *  y te lo devuelve.
	 */
	public Nodo pop() {
		if(size <= 2) {
			return null;
		}else {
			Nodo n = ultimo;
			ultimo = ultimo.getSiguiente();
			size--;
			return n;
		}
	}
	
	/**
	 * Si está vacío.
	 * @return -> True si vacía, false sino.
	 */
	public boolean isEmpty() {
		if(size == 0) {
			return true;
		} return false;
	}

	
	/**
	 * Método getter del size de la pila
	 * @return
	 */
	public int getSize() {
		return size;
	}

	
	/**
	 * Método getter del atributo
	 * último nodo
	 * @return -> Nodo último
	 */
	public Nodo getUltimo() {
		return ultimo;
	}

	
	
}
