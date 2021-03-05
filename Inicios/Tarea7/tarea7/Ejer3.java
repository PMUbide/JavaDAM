package tarea7;

public class Ejer3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Implementa un programa Java con un método llamado
		contains(String[] tabla, String cadena) que devuelva TRUE, sí o solo sí,
		alguno de los elementos de la tabla pasada como parámetro es igual al
		valor de la variable “cadena”.
		*/
		String tabla1[]= {"hola","pedro","adios","no"};
		String cadena="no";
		System.out.println(contains(tabla1,cadena));
		String cadena1="hol";
		System.out.println(contains(tabla1,cadena1));
	}
	public static boolean contains (String[] tabla,String cadena) {
		for(int i=0;i<tabla.length;i++) {
			if (tabla[i]==cadena) return true;
		}return false;
	}
}

