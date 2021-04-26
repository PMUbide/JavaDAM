package ProgramaMe;

import java.util.Scanner;

public class ReduciendoEnvases {

	public static void main(String[] args) {
		//Primero ver cuantos casos.
		System.out.println("Introduce los casos de uso:");
		Scanner in = new Scanner(System.in);
		int casos = in.nextInt();
		int tablaDatos[] = new int[casos];
		//Ahora empieza caso de prueba.
		System.out.println("Casos a rellenar " + casos);
		for (int i = 0; i < casos; i++) {
			compruebaPeso(in, tablaDatos, i);
		}
		//Muestra resultado
		for (int i = 0; i < tablaDatos.length; i++) {
			System.out.println(tablaDatos[i]);
		}
	}

	
	public static void compruebaPeso(Scanner in, int[] tabla, int i) {
		System.out.println("Escribe el peso neto.");
		int pesoNeto, pesoTotal;
		pesoNeto = in.nextInt();
		do {
			System.out.println("Escribe el peso total: ");
			pesoTotal = in.nextInt();
		}while(pesoTotal < pesoNeto);
		
		tabla[i] = pesoTotal - pesoNeto;
	}
}
