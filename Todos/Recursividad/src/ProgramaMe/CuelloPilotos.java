package ProgramaMe;

import java.util.ArrayList;
import java.util.Scanner;

public class CuelloPilotos {
	public static int	izq	= 0;
	public static int	der	= 0;
	static Scanner		in;

	public static void main(String[] args) {
		in = new Scanner(System.in);
		while (casoDePrueba()) {
		}

	}

	public static boolean casoDePrueba() {
		String linea = in.nextLine();
		int fila = 0, columna = 0;
		if (linea.equals("0 0")) {
			return false;
		} else {
			String[] lineaSplit = linea.split(" ");
			columna = Integer.parseInt(lineaSplit[0]);
			fila = Integer.parseInt(lineaSplit[1]);
			String[][] circuito = new String[fila][columna];
			for (int i = 0; i < fila; i++) {
				String lineaC = in.nextLine();
				String[] lineaCSplit = lineaC.split("");
				for (int j = 0; j < lineaCSplit.length; j++) {
					circuito[i][j] = lineaCSplit[j];
				}
			}
			System.out.println(ejercicio(circuito));
			return true;
		}
	}

	public static String ejercicio(String[][] circuito) {
		ArrayList<Double> coords = new ArrayList<Double>();
		coords.clear();
		izq = 0;
		der = 0;
		String start = "";
		for (double i = 0; i < circuito.length; i++) {
			for (double j = 0; j < circuito[(int) i].length; j++) {
				if (circuito[(int) i][(int) j].equals("#")) {
					coords.add((double) (i + (j / 100)));
				} else if (circuito[(int) i][(int) j].equals("O")) {
					coords.add((double) (i + (j / 100)));
					start = String.valueOf(i + j / 100);
				}
			}
		}
		int coordStart = 0;
		for (int i = 0; i < coords.size(); i++) {
			if (start.equals(String.valueOf(coords.get(i)))) {
				coordStart = i;
				break;
			}
			;
		}
		contarGiros(0, coordStart, 0, coords, 0);
		return izq + " " + der;
	}

	public static boolean contarGiros(int indice, int start, int cont, ArrayList<Double> coords, int giroAnterior) {
		if (cont >= coords.size())
			return true;
		double roundDbl = coords.get(start) - coords.get(indice);
		if (roundDbl == 1 && giroAnterior != 3) {
			// hacia arriba
			sumarGiros(giroAnterior, 1);
			contarGiros(0, indice, cont + 1, coords, 1);
		} else if (roundDbl > -0.011 && roundDbl < -0.0098 && giroAnterior != 4) {
			// hacia la derecha
			sumarGiros(giroAnterior, 2);
			contarGiros(0, indice, cont + 1, coords, 2);
		} else if (roundDbl > -1.0001 && roundDbl < -0.999 && giroAnterior != 1 && cont > 0) {
			// hacia abajo
			sumarGiros(giroAnterior, 3);
			contarGiros(0, indice, cont + 1, coords, 3);
		} else if (roundDbl > 0.0098 && roundDbl < 0.011 && giroAnterior != 2 && cont > 0) {
			// hacia la izquierda
			sumarGiros(giroAnterior, 4);
			contarGiros(0, indice, cont + 1, coords, 4);
		} else {
			contarGiros(indice + 1, start, cont, coords, giroAnterior);
		}
		return false;
	}

	public static void sumarGiros(int sentido, int giro) {
		if (sentido == 1) {
			if (giro == 2) {
				der = der + 1;
			} else if (giro == 4) {
				izq = izq + 1;
			}
		} else if (sentido == 2) {
			if (giro == 1) {
				izq = izq + 1;
			} else if (giro == 3) {
				der = der + 1;
			}
		} else if (sentido == 3) {
			if (giro == 2) {
				izq = izq + 1;
			} else if (giro == 4) {
				der = der + 1;
			}
		} else if (sentido == 4) {
			if (giro == 1) {
				der = der + 1;
			} else if (giro == 3) {
				izq = izq + 1;
			}
		}
	}

	public static void mostrarArray(String[][] lista) {
		for (int i = 0; i < lista.length; i++) {
			System.out.println();
			for (int j = 0; j < lista.length; j++) {
				System.out.print(lista[i][j]);
			}
		}

	}

}
