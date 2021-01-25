package pruebas;

import java.io.File;
import java.io.FileNotFoundException;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;


public class Main_prueba {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Primero leer los ficheros.
		String ruta = "files/usos-17.csv";
		File file = new File (ruta);
		Scanner archivo = null;
		try {
			archivo = new Scanner(file);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("ERROR");
		}
		int conteo = 0;
		String linea = "";
		ArrayList <UsoBici> bicis = new ArrayList<>();
		UsoBici[] nueva = new UsoBici[2000];
		while(conteo < 2000) {
//			public UsoBici(int idUsuario, int estacionRetiro, int estacionAnclaje) 
			linea = archivo.nextLine();
			if(conteo > 0) {
				String [] lineaSeparada = linea.split(";");
				UsoBici bicicleta = new UsoBici (Integer.parseInt(lineaSeparada[0]), Integer.parseInt(lineaSeparada[2]), Integer.parseInt(lineaSeparada[4]));
				bicis.add(bicicleta);
				nueva[conteo] = bicicleta;
			}
			conteo++;
		}
		for(UsoBici i: bicis) {
			System.out.println(i.toString());
		}
		//Contador de los circulares.
		
		int circulares = 0;
		for(UsoBici i: bicis) {
			circulares += i.comprobarCircular();
		}
		System.out.println();
		System.out.println("Hay un total de " + (bicis.size()-circulares) + " de usos como traslado.\n");
		System.out.println("Hay un total de " + circulares + " de usos como circulares. \n");
		//Buscador de id
		int veces = 0;
	
		for(UsoBici i: bicis) {
			for(UsoBici j: bicis) {
				if(i.getIdUsuario() == j.getIdUsuario()) {
					veces++;
				}
			}
			if(veces >2) {
				
				System.out.println("El usuario " + i.getIdUsuario() + " ha hecho un total de " + veces + " traslados.");
			}
			
			Arrays.sort(nueva);
			//
//			usos.add(i);
			veces = 0;
			
		}
		for(int i = 0; i < nueva.length; i++ ) {
			System.out.println(nueva[i].toString());
		}
		
		
		
		
		
		
		
		
		
		
		archivo.close();
		
		
		
	}

}
