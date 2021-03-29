package EnlazadasDobles;



public class Main_ListaDoble {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Nodo n1 = new Nodo (1);
		ListaDoble nuevaD = new ListaDoble();
		nuevaD.insert(n1);
		System.out.println(" el primero es " + nuevaD.getPrimerNodo().getContenido());
		System.out.println(" el ultimo es " + nuevaD.getUltimoNodo().getContenido());
		Nodo n2 = new Nodo (2);
		Nodo n3 = new Nodo (3);
		nuevaD.insert(n2);
		nuevaD.insert(n3);
		System.out.println(" el primero es " + nuevaD.getPrimerNodo().getContenido());
		System.out.println(" el ultimo es " + nuevaD.getUltimoNodo().getContenido());
		Nodo n4 = new Nodo (99);
		nuevaD.insert(n4, 1);
		mostrar(nuevaD);
		System.out.println(" el primero es " + nuevaD.getPrimerNodo().getContenido());
		System.out.println(" el ultimo es " + nuevaD.getUltimoNodo().getContenido());
		nuevaD.delete(4);
		nuevaD.delete(2);
		System.out.println(" el primero es " + nuevaD.getPrimerNodo().getContenido());
		System.out.println(" el ultimo es " + nuevaD.getUltimoNodo().getContenido());
		mostrar(nuevaD);
	}

	
	
	public static void mostrar(ListaDoble d) {
		Nodo puntero1 = d.getPrimerNodo();
		int cont1 = 0;
		while (cont1 < d.getSize()) {
			System.out.println(puntero1.getContenido());
			puntero1 = puntero1.getSiguiente();
			cont1++;
		}
//		Nodo puntero = d.getPrimerNodo();
//		for (int i = 1; i <= d.getSize(); i++) {
//			System.out.println(puntero.getContenido());
//			puntero = puntero.getSiguiente();
//		}
		
	}
	
}
