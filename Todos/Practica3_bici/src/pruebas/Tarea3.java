package pruebas;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;


public class Tarea3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ruta17 = "files/usos-17.csv";
		String ruta16 = "files/usos-16.csv";
		ArrayList<UsoBici> total16 = leerYCortarFichero(ruta16);
		mostrarUsos(total16);
		// HasMap para el número de usuarios distintos.
		HashMap <Integer, Integer> inventario = new HashMap <Integer, Integer>();
		for (int i = 0; i < total16.size(); i++) {
			conteoMap(inventario, total16.get(i).getIdUsuario());
		}
		System.out.println("Numero de usuarios distintos: " + inventario.size());
		// Ahora de ese HasMap transformar a un ArrayList de objetos de UsuarioBici.
		ArrayList <UsuarioBici> users_16 = new ArrayList<>();
		System.out.println("ArrayLeido, empieza la creación...");
		double start = System.currentTimeMillis(); //empieza un contador de tiempo en milisegundos.
		for (Entry <Integer, Integer> entry: inventario.entrySet()) {
			int trasl = traslados(entry.getKey(), total16);
			users_16.add(new UsuarioBici(entry.getKey(), trasl, (entry.getValue() - trasl)));
//			System.out.println("Running...");
		}
		double finish = System.currentTimeMillis(); //FINAL contador del tiempo al acabar en milisegundos.
		System.out.println("Tiempo de ejecución = " + (finish - start)/1000 + " segundos.\n");
		//Ordenarlo por el uso total.
		//Aplicado con la interfaz COMPARABLE en el objeto.
		Collections.sort(users_16);
		//Mostrar los 15 primeros.
		for (int i = 0; i < 15; i++) {
			System.out.println(users_16.get(i).toString());
		}
		
		
	}

	/**
	 * Devuelve el número de traslados según un índice para comparar.
	 * @param key
	 * @param array
	 * @return
	 */
	public static int traslados(Integer key, ArrayList<UsoBici> array) {
		int conteo = 0;
		for (UsoBici i: array) {
			if(i.getIdUsuario() == key && i.getEstacionAnclaje() != i.getEstacionRetiro()) {
				conteo++;
			}
		}
		return conteo;
	}
	
	/**
	 * Devuelve el número de traslados circulares. 
	 * @param key
	 * @param array
	 * @return
	 */
	public static int circular(Integer key, ArrayList<UsoBici> array) {
		int conteo = 0;
		for (UsoBici i: array) {
			if(i.getIdUsuario() == key && i.getEstacionAnclaje() == i.getEstacionRetiro()) {
				conteo++;
			}
		}
		return conteo;
		
	}
	
	
	/**
	 * Método para añadir elementos a un HasMAp y que vaya sumando si ya existe.
	 * @param <K>
	 * @param map
	 * @param key
	 */
	public static <K> void conteoMap(Map<K, Integer> map, K key) {
		// Cogemos el valor
		Integer count = map.get(key);
		// si no contiene ese key anteriormente le aplicamos 1.
		if (count == null) {
			map.put(key, 1);
		}
		// En caso de que exista le añadimos +1 al valor.
		else {
			map.put(key, count + 1);
		}
	}

	
	/**
	 * Método copiado de Main_pruebas
	 * @param bicis
	 */
	public static void mostrarUsos(ArrayList<UsoBici> bicis) {
		// Contador de los circulares.
		int circulares = 0;
		for (UsoBici i : bicis) {
			circulares += i.comprobarCircular();
		}
		System.out.println();
		System.out.println("Hay un total de " + (bicis.size() - circulares) + " de usos como traslado.");
		System.out.println("Hay un total de " + circulares + " de usos como circulares.");
		System.out.println("Número total de usos " + (bicis.size()));
	}

	
	/**
	 * Método copiado de "Main_pruebas"
	 * @param ruta
	 * @param filas
	 * @return
	 */
	public static ArrayList<UsoBici> leerYCortarFichero(String ruta, int filas) {
		Scanner archivo = null;
		try {
			archivo = new Scanner(new File(ruta));
		} catch (FileNotFoundException e) {
			System.out.println("ERROR");
		}
		int conteo = 0;
		String linea = "";
		ArrayList <UsoBici> bicis = new ArrayList<>();
		while(conteo < filas) {
//			public UsoBici(int idUsuario, int estacionRetiro, int estacionAnclaje) 
			linea = archivo.nextLine();
			if(conteo > 0) { //Para no añadir la cabecera columnas
				String [] lineaSeparada = linea.split(";");
				UsoBici bicicleta = new UsoBici (Integer.parseInt(lineaSeparada[0]), Integer.parseInt(lineaSeparada[2]), Integer.parseInt(lineaSeparada[4]));
				bicis.add(bicicleta);
			}
			conteo++;
		}
		return bicis;
	}
	
	/**
	 * Método copiado de Main_prueba
	 * @param ruta
	 * @return
	 */
	public static ArrayList<UsoBici> leerYCortarFichero(String ruta) {
		Scanner archivo = null;
		try {
			archivo = new Scanner(new File(ruta));
		} catch (FileNotFoundException e) {
			System.out.println("ERROR");
		}
		int conteo = 0;
		String linea = "";
		ArrayList<UsoBici> bicis = new ArrayList<>();
		while (archivo.hasNextLine()) {
//			public UsoBici(int idUsuario, int estacionRetiro, int estacionAnclaje) 
			linea = archivo.nextLine();
			if (conteo > 0) { // Para no añadir la cabecera columnas
				String[] lineaSeparada = linea.split(";");
				UsoBici bicicleta = new UsoBici(Integer.parseInt(lineaSeparada[0]), Integer.parseInt(lineaSeparada[2]),
						Integer.parseInt(lineaSeparada[4]));
				bicis.add(bicicleta);
			}
			conteo++;
		}
		return bicis;
	}
}
