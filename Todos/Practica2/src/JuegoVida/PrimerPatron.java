package JuegoVida;

import java.util.ArrayList;
import java.util.Scanner;

public class PrimerPatron {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Configuraci�n 1 patr�n bloque.
		String [][] bloque = new String[4][4];
		//fila 1
		bloque [0][0] = new String (" ");
		bloque [0][1] = new String (" ");
		bloque [0][2] = new String (" ");
		bloque [0][3] = new String (" ");
		//fila 2
		bloque [1][0] = new String (" ");
		bloque [1][1] = new String ("*");
		bloque [1][2] = new String ("*");
		bloque [1][3] = new String (" ");
		//fila 3
		bloque [2][0] = new String (" ");
		bloque [2][1] = new String ("*");
		bloque [2][2] = new String ("*");
		bloque [2][3] = new String (" ");
		//fila 4
		bloque [3][0] = new String (" ");
		bloque [3][1] = new String (" ");
		bloque [3][2] = new String (" ");
		bloque [3][3] = new String (" ");
		//Empieza el desarrollo de la programa.
		int veces = 0; //para ir haciendo el bucle
		int celActual = 0; //Cuenta las celulas del bucle en el que est�
		//30 generaciones predeterminadas
		while(veces <= 30) {
			celActual = Main.contarCel(bloque); //M�todo contar c�lulas
			//Imprimir informaci�n
			System.out.println("GENERACI�N: " + veces);
			Main.visualizar(bloque); //M�todo visualizar
			System.out.println(); 
			//M�todo para vivir o morir.
			Main.supervivencia(bloque);
			veces++;
		}
		//Muestra las que quedan
		System.out.println("Quedan " + celActual + " vivas.");
		
		
		
		
		
		
		
	}

}
