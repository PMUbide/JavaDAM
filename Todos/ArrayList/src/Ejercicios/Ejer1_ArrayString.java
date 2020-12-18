package Ejercicios;

import java.util.ArrayList;

public class Ejer1_ArrayString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Implementa un programa Java que contenga una
//		ArrayList de datos String. Almacena en él todos los colores que
//		conozcas y muéstralos por pantalla.
		ArrayList <String> colores = new ArrayList <String>();
		colores.add("Rojo");
		colores.add("Verde");
		colores.add("Azul");
		colores.add("Negro");
		colores.add("Morado");
		colores.add("Amarillo");
		for (String i: colores) {
			System.out.println (i);
		}
	}

}
