package pruebas;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Tarea2 {

	public static void main(String[] args) {
		//Con la ruta
		String ruta_corta17 = "files/pruebas-2000.csv";
		String ruta_corta16 = "files/pruebas-10.csv";
		//Importarlo
		//Pedir archivo y mostrar resumen.
		ArrayList<UsoBici> pruebas_17 = leerFichero(ruta_corta17);
		ArrayList<UsoBici> pruebas_16 = leerFichero(ruta_corta16);
		for (UsoBici i : pruebas_16) {
			System.out.println(i);
		}
		
		
		
		
		
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
}
