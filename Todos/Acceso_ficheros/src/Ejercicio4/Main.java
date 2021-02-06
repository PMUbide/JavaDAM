package Ejercicio4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Primero leemos el texto.;
		String ruta = "files/texto.txt";
		//Leemos el fichero
		File nuevo = new File (ruta);
		ArrayList <String> datos = new ArrayList <>();
		String palabra = "";
		ArrayList <Par> objetos = new ArrayList <>();
		try {
			Scanner fichero = new Scanner(nuevo);
			while(fichero.hasNextLine()) {
				palabra = fichero.next();
				datos.add(palabra);
			}
			//Limpiar código, le quitamos "," y "." y ":" 
			for(int i = 0; i < datos.size(); i++) {
				datos.set(i, datos.get(i).replace(",", ""));
				datos.set(i, datos.get(i).replace(".", ""));
				datos.set(i, datos.get(i).replace(":", ""));
			}
			//Recorrer en un ArrayList del objeto que vaya almacenando los datos
			String elegida = "";
			int veces = 0;
			for(int i = 0; i < datos.size(); i++) {
				if(!compararPalabra(datos.get(i), objetos)) {
					elegida = datos.get(i);
					for(int j = 0; j < datos.size(); j++ ) {
						if(elegida.equals(datos.get(j))) {
							veces++;
						}
					}
					Par entero = new Par(veces, elegida);
					objetos.add(entero);
				}
				veces = 0;
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("ERROR, archivo no encontrado.");
		}
		for(int j = 0; j < objetos.size(); j++ ) {
			System.out.printf(" %20s %10s %20s %d %n", "Palabra |||", objetos.get(j).getPalabra(), "     ||||  aparece ", objetos.get(j).getConcurrencias());
		}
		System.out.println("Busca una palabra: ");
		Scanner in = new Scanner (System.in);
		String palabraBuscar = in.nextLine();
		boolean estado = false;
		for(int i = 0; i < objetos.size(); i++) {
			if(palabraBuscar.equalsIgnoreCase((objetos.get(i).getPalabra()))) {
				System.out.println("PAlabra " + palabraBuscar + " encontrada.");
				System.out.println("Veces que aparece " + objetos.get(i).getConcurrencias());
				estado = true;
				break;
			}
		}
		if(!estado) {
			System.out.println("No encontrada");
		}
		//System.out.println(datos.toString());
	}
	
	public static boolean compararPalabra (String uno, ArrayList<Par> dos) {
		for(int i = 0; i < dos.size(); i++) {
			if(dos.get(i).getPalabra().equals(uno)) {
				return true;
			}
		}
		return false;
	}
	
	

}
