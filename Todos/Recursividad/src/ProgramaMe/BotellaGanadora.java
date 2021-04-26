package ProgramaMe;

import java.util.ArrayList;
import java.util.Scanner;

public class BotellaGanadora {

	public static void main(String[] args) {
		//casos de prueba
		System.out.println("Cuantos casos de prueba?");
		Scanner in = new Scanner(System.in);
		int casos = in.nextInt();
		//Número totales de C
		int resultados[] = new int[casos];
		for (int i = 0; i < casos; i++) {
			botellas(in, resultados, i);
		}
		//mostrar
		for (int i = 0; i < resultados.length; i++) {
			if(resultados[i] != -1) {
				System.out.println(resultados[i]);
			}else {
				System.out.println("Sigamos RECICLANDO");
			}
		}
		
	}

	public static void botellas(Scanner in, int[] c, int i) {
		//Especificar los KILOS C
		int maxC;
		do {
			maxC = in.nextInt();
		}while (maxC < 1 || maxC > 100000);
		//Array pa almacenar
		String lineaPersonas = in.nextLine();
		int[] personas = Integer.parseInt(lineaPersonas.split(" "));
		int total = 0;
		for (int j = 0; j < personas.length; j++) {
			if(personas.get(j) + total >= maxC * 8) {
				c[i] = j + 1;
				return;
			}else {
				total += personas.get(j);
			}
		}
		c[i] = -1;
	}
}
