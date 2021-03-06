package JuegoVida;

public class SegundoPatron {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Configuración 2 patrón intermitente.
		String[][] intermitente = new String[5][5];
		// fila 1
		intermitente[0][0] = new String(" ");
		intermitente[0][1] = new String(" ");
		intermitente[0][2] = new String(" ");
		intermitente[0][3] = new String(" ");
		intermitente[0][4] = new String(" ");
		// fila 2
		intermitente[1][0] = new String(" ");
		intermitente[1][1] = new String(" ");
		intermitente[1][2] = new String(" ");
		intermitente[1][3] = new String(" ");
		intermitente[1][4] = new String(" ");
		// fila 3
		intermitente[2][0] = new String(" ");
		intermitente[2][1] = new String("*");
		intermitente[2][2] = new String("*");
		intermitente[2][3] = new String("*");
		intermitente[2][4] = new String(" ");
		// fila 4
		intermitente[3][0] = new String(" ");
		intermitente[3][1] = new String(" ");
		intermitente[3][2] = new String(" ");
		intermitente[3][3] = new String(" ");
		intermitente[3][4] = new String(" ");
		// fila 5
		intermitente[4][0] = new String(" ");
		intermitente[4][1] = new String(" ");
		intermitente[4][2] = new String(" ");
		intermitente[4][3] = new String(" ");
		intermitente[4][4] = new String(" ");
		// Empieza el desarrollo de la programa.
		int veces = 0;
		int celActual = 0; //Cuenta las celulas del bucle en el que está
		// 30 generaciones predeterminadas
		while (veces <= 30) {
			celActual = Main.contarCel(intermitente); //Método contar células
			// Imprimir información
			System.out.println("GENERACIÓN: " + veces);
			Main.visualizar(intermitente); //Visualiza el tablero
			System.out.println();
			// Método para vivir o morir.
			Main.supervivencia(intermitente);
			veces++;
		}
		//Muestra información por pantalla
		System.out.println("Quedan " + celActual + " vivas.");

	}

}
