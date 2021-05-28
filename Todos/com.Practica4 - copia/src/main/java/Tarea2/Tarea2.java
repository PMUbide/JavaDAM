package Tarea2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Tarea2 {

	public static void main(String[] args) {
//		Un alumno está formado por :
//			• ID (int)
//			• Nombre (String)
//			• Apellidos (String)
//			• DNI (String)
//			• Edad (int)
//		Una nota está formada por :
//			• ID (int)
//			• IDAlumno (int)
//			• Nombre asignatura
//			• Nota (double)
		MySqlAccess con = new MySqlAccess();
		Scanner inFile = null;
		try {
			inFile = new Scanner(new File("files/alumnos.csv"));
			int cont = 0;
			while(inFile.hasNextLine()) {
				String linea = inFile.nextLine();
				if(cont > 0) {
					con.insertAlumno(linea.split(","));
				}
				cont++;
			}
			System.out.println("Alumnos añadidos.");
			inFile = new Scanner(new File("files/notas.csv"));
			cont = 0;
			while(inFile.hasNextLine()) {
				String linea = inFile.nextLine();
				if(cont > 0) {
					con.insertNota(linea.split(","));
				}
				cont++;
			}
			System.out.println("Notas añadidos.");
		} catch (Exception  e) {
			e.printStackTrace();
		}
			
		
		
	}

}
