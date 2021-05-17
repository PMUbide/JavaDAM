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
			int count = 0;
			String linea = "";
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
			
			List<Entry<Integer, Integer>> list = new ArrayList<>(inventario.entrySet());
			list.sort(Entry.comparingByValue());
//			list.forEach(System.out::println);
			
			for (int i = list.size() - 1; i >= 0; i--) {
				System.out.println(list.get(i).getKey() + " - - - " + list.get(i).getValue());
			}
			
//			list.forEach(entry -> {
//			    System.out.println(entry.getKey() + " - -  " + entry.getValue());
//			});
			
			inventario.entrySet().forEach(entry -> {
			    System.out.println(entry.getKey() + " " + entry.getValue());
			});
			System.out.println("Total de lineas " + lineas.size());
			System.out.println("Total de caracteres " + totalCaracteres(lineas));
			//palabras de caracteres
			palabrasCaracteres(lineas);
			
			//Recorrer para ver si es articulo.
			for (int i = 0; i < lineas.size(); i++) {
				
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
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
	
	
	
	
	public static void palabrasCaracteres(ArrayList<String> linea) {
		int count = 0;
		String lineaBuscar = "";
		int[][] nuevo = new int [30][2];
		for (int i = 0; i < linea.size(); i++) {
			lineaBuscar = linea.get(i);
			lineaBuscar = lineaBuscar.replace(",", "").replace(".", "").replace(":", "").replace(";", "");
			System.out.println(lineaBuscar);
			String[] separado = lineaBuscar.split(" ");
			for (int j = 1; j < separado.length; j++) {
				nuevo[separado[j].length()][0]++;
				nuevo[separado[j].length()][1] = separado[j].length();
			}
			count += lineaBuscar.length();
		}
//		Arrays.sort(nuevo, new Comparator<int[]>() {
//		    public int compare(int[] a, int[] b) {
//		        return Double.compare(b[0], a[0]);
//		    }
//		});
		nuevo = ordenarArray(nuevo);
		
		for (int i = 0; i < nuevo.length; i++) {
			if(nuevo[i][0] != 0) {
				System.out.println("Palabras con " + nuevo[i][1] + " caracteres = " + nuevo[i][0]);
			}
		}
	}
	
	public static int[][] ordenarArray(int[][] array){
		int a[][] = array;
		for (int x = 0; x < a.length; x++) {
	        for (int i = 1; i < a.length; i++) {
	            if(a[i][0] < a[x][0]){
	                int tmp = a[x][0];
	                int tmp2 = a[x][1];
	                a[x][0] = a[i][0];
	                a[x][1] = a[i][1];
	                a[i][0] = tmp;
	                a[i][1] = tmp2;
	            }
	        }
	    }
	    return a;
	}
	
	
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
