import java.util.*;
public class Programa_tarea10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// programa que cree tablero 12x12 o lo que sea,
		//si es 12x12 tiene que haber 12 reinas, y tu indicas la posición de cada reina
		//El programa tiene que decirte si ese tablero cumple que hay una reina por fila, una reina por fila, por columna o diagonal.
		//Celda vacia asteriscos, y las reinas Q.
		System.out.println("Introduce la extensión del tablero (5x5, 10x10, 12x12, etc)");
		Scanner entrada=new Scanner (System.in);
		int exten=entrada.nextInt();
		String[][] tablero=new String[exten][exten];
		fill_asteriscos(tablero); //Un metodo para rellenarlo de asteriscos
		visualizar(tablero); //MEtodo para ver la matriz
		System.out.printf("\n"+"Ahora introduce la posición de las "+exten+ " reinas."+"\n"); // Se haría con Scanner pero vamos a dejarlas fijas de momento.
		fill_reinas(tablero); //Metodo para rellenar las reinas,
		visualizar(tablero);
		boolean horizontal_vertical=horizontal_vertical(tablero);// Metodo para comprobar las horizontales y las verticales.
		boolean diagonal=diagonales(tablero, exten); //metodo para comprobar las diagonales.
		if(horizontal_vertical==true || diagonal==true) {
			System.out.println("La colocación de las reinas no es válido.");
		}
		else System.out.println("\n"+"El tablero es correcto.");
	}
	
	public static boolean diagonales(String tabla[][],int exten) {
		//Primero diagonal  1 ""  \  "".
 		boolean diagonal_1=false;
		for(int i=0;i<tabla.length;i++) {
			for(int v=0;v<tabla.length;v++) {
				if (tabla[i][v].equals("Q")) {
					int diaga=i+1;
					int diagb=v+1;
					while(diaga<(exten) && diagb<(exten)) {
						if(tabla[diaga][diagb].equals("Q")) {
								diagonal_1=true;
						}
						diaga++;
						diagb++;
					}
				}
			}
		}
		//Despues diagonal 2 "" / "".
		boolean diagonal_2=false;
		for(int i=0;i<tabla.length;i++) {
			for(int v=0;v<tabla.length;v++) {
				if (tabla[i][v].equals("Q")) {
					int diaga=i+1;
					int diagb=v-1;
					while(diaga<(exten) && diagb>=0) {
						if(tabla[diaga][diagb].equals("Q")) {
								diagonal_2=true;
						}
						diaga++;
						diagb--;
					}
				}
			}
		}
		if(diagonal_1==true || diagonal_2==true) {
			System.out.println("Encuentra Q en las diagonales a derechas = "+diagonal_1+"."+"\n"+"Encuentra Q en las diagonales a izquierdas = "+diagonal_2+"."+"\n");
			return true;
		}
		else return false;
	}
	
	public static boolean horizontal_vertical(String tabla[][]) {
		boolean horizontal=false;
			for(int i=0;i<tabla.length;i++) {
				for(int z=0;z<tabla.length;z++) {
					if(tabla[i][z].equals("Q")) {
						for(int x=z+1;x<tabla[i].length;x++) {
							if (tabla[i][x].equals("Q")){
								horizontal=true;
								break;
							}
						}
					}
				}
			}
		boolean vertical=false;
			for(int i=0;i<tabla.length;i++) {
				for(int z=0;z<tabla.length;z++) {
					if(tabla[i][z].equals("Q")) {
						for(int x=i+1;x<tabla[z].length;x++) {
							if (tabla[x][z].equals("Q")){
								vertical=true;
								break;
							}
						}
					}
				}
			}	
			
		if (horizontal==true || vertical==true) {
			System.out.println("\n"+"Encuentra Q en la horizontal = "+horizontal+"."+"\n"+"Encuentra Q en la vertical = "+vertical+".");
			return true;
		}
		else return false;
	}
	
	public static String[][] fill_reinas(String tabla[][] ){
//		tabla[0][0]="Q";
		tabla[2][3]="Q";
		tabla[4][2]="Q";
//		tabla[3][2]="Q";
//		tabla[4][3]="Q";
		tabla[0][8]="Q";
		tabla[9][3]="Q";
		tabla[3][9]="Q";
		tabla[8][7]="Q";
		tabla[1][1]="Q";
		return tabla;
	}
	
	public static String[][] fill_asteriscos(String tabla[][]) {
		for(int i=0;i<tabla.length;i++) {
			for(int z=0;z<tabla.length;z++) {
				tabla[i][z]="*";
			}
		}
		return tabla;
	}	
	
	public static void visualizar(String tabla[][]) {
		System.out.println();
		for(int i=0;i<tabla.length;i++) {
			for(int z=0;z<tabla.length;z++) {
				System.out.print(tabla[i][z]+" ");
			}
			System.out.println();
		}
	}
	
}
