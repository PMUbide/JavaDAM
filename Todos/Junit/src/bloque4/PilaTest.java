package bloque4;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PilaTest {
	
	/**
	 * Test comprobar que la lista tiene 2 de size
	 */
	@Test
	public void Lista_Vacia_Tiene_2_Elementos() {
		//creamos la pila
		Pila pila = new Pila();
		//Tiene que tener los 2 elementos por defecto
		assertEquals(2, pila.getSize());
	}
	
	/**
	 * TEst para comprobar que los dos elementos tienen 0
	 */
	@Test
	public void Nodos_Lista_Vacia_Contienen_Cero() {
		//cremoas la pila
		Pila pila = new Pila();
		//Tiene que ser 0 los dos nodos
		assertEquals(0, pila.getUltimo().getContenido());
		assertEquals(0, pila.getUltimo().getSiguiente().getContenido());
	}
	
	/**
	 * Test para comprobar que no añade nodos que no están
	 * en el rango admitido
	 */
	@Test
	public void Añadir_Nodos_Erroneos() {
		//creamos la pila
		Pila pila = new Pila();
		//intentamos añadir nodos con numeros no admitidos
		pila.push(new Nodo(51));
		pila.push(new Nodo(-5));
		//Tiene que seguir teniendo 2 de tamaño
		assertEquals(2, pila.getSize());
	}
	
	/**
	 * Test que comprueba que inserta bien nodos que 
	 * sean admitidos por su contenido
	 */
	@Test
	public void Añadir_Nodos_Correctos() {
		//creamos la pila
		Pila pila = new Pila();
		//intentamos añadir nodos con numeros admitidos
		pila.push(new Nodo(3));
		pila.push(new Nodo(45));
		//Tiene que seguir teniendo 2 de tamaño
		assertEquals(4, pila.getSize());
	}
	
	/**
	 * Test para eliminar nodos y comprobar que siempre
	 * tenga los creados por defecto
	 */
	@Test
	public void Eliminar_Nodos() {
		//creamos la pila
		Pila pila = new Pila();
		//intentamos añadir nodos con numeros admitidos
		Nodo nodoPush = new Nodo(3);
		pila.push(nodoPush);
		//elinamos 2 nodos
		Nodo n = pila.pop();
		Nodo n2 = pila.pop();
		//Debera seguir teniendo 2 de size
		assertEquals(2,  pila.getSize());
		//El nodo sacado tiene que ser como el último añadido
		assertEquals(nodoPush,  n);
		//el ultimo debe ser null
		assertEquals(null,  n2);
		
	}
}
