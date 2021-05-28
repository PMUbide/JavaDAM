package com.pruebaMaven.practicaMaven;

public class Ejer1_recursivo {

	public static void main(String[] args) {
//		Diseñad un método recursivo que escriba al revés la cadena que
//		se le pasa como parámetro, más un índice que se usará para recorrer la cadena.
//		Haced dos versiones del mismo, una en la que el índice vaya incrementándose a
//		cada llamada y otra en la éste que vaya decrementándose.
		String cadena = "Bienvenido";
		System.out.println(daleLaVuelta(cadena));
		
	}
	
	/**
	 * Método recursivo que dada una palabra devuelve la cadena al revés
	 * @param s -> String para dar la vuelta
	 * @return -> String dado la vuelta
	 */
	public static String daleLaVuelta(String s) {
		if(s.length() == 0) return "";
		return s.substring(s.length()-1, s.length()) + daleLaVuelta(s.substring(0, s.length()-1));
	}

}
