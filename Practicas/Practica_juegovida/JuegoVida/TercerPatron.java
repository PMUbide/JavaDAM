package JuegoVida;

public class TercerPatron {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Configuraci�n 3 patr�n faro.
		String[][] faro = new String[6][6];
		// fila 1
		faro[0][0] = new String(" ");
		faro[0][1] = new String(" ");
		faro[0][2] = new String(" ");
		faro[0][3] = new String(" ");
		faro[0][4] = new String(" ");
		faro[0][5] = new String(" ");
		// fila 2
		faro[1][0] = new String(" ");
		faro[1][1] = new String("*");
		faro[1][2] = new String("*");
		faro[1][3] = new String(" ");
		faro[1][4] = new String(" ");
		faro[1][5] = new String(" ");
		// fila 3
		faro[2][0] = new String(" ");
		faro[2][1] = new String("*");
		faro[2][2] = new String("*");
		faro[2][3] = new String(" ");
		faro[2][4] = new String(" ");
		faro[2][5] = new String(" ");
		// fila 4
		faro[3][0] = new String(" ");
		faro[3][1] = new String(" ");
		faro[3][2] = new String(" ");
		faro[3][3] = new String("*");
		faro[3][4] = new String("*");
		faro[3][5] = new String(" ");
		// fila 5
		faro[4][0] = new String(" ");
		faro[4][1] = new String(" ");
		faro[4][2] = new String(" ");
		faro[4][3] = new String("*");
		faro[4][4] = new String("*");
		faro[4][5] = new String(" ");
		// fila 6
		faro[5][0] = new String(" ");
		faro[5][1] = new String(" ");
		faro[5][2] = new String(" ");
		faro[5][3] = new String(" ");
		faro[5][4] = new String(" ");
		faro[5][5] = new String(" ");
		// Empieza el desarrollo de la programa.
		int veces = 0;
		int celActual = 0; //Cuenta las celulas del bucle en el que est�
		// 30 generaciones predeterminadas
		while (veces <= 30) {
			celActual = Main.contarCel(faro); //M�todo contar c�lulas
			// Imprimir informaci�n
			System.out.println("GENERACI�N: " + veces);
			Main.visualizar(faro); //M�todo visualizar el tablero.
			System.out.println();
			// M�todo para vivir o morir.
			Main.supervivencia(faro);
			veces++;
		}
		//Muestra informaci�n de las que quedan vivas.
		System.out.println("Quedan " + celActual + " vivas.");
		
	}

}
