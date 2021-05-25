package Ejercicio3;


public class ListaEnlazadaSimple {
	private int size; //tama�o de la lista
	private Nodo primerNodo; //Nodo que empieza.
	
	/**
	 * Constructor de la lista
	 */
	public ListaEnlazadaSimple() {
		primerNodo = null;
		size = 0; 
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
	public void setPrimerNodo(Nodo a) {
		primerNodo = a;
	}
	
	/**
	 * Método para añadir un nodo
	 * @param a
	 */
	public void aumentarUno(Nodo a){
		if(size == 0) {
			primerNodo = a;
		}else {
			Nodo puntero = primerNodo; 
			//System.out.println(puntero.getContenido());
			int i = 1;
			while(i < size) {
				puntero = puntero.getSiguiente();
				i++;
			}
			puntero.setSiguiente(a);
		}
		size++;
	}
	
	/**
	 * Método para eliminar el mayor
	 */
	public void eliminaMayor() {
		int mayor = 0; //variable para almacenar el mayor.
		int posicion = 0; // variable para guardar la posicion
		Nodo puntero1 = this.getPrimerNodo();
		int cont1 = 0;
		while (cont1 < this.getSize()) {
			if(puntero1.getContenido() > mayor) {
				mayor = puntero1.getContenido();
				posicion = cont1;
			}
			puntero1 = puntero1.getSiguiente();
			cont1++;
		}
//		System.out.println("el mayor es " + mayor + " posicion " + (posicion));
		//Con esa posición llamamos al método eliminar
		eliminarUno(posicion);
	}
	
	
	/**
	 * Método que elimina según la posición
	 * @param posicion
	 */
	public void eliminarUno(int posicion) {
		//Eliminar el �ltimo
		if((posicion + 1) == size) {
			Nodo siguiente = primerNodo; 
			//System.out.println(puntero.getContenido());
			int i = 1;
			while(i < size - 1) {
				siguiente = siguiente.getSiguiente();
				i++;
			}siguiente.setSiguiente(null);
		//Eliminar el primero
		}else if(posicion == 0) {
			Nodo uno = primerNodo; 
			uno = uno.getSiguiente();
			setPrimerNodo(uno);
		//Eliminar uno entre medias
		}else {
			Nodo siguiente = primerNodo; 
			//System.out.println(puntero.getContenido());
			int i = 1;
			while(i <= posicion + 1) {
				siguiente = siguiente.getSiguiente();
				i++;
			}
			i = 1;
			Nodo a = primerNodo;
			while(i < posicion) {
				a = a.getSiguiente();
				i++;
			}
			a.setSiguiente(siguiente);
		}
		size--;
	}
	
	/**
	 * Método que añade un nodo en una posicion dada
	 * @param contenido
	 * @param posicion
	 */
	public void anadirNodo(int contenido, int posicion){
		if(posicion == 0) {
			Nodo nuevo = new Nodo(contenido, primerNodo);
			//Nodo siguiente = primerNodo; 
			setPrimerNodo(nuevo);
		}else if(posicion == size -1){
			Nodo puntero = primerNodo; 
			//System.out.println(puntero.getContenido());
			int i = 1;
			while(i < size) {
				puntero = puntero.getSiguiente();
				i++;
			}
			puntero.setSiguiente(new Nodo(contenido, null));
		}else {
			
			Nodo siguiente = primerNodo; 
			int i = 1;
			while(i <= posicion) {
				siguiente = siguiente.getSiguiente();
				i++;
			}
			i = 1;
			Nodo nuevo = new Nodo(contenido, siguiente);
			siguiente = primerNodo;
			while(i < posicion) {
				siguiente = siguiente.getSiguiente();
				i++;
			}
			siguiente.setSiguiente(nuevo);
		}
		size++;
	}
	
	
	
}
