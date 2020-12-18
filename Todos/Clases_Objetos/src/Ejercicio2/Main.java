package Ejercicio2;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Persona people = new Persona ("Pedro", 25, "123456J", "H", 50, 1.90);
		Persona dodo = new Persona();
		
		
		switch (people.calcularImc()) {
			case -1:
				System.out.println("PESO IDEAL");
				break;
			case 0:
				System.out.println("DEBAJO PESO IDEAL");
				break;
			case 1:
				System.out.println("SOBREPESO");
		}
		
		if (people.esMayorEdad()) {
			System.out.println("Eres mayor de edad");
		}
		else {
			System.out.println("No eres mayor de edad");
		}
		System.out.println("Introduce el sexo. (H/M)");
		//////////////////////////////
		Scanner in = new Scanner (System.in);
		String sexo = in.next();
		people.comprobarSexo(sexo);
		System.out.println("El sexo es: "+ people.getSexo());
		System.out.println(people.toString());

		System.out.println(dodo.toString());
	}
	
}
