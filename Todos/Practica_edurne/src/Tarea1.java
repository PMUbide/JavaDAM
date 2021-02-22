package PRÁCTICA3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Formatter;
import java.util.Scanner;

public class Tarea1 {
	private static void lineas(String nombreFichero, String nombreCopia, ArrayList<UsoBizi> totales, int max) {
		try {
			Scanner texto = new Scanner(new File(nombreFichero));
			Formatter copiaTexto = new Formatter(new File(nombreCopia));
			/*
			 * Mientras el fichero que estamos leyendo tenga una nueva línea, seguimos
			 * iterando para escribirlo todo en [copiaTexto] pero con la nueva estructura.
			 */
			int cont = 0;
//			ArrayList <UsoBizi> total_10 = new ArrayList <UsoBizi> ();
			while (texto.hasNextLine()) {
				String linea = texto.nextLine();
//				System.out.println(cont + "   " + linea);
				String[] lineaSeparada = linea.split(";");
				if (cont > 0) {

//					for(int i = 0; i < lineaSeparada.length; i++ ) {
//						System.out.println(lineaSeparada[i]);
//					}

					int num1 = Integer.parseInt(lineaSeparada[0]);
					int num2 = Integer.parseInt(lineaSeparada[2]);
					int num3 = Integer.parseInt(lineaSeparada[4]);
					UsoBizi uso = new UsoBizi(num1, num2, num3);
					totales.add(uso);	
					copiaTexto.format(lineaSeparada[0] + "; "+ lineaSeparada[2] + "; " + lineaSeparada[4] +"\n" );
				}
				cont++;
				if (cont == max) {
					break;
				}
				
			}
			copiaTexto.close();
			System.out.print(cont);
		} catch (FileNotFoundException e) {
			System.out.println("Error en el nombre de uno de los ficheros");
		}
	}

	public static void main(String[] args) {
		String ruta16 = "Ficheros/usos-16.csv";
		String prueba16 = "Ficheros/bici/pruebas-10.csv";
		ArrayList <UsoBizi> total_10 = new ArrayList <UsoBizi> ();

		lineas(ruta16, prueba16, total_10, 10);
		System.out.println("has salido del método den 'lineas'");
		System.out.println(total_10);
		
		String ruta17 = "Ficheros/usos-17.csv";
		String prueba17 = "Ficheros/bici/pruebas-2000.csv";
		ArrayList <UsoBizi> total_2000 = new ArrayList <UsoBizi> ();
		lineas(ruta17, prueba17, total_2000, 2000);

	}
}
