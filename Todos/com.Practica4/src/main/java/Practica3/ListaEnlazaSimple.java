package Tarea3;


public class ListaEnlazaSimple {
	private int size; //variable del número de elementos en la lista
	private Nodo primer; //variable para obtener el primer nodo de la lista

	/**
	 * Método que indica si una lista está vacía o no
	 * @return -> Devuelve True si el size es 0, o false en caso contrario.
	 */
	public boolean isEmpty() {
		if(size == 0) return true;
		else return false;
	}
	
	/**
	 * Método para añadir un nodo a partir de un número entero recibido
	 * @param n -> número para hacer la creción de un nodo y añadirlo 
	 * a la lista
	 */
	public void insertOne(int n) {
		//crea nodo con el numero recibido
		Nodo newNodo = new Nodo(n);
		//Si esta vacio lo hace como el primero
		if(isEmpty()) {
			primer = newNodo;
		}else {
			//en caso contrario recorre a partir del primero para
			//ponerlo al final.
			Nodo puntero = primer; 
			int i = 1;
			while(i < size) {
				puntero = puntero.getSiguiente();
				i++;
			}
			//Se hace que el último disponible apunte al nuevo nodo creado.
			puntero.setSiguiente(newNodo);
		}
		//se aumenta el tamño en 1
		size++;
	}
	
	/**
	 * Método que recorre la lista y muestra sus elementos
	 */
	public void show() {
		Nodo puntero = primer; 
		System.out.println(puntero.getContenido());
		int i = 1;
		while(i < size) {
			puntero = puntero.getSiguiente();
			System.out.println(puntero.getContenido());
			i++;
		}
	}
	
	/**
	 * Método que muestra la media de los contenidos de los nodos
	 * de la lista
	 */
	public double media() {
		Nodo puntero = primer;
		//variable tipo double para ir sumando todos los valores
		double suma = puntero.getContenido();
		int i = 1; 
		//recorre todos los nodos sumando
		while(i < size) {
			puntero = puntero.getSiguiente();
			suma += puntero.getContenido();
			i++;
		}
		//Por ultimo la media es la visión entre el número de nodos.
		return suma/size;
	}
	
	/**
	 * Método para eliminar un nodo
	 * @param posicion -> Recibe la posición que se quiere eliminar
	 */
	public void deleteOne(int posicion) {
		//Eliminar el último
		if((posicion + 1) >= size) {
			Nodo siguiente = primer; 
			//System.out.println(puntero.getContenido());
			int i = 1;
			while(i < size - 1) {
				siguiente = siguiente.getSiguiente();
				i++;
			}
			siguiente.setSiguiente(null);
		//Eliminar el primero
		}else if(posicion == 0) {
			Nodo uno = primer; 
			uno = uno.getSiguiente();
			primer = uno;
		//Eliminar uno entre medias
		}else {
			Nodo siguiente = primer; 
			//System.out.println(puntero.getContenido());
			int i = 1;
			while(i <= posicion + 1) {
				siguiente = siguiente.getSiguiente();
				i++;
			}
			i = 1;
			Nodo a = primer;
			while(i < posicion) {
				a = a.getSiguiente();
				i++;
			}
			a.setSiguiente(siguiente);
		}
		//se resta 1 al tamño de la lista
		size--;
	}
	
}
