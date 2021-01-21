package LeeFicheros;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class PruebaLectura {
	
	
	
	
	private static void calcularMedias(String nombre) {
		File file = new File (nombre);
		try {
			Scanner f = new Scanner(file);
			while(f.hasNextLine()) {
				String linea = f.nextLine();
				String[] lineaSeparada = linea.split(";");
				double media = ((Integer.parseInt(lineaSeparada[1])) +
						(Integer.parseInt(lineaSeparada[2])) + (Integer.parseInt(lineaSeparada[3]))) / 3.0;
				System.out.printf("%s %s %3.2f %n", lineaSeparada[0], "tiene una media de: ", media);		
			}
			
			f.close();
		} catch(FileNotFoundException e) {
			System.out.println("No se ha encontrado la ruta de " + nombre);
		}
		
	}
	
	
	
	
	
	
	/**
	 * Pre: [nombre] almacena la ruta + nombre del fichero a leer
	 * Post: lee el fichero cuyo path coincide con [nombre] y muestra por 
	 * 		pantalla el número total de lÃ­neas y el número total de caracteres
	 * 		de este.
	 */
	private static void mostrarInformacionFichero(String nombre) {
		/*
		 * Creo el objeto [file] de tipo File para poder crear el objeto
		 * de tipo Scanner para leer el fichero.
		 */
		File file = new File(nombre); //FILE NO SE CIERRA
		int numLineas = 0;		// Almacena el número de lineas del fichero
		int numCaracteres = 0;  // Almacena el número total de caracteres del fichero
		String linea = "";
		try {
			/*
			 * Se crea un objeto [Formatter] al que se asocia un fichero deno-
			 * minado [file].
			 */
			Scanner f = new Scanner(file);
			while(f.hasNextLine()) {
				/*
				 * Almacenamos toda la lÃ­nea en la variable asociada, para poder
				 * trabajar con ella. PodrÃ­amos usar el mÃ©todo subString() y todos 
				 * los mÃ©todos de la clase String asociados que dimos en el primer
				 * trimestre. 
				 */
				linea += f.nextLine()+ "\n";
				numLineas++;
				numCaracteres = numCaracteres + linea.length();
			}
			/*
			 * Se libera el fichero que estamos leyendo. 
			 */
			f.close();
			/*
			 * Mostramos por pantalla el resultdo del anÃ¡lisis del fichero.
			 */
			System.out.println(linea);
			System.out.println("Fichero " + nombre + " analizado con éxito:");
			System.out.println("\t- número total de líneas = " + numLineas);
			System.out.println("\t- número total de caracteres = " + numCaracteres);
		} catch(FileNotFoundException e) {
			System.out.println("El fichero " + nombre + " no ha podido ser abierto.");
		}
		
	}
	
	/**
	 * Pre: ---
	 * Post: Ejecuta el programa Java que solicita al usuario el (path + nombre) de un fichero
	 * 		que ya existe en el sistema. Muestra por pantalla el número de lÃ­neas y el número
	 * 		de caracteres de este.
	 */
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		/*
		 * Solicita al usuario el fichero mostrar la informaciÃ³n
		 * de este por pantalla
		 */
		System.out.print("Dame la ruta + nombre del fichero: ");
		String nombreFichero = entrada.next();
		mostrarInformacionFichero(nombreFichero);
		calcularMedias(nombreFichero);
		//Cerrar el Scanner
		entrada.close();
	}
}
