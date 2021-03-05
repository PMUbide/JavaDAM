package Tarea6;
import java.util.*;
import java.math.*;
public class Ejer5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Escribe un programa Java que muestre por pantalla las potencias de n^1
		hasta n^4 de los números desde 1 hasta n, donde n es un número entero
		escrito por el usuario.
		*/
		System.out.println("Introduce un número: ");
		Scanner entrada= new Scanner (System.in);
		int num1=entrada.nextInt();
		for(int i=0; i<(num1+1); i++) {
			System.out.println("\n");
			for(int x=1; x<10;x++) {
				if (i==0) System.out.printf("%-20s","n^"+x+" ");
				else {					
				//BigInteger yolo = BigDecimal.valueOf(Math.pow(i, x)).toBigInteger();		
				//(BigInteger yolo=(BigInteger) Math.pow(i, x);
				//System.out.printf("%-20s", yolo);
				System.out.printf("%-20s", Math.round(Math.pow(i, x)));
				System.out.print(" ");
				}
			}
			//System.out.printf("%-5s%-7s%-7s%-7s%n",n1,n2,n3,n4);	
		}
	}
}
