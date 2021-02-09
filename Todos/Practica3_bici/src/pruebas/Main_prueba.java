package pruebas;

import java.io.File;
import java.io.FileNotFoundException;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Formatter;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class Main_prueba {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Primero leer los ficheros.
		//Año 2017
		String ruta = "files/usos-17.csv";	
		//Se le pasa al método la ruta y las lineas que queremos que lea. 
		//Devuelve un array de objetos. Cada fila del archivo es un objeto. con la info
		ArrayList<UsoBici> datos_17 = leerYCortarFichero(ruta, 2000);
//		System.out.println(datos_17.size());
		//
		//Año 2016
		String ruta2 = "files/usos-16.csv";
		ArrayList<UsoBici> datos_16 = leerYCortarFichero(ruta2, 10);
		System.out.println(datos_16.size());
		//Muestra la información
//		for(UsoBici i: datos_16) {
//			System.out.println(i.toString());
//		}
		//Ahora Escribirlos en el sistema.
		String ruta_escribir17 = "files/pruebas-2000.csv";
		crearFicheroCsv(ruta_escribir17, datos_17);
		String ruta_escribir16 = "files/pruebas-10.csv";
		crearFicheroCsv(ruta_escribir16, datos_16);
		
		//TAREA 2
		//Resto del programa.
		//Pedir archivo y mostrar resumen.
		ArrayList<UsoBici> pruebas_17 = leerFichero(ruta_escribir17);
		ArrayList<UsoBici> total16 = leerYCortarFichero(ruta2);
		System.out.println("Usos del total de 16:");
		mostrarUsos(total16);
		System.out.println("\nUsos del cortado de 10 lineas:");
		mostrarUsos(datos_16);
		System.out.println("\nUsos del cortado de 2000 lineas:");
		mostrarUsos(datos_17);
		
		//TAREA 3
		//HasMap para el número de usuarios distintos.
		HashMap <Integer, Integer> inventario = new HashMap<Integer, Integer>();
        for(int i = 0; i < total16.size(); i++) {
        	incrementValue(inventario, total16.get(i).getIdUsuario());
        }
		System.out.println("Numero de usuarios distintos: " + inventario.size());
        //Ahora de ese HasMap transformar a un ArrayList de objetos de UsuarioBici.
		
		
		
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
	 * Método para mostrar la información de cualquier archivo
	 * Enseña los usos como traslado y los usos como circulares.
	 * @param bicis
	 */
	public static void mostrarUsos(ArrayList <UsoBici> bicis) {
		//Contador de los circulares.
		int circulares = 0;
		for(UsoBici i: bicis) {
			circulares += i.comprobarCircular();
		}
		System.out.println();
		System.out.println("Hay un total de " + (bicis.size()-circulares) + " de usos como traslado.");
		System.out.println("Hay un total de " + circulares + " de usos como circulares.");
		System.out.println("Número total de usos " + (bicis.size()));
	}
	
	
	
	/**
	 * Para leer un fichero CSV que tengamos SIN CABECERA.
	 * @param ruta "La ruta del fichero para leer, en este caso
	 * será la que se creo en el apartado 1."
	 * @return "Devuelve un arrayList de <UsoBici> con la info recogida.
	 */
	public static ArrayList <UsoBici> leerFichero(String ruta){
		Scanner archivo = null;
		try {
			archivo = new Scanner(new File(ruta));
		} catch (FileNotFoundException e) {
			System.out.println("ERROR");
		}
		String linea = "";
		ArrayList <UsoBici> bicis = new ArrayList<>();
		while(archivo.hasNextLine()) {
//			public UsoBici(int idUsuario, int estacionRetiro, int estacionAnclaje) 
			linea = archivo.nextLine();
			String [] lineaSeparada = linea.split(";");
			UsoBici bicicleta = new UsoBici (Integer.parseInt(lineaSeparada[0]), Integer.parseInt(lineaSeparada[1]), Integer.parseInt(lineaSeparada[2]));
			bicis.add(bicicleta);
		}
		return bicis;
	}
		
	/**
	 * PAra escribir el fichero con las lineas recortadas.
	 * @param ruta "La ruta donde crear el nuevo fichero"
	 * @param array "El array de <UsoBici> que queremos escribir.
	 */
	public static void crearFicheroCsv(String ruta, ArrayList <UsoBici> array) {
		try {
			Formatter nuevo = new Formatter(new File(ruta));
			for (UsoBici i : array) {
				//IDUsuario;RetiroEstacion;AnclajeEstacion
				String linea = i.getIdUsuario()+ ";" + i.getEstacionRetiro() +
						";" + i.getEstacionAnclaje() + "\n";
				nuevo.format(linea);
			}
			nuevo.close();
		} catch (FileNotFoundException e) {
			System.out.println("Fichero EXCEPTION");
		}
		System.out.println("Fichero creado con éxito!");
	}
	
	
	
	/** Método para leer la parque que se quiera de
	 *  un fichero de csv con la información de partida.
	 * 
	 * @param ruta "La ruta del archivo .csv para leer"
	 * @param filas "El número de filas contando la cabecera que van a ser leidas"
	 * @return "Devuelve un ArrayList de los objetos.
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
	 * Mismo método pero para leer la totalidad del fichero, no le llega el parámetro de las filas.
	 * @param ruta "Del fichero a leer"
	 * @return "Devuelve un ArrayList <UsoBici> con todas las filas del csv
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
		ArrayList <UsoBici> bicis = new ArrayList<>();
		while(archivo.hasNextLine()) {
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
	
}
