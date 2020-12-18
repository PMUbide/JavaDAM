package Array2;
import java.util.*;

public class Array_tarea2_ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Implementa un programa Java que solicite al usuario
//		constantemente números enteros distintos de 0 y los vaya introduciendo
//		de forma dinámica en un ArrayList. Cuando el usuario escribe un 0,
//		ejecutar los métodos:
//		1. calcularSuma(ArrayList&lt;Integer&gt; lista): muestra por pantalla la
//		suma de todos los elementos de la lista pasada como parámetro.
//		2. calcularMedia(ArrayList&lt;Integer&gt; lista): muestra por pantalla la
//		media aritmética de la lista pasada como parámetro.
//		3. esCapicua(ArrayList&lt;Integer&gt; lista) muestra por pantalla si la lista
//		pasada por parámetros es capicúa.
		Scanner in = new Scanner (System.in);
		System.out.println("Introduce un numero distinto de 0. (0 para cerrar)");
		ArrayList <Integer> numeros = new ArrayList <Integer>();
		int num = 1;
		while(num != 0) {
			num = pedirNum();
			if (num > 0) {
				numeros.add(num);
			}
		}
		//Método para calcular la suma de todos.
		System.out.println("El sumatorio es: " + suma(numeros));
		//Método para calcular la media de la lista.
		System.out.println("La media es: " + media(numeros));
		//Método para ver si es capicua.
		if(capicua(numeros)) System.out.println("Si es capicua");
		else System.out.println("No es capicua");
		
		
		
//		for (int i: numeros) {
//			System.out.println (i);
//		}
		
	}
	
	public static boolean capicua (ArrayList <Integer> lista) {
		for (int i = 0; i < lista.size(); i++) {
			if(lista.get(i) != lista.get(lista.size()-1-i)) {
				return false;
			}
		}
		return true;
	}
	
	
	
	
	
	public static int pedirNum() {
		Scanner in = new Scanner (System.in);
		try {
			return in.nextInt();
		} catch(InputMismatchException e) {
			System.out.println("Tienes que introducir un entero!!");
			return -1;
		}
	}

	/**
	 * Método que hace la media.
	 * @param lista
	 */
	public static double media (ArrayList <Integer> lista) {
		double sum_ele = suma(lista); //sumatorio.
		return sum_ele / lista.size();
		
	}
	
	/**
	 * Método que hace el sumatorio.
	 * @param lista
	 */
	public static int suma (ArrayList <Integer> lista) {
		int sumatorio = 0;
		for (int i = 0; i < lista.size(); i++) {
			sumatorio += lista.get(i);
		}
		return sumatorio;
		//System.out.println("El sumatorio es "+ sumatorio);
	}
	
	
}
