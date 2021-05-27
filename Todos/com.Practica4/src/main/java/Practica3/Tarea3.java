package Tarea3;

public class Tarea3 {

	public static void main(String[] args) {
		//Se crea una lista 
		ListaEnlazaSimple lista = new ListaEnlazaSimple();
		//Se realiza la inserción de nodos con el método mandándo un int
		lista.insertOne(10);
		lista.insertOne(7);
		lista.insertOne(5);
		lista.insertOne(1);
		lista.insertOne(8);
		//metodo para mostrar la lista
		lista.show();
		//mostrar la media llamando al método para hacer la media
		System.out.println("LA MEDIA: ");
		System.out.println(lista.media());
	}

	
}
