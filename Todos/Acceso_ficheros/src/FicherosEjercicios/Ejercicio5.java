package FicherosEjercicios;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Formatter;
import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Ejercicio 5: Realiza un programa en JAVA en el que muestres un menú que te permita 3
//		opciones:
//
//		1. Volcado de un arrayList con todos los números pares comprendidos entre 0 y 100.
//		El nombre del fichero lo elegirá el usuario.
//
//		2. Mostrar por pantalla el contenido del fichero de texto creado.
//
//		3. Salir del Programa.
		ArrayList<Integer> nuevo = new ArrayList<>();
		//Parte 1 menu
		for(int i = 0; i < 100; i++) {
			if(i%2 == 0) {
				nuevo.add(i);
			}
		}
		Formatter archivo = null;
		try {
			archivo = new Formatter("files/ejercicio5.txt");
			String meter = nuevo.toString();
//			System.out.println(meter);
			archivo.format(meter);
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		archivo.close();
		
		try {
			Scanner ay = new Scanner (new File ("files/ejercicio5.txt"));
			while(ay.hasNextLine()) {
				System.out.println(ay.nextLine());
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
