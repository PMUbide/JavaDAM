package Tarea6;
import java.util.*;
public class Ejer1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*Implementa un programa Java que le solicite al usuario un número entero
		positivo y escriba dicho número con letra por pantalla. Únicamente debe
		mostrar los nombres de los números del 0 al 9, el resto los mostrará con
		el nombre “Otros”.
		*/
		
		Scanner entrada=new Scanner(System.in);
		
		System.out.println("Introduce un numero: ");
		
		int num1=entrada.nextInt();
		int i=0;
	
		do {
		
			if (num1==1) System.out.println("Uno");
			else if (num1==2) System.out.println("Dos");
			else if(num1==3) System.out.println("Tres");
			else if(num1==4) System.out.println("Cuatro");
			else if (num1==5) System.out.println("Cinco");
			else if (num1==6) System.out.println("Seis");
			else if (num1==7) System.out.println("Siete");
			else if (num1==8) System.out.println("Ocho");
			else if (num1==9) System.out.println("Nueve");
			else System.out.println("Otros");
			System.out.println();
			System.out.println("Introduce un número: ");
			num1=entrada.nextInt();
			i++;
		}while (i<100);
		
		
		
		
	}

}
