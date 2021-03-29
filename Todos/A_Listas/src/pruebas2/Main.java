package pruebas2;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		La clase que programes se deberá llamar MyAdvancedLinkedList. 
		Nodo n3 = new Nodo(new Alumno(123, "Pablo", "Martinez"), null);
		Nodo n2 = new Nodo(new Alumno(234, "Edurne", "Abian"), n3);
		Nodo n1 = new Nodo(new Alumno(345, "Cesar", "Martin"), n2);
		MyAdvancedLinkedList lista = new MyAdvancedLinkedList();
//		lista.setPrimerNodo(n1);
//		lista.setSize(3);
////		System.out.println("-----AÑADIR---");
////		visualizarLista(lista);
//		lista.insert(new Alumno(444, "Kevin", "Malone"), 2);
//		System.out.println("-----AÑADIR---");
//		visualizarLista(lista);
		
		System.out.println("----LISTA circular----");
		ListaEnlazadaCircular listaCircular = new ListaEnlazadaCircular(3, n1, n3);
//		System.out.println("El primero " + listaCircular.getPrimerNodo().getAlumno());
//		System.out.println("El ultimo " + listaCircular.getUltimoNodo().getAlumno());
		
//		listaCircular.insert(new Alumno(222, "Pepe", "Botera"), 1);
		
		
//		System.out.println("El primero " + listaCircular.getPrimerNodo().getAlumno());
//		System.out.println("El ultimo " + listaCircular.getUltimoNodo().getAlumno());
//		//System.out.println("aaaa " + listaCircular.getUltimoNodo().getSiguiente().getAlumno());
//		visualizarLista(listaCircular);
//		listaCircular.insert(new Alumno(3212, "Pito", "Bolo"), 3);
//		System.out.println("El primero " + listaCircular.getPrimerNodo().getAlumno());
//		System.out.println("El ultimo " + listaCircular.getUltimoNodo().getAlumno());
//		//System.out.println("aaaa " + listaCircular.getUltimoNodo().getSiguiente().getAlumno());
//		visualizarLista(listaCircular);
		
		listaCircular.insert(new Alumno(222, "Guarro", "Botera"), 4);
//		System.out.println("El primero " + listaCircular.getPrimerNodo().getAlumno());
//		System.out.println("El ultimo " + listaCircular.getUltimoNodo().getAlumno());
//		//System.out.println("aaaa " + listaCircular.getUltimoNodo().getSiguiente().getAlumno());
//		System.out.println(" total elementos " + listaCircular.getSize());
//		System.out.println("El ultimo apunta a " + listaCircular.getUltimoNodo().getSiguiente().getAlumno());
		visualizarLista(listaCircular);
		
		System.out.println("DELETEAR----------");
		listaCircular.delete(4);
		System.out.println(" total elementos " + listaCircular.getSize());
		System.out.println("El primero " + listaCircular.getPrimerNodo().getAlumno());
		System.out.println("El ultimo " + listaCircular.getUltimoNodo().getAlumno());
		System.out.println("El ultimo apunta a " + listaCircular.getUltimoNodo().getSiguiente().getAlumno());
		visualizarLista(listaCircular);
		
		Nodo eaea = listaCircular.getNodo(6);
		System.out.println(" EAEAEAEE " + eaea.getAlumno());
		
	}

	public static void visualizarLista(MyAdvancedLinkedList l) {
		Nodo puntero1 = l.getPrimerNodo();
		int cont1 = 0;
		while (cont1 < l.getSize()) {
			System.out.println(puntero1.getAlumno());
			puntero1 = puntero1.getSiguiente();
			cont1++;
		}
	}
	
	public static void visualizarLista(ListaEnlazadaCircular l) {
		Nodo puntero1 = l.getPrimerNodo();
		int cont1 = 0;
		while (cont1 < l.getSize()) {
			System.out.println(puntero1.getAlumno());
			puntero1 = puntero1.getSiguiente();
			cont1++;
		}
	}
}
