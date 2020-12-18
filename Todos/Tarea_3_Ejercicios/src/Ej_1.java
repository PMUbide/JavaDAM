import java.util.*;
public class Ej_1 {

	public static void main(String[] args) {
		
		double num1=1;
		
		while (num1>0) {
			
		System.out.println("Introduce un número: ");
		
		
		Scanner entrada = new Scanner (System.in);
		
		num1= entrada.nextDouble(); 		
		
		if (num1>0) {
		
		System.out.println("El cuadrado es " + (Math.pow(num1, 2)));
		System.out.println();
		
					}
		}
		
		System.out.println("Has introducido un número negativo.");
		
	}

}

