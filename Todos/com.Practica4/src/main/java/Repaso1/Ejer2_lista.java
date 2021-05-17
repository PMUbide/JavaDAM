package Repaso1;


public class Ejer2_lista {

	public static void main(String[] args) {
//		Dada una lista doblemente enlazada que almacena datos de tipo entero, con el método añadir() y eliminar().
//		Diseña un método llamado sePuedeObtener(int numero) que devuelve true
//		sí y solo sí, el número pasado como parámetro se puede obtener de la suma de dos de los nodos de la lista. Ejemplo:
//		Contenido de la lista: 3 -> 2 -> 9 -> 10
//        Número pasado por parámetro: 13
//        Resultado: 3 + 10 = 13 -----> RETURN TRUE
		ListaDoble nuevaD = new ListaDoble();
		Nodo n1 = new Nodo (3);
		Nodo n2 = new Nodo (2);
		Nodo n3 = new Nodo (9);
		Nodo n4 = new Nodo (10);
		nuevaD.insert(n1);
		nuevaD.insert(n2);
		nuevaD.insert(n3);
		nuevaD.insert(n4);
//		mostrar(nuevaD);
		System.out.println(sePuedeObtener(nuevaD, 9));
	}
	
	public static void mostrar(ListaDoble d) {
		Nodo puntero1 = d.getPrimerNodo();
		int cont1 = 0;
		while (cont1 < d.getSize()) {
			System.out.println(puntero1.getContenido());
			puntero1 = puntero1.getSiguiente();
			cont1++;
		}
	}
	
	public static boolean sePuedeObtener(ListaDoble d, int num) {
		if(d.getSize() <= 1) return false;
		Nodo puntero1 = d.getPrimerNodo();
		int primerN = puntero1.getContenido();
		int cont = 0;
		puntero1 = puntero1.getSiguiente();
		while (cont < d.getSize() - 1) {
//			System.out.println(puntero1.getContenido());
			if((primerN + puntero1.getContenido()) == num) {
				return true;
			}
			cont++;
			puntero1 = puntero1.getSiguiente();
		}
		d.delete(0);
		return sePuedeObtener(d, num);
	}
}
