package Repaso1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
import java.util.Map.Entry;

public class Ejer2_csv {

	public static <T> void main(String[] args) {
//		Dado el fichero "drivers.csv" que contiene toda la información historica de los pilotos de Fórmula 1
//		muestra por pantalla el número de pilotos de cada una de las nacionalidades
//		(ordenados de mayor a menor número de ocurrencias).
		HashMap <String, Integer> datos = new HashMap<String, Integer>();
		try {
			Scanner f = new Scanner (new File("files/drivers.csv"));
			int cont = 0;
			while(f.hasNextLine()) {
				String linea = f.nextLine();
				System.out.println(linea);
				if(cont > 0) {
					String[] lineaSplit = linea.split(",");
//					for (int i = 0; i < lineaSplit.length; i++) {
//						System.out.print("---" + i + " ---" + lineaSplit[i]);
//					}
					incrementValue(datos, lineaSplit[7]);
					//lineaSplit[7]
				}
//				System.out.println();
				cont++;
			}
			//Tranformar el hasmap a list para mostrarla ordenada.
			List<Entry<String, Integer>> list = new ArrayList<>(datos.entrySet());
			list.sort(Entry.comparingByValue());
			for (int i = list.size() - 1; i >= 0; i--) {
				System.out.println(list.get(i).getKey() + " - - - " + list.get(i).getValue());
			}
//			datos.entrySet().forEach(entry -> {
//			    System.out.println(entry.getKey() + " " + entry.getValue());
//			});
			f.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
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

}
