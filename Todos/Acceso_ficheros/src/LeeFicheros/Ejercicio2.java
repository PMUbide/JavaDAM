package LeeFicheros;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Formatter;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner (System.in);
//		String ruta = "D:\\PABLO\\APUNTES\\DAM\\Programacion\\personas.txt";
		String ruta = "files/nuevo.txt";
		//creamos un archivo
		File archivo = new File(ruta);
		//ahora la lectura con SCANNER
		System.out.println(ruta);
		String datos= " ";
		//TRIM() es para ignorar espacios.
		try {
			Scanner f = new Scanner(archivo);
			Formatter salida = new Formatter("files/final1.txt");
			String acabado = " ";
			while(f.hasNextLine()) {
				String linea = f.nextLine();
				String[] lineaSeparada = linea.split(" ");
				String dni = lineaSeparada[0];
				String apellido = lineaSeparada[1] + " " + lineaSeparada[2].substring(0, lineaSeparada[2].length()-1);
				String nombre = lineaSeparada[3];
				String total = nombre + " " + apellido + " " +dni;
				acabado = nombre + " " + apellido;
				int longitud = 60 - total.length();
				for(int i = 0; i < longitud; i++) {
					acabado += ".";
				}
				acabado += dni;
				System.out.println(acabado);
				salida.format(acabado+"\n");
			}
			salida.close();
			f.close();
		} catch(FileNotFoundException e) {
			System.out.println("No se ha encontrado la ruta de " + ruta);
		} 
		
		
	}

}
