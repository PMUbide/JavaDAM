import static org.junit.jupiter.api.Assertions.*;

import org.junit.Before;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


class ListaEnlazadaSimpleTest {
	
	
	@Before
	public void setup() {
		System.out.println("Se ejecutan los test");
	}
//	Test añadir: debe comprobar que, para todos los casos posibles, el método añadir de la Lista
//	Enlazada Simple funciona correctamente. (1,5 puntos)
	
	@Test
	void Insert_Nodo_Lista_Vacia() {
		ListaEnlazadaSimple lista = new ListaEnlazadaSimple();
		Nodo n = new Nodo(1, null);
		lista.anadir(n);
		//El primer nodo tiene que ser el nodo añadido
		assertEquals(n, lista.getPrimerNodo());
		//El tamaño tiene que ser 1
		assertEquals(1, lista.getTamano());
	}
	
	@Test
	void Insert_Nodo_AlFinal() {
		//creamos lista
		ListaEnlazadaSimple lista = new ListaEnlazadaSimple();
		//creamos nodos
		Nodo n2 = new Nodo(2, null);
		Nodo n1 = new Nodo(1, n2);
		//añadimos nodos
		lista.anadir(n1);
		lista.anadir(n2);
		lista.mostrar();
		//Recorremos para quedarnos con el último;
		Nodo puntero1 = lista.getPrimerNodo();
		int cont1 = 1;
		while (cont1 < lista.getTamano()) {
			puntero1 = puntero1.getSiguiente();
			cont1++;
		}
		//El ultimo nodo del puntero tiene que ser igual al ultimo nodo insertado
		assertEquals(n2, puntero1);
		//El tamaño tiene que ser 2
		assertEquals(2, lista.getTamano());
	}
	
//	Test eliminar: debe comprobar que, para todos los casos posibles, el método eliminar de la
//	Lista Enlazada Simple funciona correctamente. (1,5 puntos)
	
	@Test
	void Delete_Nodo_Lista_Vacia() {
		//creamos lista
		ListaEnlazadaSimple lista = new ListaEnlazadaSimple();
		//añadimos nodos
		lista.eliminar(1);
	}
	
	@Test
	void Delete_Nodo_Lista_Principio() {
		//creamos lista
		ListaEnlazadaSimple lista = new ListaEnlazadaSimple();
		//añadimos nodos
		//creamos nodos
		Nodo n2 = new Nodo(2, null);
		Nodo n1 = new Nodo(1, n2);
		//añadimos nodos
		lista.anadir(n1);
		lista.anadir(n2);
		//Elimina la primera posicion
		lista.eliminar(0);
		//tiene que tener 1 de tamaño
		assertEquals(1, lista.getTamano());
		//El primer nodo ahora tiene que ser el n2
		assertEquals(lista.getPrimerNodo(), n2);
	}
	
	@Test
	void Delete_Nodo_Lista_Final() {
		//creamos lista
		ListaEnlazadaSimple lista = new ListaEnlazadaSimple();
		//añadimos nodos
		//creamos nodos
		Nodo n2 = new Nodo(2, null);
		Nodo n1 = new Nodo(1, n2);
		//añadimos nodos
		lista.anadir(n1);
		lista.anadir(n2);
		//Elimina el nodo que está al final
		lista.eliminar(1);
		//TEndrá 1 de tamaño
		assertEquals(1, lista.getTamano());
		//El nodo siquiente del que estaba antes es null
		assertEquals(null, lista.getPrimerNodo().getSiguiente());
	}
	
	@Test
	void Delete_Nodo_Lista_Medio() {
		//creamos lista
		ListaEnlazadaSimple lista = new ListaEnlazadaSimple();
		//añadimos nodos
		//creamos nodos
		Nodo n3 = new Nodo(3, null);
		Nodo n2 = new Nodo(2, n3);
		Nodo n1 = new Nodo(1, n2);
		//añadimos nodos
		lista.anadir(n1);
		lista.anadir(n2);
		lista.anadir(n3);
		//eliminamos la segunda posicion
		lista.eliminar(1);
		//Tiene que tener 2 de tamaño
		assertEquals(2, lista.getTamano());
		//la segunda posición tirne que se el nodo 3
		assertEquals(n3, lista.getPrimerNodo().getSiguiente());
	}
	
//	Test buscar: debe comprobar que, para todos los casos posibles, el método buscar de la Lista
//	Enlazada Simple funciona correctamente. (2 puntos)
	
	@Test
	void Buscar_Nodo_Lista_Vacia() {
		//creamos lista
		ListaEnlazadaSimple lista = new ListaEnlazadaSimple();
		Nodo a = lista.buscar(1);
		//Tamaño 0 al no tener nada
		assertEquals(0, lista.getTamano());
		//Tiene que devolver null pq la lista está vacía
		assertEquals(null, a);
	}
	
	@Test
	void Buscar_Nodo_Lista_Llena_True() {
		ListaEnlazadaSimple lista = new ListaEnlazadaSimple();
		//añadimos nodos
		//creamos nodos
		Nodo n3 = new Nodo(3, null);
		Nodo n2 = new Nodo(2, n3);
		Nodo n1 = new Nodo(1, n2);
		//añadimos nodos
		lista.anadir(n1);
		lista.anadir(n2);
		lista.anadir(n3);
		//eliminamos la segunda posicion
		Nodo b = lista.buscar(2);
		//el nodo que tiene un 2 es el n2
		assertEquals(n2, b);
	}
	
	@Test
	void Buscar_Nodo_Lista_Llena_False() {
		ListaEnlazadaSimple lista = new ListaEnlazadaSimple();
		//añadimos nodos
		//creamos nodos
		Nodo n3 = new Nodo(3, null);
		Nodo n2 = new Nodo(2, n3);
		Nodo n1 = new Nodo(1, n2);
		//añadimos nodos
		lista.anadir(n1);
		lista.anadir(n2);
		lista.anadir(n3);
		//eliminamos la segunda posicion
		Nodo b = lista.buscar(5);
		//Tiene que devolver false pq no existe ninguno con 5
		assertEquals(null, b);
	}
	
	

}
