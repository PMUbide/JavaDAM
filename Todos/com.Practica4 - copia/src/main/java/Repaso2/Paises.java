package Repaso2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Map.Entry;

/**
 * Dado el fichero "paises.csv", muestra por pantalla, ordenado de menor a mayor,
 * el n�mero de pa�ses que empiezan por cada una de las letras del abecedario.
 * @author edurne
 *
 */

public class Paises {
	public static void main(String[] args) {
		//Creamos un HashMap para almacenar los datos
		HashMap<String, Integer> datos = new HashMap<String, Integer>();
		try {
			//Creamos el scanner para leer el fichero
			Scanner fichero = new Scanner(new File("files/paises.csv"));
			//Creamos el contador para eliminar la primera l�nea que no necesitamos.
			int cont = 0;
			while(fichero.hasNextLine()) {
				//Almacenamos las l�neas (y las mostramos)
				String linea = fichero.nextLine();
//				System.out.println(linea);
				if (cont > 0) {
					//Separamos las l�neas por (,)
					String[] lineaSplit = linea.split(",");
					//Recorremos y mostramos para ver qu� �ndice nos interesa
//					for (int i = 0; i < lineaSplit.length; i++) {
//						System.out.println(i + "______" + lineaSplit[i] + "______");
//					}
					
//					System.out.println(lineaSplit[0]);
//					ArrayList<String> paises = new ArrayList<String>();
					incrementValue(datos, lineaSplit[0].substring(1, 2));
					
//					System.out.println(lineaSplit[0]);
					
				}
				cont++;
			}
			
//			List<Entry<String, Integer>> list = new ArrayList<>(datos.entrySet());
//			list.sort(Entry.comparingByValue());
//			for (int i = list.size() - 1; i >= 0; i--) {
//				System.out.println(list.get(i).getKey() + " - - - " + list.get(i).getValue());
//			}
			datos.entrySet().forEach(entry -> {
			    System.out.println(entry.getKey() + " " + entry.getValue());
			});
			
			
			fichero.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/*
	 * M�todo que trata el HashMap e incrementa en uno si el dato buscado est� repetido,
	 * si no, le da valor 1
	 */
	public static <K> void incrementValue(Map<K, Integer> map, K key) {
		// Cogemos el valor
		Integer count = map.get(key);
		// si no contiene ese key anteriormente le aplicamos 1.
		if (count == null) {
			map.put(key, 1);
		}
		// En caso de que exista le a�adimos +1 al valor.
		else {
			map.put(key, count + 1);
		}
	}
	
}
