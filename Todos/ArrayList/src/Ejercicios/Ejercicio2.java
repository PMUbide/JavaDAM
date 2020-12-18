package Ejercicios;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Implementa un programa Java que inserte un elemento
//		en la primera posición de un ArrayList de datos String.
		ArrayList <String> cosas = new ArrayList <String>();
		cosas.add("avion");
		cosas.add("coche");
		cosas.add("lapicero");
		cosas.add("movil");
		cosas.add("cuaderno");
		cosas.add("pato");
		ArrayList <String> elementos = new ArrayList <String>();
		elementos.add("Rojo");
		elementos.add("Verde");
		elementos.add("Azul");
		elementos.add("Morado");
		elementos.add("Amarillo");
		//actualizar(elementos);
//		System.out.println();
//		for (String i: elementos) {
//			System.out.println (i);
//		}
//		System.out.println();
		//insertar(elementos);
//		System.out.println();
		//System.out.println(mostrarElemento(elementos));
		ArrayList <String> copia = new ArrayList <String>();
		clonarArray(elementos, copia);
//		
		revertirPosiciones(copia);
//		
//		
//		eliminarPosiciones(copia);
		
		if(comparar(elementos, cosas)) System.out.println("Son iguales \n");
		else System.out.println("No son iguales \n");
//			
//		
		ArrayList <String> todoUno = new ArrayList <String>(unificar(elementos, cosas));
//		
		ordenAlfabetico(todoUno);
		
		
		
		for (String i: todoUno) {
			System.out.println (i);
		}
		
		
		
	}

	/**Ejercicio 11:
	 * Implementa un programa Java que ordene
		alfabéticamente los elementos de un ArrayList de datos String.
	 * @param elemento1
	 */
	public static void ordenAlfabetico (ArrayList <String> elemento1) {
		for(int i = 0; i < elemento1.size(); i++) {
			elemento1.set(i, elemento1.get(i).toLowerCase());
		}
		Collections.sort(elemento1);
		
	}
	
	/**Ejercicio 10:
	 * Implementa un programa Java que unifique dos
		ArrayLists de datos String en uno solo.
	 * @param elemento1
	 * @param elemento2
	 * @return
	 */
	public static ArrayList<String> unificar (ArrayList <String> elemento1, ArrayList <String> elemento2) {
		ArrayList <String> copia1 = new ArrayList <String>();
		for (int i = 0; i < elemento2.size(); i++) {
			elemento1.add(elemento2.get(i));
		}
		return elemento1;
	}
	
	/**Ejercicio 9:
	 * Implementa un programa Java que compare dos
		ArrayLists de datos String.
	 * @param elementos
	 */
	public static boolean comparar(ArrayList <String> elementos, ArrayList <String> otro) {
		if(elementos.size() != otro.size()) {
			return false;
		}
		for (int i = 0; i < elementos.size(); i++) {
			if(elementos.get(i) != otro.get(i)) {
				return false;
			}
		}
		return true;
	}
	
	
	
	
	
	/**
	 *Ejercicio 8:  Implementa un programa Java que elimine todos los
		elementos entre la posición N y M de un ArrayList de datos String.
	 */
	public static void eliminarPosiciones(ArrayList <String> elementos) {
		int n = 1;
		int m = 3;
		for (int i = 0; i < 1+(m-n); i++) {
			System.out.println(n);
			elementos.remove(n);
		}
	}
	
	/**
	 * Ejercicio 7: Implementa un programa Java que revierta la posición de
		todos los elementos de un ArrayList de datos String.
	 */
	public static void revertirPosiciones(ArrayList <String> elementos) {
		//Collections.reverse(elementos);
		ArrayList <String> copia1 = new ArrayList <String>();
		for (int i = 0; i < elementos.size(); i++) {
			copia1.add(elementos.get(i));
		}
		for (int i = 0; i < copia1.size(); i++) {
			elementos.add(0, copia1.get(i));
			elementos.remove(i+1);
		}
		
	}
	
	/**
	 *Ejercicio 6: Implementa un programa Java que copie/clone un
		ArrayList en otro.
	 */
	public static void clonarArray (ArrayList <String> elementos, ArrayList <String> nuevo) {
//		ArrayList <String> nuevo = new ArrayList <String>();
		for(String i: elementos) {
			nuevo.add(i);
		}
		
	}
	
	/**
	 * Ejercicio 5:
	 * Implementa un programa Java elimine el elemento en la
		posición 3 de un ArrayList de datos String.
	 * @param elementos
	 */
	public static void eliminarEle(ArrayList<String> elementos) {
		System.out.println("Que lugar quieres eliminar?");
		Scanner in = new Scanner (System.in);
		int i = in.nextInt();
		elementos.remove(i);
	}
	
	/**
	 * Ejercicio 3:
	 * Implementa un programa Java que muestre por pantalla
		el valor de un elemento específico (debes indicar el índice) de un
		ArrayList de datos String.
	 * @param elementos
	 * @return
	 */
	public static String mostrarElemento (ArrayList<String> elementos) {
		System.out.println("Que lugar quieres visualizar?");
		Scanner in = new Scanner (System.in);
		int i = in.nextInt();
		return elementos.get(i);
	}
	
	/**
	 * Ejercicio 2:
	 * Implementa un programa Java que inserte un elemento
		en la primera posición de un ArrayList de datos String.
	 * @param elementos
	 */
	public static void insertar(ArrayList<String> elementos) {
		System.out.println("Que lugar quieres insertar?");
		Scanner in = new Scanner (System.in);
		int i = in.nextInt();
		System.out.println("Que palabra?");
		String palabra = in.next();
		elementos.add(0, palabra);
	}
	
	/**
	 * Ejercicio 4:
	 * Implementa un programa Java que actualice el valor de
		un elemento específico de un ArrayList de datos String.
	 * @param elementos
	 */
	public static void actualizar(ArrayList<String> elementos) { //Lo
		System.out.println("Que lugar quieres actualizar?");
		Scanner in = new Scanner (System.in);
		int i = in.nextInt();
		System.out.println("Que palabra?");
		String palabra = in.next();
		elementos.add(i, palabra);
		elementos.remove(i+1);
	}
	
	
}
