package pruebas;


public class Main {

	public static void main(String[] args) {
		//Vamos a crear 3 nodos
		Nodo n3 = new Nodo(10, null);
		Nodo n2 = new Nodo(5, n3);
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
		Nodo nuevo = new Nodo(20, null);
		Nodo nuevo2 = new Nodo(30, null);
		Nodo nuevo3 = new Nodo(40, null);
		l.aumentarUno(nuevo2);
		l.aumentarUno(nuevo3);
		l.aumentarUno(nuevo);
		System.out.println("------------------");
		visualizarLista(l);
		System.out.println("AHORA ELIMINAR"
				);
		System.out.println("------------------");
		l.eliminarUno(2);
		visualizarLista(l);
		System.out.println("-------AÑADIR-----------");
		l.anadirNodo(100, 2);
		visualizarLista(l);
		System.out.println("-------AÑADIR-----------");
		l.anadirNodo(666, 3);
		visualizarLista(l);
		System.out.println("-------BUSCAR-----------");
		Nodo busqueda = l.buscarNodo(22);
		if (busqueda != null) {
			System.out.println( "El contenido de busqueda es " + busqueda.getContenido());
		}
		//visualizarLista(l);
		
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
