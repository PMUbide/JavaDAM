package LeeFicheros;

import java.io.FileNotFoundException;
import java.util.*;

public class ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("¡Bienvenido al programa de escritura sobre ficheros de texto!");
		Scanner in = new Scanner(System.in);
		System.out.println("Indique ruta del fichero a escribir: ");
		String ruta = in.next();
		in.nextLine();
		guardarResultados(ruta, in);
		System.out.println("FIN");
	}

	private static void guardarResultados(String nombre, Scanner entrada) {
		try {
			Formatter salida = new Formatter(nombre);
			String respuesta = " ";
			while (!respuesta.equals("fin")) {
				System.out.println("Introduzca lo que desea escribir: ");
				respuesta = entrada.nextLine();
				if(respuesta.equals("fin")) {
					break;
				}
				if (comprobarInt(respuesta)) { // Crea un int
					System.out.println("Número entero introducido por el usuario: " + respuesta);
					salida.format("Número entero introducido por el usuario: " + respuesta + "\n");
				} else { // Guardará un String
					System.out.println("Cadena de caracteres introducido por el usuario: " + respuesta);
					salida.format("Cadena de caracteres introducido por el usuario: " + respuesta + "\n");
				}
			}
			salida.close();
		} catch (FileNotFoundException e) {
			System.out.println("El fichero " + nombre + " no ha podido ser creado.");
		}
	}

	private static boolean comprobarInt(String name) {
		try {
			int a = Integer.parseInt(name);
			return true;
		} catch (NumberFormatException e) {
			return false;
		}

	}

}
