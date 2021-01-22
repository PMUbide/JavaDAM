package FicherosEjercicios;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Formatter;
import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Ejercicio 1: Crea un fichero de texto con el nombre y contenido que tú desees. Por
//		ejemplo, Ejercicio1.txt. Realiza un programa en Java que lea el fichero
//		<<Ejercicio1.txt>> carácter a carácter y muestre su contenido por pantalla sin espacios.
		Scanner in = new Scanner (System.in);
		String ruta = "files/Ejercicio1.txt";
		//creamos un archivo
		File archivo = new File(ruta);
		//ahora la lectura con SCANNER
		System.out.println("Ruta: " + ruta);
		String datos= " ";
		//TRIM() es para ignorar espacios.
		try {
			Scanner f = new Scanner(archivo);
			String acabado = " ";
			while(f.hasNext()) {
				String linea = f.next();
				//String lineaJunta = linea.trim();
				acabado += linea;
			}
			System.out.println(acabado);
			f.close();
		} catch(FileNotFoundException e) {
			System.out.println("No se ha encontrado la ruta de " + ruta);
		} 
		
		
		
	}

}
