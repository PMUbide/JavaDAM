package ProgramaMe;

import java.util.Scanner;

public class MovilidadSostenible {

	public static void main(String[] args) {
		//numero P
		Scanner in = new Scanner(System.in);
		String linea = in.nextLine();
		String[] lineaS = linea.split(" ");
		int[] comando = new int[lineaS.length];
		for (int i = 0; i < comando.length; i++) {
			comando[i] = Integer.parseInt(lineaS[i]);
		}
		//Array pa guardar lineas
		int[][] lineasBici = new int[comando[1]][2];
		//ahora entrada para las lineas bici.
		for (int i = 0; i < comando[1] ; i++) {
			linea = in.nextLine();
			lineaS = linea.split(" ");
			for (int j = 0; j < 2 ; j++) {
				lineasBici[i][j] = Integer.parseInt(lineaS[j]);
			}
		}
		comprobarPuntos(lineasBici, comando[0]);
		
	}

	public static void comprobarPuntos(int[][] lineas, int acabar) {
		int[][] numerosFinal = new int[acabar - 1][2];
		int numSuma = 2;
		for (int i = 0; i < numerosFinal.length; i++) {
			numerosFinal[i][0] = numSuma;
			numSuma++;
		}
		for (int i = 0; i < numerosFinal.length; i++) {
			numerosFinal[i][1] = siono(lineas, numerosFinal[i][0]);
		}
		boolean pie = true;
		for (int i = 0; i < numerosFinal.length; i++) {
			if(numerosFinal[i][1] == 0) {
				pie = false;
				break;
			}
		}
		if(pie) {
			System.out.println("BICI");
		}else {
			System.out.println("PIE");
		}
	}
	
	
	public static int siono(int[][] lineas, int acabar) {
		boolean fin = false;
		boolean encontrado = false;
		int puntoInicio = 1;
		int puntoFin = acabar;
		int suma = 0;
		for (int i = 0; i < lineas.length; i++) {
			if(puntoInicio == lineas[i][0] && lineas[i][1] == acabar) {
				return 1;
			}else if(puntoInicio == lineas[i][1] && lineas[i][0] == acabar) {
				return 0;
			}
		}
		while(suma < puntoFin || !fin) {
			for (int i = 0; i < lineas.length; i++) {
				if(puntoInicio == lineas[i][0] && lineas[i][1] > puntoInicio) {
					puntoInicio = lineas[i][1];
					break;
				}else if(puntoInicio == lineas[i][1] && lineas[i][0] > puntoInicio) {
					puntoInicio = lineas[i][0];
					break;
				}
			}
			suma++;	
			if(puntoInicio == puntoFin) {
				fin = true;
				encontrado = true;
			}else {
				fin = true;
			}
		}
		if(fin && encontrado) {
			return 1;
		}else {
			return 0;
		}
	}
	
	
}
