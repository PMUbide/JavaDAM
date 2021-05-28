package com.pruebaMaven.practicaMaven;

public class CadenaTexto {
	
	public static String quitarVocales(String word) {
        return quitarVocales(word, "aeiou");
    }
	
    private static String quitarVocales(String word, String vocales) {
        if(vocales.length() == 0) {
            return word;
        }
        return quitarVocales(word.replaceAll(vocales.substring(0, 1), ""), vocales.substring(1));
    }
    
    public static String quitarConsonantes(String word) {
        return quitarConsonantes(word, "qwrtypsdfghjklñzxcvbnm");
    }
    
    private static String quitarConsonantes(String word, String consonantes) {
        if(consonantes.length() == 0) {
            return word;
        }
        return quitarVocales(word.replaceAll(consonantes.substring(0, 1), ""), consonantes.substring(1));
    }
    
	

}
