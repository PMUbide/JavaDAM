package pruebas;

public class ListaEnlazadaSimple {
	private int size; //tamaño de la lista
	private Nodo primerNodo; //Nodo que empieza.
	
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
	
	public void eliminarUno(int posicion) {
		//Eliminar el último
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
	
	
	public Nodo buscarNodo(int busqueda){
		Nodo puntero1 = getPrimerNodo();
		int cont1 = 0;
		while (cont1 < getSize()) {
			if(busqueda == puntero1.getContenido()) {
				System.out.println("Lo ha encontrado");
				return puntero1;
			}
			puntero1 = puntero1.getSiguiente();
			cont1++;
		}
		System.out.println("No lo ha encontrado");
		return null;
	}
	
}
