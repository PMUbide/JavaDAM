package Repaso3;



public class ListaDobleEjer2 {

	public static void main(String[] args) {
		ListaDoble listica = new ListaDoble();
		Nodo uno1 = new Nodo(1);
		Nodo uno2 = new Nodo(2);
		Nodo uno3 = new Nodo(3);
		Nodo uno4 = new Nodo(4);
		Nodo uno5 = new Nodo(5);
		Nodo uno6 = new Nodo(6);
		Nodo uno7 = new Nodo(7);
		Nodo uno8 = new Nodo(8);
		listica.insert(uno1);
		listica.insert(uno2);
		listica.insert(uno3);
		listica.insert(uno4);
		listica.insert(uno5);
		listica.insert(uno6);
		listica.insert(uno7);
		listica.insert(uno8);
		//Eliminar con indices.
		int[] posiciones = {1, 4, 2, 7};
		listica.deleteTotal(posiciones);
		mostrar(listica);
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

}
