package Colas;

public class Cola {
//	Una lista se comporta como una cola si las inserciones las hacemos al final
//	y las extracciones las hacemos por el frente de la lista. También se las llama listas
//	FIFO (First In First Out - primero en entrar primero en salir).
//		- public void insertar (insert): añade un elemento a la lista.
//		- public Nodo eliminar (remove): retira un elemento de la lista
//		- public boolean estaVacia (isEmpty): comprueba si la lista está vacía.
	private int size;
	private Nodo last;
	private Nodo first;
	
	public Cola() {
		size = 0;
	}
	
	public Nodo remove() {
		if(isEmpty()) {
			return null;
		}else{
			Nodo rem = first;
			first = rem.getSiguiente();
			size--;
			return rem;
		}
	}
	
	
	public void insert(Nodo n) {
		if(isEmpty()) {
			last = n;
			first = n;
		}else {
			last.setSiguiente(n);
			last = n;
		}
		size++;
	}
	
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

	public Nodo getLast() {
		return last;
	}

	public void setLast(Nodo last) {
		this.last = last;
	}

	public Nodo getFirst() {
		return first;
	}

	public void setFirst(Nodo first) {
		this.first = first;
	}
	
	
}
