package Ejercicio_Extra;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// Fichero de los estudiantes
		String rutaFichero = "files/Ejercicio_Extra/estudiantes.csv";
		// ArrayList donde se van a ir guardando todos los objetos de estudiantes.
		ArrayList<Estudiante> todos = new ArrayList<>();
		if(leerEstudiantes(rutaFichero, todos)) {
			System.out.println("Se han leido bien");
		}else {
			System.out.println("Se han leido mal.");
		}
		// Llamamos a leer el fichero.
		String rutaPr1 = "files/Ejercicio_Extra/notas-pr1.txt";
		String rutaPr2 = "files/Ejercicio_Extra/notas-pr2.txt";
		double[] notaspr1 = new double[99];
		double[] notaspr2 = new double[99];
		if (leerNotasEquipo(rutaPr1, notaspr1)) {
			System.out.println("Se han leido bien las notas práctica 1");
		} else {
			System.out.println("No se han leído bien.");
		}
		if (leerNotasEquipo(rutaPr2, notaspr2)) {
			System.out.println("Se han leido bien las notas práctica 2");
		} else {
			System.out.println("No se han leído bien.");
		}
//		for (int i = 0; i < 5; i++) {
//			System.out.println("notas 1 - " + notaspr1[i]);
//		}
//		for (int i = 0; i < 5; i++) {
//			 System.out.println("notas 2 - " + notaspr2[i]);
//		}
		//tabla vacio notas que le vamos a enviar para rellenar.
		double[] notasFIN1 = new double[99];
		String rutaEP1 = "files/Ejercicio_Extra/equipos-pr1.txt";
		//En este caso le mandamos que vaya a crear con el tipo 1, 
		//la práctica 1 dentro del método.
		asignarNotas(1, rutaEP1, notasFIN1, todos);
		//Volver a enviar con los equipos de la práctica 2.
		double[] notasFIN2 = new double[99];
		String rutaEP2 = "files/Ejercicio_Extra/equipos-pr2.txt";
		//practica 2, y la otra ruta en el método.
		asignarNotas(2, rutaEP2, notasFIN2, todos);
		//IMPRIMIR RESULTADO FINAL.
//		for(int i = 0; i < todos.size(); i++) {
//			System.out.println("El estudiante " + todos.get(i).getNombre() + " con dni " + todos.get(i).getNip() + " tiene las notas PR1: "
//			+ todos.get(i).getNotas()[0] + " notas PR2: " + todos.get(i).getNotas()[1] );
//		}
		System.out.println();
		//Iterator.
		Iterator <Estudiante> mi_iterator = todos.iterator();
		while(mi_iterator.hasNext()) {
			System.out.println(mi_iterator.next());
		}

		
		
		
		
		
//		Estudiante a = new Estudiante(todos.get(1));
//		System.out.println(a.getNombre());
//		if(a.equals(todos.get(1))) {
//			System.out.println("Es igual");
//			
//		}else System.out.println("no es igual");
		
		
		
		
		
	}
	
	
	/*
	 * Escribe el código de la función asignarNotas(int numPractica,
		String nombreFicheroEquipos, double[] notasEquipo,
		ArrayList<Estudiante> estudiantes). Esta función debe ser capaz de
		almacenar en la tabla de notas de cada uno de los estudiantes la nota que
		ha obtenido en la práctica = [numPractica]. Para ello, se tiene que obtener
		el grupo al que pertenece dicho alumno, posteriormente mirar la nota de
		dicho grupo en la práctica, y por último almacenarla en el objeto
		[Estudiante] correctamente.
	 * 
	 */
	public static void asignarNotas(int numPractica, String nombreFicheroEquipo, 
			double[] notasEquipo, ArrayList <Estudiante> estudiantes) {
		//Primero ver a que grupo pertenece cada alumno.
		if(numPractica == 1) {
			String ruta1 = "files/Ejercicio_Extra/notas-pr1.txt";
			if(leerNotasEquipo(ruta1, notasEquipo)) {
				System.out.println("Se ha leido bien la práctica " + numPractica );
			}else {
				System.out.println("No se ha leido bien");
			}
		}else {
			String ruta2 = "files/Ejercicio_Extra/notas-pr2.txt";
			if(leerNotasEquipo(ruta2, notasEquipo)) {
				System.out.println("Se ha leido bien la práctica " + numPractica );
			}else {
				System.out.println("No se ha leido bien");
			}
		}
		try {
			Scanner in = new Scanner (new File (nombreFicheroEquipo));
			while(in.hasNextLine()) {
				String linea = in.nextLine();
				String[] lineaS = linea.split(" ");
				int indice = Integer.parseInt(lineaS[1].substring(1));
				//bucle recorre los estudiantes para buscar el mismo dni
				int index = 0;
				for(int i = 0; i < estudiantes.size(); i++) {
					if(estudiantes.get(i).getNip().equals(lineaS[0])) {
						index = i;
//						System.out.println(estudiantes.get(i).getNip());
//						System.out.println(lineaS[0]);
					}
				}
				double nota = notasEquipo[indice];
				//Añadirlo con el método de añadir la nota según se práctica.
				estudiantes.get(index).setSuNota(numPractica -1, nota);  
			}
			in.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("Error al leer el archivo.");
		}
		
		
	}
	

	/**
	 * Escribe el código de la función leerNotasEquipo(String nombreFicheroNotas,
	 * double[] notasEquipo). Esta función lee las notas del fichero pasado como
	 * parámetro y almacena en la componente de índice igual al código de equipo
	 * correspondiente la calificación obtenida por dicho grupo. Si todo funciona
	 * correctamente y no ha ocurrido ningún fallo, devuelve true. En caso
	 * contrario, devuelve false.
	 * 
	 */
//	public static int lineasFichero(String rutaFichero) {
//		Scanner a = new Scanner(rutaFichero);
//		int cont = 0;
//		while (a.hasNextLine()) {
//			cont++;
//		}
//		return cont;
//	}

	public static boolean leerNotasEquipo(String rutaFichero, double[] notasEquipo) {
		try {
			Scanner a = new Scanner(new File(rutaFichero));
			while (a.hasNextLine()) {
				String linea = a.nextLine();
				String[] lineaS = linea.split(" ");
//				System.out.println(lineaS[0]);
				int indice = Integer.parseInt(lineaS[0].substring(1));
				notasEquipo[indice] = Double.parseDouble(lineaS[1]);
			}
			a.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			return false;
		}
		return true;
	}

	/**
	 * 
	 * función se encarga de leer el fichero pasado como parámetro y de almacenar
	 * cada uno de los estudiantes en el vector [estudiantes]. Si todo funciona
	 * correctamente y no ha ocurrido ningún fallo, devuelve true. En caso
	 * contrario, devuelve false.
	 */
	public static boolean leerEstudiantes(String nameFichero, ArrayList<Estudiante> array) {
//		File estudiantesFichero = new File (nameFichero);
		try {
			Scanner in = new Scanner(new File(nameFichero));
			int cont = 0;
			while (in.hasNextLine()) {
				String linea = in.nextLine();
				if (cont > 0) {
					String[] lineaS = linea.split(";");
					Estudiante nuevo = new Estudiante(lineaS[0], lineaS[1], lineaS[2]);
					array.add(nuevo);
				}
				cont++;
			}
			return true;
		} catch (FileNotFoundException e) {
			System.out.println("No se ha encontrado el archivo.");
			return false;
		}

	}

}
