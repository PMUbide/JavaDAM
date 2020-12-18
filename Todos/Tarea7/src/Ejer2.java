
public class Ejer2 {


	public static void main(String[] args) {
		/*Implementa un programa Java con un método llamado
	average(double [] tabla) que devuelva un dato de tipo double, que
	indique la media de los valores de los elementos de la tabla pasada como
	parámetro.
		*/
		
		int tabla1[]= {7,5,6,3};
//		Lo imprime el main
		System.out.println(average(tabla1));	
	}
	public static double average(int[] tabla) {
		double total=0;
		for(int x=0;x<tabla.length;x++) {
			total=total+tabla[x];
		}
		return total=total/(tabla.length);
	}
}


