package com.pruebaMaven.practicaMaven;


import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;


public class Ejer1_recursivoTest {

	Ejer1_recursivo caso;
	
	/**
	 * Método para crear un caso de prueba
	 */
	@Before
	public void before() {
		caso = new Ejer1_recursivo();
	}
	
	/**
	 * Test para comprobar que le da la vuelta correctamente
	 */
	@Test
	public void Dar_Vuelta_Palabra() {
		String inicial = "Bienvenido";
		String esperado = "odinevneiB";
		assertEquals(esperado, caso.daleLaVuelta(inicial));
		
	}
	
	/**
	 * Método que comprueba que devuelve una cadena vacia si 
	 * le envías una vacia
	 */
	@Test
	public void Dar_Vuelta_Palabra_Vacia() {
		String inicial = "";
		String esperado = "";
		assertEquals(esperado, caso.daleLaVuelta(inicial));
		
	}

}
