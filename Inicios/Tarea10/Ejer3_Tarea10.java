
public class Ejer3_Tarea10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Tenemos la siguiente tabla multidimensional:
//		int tabla[][] = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}};
//		Implementa un método Java llamado “modificar” que, dado una tabla
//		multidimensional y un entero positivo, multiplique todos los elementos
//		de dicha tabla por el entero dado. Al finalizar la operación, deberás
//		mostrar el resultado de final de la tabla en el método main.
		int tabla[][] = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}};
		int factor=2;
		modificar(tabla,factor);
		for(int t=0;t<tabla.length;t++) {
			for(int i=0;i<(tabla.length);i++){
				System.out.println(tabla[t][i]);
			}
		}
	}
	
	public static int[][] modificar(int tabla[][],int factor){
		//int tabla2[][]=new int [tabla.length][tabla.length];
		for(int t=0;t<tabla.length;t++) {
			for(int i=0;i<(tabla.length);i++){
				tabla[t][i]=tabla[t][i]*factor;
			}
		}
		return tabla;
	}

}
