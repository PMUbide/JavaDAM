import java.util.*;
public class Ejer6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Implementa un programa Java con un método llamado insertElement(int[] tabla, int num, int index) que devuelve “tabla”,
		 * insertando el valor de “num” en el índice “index” pasado por parámetro. Como ya conocemos, las tablas tienen una longitud máxima que se indica al crearlas.
		 * Por lo tanto, para añadir este nuevo elemento deberemos desplazar el resto una posición hacia abajo. Es decir, si queremos almacenar num=2 en index=3,
		 * los elementos en la posición desde 3 hasta tabla.length deberán desplazarse para dejar hueco al nuevo elemento.
		 */
		System.out.println("Introduce un numero,");
		Scanner entrada=new Scanner(System.in);
		int num=entrada.nextInt();
		System.out.println("Inserta una posición, ");
		int index=entrada.nextInt();
		int tabla[]={1,2,3,4,5,6,7,8,9,10};
		insertElement(tabla,num,index);
		Muestra(tabla);
	}
	
	/**	 * Metodo
	 * @param tabla
	 * @param num
	 * @param index
	 * @return
	 */
	public static int[] insertElement (int []tabla, int num, int index) {
		while (index!=9){
			int posicion=tabla[index];
			//tabla[index+1]=tabla[index];
			for(int i=index+1;i<tabla.length;i++) {
				tabla[i]=posicion;
				posicion++;
			}	
			tabla[index]=num;
			return tabla;	
		}	
			tabla[index]=num;
			return tabla;
	}
		
		
	public static void Muestra (int[]a) {
		for(int j=0;j<a.length;j++) {
			System.out.print(a[j]+" ");
		}			
	}
}