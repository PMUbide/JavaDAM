package Aeropuerto;

public class Pila {
	private int size;
	private Nodo primerNodo;
	private Nodo ultimoNodo;
	
	
	/**
	 * Constructor Pila
	 */
	public Pila() {
		this.size = 0;
	}
	
	public void push(Nodo n) {
		if(size == 0) {
			primerNodo = n;
			ultimoNodo = n;
			size++;
			return;
		}
		if(size < 3) {
			n.setSiguiente(ultimoNodo);
			ultimoNodo = n;
			size++;
		}else {
			System.out.println("Pila llena.");
		}
	}
	
	public Nodo pop() {
		if(size > 0) {
			Nodo aux = ultimoNodo;
			ultimoNodo = ultimoNodo.getSiguiente();
			size--;
			return aux;
		}
		System.out.println("Pila vacia");
		return null;
	}
	
	
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}

	public Nodo getPrimerNodo() {
		return primerNodo;
	}

	public void setPrimerNodo(Nodo primerNodo) {
		this.primerNodo = primerNodo;
	}

	public Nodo getUltimoNodo() {
		return ultimoNodo;
	}

	public void setUltimoNodo(Nodo ultimoNodo) {
		this.ultimoNodo = ultimoNodo;
	}
	
	
	
}
