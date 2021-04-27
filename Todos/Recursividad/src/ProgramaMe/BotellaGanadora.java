package ProgramaMe;

import java.util.Scanner;

public class BotellaGanadora {

	static Scanner in;
	
	public static void main(String[] args) {
		//casos de prueba
		in = new Scanner(System.in);
		int casos = in.nextInt();
		in.nextLine(); //liberar la linea
		for (int i = 0; i < casos; i++) {
			casoDePrueba();
		}
		
		
	}

	
	public static void casoDePrueba() {
		//Especificar los KILOS C
		int maxC = in.nextInt();
		in.nextLine(); //limpiar la linea
		String lineaPersonas = in.nextLine();
		String[] personas = lineaPersonas.split(" ");
		int total = 0;
		for (int j = 0; j < personas.length; j++) {
			if(Integer.parseInt(personas[j]) + total >= maxC * 8) {
				System.out.println(j + 1);
				return;
			}else {
				total += Integer.parseInt(personas[j]);
			}
		}
		System.out.println("SIGAMOS RECICLANDO");
		
	}
}
