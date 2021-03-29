package Pilas;

public class Pila {
	private int size;
	private Nodo ultimo;
	
	public Pila() {
		size = 0;
	}

	public void push(Nodo n) {
		if(isEmpty()) {
			ultimo = n;
		}else {
			n.setSiguiente(ultimo);
			ultimo = n;
		}
		size++;
	}
	
	/*
	 * Lo quita de la lista y te lo devuelve.
	 */
	public Nodo pop() {
		if(isEmpty()) {
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
	 * @return
	 */
	public boolean isEmpty() {
		if(size == 0) {
			return true;
		} return false;
	}

	
	
	
	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	

	public Nodo getUltimo() {
		return ultimo;
	}

	public void setUltimo(Nodo ultimo) {
		this.ultimo = ultimo;
	}
	
}
