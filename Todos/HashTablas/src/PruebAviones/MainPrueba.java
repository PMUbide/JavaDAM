package PruebAviones;

import java.io.*;
import java.util.*;
import java.util.Map.Entry;

import Aviones.Accidentes;

public class MainPrueba {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Accidentes> lista = new ArrayList<>();
		String fichero = "files/aviones_datos.dat";
		// LEER
        try {
            ObjectInputStream oisFP = new ObjectInputStream(new FileInputStream(fichero));
            while(true) {
                lista.add((Accidentes)oisFP.readObject());
            }
        } catch (FileNotFoundException e) {
            System.out.println("No se ha importado ningún objeto");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            System.out.println("ERROr");
        } catch (EOFException e) {
            System.out.println("Objetos importados correctamente.");
        } catch (IOException e) {
        	System.out.println("FAILED");
            //e.printStackTrace();
        }

		
		HashMap <String, Integer> inventario = new HashMap<String, Integer>();

        for(int i = 0; i < lista.size(); i++) {
        	incrementValue(inventario, lista.get(i).getTipoAvion());
        }


//		Avion aa1 = new Avion("Boeing-1", 10);
//		Avion aa2 = new Avion("Boeing-2", 12);
//		Avion aa3 = new Avion("Boeing-3", 13);
//		Avion aa4 = new Avion("Boeing-3", 15);

//		HashMap<String, Integer> inventario = new HashMap<String, Integer>();

//		inventario.put("Boeing-1", 0);
//		inventario.put("Boeing-2", 0);
//		inventario.put("Boeing-3", 0);
//		inventario.put("Boeing-3", 0);

//		Map<String, Integer> map = new HashMap();
//		map.put("A", 100);

//		incrementValue(inventario, "Boeing-1");
//		incrementValue(inventario, "Boeing-2");
//		incrementValue(inventario, "Boeing-1");
//		incrementValue(inventario, "Boeing-3");
//		incrementValue(inventario, "Boeing-3");
		
		System.out.println(inventario);

		ArrayList<Avion> prueba_aviones = new ArrayList<>();
		//Transformarlo a un arraylist
		for (String p : inventario.keySet()) {
			prueba_aviones.add(new Avion(p, inventario.get(p)));
			
		}
//        for (Avion avion : prueba_aviones) {
//			System.out.println(avion);
//		}
        
//		for (Entry<Integer, Integer> entry: inventario.entrySet()) {
//			int trasl = traslados(entry.getKey(), total16);
//			users_16.add(new UsuarioBici(entry.getKey(), trasl, (entry.getValue() - trasl)));
//			System.out.println("Running...");
//		}
		
		
        ////////////////////////////////////////AQui implementar comparator para ordenarlos de mayor a menor.
        
        Collections.sort(prueba_aviones);
        
        
        for(int i = 0; i < 15; i++) {
        	System.out.println(prueba_aviones.get(i));
        }
        
        
        
//		for (String p : inventario.keySet()) {
//			if(inventario.get(p) > 10) {
//				System.out.println("Clave: " + p + ", Valor: " + inventario.get(p));
//				
//			}
//		}
//        System.out.println(inventario);
		
//		Comparator<Entry<String, String>> valueComparator = new Comparator<Entry<String,String>>() {
//			public int compare(Entry<String, String> e1, Entry<String, String> e2) {
//				String v1 = e1.getValue();
//				String v2 = e2.getValue();
//				return v1.compareTo(v2);
//			}
//		}	
			
	}

	
	
	
	/**
	 * Añade elementos aun HashMAp de <String> y <Integer> y sumando sus ocurrencias 
	 * si aparece repetida la clave.
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
	
	
	
	
//	public static <K> void incrementValue(Map<K, Integer> map, K key) {
//		// get value of the specified key
//		Integer count = map.get(key);
//		// if the map contains no mapping for the key, then
//		// map the key with value of 1
//		if (count == null) {
//			map.put(key, 1);
//		}
//		// else increment the found value by 1
//		else {
//			map.put(key, count + 1);
//		}
//	}

}
