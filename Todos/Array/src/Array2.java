import java.util.Scanner;

public class Array2 {

	public static void main(String[] args) {
		/*Programa que lee por teclado la nota de los alumnos de una clase y calcula la nota media del grupo.
		Tambi�n muestra los alumnos con notas superiores a la media. El n�mero de alumnos se lee por teclado.
		Este programa utiliza un array de elementos de tipo double que contendr� las notas de los alumnos. 
		El tama�o del array ser� el n�mero de alumnos de la clase, por lo tanto primero se pedir� por teclado
		el n�mero de alumnos y a continuaci�n se crear� el array.
		Se realizan 3 recorridos sobre el array, el primero para asignar a cada elemento las notas introducidas por teclado,
		el segundo para sumarlas y calcular la media y el tercero para mostrar los alumnos con notas superiores a la media.
		*/
		
		Scanner entrada=new Scanner(System.in);
		
		
		
		int num_alum=0;
		
		do {
			System.out.println("Introduce el n�mero de alumnos. ");
			num_alum=entrada.nextInt();
		
		} while (num_alum<=0);
		
		double alumnos[]=new double[num_alum];
		
		double sumatorio=0;
		
		int notas_altas=0;
		
		
		System.out.println("Introduce la nota de los alumnos a continuaci�n:");
		
			for (int i=0; i<alumnos.length; i++) {
				
				System.out.print("Nota del alumno "+(i)+" "+ "de "+ alumnos.length +  " introducidos: ");
				
				double n= entrada.nextDouble();
				
				alumnos[i] = n;
				
				if (n>10 || n<0) {
					System.out.println("Introduce un n�mero entre 0-10");
					i--;
				}
				
							
			}
		
			
			for (int r=0; r<alumnos.length; r++) {
				
							
				sumatorio= sumatorio+alumnos[r];
									
			}
			
			
		
			System.out.println("La suma de las notas es: "+ sumatorio);
			
			System.out.println("La media de las notas es: "+  (sumatorio/num_alum));
		
			
			for (int i=0; i<alumnos.length; i++) {
				
				if (alumnos[i]> (sumatorio/num_alum))	{
					
					notas_altas++;
									
				}
				
						
			}
		
			System.out.println("Alumnos con nota m�s alta que la media: " + notas_altas);
			
			
	        for (int dd = 0; dd < alumnos.length;dd++) {
	            if (alumnos[dd] > (sumatorio/num_alum)) {
	                System.out.println("Alumno numero " + (dd)+ " Nota final: " + alumnos[dd]);
				}
			
	        }

}
}
