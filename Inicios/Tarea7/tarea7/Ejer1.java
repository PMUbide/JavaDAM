package tarea7;

public class Ejer1 {
	
	public static void main(String[] args) {
		/*Implementa un programa Java con un método llamado
		sum(int [] tabla) que muestre por pantalla el resultado de sumar todos los
		elementos de la tabla pasada como parámetro.
		*/
		int tabla1 []= {5,7,2,16};
		System.out.println(sum(tabla1));	
	}
	public static int sum(int []tabla) {
		int total=0;
		for(int x=0;x<tabla.length;x++) {
			total=total+tabla[x];
		}
		return total;
	}			
}
