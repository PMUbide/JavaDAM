import java.util.Scanner;

public class Ej_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		double num1=1;
		
		int i=0;
				
		System.out.println("Introduce un n�mero: ");
		Scanner entrada = new Scanner (System.in);		
		num1=entrada.nextDouble();
		
		
		while (num1>0) {
			
			
			System.out.println("Introduce otro n�mero");
						
			num1=entrada.nextDouble();
			
			i++;
			
			
		}
			
		System.out.println("El n�mero de veces introducido es: " + (i+1));
		
			
	}

}
