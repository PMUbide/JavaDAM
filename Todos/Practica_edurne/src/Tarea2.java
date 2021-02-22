import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Formatter;
import java.util.Scanner;

public class Tarea2 {
	public static void main(String[] args) {
		//Creamos los ArrayList donde se van a guardar los datos le�dos
		ArrayList <UsoBizi> total_10 = new ArrayList <UsoBizi> ();
		ArrayList <UsoBizi> total_2000 = new ArrayList <UsoBizi> ();
		//Pasamos los ficheros que se crearon en la TAREA 1
		String prueba16 = "Ficheros/bici/pruebas-10.csv";
		String prueba17 = "Ficheros/bici/pruebas-2000.csv";
		//Se llama al m�todo para leer el fichero y almacenarlo.
		leerFichero(prueba16, total_10);
		leerFichero(prueba17, total_2000);
		//Se muestra la informaci�n de cada uno llamando al m�todo
		System.out.println("Fichero: " + prueba16);
		traslados(total_10);
		System.out.println("Fichero: " + prueba17);
		traslados(total_2000);
	}
	
	
	/**
	 * M�todo que recibe la ruta de un fichero creado en la tarea 1,
	 * como un csv separado por punto y coma, y a su vez un ArrayList
	 * para almacenar la informaci�n de las filas como objetos.
	 * @param nombreFichero -> Ruta del fichero que se quiere leer
	 * @param totales -> ArrayList que se almacena la informaci�n.
	 */
	private static void leerFichero(String nombreFichero,  ArrayList<UsoBizi> totales) {
		try {
			//Scanner para leer el fichero
			Scanner texto = new Scanner(new File(nombreFichero));
			//Contador para 
			int cont = 0;
			while (texto.hasNextLine()) {
				String linea = texto.nextLine();
				String[] lineaSeparada = linea.split(";");
				int num1 = Integer.parseInt(lineaSeparada[0].trim());
				int num2 = Integer.parseInt(lineaSeparada[1].trim());
				int num3 = Integer.parseInt(lineaSeparada[2].trim());
				UsoBizi uso = new UsoBizi(num1, num2, num3);
				totales.add(uso);
			}
		} catch (FileNotFoundException e) {
			System.out.println("Error en el nombre de uno de los ficheros");
		}
	}
	
	private static void traslados (ArrayList <UsoBizi> array) {
		int contCirculares = 0;
		for (UsoBizi i: array) {
			if(i.getEstAnclaje() == i.getEstRetiro()) {
				//System.out.println("El recorrido es circular");
				contCirculares++;
			}
		
		}
		System.out.println("Traslados " + (array.size() - contCirculares));
		System.out.println("Circulares " + (contCirculares));
		System.out.println("Totales" + array.size());
		System.out.println(" ");
		
	}
	
}
