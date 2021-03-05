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
			//Condicional para leer la informaci�n en la totalidad del fichero.
			while (texto.hasNextLine()) {
				//String para almacenar la fila
				String linea = texto.nextLine();
				//Split por ";" para recoger la informaci�n.
				String[] lineaSeparada = linea.split(";");
				int num1 = Integer.parseInt(lineaSeparada[0].trim());
				int num2 = Integer.parseInt(lineaSeparada[1].trim());
				int num3 = Integer.parseInt(lineaSeparada[2].trim());
				//Objeto creado con la informaci�n de la fila.
				UsoBizi uso = new UsoBizi(num1, num2, num3);
				//A�adido al ArrayList
				totales.add(uso);
			}
		} catch (FileNotFoundException e) {
			System.out.println("Error al leer el fichero");
		}
	}
	
	/**
	 * M�todo que muestra por pantalla la informaci�n que 
	 * es requerida del fichero, por lo que recibe un 
	 * ArrayList con la informaci�n almacenada
	 * @param array -> ArrayList de la clase UsoBizi con la informaci�n del fichero
	 */
	private static void traslados (ArrayList <UsoBizi> array) {
		//Se crea una variable para ir sumando el n�mero de 
		//recorridos circulares que hay en total
		int contCirculares = 0;
		//Se recorre el ArrayList para registrar los traslados.
		for (UsoBizi i: array) {
			//Si la estaci�n de retiro coincide con la de anclaje
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
		//Los usos totales que corresponde con el tama�o del ArrayList
		System.out.println("Totales " + array.size());
		System.out.println(" ");
		
	}
	
}
