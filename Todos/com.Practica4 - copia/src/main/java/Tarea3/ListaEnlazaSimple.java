package Tarea3;


public class ListaEnlazaSimple {
	private int size;
	private Nodo primer;
//	Implementa un TAD de Lista Enlaza Simple que contenga los métodos básicos de
//	cualquier lista (estáVacia(), añadir() y eliminar()). Además, diseña e implementa el
//	método promedio() que devuelve un dato de tipo double, el cual indica la media de los
//	elementos contenidos en la lista.
//	Nota : los nodos de la lista enlazada deben contener números enteros.
	
	public boolean isEmpty() {
		if(size == 0) return true;
		else return false;
	}
	
	public void insertOne(int n) {
		Nodo newNodo = new Nodo(n);
		if(isEmpty()) {
			primer = newNodo;
		}else {
			Nodo puntero = primer; 
			//System.out.println(puntero.getContenido());
			int i = 1;
			while(i < size) {
				puntero = puntero.getSiguiente();
				i++;
			}
			puntero.setSiguiente(newNodo);
		}
		size++;
	}
	
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
	
	public void media() {
		Nodo puntero = primer; 
		double suma = puntero.getContenido();
		int i = 1;
		while(i < size) {
			puntero = puntero.getSiguiente();
			suma += puntero.getContenido();
			i++;
		}
		System.out.println(suma/size);
	}
	
}
