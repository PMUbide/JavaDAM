package Repaso3;

import java.util.Arrays;

public class ListaDoble {
	private int size;
	private Nodo primerNodo;
	private Nodo ultimoNodo;
	
	public ListaDoble() {
		this.size = 0;
	}
	
	public void insert(Nodo n) {
		if(size == 0) {
			primerNodo = n;
			ultimoNodo = n;
		}else {
			n.setAnterior(ultimoNodo);
			ultimoNodo.setSiguiente(n);
			ultimoNodo = n;
		}
		size++;
	}
	
	public void delete(int posicion) {
		if(size == 0) {
			System.out.println("Lista vac�a");
			return;
		}
		if(posicion == 0) {
			primerNodo.getSiguiente().setAnterior(null);
			primerNodo = primerNodo.getSiguiente();
			size--;
		}else if(posicion >= size-1) {
			if(size == 2) {
				ultimoNodo = ultimoNodo.getAnterior();
				ultimoNodo.setSiguiente(null);
				size--;
			}else {
				ultimoNodo = ultimoNodo.getAnterior();
				ultimoNodo.setSiguiente(null);
				size--;
			}
		}else {
			Nodo puntero = primerNodo;
			for (int i = 1; i <= posicion; i++) {
				puntero = puntero.getSiguiente();
			}
			puntero.getAnterior().setSiguiente(puntero.getSiguiente());
			puntero.getSiguiente().setAnterior(puntero.getAnterior());
			size--;
		}
		
	}
	
	
	/**
	 * Método que elimina todas las posiciones del array.
	 * @param posicionEliminar
	 */
	public void deleteTotal(int[] posicionEliminar) {
		//Antes de eliminar ordenar posiciones
		Arrays.sort(posicionEliminar);
		for (int i : posicionEliminar) {
			System.out.println(i);
		}
		for (int i = posicionEliminar.length - 1; i >= 0; i--) {
			System.out.println("posicion " + i + " con numero " + posicionEliminar[i]);
			delete(posicionEliminar[i] - 1);
		}
	}
	
	
	public void insert(Nodo n, int posicion) {
		if(size == 0) {
			primerNodo = n;
			ultimoNodo = n;
			size++;
			return;
		}
		if(posicion == 0) {
			primerNodo.setAnterior(n);
			n.setSiguiente(primerNodo);
			primerNodo = n;
			size++;
		}else if(posicion >= size - 1) {
			n.setAnterior(ultimoNodo);
			ultimoNodo.setSiguiente(n);
			ultimoNodo = n;
			size++;
		}else {
			Nodo puntero = primerNodo;
			for (int i = 1; i < posicion; i++) {
				puntero = puntero.getSiguiente();
			}
			n.setSiguiente(puntero.getSiguiente());
			n.setAnterior(puntero);
			puntero.setSiguiente(n);
			size++;
		}
		
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
