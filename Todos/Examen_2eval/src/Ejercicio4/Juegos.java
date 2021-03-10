package Ejercicio4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class Juegos {

	public static void main(String[] args) {
		// leer archivo
		Scanner entrada;
		ArrayList<String> consolas = new ArrayList<String>();
		try {
			entrada = new Scanner(new File("files/ventasVideojuegos.csv"));
			int cont = 0;
			//Hacer el while mientras existan líneas.
			while (entrada.hasNextLine()) {
				String linea = entrada.nextLine();
				String[] lineaS = linea.split(",");
//				//Se hace un split por comas y se gestiona que no coja la primera fila.
				if(cont > 0) {
					//Si la segunda columna no empieza con comilla, entonces añade en el caso de
					//no exista ese elemento al ArrayList de consolas
					if(!lineaS[1].substring(0, 1).equals("\"")) {
						if(!existeJuego(consolas, lineaS[2])) {
							consolas.add(lineaS[2]);
						}
//					En caso de que si empiece por comillas,	
					}else {
						for (int i = 1; i < lineaS.length-6; i++) {
							//Recorrera cada posicion y si encuentra una que acabe con comillas,,
							//Será cuando añadirá la siguiente en caso de que no exista.
							if(lineaS[i].substring(lineaS[i].length()-1,lineaS[i].length()).equals("\"")) {
								if(!existeJuego(consolas, lineaS[i+1])) {
									consolas.add(lineaS[i+1]);
								}
							}
						}
					}
				}
				cont++;
			}
			//Cerrar el scanner
			entrada.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("ERROR");
		}
		//Ordena alfabéticamente y lo muestra por pantalla.
		Collections.sort(consolas);
		System.out.println("Diferentes = " + consolas.size());
		for (String c : consolas) {
			System.out.println(c);
		}
		
	}
	
	
	public static boolean existeJuego(ArrayList<String> juegos, String nuevo) {
		for (String string : juegos) {
			if(string.equals(nuevo)) {
				return true;
			}
		}
		return false;
	}

}
