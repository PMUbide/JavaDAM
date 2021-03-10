package Ejercicio2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		String ruta = "files/textoExamen.txt";
		try {
			Scanner f = new Scanner(new File(ruta));
			String acabado = " ";
			while(f.hasNext()) {
				String linea = f.next() + " ";
				acabado += linea;
			}
			System.out.println(acabado);
			String[] palabras = acabado.split(" ");
			for (int i = 0; i < palabras.length; i++) {
				palabras[i] = palabras[i].replace(".", "");
				palabras[i] = palabras[i].replace(",", "");
				palabras[i] = palabras[i].replace(":", "");
				palabras[i] = palabras[i].replaceAll("\"", "");
				palabras[i] = palabras[i].trim();
			}
//			for (String string : palabras) {
//				System.out.println(string);
//			}
			int totalPalabras = palabrasMasLargasQue(palabras, 4);
			System.out.println("Palabras totales " + palabras.length);
			System.out.println("El numero de palabras  mayores es " + totalPalabras);
			f.close();
		} catch(FileNotFoundException e) {
			System.out.println("No se ha encontrado la ruta de " + ruta);
		} 
		
		
	}
	
	public static int palabrasMasLargasQue(String[] palabras, int longitud) {
		int contador = 0;
		for (int i = 0; i < palabras.length; i++) {
			if(palabras[i].length() >= longitud) {
				contador++;
			}
		
		}
		return contador;
	}
}
