package LeeFicheros;

import java.io.FileNotFoundException;
import java.util.Formatter;
import java.util.Scanner;

public class Prueba_formatter {
	
	/**
	 * Pre: [nombre] almacena la ruta + nombre del fichero a crear/modificar
	 * Post: Crea un fichero de texto denominado [nombre] y almacena en Ã©l una tabla con
	 * 		los valores de las funciones trigonomÃ©tricas seno y coseno para Ã¡ngulos compren-
	 * 		didos entre 0Âº y 360Âº. La tabla de datos NO CONTIENE formato.
	 */
	private static void guardarResultadosSinFormato(String nombre) {
		try {
			/*
			 * Se crea un objeto [Formatter] al que se asocia un fichero deno-
			 * minado [nombre].
			 */
			Formatter salida = new Formatter(nombre);
			/*
			 * Se almacena en el buffer la informaciÃ³n a escribir en el fichero
			 */
			salida.format(" x (en grados)     sen(x)     cos(x)\n");
			salida.format("===============   ========   ========\n");
			/*
			 * Se solicita al buffer que se vacÃ­e y escriba toda la informaciÃ³n
			 * que tiene almacenada en el fichero.
			 */
			salida.flush();
			/*
			 * Se escriben las lÃ­neas de datos de la tabla
			 */
			for(int i = 0; i <= 12; i++) {
				double angulo = i*30*Math.PI/180.0;
				salida.format("    " + 30*i + "   " + Math.sin(angulo) + "   " + 
				Math.cos(angulo) + "\n");
			}
			/*
			 * Se libera el fichero que almacena la tabla de datos. La llamada
			 * al metodo close() tambiÃ©n libera la informaciÃ³n del buffer, por 
			 * lo tanto escribe toda la tabla de datos en el fichero antes
			 * de cerrarlo.
			 */
			salida.close();
		} catch(FileNotFoundException e) {
			System.out.println("El fichero " + nombre + " no ha podido ser creado.");
		}
	}
	
	/**
	 * Pre: [nombre] almacena la ruta + nombre del fichero a crear/modificar
	 * Post: Crea un fichero de texto denominado [nombre] y almacena en Ã©l una tabla con
	 * 		los valores de las funciones trigonomÃ©tricas seno y coseno para Ã¡ngulos compren-
	 * 		didos entre 0Âº y 360Âº. La tabla de datos SÃ� CONTIENE formato.
	 */
	private static void guardarResultadosConFormato(String nombre) {
		try {
			/*
			 * Se crea un objeto [Formatter] al que se asocia un fichero deno-
			 * minado [nombre].
			 */
			Formatter salida = new Formatter(nombre);
			/*
			 * Se almacena en el buffer la informaciÃ³n a escribir en el fichero
			 */
			salida.format(" x (en grados)     sen(x)     cos(x)\n");
			salida.format("===============   ========   ========\n");
			/*
			 * Se solicita al buffer que se vacÃ­e y escriba toda la informaciÃ³n
			 * que tiene almacenada en el fichero.
			 */
			salida.flush();
			/*
			 * Se escriben las lÃ­neas de datos de la tabla
			 */
			for(int i = 0; i <= 12; i++) {
				double angulo = i*30*Math.PI/180.0;
				salida.format("%8d    %12.3f   %9.3f\n", 30*i, Math.sin(angulo), Math.cos(angulo));
			}
			/*
			 * Se libera el fichero que almacena la tabla de datos. La llamada
			 * al metodo close() tambiÃ©n libera la informaciÃ³n del buffer, por 
			 * lo tanto escribe toda la tabla de datos en el fichero antes
			 * de cerrarlo.
			 */
			salida.close();
		} catch(FileNotFoundException e) {
			System.out.println("El fichero " + nombre + " no ha podido ser creado.");
		}
	}
	
	/**
	 * Pre: ---
	 * Post: Ejecuta el programa Java que solicita al usuario el (path + nombre) de un fichero
	 * 		que ya existe o no en el sistema, y escribe sobre Ã©l la tabla de datos
	 * 		con las funciones trigonomÃ©tricas. Esta solicitud ocurre 2 veces, la primera de ellas
	 * 		para escribir la tabla de datos sin formato, y la segunda de ellas para escribirla
	 * 		con formato.
	 */
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		/*
		 * Solicita al usuario el fichero para escribibr en Ã©l los datos
		 * sin formato.
		 */
		System.out.print("Dame la ruta + nombre del fichero (sin formato): ");
		String nombreFichero = entrada.next();
		guardarResultadosSinFormato(nombreFichero);
		/*
		 * Solicita al usuario el fichero para escribibr en Ã©l los datos
		 * CON formato.
		 */
		System.out.print("Dame la ruta + nombre del fichero (con formato): ");
		nombreFichero = entrada.next();
		guardarResultadosConFormato(nombreFichero);
	}

}
