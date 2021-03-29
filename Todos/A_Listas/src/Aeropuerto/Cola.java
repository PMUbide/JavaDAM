package Aeropuerto;

public class Cola {
	private int size;
	private Nodo primerNodo;
	
	
	public Cola() {
		this.size = 0;
	}

	public void insert(Nodo n) {
		if(size == 0) {
			primerNodo = n;
			
			size++;
			return;
		}
		if(size < 2) {
			primerNodo.setSiguiente(n);
			size++;
		}
	}
	
	public Nodo remove() {
		if(size > 0) {
			Nodo aux = primerNodo;
			primerNodo = primerNodo.getSiguiente();
			size--;
			return aux;
		}
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
