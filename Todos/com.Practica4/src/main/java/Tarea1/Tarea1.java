package Tarea1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;


import java.util.Scanner;

public class Tarea1  {
	public static void main(String[] args)  {
//		TAREA 1 :
//			Realiza un programa Java que, dado el fichero texto.txt, muestre por pantalla :
//			• El número total de líneas del documento.
//			• El número total de caracteres del documento.
//			• El número de caracteres de cada una de las palabras, seguido de la cantidad de
//			palabras con dicho número de caracteres, ordenador de mayor a menor número
//			de ocurrencias :
//			Palabras con 5 caracteres : 10
//			Palabras con 8 caracteres : 5
//			Palabras con 3 caracteres : 4
//			Palabras con 10 caracteres : 1
//			• El número de errores gramáticales en los cuales el artículo y el sustantivo al que
//			acompaña no se encuentran en la misma persona (singular o plural).
//			El ojos ERROR
//			Un pato ACIERTO
//			Los árbol ERROR
		HashMap <Integer, Integer> inventario = new HashMap<Integer, Integer>();
		try {
			Scanner a = new Scanner(new File("files/texto.txt"));
			ArrayList<String> lineas = new ArrayList<String>();
			a = new Scanner(new File("files/texto.txt"));
			while(a.hasNextLine()) {
				lineas.add(a.nextLine());
			}
			for(int i = 0; i < lineas.size(); i++) {
				String fila = lineas.get(i);
				fila = fila.replace(",", "").replace(".", "").replace(":", "").replace(";", "");
				String [] separad = fila.split(" ");
				for (int j = 0; j < separad.length; j++) {
					incrementValue(inventario, separad[j].length());
				}
			}
			//Mostrar: 
			System.out.println("Total de lineas " + lineas.size());
			System.out.println("Total de caracteres " + totalCaracteres(lineas));
			List<Entry<Integer, Integer>> list = new ArrayList<>(inventario.entrySet());
			list.sort(Entry.comparingByValue());
			for (int i = list.size() - 1; i >= 0; i--) {
				System.out.println("Carácteres: " + list.get(i).getKey() + " - - - " + list.get(i).getValue());
			}
			//Recorrer para ver si es articulo.
			for (int i = 0; i < lineas.size(); i++) {
//				System.out.println("-----> " + lineas.get(i));
				String fila = lineas.get(i);
				fila = fila.replace(",", "").replace(".", "").replace(":", "").replace(";", "");
				String [] separad = fila.split(" ");
				for (int j = 0; j < separad.length; j++) {
					//controlar que no sea la última palabra del texo.
					if(i != lineas.size() -1 && j != separad.length -1) {
						if(compruebaArticulos(separad[j])) {
							if(encuentraEse(separad[j])) {
								if(encuentraEse(separad[j+1])) {
									System.out.println(separad[j] + " " + separad[j+1] + " ACIERTO");
								}else {
									System.out.println(separad[j] + " " + separad[j+1] + " ERROR");
								}
							}else {
								if(encuentraEse(separad[j+1])) {
									System.out.println(separad[j] + " " + separad[j+1] + " ERROR");
								}else {
									System.out.println(separad[j] + " " + separad[j+1] + " ACIERTO");
								}
							}
						}
					}
				}
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
	}
	
	/**
	 * Método que si le envías una palabra comprueba si acaba en "s".
	 * @param palabra
	 * @return
	 */
	public static boolean encuentraEse(String palabra) {
		if (palabra.substring(palabra.length() - 1, palabra.length()).equalsIgnoreCase("s")) return true;
		return false;
	}
	
	
	/**
	 * Método comprueba si la palabra que recibe es un articulo
	 * @param palabra
	 * @return
	 */
	public static boolean compruebaArticulos(String palabra) {
		String[] articulos = {"el", "la", "los", "las", "un", "una", "unos", "unas"};
		for (int i = 0; i < articulos.length; i++) {
			if(articulos[i].equalsIgnoreCase(palabra)) {
				return true;
			}
		}
		return false;
	}
	
	/**
	 * Método para añadir elementos a un HasMAp y vaya sumando.
	 * @param <K>
	 * @param map
	 * @param key
	 */
	public static <K> void incrementValue(Map <K, Integer> map, K key) {
		//Cogemos el valor
		Integer count = map.get(key);
		//si no contiene ese key anteriormente le aplicamos 1.
		if (count == null) {
			map.put(key, 1);
		}
		//En caso de que exista le añadimos +1 al valor.
		else {
			map.put(key, count + 1);
		}
	}
	

	
	/**
	 * Método que 
	 * @param linea
	 * @return
	 */
	public static int totalCaracteres(ArrayList<String> linea) {
		int count = 0;
		String lineaBuscar = "";
		for (int i = 0; i < linea.size(); i++) {
			lineaBuscar = linea.get(i);
			lineaBuscar = lineaBuscar.replaceAll(" ", "").replace(",", "").replace(".", "").replace(":", "");
			count += lineaBuscar.length();
		}
		return count;
	}




	
	
	
	
	

}
