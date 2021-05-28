package com.pruebaMaven.practicaMaven;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class CadenaTextoTest {

	/**
	 * Test que lee el fichero xml con formato
	 */
	@Test
	public void test_Quitar_Vocales() {
		ArrayList<String[]> casos = leeXML.leerArchivo("files/texto.xml");
		for (String[] strings : casos) {
			String palabra = strings[0];
			String sinVocales = CadenaTexto.quitarVocales(palabra);
			assertEquals(strings[1], sinVocales);
		}
	}
	
	@Test
	public void test_Quitar_Consonantes() {
		ArrayList<String[]> casos = leeXML.leerArchivo("files/texto.xml");
		for (String[] strings : casos) {
			String palabra = strings[0];
			String sinConsonantes = CadenaTexto.quitarConsonantes(palabra);
			assertEquals(strings[2], sinConsonantes);
		}
	}

}
