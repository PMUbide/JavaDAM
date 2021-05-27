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
		//Creamos un hashmap para ir almacenando las palabras y el número de ocurrencias
		HashMap <Integer, Integer> inventario = new HashMap<Integer, Integer>();
		try {
			//Scanner del archivo
			Scanner a = new Scanner(new File("files/texto.txt"));
			//AraryList para almacenar las lineas del texto
			ArrayList<String> lineas = new ArrayList<String>();
			//Bucle para almacenar todas las lineas que lee del fichero
			while(a.hasNextLine()) {
				lineas.add(a.nextLine());
			}
			//Bucle para separar cada palabra
			for(int i = 0; i < lineas.size(); i++) {
				String fila = lineas.get(i);
				//Se reemplazan caracteres que no se quieren tener en cuenta:
				fila = fila.replace(",", "").replace(".", "").replace(":", "").replace(";", "");
				String [] separad = fila.split(" ");
				//Del split por espacios va mandado en otro bucle cada palabra de la linea
				for (int j = 0; j < separad.length; j++) {
					//método que controla la inserción del hashmap
					incrementValue(inventario, separad[j].length());
				}
			}
			//Mostrar: 
			System.out.println("Total de lineas " + lineas.size());
			System.out.println("Total de caracteres " + totalCaracteres(lineas));
			//Mostrar el hasmap transformandolo en una lista y después mostrarlo por el orden requerido
			List<Entry<Integer, Integer>> list = new ArrayList<>(inventario.entrySet());
			list.sort(Entry.comparingByValue());
			for (int i = list.size() - 1; i >= 0; i--) {
				System.out.println("Carácteres: " + list.get(i).getKey() + " - - - " + list.get(i).getValue());
			}
			//Recorrer para ver si es articulo.
			for (int i = 0; i < lineas.size(); i++) {
				String fila = lineas.get(i); //variable para ir guardando la linea actual a analizar.
				fila = fila.replace(",", "").replace(".", "").replace(":", "").replace(";", "");
				String [] separad = fila.split(" "); //split por espacios para recoger cada palabra
				for (int j = 0; j < separad.length; j++) {
					//controlar que no sea la última palabra del texo.
					if(i != lineas.size() -1 && j != separad.length -1) {
						//llama primero al método a ver si es articulo
						if(compruebaArticulos(separad[j])) {
							//Si si que es articulo busca si tiene "s" de plural
							if(encuentraEse(separad[j])) {
								//Si si encuentra la "s" vuelve a buscar la "s" en la palabra siguiente
								if(encuentraEse(separad[j+1])) {
									//Si la encuentra estará bien y es ACIERTO
									System.out.println(separad[j] + " " + separad[j+1] + " ACIERTO");
								}else {
									//En caso contrario no coindicen las "s" y es ERROR
									System.out.println(separad[j] + " " + separad[j+1] + " ERROR");
								}
							}else {
								//Si no se encuentra la "s" cambiará el orden para la palabra siguiente
								if(encuentraEse(separad[j+1])) {
									//Si si encuentra "s" significare un ERROR
									System.out.println(separad[j] + " " + separad[j+1] + " ERROR");
								}else {
									//Y si no, es acierto.
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
	 * @param palabra -> la palabra para comprobar
	 * @return -> Devuelve true si acaba en "s" y false en caso contrario.
	 */
	public static boolean encuentraEse(String palabra) {
		if (palabra.substring(palabra.length() - 1, palabra.length()).equalsIgnoreCase("s")) return true;
		return false;
	}
	
	
	/**
	 * Método comprueba si la palabra que recibe es un articulo
	 * @param palabra -> palabra para comprobar
	 * @return -> devuelve true si coincide con la lista de articulos, false en caso contrario
	 */
	public static boolean compruebaArticulos(String palabra) {
		//un array de variables que son articulos:
		String[] articulos = {"el", "la", "los", "las", "un", "una", "unos", "unas"};
		//Recorre y si encuentra la similitud devuelve true.
		for (int i = 0; i < articulos.length; i++) {
			if(articulos[i].equalsIgnoreCase(palabra)) {
				return true;
			}
		}
		//si no ha encontrado la igualdad devuelve false
		return false;
	}
	
	/**
	 * Método para añadir elementos a un HasMAp y vaya sumando.
	 * @param <K> -> Parámetro que hace de _Key del hashmap global
	 * @param map -> el HashMap
	 * @param key -> Key del hasmap que se va a comprobar
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
	 * Método que cuenta el total de caracteres de una linea.
	 * @param linea -> recibe el arratList con todas las lineas del documento
	 * @return -> Devuelve un int del conteo total de caracteres
	 */
	public static int totalCaracteres(ArrayList<String> linea) {
		int count = 0; //variable para hacer el sumatorio
		String lineaBuscar = ""; //variable para ir almacenando la linea
		for (int i = 0; i < linea.size(); i++) {
			lineaBuscar = linea.get(i);
			//Se elimina lo que no nos interesa de la linea, y tambien se deja sin espacios:
			lineaBuscar = lineaBuscar.replaceAll(" ", "").replace(",", "").replace(".", "").replace(":", "");
			//Se aumenta el contador con la longitud de esa línea.
			count += lineaBuscar.length();
		}
		return count;
	}




	
	
	
	
	

}
