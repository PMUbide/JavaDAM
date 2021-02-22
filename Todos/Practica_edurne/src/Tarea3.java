package PRÁCTICA3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Tarea3 {
	public static void main(String[] args) {
		ArrayList <UsoBizi> total_10 = new ArrayList <UsoBizi> ();
		ArrayList <UsoBizi> total_2000 = new ArrayList <UsoBizi> ();
		String prueba16 = "Ficheros/bici/pruebas-10.csv";
		String prueba17 = "Ficheros/bici/pruebas-2000.csv";
		
		leerFichero(prueba16, total_10);
		leerFichero(prueba17, total_2000);
		
		ArrayList <UsuarioBizi> usuarios_10 = new ArrayList <UsuarioBizi> (); 
		for (UsoBizi i: total_2000) {
			if(usuarios_10.size() == 0) {
				int circular = buscarCircular(i);
				int lineal;
				if(circular == 0) {
					lineal = 1;
				} else {
					lineal = 0;
				}
				UsuarioBizi nuevo = new UsuarioBizi(i.getIdUsuario(), lineal, circular);
				usuarios_10.add(nuevo);
				
			} else {
				if(comprobarId(i.getIdUsuario(), usuarios_10)) {
					int index = 0;
					for(int j = 0; j < usuarios_10.size(); j++) {
						if(i.getIdUsuario() == usuarios_10.get(j).getIdUsuario()) {
							index = j;
							break;
						}
					}
					int circular = buscarCircular(i);
					if(circular == 1) {
						usuarios_10.get(index).sumarCircular();
					} else {
						usuarios_10.get(index).sumarTraslado();
					}
				} else {
					int circular = buscarCircular(i);
					int lineal;
					if(circular == 0) {
						lineal = 1;
					} else {
						lineal = 0;
					}
					UsuarioBizi nuevo = new UsuarioBizi(i.getIdUsuario(), lineal, circular);
					usuarios_10.add(nuevo);
					
				}
				
			}
		}
		Collections.sort(usuarios_10);
		System.out.println("Visualizamos usuarios");
		System.out.println("----------------------------");
		System.out.println("Usuarios totales: " + usuarios_10.size());
		System.out.println("----------------------------");
//		for (UsuarioBizi usuarioBizi : usuarios_10) {
//			System.out.println(usuarioBizi.toString());
//		}
		for(int j = 0; j < 15; j++) {
			System.out.println(usuarios_10.get(j).toString());
		}
		
	}
	
	public static boolean comprobarId(int idUsuario, ArrayList<UsuarioBizi> usos){
		for (UsuarioBizi i : usos) {
			if(i.getIdUsuario() == idUsuario) {
				return true;
			}
		} return false;
	}
	
	public static int buscarCircular(UsoBizi recorrido) {
		if(recorrido.getEstAnclaje() == recorrido.getEstRetiro()) {
			return 1;
		} else {
			return 0;
		}
	}
	
	private static void traslados(ArrayList <UsoBizi> array) {
		int contCirculares = 0;
		for (UsoBizi i: array) {
			if(i.getEstAnclaje() == i.getEstRetiro()) {
				//System.out.println("El recorrido es circular");
				contCirculares++;
			}
		}
	}
	
	private static void leerFichero(String nombreFichero,  ArrayList<UsoBizi> totales) {
		try {
			Scanner texto = new Scanner(new File(nombreFichero));
			/*
			 * Mientras el fichero que estamos leyendo tenga una nueva línea, seguimos
			 * iterando para escribirlo todo en [copiaTexto] pero con la nueva estructura.
			 */
			int cont = 0;
			while (texto.hasNextLine()) {
				String linea = texto.nextLine();
				String[] lineaSeparada = linea.split(";");
					int num1 = Integer.parseInt(lineaSeparada[0].trim());
					int num2 = Integer.parseInt(lineaSeparada[1].trim());
					int num3 = Integer.parseInt(lineaSeparada[2].trim());
					UsoBizi uso = new UsoBizi(num1, num2, num3);
					totales.add(uso);
				
				
				}

		} catch (FileNotFoundException e) {
			System.out.println("Error en el nombre de uno de los ficheros");
		}
	}
}
