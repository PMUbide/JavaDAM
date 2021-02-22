import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Formatter;
import java.util.Scanner;

public class Tarea2 {
	public static void main(String[] args) {
		//Creamos los ArrayList donde se van a guardar los datos leídos
		ArrayList <UsoBizi> total_10 = new ArrayList <UsoBizi> ();
		ArrayList <UsoBizi> total_2000 = new ArrayList <UsoBizi> ();
		//Pasamos los ficheros que se crearon en la TAREA 1
		String prueba16 = "Ficheros/bici/pruebas-10.csv";
		String prueba17 = "Ficheros/bici/pruebas-2000.csv";
		//Se llama al método para leer el fichero y almacenarlo.
		leerFichero(prueba16, total_10);
		leerFichero(prueba17, total_2000);
		//Se muestra la información de cada uno llamando al método
		System.out.println("Fichero: " + prueba16);
		traslados(total_10);
		System.out.println("Fichero: " + prueba17);
		traslados(total_2000);
	}
	
	
	/**
	 * Método que recibe la ruta de un fichero creado en la tarea 1,
	 * como un csv separado por punto y coma, y a su vez un ArrayList
	 * para almacenar la información de las filas como objetos.
	 * @param nombreFichero -> Ruta del fichero que se quiere leer
	 * @param totales -> ArrayList que se almacena la información.
	 */
	private static void leerFichero(String nombreFichero,  ArrayList<UsoBizi> totales) {
		try {
			//Scanner para leer el fichero
			Scanner texto = new Scanner(new File(nombreFichero));
			//Condicional para leer la información en la totalidad del fichero.
			while (texto.hasNextLine()) {
				//String para almacenar la fila
				String linea = texto.nextLine();
				//Split por ";" para recoger la información.
				String[] lineaSeparada = linea.split(";");
				int num1 = Integer.parseInt(lineaSeparada[0].trim());
				int num2 = Integer.parseInt(lineaSeparada[1].trim());
				int num3 = Integer.parseInt(lineaSeparada[2].trim());
				//Objeto creado con la información de la fila.
				UsoBizi uso = new UsoBizi(num1, num2, num3);
				//Añadido al ArrayList
				totales.add(uso);
			}
		} catch (FileNotFoundException e) {
			System.out.println("Error al leer el fichero");
		}
	}
	
	/**
	 * Método que muestra por pantalla la información que 
	 * es requerida del fichero, por lo que recibe un 
	 * ArrayList con la información almacenada
	 * @param array -> ArrayList de la clase UsoBizi con la información del fichero
	 */
	private static void traslados (ArrayList <UsoBizi> array) {
		//Se crea una variable para ir sumando el número de 
		//recorridos circulares que hay en total
		int contCirculares = 0;
		//Se recorre el ArrayList para registrar los traslados.
		for (UsoBizi i: array) {
			//Si la estación de retiro coincide con la de anclaje
			//se considera un recorrido circular.
			if(i.getEstAnclaje() == i.getEstRetiro()) {
				contCirculares++;
			}
		}
		//Ahora se muestra por pantalla cada uno de los usos
		//Traslados
		System.out.println("Traslados " + (array.size() - contCirculares));
		//Circulares
		System.out.println("Circulares " + (contCirculares));
		//Los usos totales que corresponde con el tamaño del ArrayList
		System.out.println("Totales " + array.size());
		System.out.println(" ");
		
	}
	
}
