package array;
import java.util.*;
public class Empleados {

	static void visualizar(String [][] array) {
		
		for(int u = 0;u < array.length; u++) {
			for(int y = 0; y < array[u].length; y++) {
		System.out.println(array[u][y]);
			}
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Programa Java que lea el nombre y el sueldo de 20 empleados y muestre el nombre y el sueldo del empleado que más gana.
		
		
		Scanner entrada = new Scanner (System.in);
				
		String matriz1 [][]= new String [3][2];
		int matriz2[][]= new int[matriz1.length][matriz1.length];
				
		int sumatorio=0;
			
		//Bucle para introducir los datos de la matriz.
		System.out.println("Introduce el nombre de los empleados y el sueldo: ");
		System.out.println();
		for(int i=0;i<matriz1.length;i++) {
			for(int j=0;j<matriz1[i].length;j++) {
				if(j==0) { System.out.println("Empleado número "+(i+1));
					matriz1[i][j]=entrada.nextLine();
				}
				else {System.out.println("Sueldo del empleado " + (i+1));
				matriz1[i][j]=entrada.nextLine();
				matriz2[i][j]=Integer.parseInt(matriz1[i][j]);
				}
			}
				
		}
		//Bucle para buscar el sueldo más alto.
		for(int i=0;i<matriz1.length;i++) {
			for(int j=0;j<matriz1[i].length;j++) {
				sumatorio= matriz2[i][j];
				//System.out.println(suamtorio);
			}
		}
		//Visualizar matriz1
		visualizar(matriz1);
		System.out.println(sumatorio);
		
	}

}
