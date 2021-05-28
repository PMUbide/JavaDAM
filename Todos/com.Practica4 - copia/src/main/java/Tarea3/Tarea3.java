package Tarea3;

public class Tarea3 {

	public static void main(String[] args) {
//		Implementa un TAD de Lista Enlaza Simple que contenga los métodos básicos de
//		cualquier lista (estáVacia(), añadir() y eliminar()). Además, diseña e implementa el
//		método promedio() que devuelve un dato de tipo double, el cual indica la media de los
//		elementos contenidos en la lista.
//		Nota : los nodos de la lista enlazada deben contener números enteros.
		
		ListaEnlazaSimple lista = new ListaEnlazaSimple();
		lista.insertOne(10);
		lista.insertOne(7);
		lista.insertOne(5);
		lista.insertOne(1);
		lista.insertOne(8);

		lista.show();
		System.out.println("LA MEDIA: ");
		lista.media();
	}

	
}
