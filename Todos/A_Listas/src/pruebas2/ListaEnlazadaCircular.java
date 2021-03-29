package pruebas2;

public class ListaEnlazadaCircular {
	int size;
	Nodo primerNodo;
	Nodo ultimoNodo;
	
	public ListaEnlazadaCircular(int size, Nodo primerNodo, Nodo ultimoNodo) {
		this.size = size;
		this.primerNodo = primerNodo;
		this.ultimoNodo = ultimoNodo;
	}
	
	public ListaEnlazadaCircular() {
		this.size = 0;
		this.primerNodo = null;
		this.ultimoNodo = null;
	}

	public void insert(Alumno a, int posicion) {
		if(size == 0) {
			primerNodo = new Nodo(a, null);
			ultimoNodo = new Nodo(a, null);
			primerNodo.setSiguiente(ultimoNodo);
			size++;
			return;
		}
		if(posicion == 0) {
			Nodo nuevo = new Nodo(a, primerNodo);
			primerNodo = nuevo;
			ultimoNodo.setSiguiente(primerNodo);
			size++;
		}else if(posicion > 0 && posicion < size) {
			System.out.println("MITAD");
			Nodo puntero = primerNodo;
			for (int i = 1; i < posicion; i++) {
				puntero = puntero.getSiguiente();
			}
			//Nuevo apunta al siguiente del puntero.
			Nodo nuevo = new Nodo(a, puntero.getSiguiente());
			//Y el puntero apunta ahora su siguiente al que nuevo
			puntero.setSiguiente(nuevo);
			size++;
		}else {
			//Apunta al último.
			System.out.println("ULTIMO");
			Nodo nuevo = new Nodo(a, primerNodo);
			ultimoNodo.setSiguiente(nuevo);
			ultimoNodo = nuevo;
			size++;
		}
	}
	
	public void delete(int posicion) {
		if(size == 0) {
			System.out.println("La lista está vacía.");
			return;
		}
		if(posicion == 0) {
			primerNodo = primerNodo.getSiguiente();
			ultimoNodo.setSiguiente(primerNodo);
			size--;
		}else if(posicion > 0 && posicion < size-1) {
			//Si esta en la mitad
			//System.out.println("MITAD");
			Nodo puntero = primerNodo;
			for (int i = 1; i < posicion; i++) {
				puntero = puntero.getSiguiente();
			}
			puntero.setSiguiente(puntero.getSiguiente().getSiguiente());
			size--;
		}else {
			//Apunta al último.
			System.out.println("ULTIMO");
			Nodo puntero = primerNodo;
			for (int i = 1; i < size - 1; i++) {
				puntero = puntero.getSiguiente();
			}
			puntero.setSiguiente(primerNodo);
			System.out.println("EA");
			this.ultimoNodo = puntero;
			size--;
		}
		
		
	}
	
	public Nodo getNodo(int posicion) {
		Nodo puntero = primerNodo;
		posicion = posicion %size;
		System.out.println("LA posicion es " + posicion);
		for (int i = 1; i <=posicion; i++) {
			puntero = puntero.getSiguiente();
		}
		return puntero;
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

	public void setUltimorNodo(Nodo elminarNodo) {
		this.ultimoNodo = elminarNodo;
	}
	
	
}
