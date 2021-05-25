package Ejercicio3;


public class Ejercicio3 {

	public static void main(String[] args) {
//		Partiendo de la implementación de una Lista Simple Enlazada vista en clase (con nodos
//		cuyo contenido sea de tipo entero), diseña un nuevo método llamado eliminarMayor() que se
//		encargue de eliminar el nodo cuyo contenido tenga el número mayor de la lista.
		
		//Creamos la lista:
		ListaEnlazadaSimple lista = new ListaEnlazadaSimple();
		//añadimos nodos de prueba
		Nodo n1 = new Nodo(10);
		Nodo n2 = new Nodo(45);
		Nodo n3 = new Nodo(20);
		Nodo n4 = new Nodo(1);
		lista.aumentarUno(n1);
		lista.aumentarUno(n2);
		lista.aumentarUno(n3);
		lista.aumentarUno(n4);
		//mostramos la lista
		System.out.println("Lista inicial: ");
		mostrar(lista);
		//Llamamos al método que elimina el mayor
		lista.eliminaMayor();
		//Volvemos a mostrar para ver si ha funcionado:
		System.out.println("Eliminado el mayor: ");
		mostrar(lista);
		
	}

	/**
	 * Método que recorre la lista y muestra el contenido de los nodos.
	 * @param l -> ListaEnlazadaSimple para mostrar
	 */
	public static void mostrar(ListaEnlazadaSimple l) {
		Nodo puntero = l.getPrimerNodo();
		int cont = 0;
		while (cont < l.getSize()) {
			System.out.println(puntero.getContenido());
			puntero = puntero.getSiguiente();
			cont++;
		}
	}
	
}
