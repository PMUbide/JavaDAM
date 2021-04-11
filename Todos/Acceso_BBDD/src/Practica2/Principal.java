package Practica2;

import java.util.ArrayList;
import java.util.Scanner;


public class Principal {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Base de datos que quieres leer: ");
		String host = "localhost:3306/colegio";
//		host += in.next();
		System.out.println("Usuario: ?");
		String user = "root";
		System.out.println("Contraseña?: ");
		String passwd = "12345678";
		// leer database.
		MySqlAccess dao = new MySqlAccess(host, user, passwd);

		try {
			System.out.println("Leemos y almacenamos alumnos: ");
			ArrayList<Alumno> alumnosTotales = dao.readTableAlumnos();
//			for (Alumno alumno : alumnosTotales) {
//				System.out.println(alumno.toString());
//			}
			
//			System.out.println("\nLeemos y almacenamos asignaturas: ");
//			ArrayList<Asignatura> asigTotales = dao.readTableAsignatura();
//			for (Asignatura asignatura : asigTotales) {
//				System.out.println(asignatura.toString());
//			}
			
//			System.out.println("\nLeemos la tabla intermedia y actualizamos alumnos. ");
//			dao.readTableIntermedia(alumnosTotales);
			
			dao.readDataBase();
			
//			System.out.println("MOSTRAR ASIGNATURAS ALUMNOS.");
//			for (Alumno alumno : alumnosTotales) {
//				alumno.muestraAsignaturas(asigTotales);
//			}
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("Fallo comando SQL.");
//			e.printStackTrace();
		}

		
		
	}

}
