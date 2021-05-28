package bloque4;

public class Pila {
	
	private int size; //N�mero elementos en la pila
	private Nodo ultimo; //nodo ultimo a�adido
	
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
	 * M�todo para a�adir un Nodo a la pila
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
	 * M�todo que quita de la lista el ultimo nodo
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
	 * Si est� vac�o.
	 * @return -> True si vac�a, false sino.
	 */
	public boolean isEmpty() {
		if(size == 0) {
			return true;
		} return false;
	}

	
	/**
	 * M�todo getter del size de la pila
	 * @return
	 */
	public int getSize() {
		return size;
	}

	
	/**
	 * M�todo getter del atributo
	 * �ltimo nodo
	 * @return -> Nodo �ltimo
	 */
	public Nodo getUltimo() {
		return ultimo;
	}

	
	
}
