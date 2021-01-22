package FicherosEjercicios;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Formatter;
import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Ejercicio 4: Crea una aplicación que pida la ruta de dos ficheros de texto y de una ruta de
//		destino (solo la ruta, sin fichero al final). Debes copiar el contenido de los dos ficheros en uno,
//		este tendrá el nombre de los dos ficheros separados por un guion bajo y se guardará en la
//		ruta donde le hayamos indicado por teclado.
//
//		Por ejemplo, si tengo un fichero A.txt con “ABC” como contenido, un
//		fichero B.txt con “DEF” y una ruta de destino D:\, el resultado será un fichero
//		llamado A_B.txt en la ruta D:\ con el contenido “ABCDEF”.
		Scanner in = new Scanner(System.in);
		System.out.println("Te pido la ruta del fichero 1: ");
		String ruta1 = "files/archivo1.txt";
		System.out.println("Te pido la ruta del fichero 2: ");
		String ruta2 = "files/archivo2.txt";
		System.out.println("Te pido SOLO la ruta de destino: ");
		String rutaDestino = "files/";
		File archivo1 = new File (ruta1);
		File archivo2 = new File (ruta2);
		String nombre1 = archivo1.getName();
		String nombre2 = archivo2.getName();
		nombre1 = nombre1.substring(0, nombre1.length()-4); //Para quitarle el ".txt"
		String nombreAcabado = nombre1 + "_" + nombre2;
		System.out.println(nombreAcabado);
		
		try {
			Scanner file1 = new Scanner(archivo1);
			Scanner file2 = new Scanner(archivo2);
			String linea1 = "";
			String linea2 = "";
			while(file1.hasNextLine()) {
				linea1 += file1.nextLine();
			}
			while(file2.hasNextLine()) {
				linea2 += file2.nextLine();
			}
			Formatter nuevo = new Formatter (rutaDestino+nombreAcabado);
			nuevo.format(linea1 + linea2);
			System.out.println("Archivo CREADO");
			//CERRAMOS EL FORMATTER
			nuevo.close();
			//CErramos el SCANNNER
			file1.close();
			file2.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("ERROR");
		}
		
		
		
		
		
	}

}
