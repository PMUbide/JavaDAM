package tarea7;
import javax.swing.*;
public class Ejer5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Implementa un programa Java con un método llamado copyArray(String[] tabla, String[] tabla2) que devuelva “tabla2” con los mismos valores de “tabla”.
//		Es decir, el programa debe copiar el contenido de una tabla en otra.
	String tabla1[]= {"Pablo", "Quike", "Jorge", "Juan", "Pedro"};
	String tabla2[]= new String[tabla1.length+1];
	copyArray(tabla1,tabla2);
	//Introduce un nombre para una nueva tabla con una posición más.
	tabla2[(tabla2.length-1)]=JOptionPane.showInputDialog("Introduce un nombre: ");
	Muestra(tabla2);		 
	}
	/**
	 * Copiar de una matriz a otra. 
	 * @param a la matriz que se quiere copiar
	 * @param b la matriz a donde se va a copiar 
	 */
	public static void copyArray (String[] a, String[] b) {
		for(int i=0;i<a.length;i++) {
			b[i]=a[i];
		}
	} 
	/**
	 * Enseñar una matriz
	 */
	public static void Muestra (String[]a) {
		for(int j=0;j<a.length;j++) {
			System.out.println(a[j]);	
		}	
	}
}
