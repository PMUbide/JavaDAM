package ProgramaMe;

import java.util.Scanner;

//int[] cotas = {1200, 1250, 1350, 1400, 1300, 1600, 1600, 1600, 1700, 1500, 1300};
//int[] cotas = {1200, 1250, 1350, 1400, 1550, 1550, 1550, 1700, 1500, 1300};
//int[] cotas = {10, 10, 10, 10};
public class I {

	static Scanner in;

	public static boolean casoDePrueba() {
		if (!in.hasNextLine()) {
			return false;
		} else {
			String linea = in.nextLine();
			String[] lineaSplit = linea.split(" ");
			int d = Integer.parseInt(lineaSplit[0]); // desnivel maximo
			int n = Integer.parseInt(lineaSplit[1]); // cotas
			int[] cotas = new int[n];
			String cotaLinea = in.nextLine();
			String[] cotaSplit = cotaLinea.split(" ");
			for (int i = 0; i < cotaSplit.length; i++) {
				cotas[i] = Integer.parseInt(cotaSplit[i]);
			}
			int contador = cotas[0];
			int suma = 0;
			boolean apta = true;
			for (int i = 1; i < cotas.length; i++) {
				if (cotas[i] > contador) {
					suma += cotas[i] - contador;
				} else {
					suma = 0;
				}
				if (suma > d) {
					System.out.println("NO APTA");
					apta = false;
					break;
				}
				contador = cotas[i];
			}
			if (apta) {
				System.out.println("APTA");
			}
			return true;
		}
	}

	public static void main(String[] args) {
		in = new Scanner(System.in);
		while (casoDePrueba());
	}

}
