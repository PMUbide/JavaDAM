package ProgramaMe;

import java.util.Scanner;

public class I {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String linea = in.nextLine();
		String[] lineaSplit = linea.split(" ");
		int d = Integer.parseInt(lineaSplit[0]); //desnivel maximo
		int n = Integer.parseInt(lineaSplit[1]); //cotas
		int[] cotas = new int[n];
		String cotaLinea = in.nextLine();
		String[] cotaSplit = cotaLinea.split(" ");
		for (int i = 0; i < cotaSplit.length; i++) {
			cotas[i] = Integer.parseInt(cotaSplit[i]);
		}
//		int[] cotas = {1200, 1250, 1350, 1400, 1300, 1600, 1600, 1600, 1700, 1500, 1300};
//		int[] cotas = {1200, 1250, 1350, 1400, 1550, 1550, 1550, 1700, 1500, 1300};
//		int[] cotas = {10, 15, 10, 10};
		int contador = cotas[0];
		int suma = 0;
		boolean apta = true;
		for (int i = 1; i < cotas.length; i++) {
			if(cotas[i] > contador) {
				suma += cotas[i] - contador;
			} else {
				suma = 0;
			}
			if(suma > d) {
				System.out.println("NO APTA");
				apta = false;
				break;
			}
//			System.out.println("suma " + suma);
//			System.out.println("contador " + contador);
			contador = cotas[i];
		}
		if(apta) {
			System.out.println("APTA");
		}
		in.close();
	}

}
