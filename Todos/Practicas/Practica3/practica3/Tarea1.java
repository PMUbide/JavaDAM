package practica3;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Formatter;
import java.util.Scanner;

public class Tarea1 {
	public static void main(String[] args) {
		//Ruta del fichero de 2016
		String ruta16 = "Ficheros/usos-16.csv";
		//Fichero donde donde se va a guardar las 10 primeras líneas
		String prueba16 = "Ficheros/bici/pruebas-10.csv";
		//Arraylist para almancear los datos de cada linea
		ArrayList <UsoBizi> total_10 = new ArrayList <UsoBizi> ();
		//Llama al método de leer y escribir
		lineas(ruta16, prueba16, total_10, 10);
		System.out.println("Has entrado y salido del método.");
		System.out.println(total_10);
		//Ruta del fichero de 2017
		String ruta17 = "Ficheros/usos-17.csv";
		//Fichero donde se van a guardar los datos de las 2000 primeras líneas.
		String prueba17 = "Ficheros/bici/pruebas-2000.csv";
		//ArrayList para almancear los datos.
		ArrayList <UsoBizi> total_2000 = new ArrayList <UsoBizi> ();
		//Llamada al método principal
		lineas(ruta17, prueba17, total_2000, 2000);
	}
	
	/**
	 * Método que recibe el directorio de un fichero a leer,
	 * a continuación separa la información y la almacena en un 
	 * ArrayList de <UsoBizi> con la cantidad de líneas para leer
	 * que se le manda también como parámetro.
	 * @param nombreFichero -> El nombre del fichero que lee.
	 * @param nombreCopia	-> El nombre de donde se va a guardar la nueva copia reducida.
	 * @param totales	-> El ArrayList que almacena la información
	 * @param max -> El número de líneas que se van a leer del fichero original.
	 */
	private static void lineas(String nombreFichero, String nombreCopia, ArrayList<UsoBizi> totales, int max) {
		try {
			//Scanner para leer el fichero csv
			Scanner texto = new Scanner(new File(nombreFichero));
			//Formatter para el archivo que se guarda.
			Formatter copiaTexto = new Formatter(new File(nombreCopia));
			//Se crea un contador para tener en cuenta la primera línea.
			int cont = 0;
			//Empieza el bucle mientras tenga líneas.
			while (texto.hasNextLine()) {
				//String donde se almacena la información de una fila.
				String linea = texto.nextLine();
				//Split por comas para el String
				String[] lineaSeparada = linea.split(";");
				//Un condicional para evitar seleccionar la primera fila.
				if (cont > 0) {
					//Se registran los datos que interesan como integer.
					int num1 = Integer.parseInt(lineaSeparada[0]);
					int num2 = Integer.parseInt(lineaSeparada[2]);
					int num3 = Integer.parseInt(lineaSeparada[4]);
					//Se crea un nuevo objeto de la clase UsoBizi en cada iteración
					UsoBizi uso = new UsoBizi(num1, num2, num3);
					//Se añade al ArrayList
					totales.add(uso);	
					//Se registra en el archivo para guardarlo como un nuevo "csv" separado por ";"
					copiaTexto.format(lineaSeparada[0] + "; "+ lineaSeparada[2] + "; " + lineaSeparada[4] +"\n" );
				}
				cont++;
				//Si el contador llega al parámetro "max" pasado en el método finaliza el bucle while.
				if (cont == max) {
					break;
				}
			}
			//Se cierra el Formatter
			copiaTexto.close();
			//System.out.print(cont); //Debug
		} catch (FileNotFoundException e) {
			System.out.println("Error en el nombre de uno de los ficheros");
		}
	}

	
}
