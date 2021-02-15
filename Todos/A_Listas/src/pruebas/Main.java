package pruebas;


public class Main {

	public static void main(String[] args) {
		//Vamos a crear 3 nodos
		Nodo n3 = new Nodo(3, null);
		Nodo n2 = new Nodo(2, n3);
		Nodo n1 = new Nodo(1, n2);
		//crear lista
		ListaEnlazadaSimple l = new ListaEnlazadaSimple();
		l.setPrimerNodo(n1);
		l.setSize(3);
		//Nodo puntero para ir almacenando.
		Nodo puntero = l.getPrimerNodo();
		//i = 1 pq el primero ya lo he cogido
		int cont = 0;
		while (cont < l.getSize()) {
			System.out.println(puntero.getContenido());
			puntero = puntero.getSiguiente();
			cont++;
		}
		//Otra forma de imprimir
		puntero = l.getPrimerNodo();
		while(puntero.getSiguiente() != null) {
			System.out.println(puntero.getContenido());
			puntero = puntero.getSiguiente();
		}System.out.println(puntero.getContenido());
		//Añadir nuevo NODO al FINAL.
		Nodo nuevo = new Nodo(5, null);
		l.aumentarUno(nuevo);
		System.out.println("------------------");
		visualizarLista(l);
		
		
	}
	
	public static void visualizarLista(ListaEnlazadaSimple l) {
		Nodo puntero1 = l.getPrimerNodo();
		int cont1 = 0;
		while (cont1 < l.getSize()) {
			System.out.println(puntero1.getContenido());
			puntero1 = puntero1.getSiguiente();
			cont1++;
		}
	}

	
	
	
}
