package Ejercicios;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class EjemploListas {
	public static void main (String [] args) {
		ArrayList<String> listaAlumnos = new ArrayList<String>();
		//Añadiendo 100 alumnos.
		for (int i = 0; i <= 100; i++) {
			listaAlumnos.add("Alumno"+i);
		}
		//1º forma de mostrar una lista.
		for (int i = 0; i < listaAlumnos.size(); i++) {
			System.out.println(listaAlumnos.get(i));
		}
		//Eliminar alumnos.
		System.out.println("------------------------");
		listaAlumnos.remove(0);
		listaAlumnos.remove("Alumno9");
		System.out.println("------------------------");
		//2º forma de mostrar una lista.
		for (String alumno: listaAlumnos) {
			System.out.println(alumno);
		}
		System.out.println (listaAlumnos.size());
		//Un array de Personas.
		ArrayList<Persona> listaPersonas = new ArrayList <Persona>();	
		for(int i = 1; i<= 100; i++) {
			String sexo = "";
			if (i%2==0) {
				sexo = "H";
			}else {
				sexo = "M";
			}
			int edadAleatoria = (int)(100*Math.random());
			Persona persona = new Persona ("Nombre" + i, edadAleatoria, sexo);
			listaPersonas.add (persona);
		}
//		for (Persona i: listaPersonas) {
//			
//			System.out.println (i);
//		}
		
		System.out.println("________________________________________________");
		
		Collections.sort(listaPersonas, (persona1, persona2) -> persona2.getEdad() - persona1.getEdad());
		
		for (Persona i: listaPersonas) {
			
			System.out.println (i);
		}
	
		
	
	}
	
	

}
