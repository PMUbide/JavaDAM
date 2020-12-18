import java.util.Scanner;

public class Ej_2 {

	public static void main(String[] args) {
		

		double num1=1;
		
		while (num1!=0) {
			
		System.out.println("Introduce un número: ");
		
		
		Scanner entrada = new Scanner (System.in);
		
		num1= entrada.nextDouble(); 		
		
		System.out.println(num1 + (num1>0 ? " es positivo" : " es negativo "));
		System.out.println();
		
		
					}
		
		
		System.out.println("Has introducido un 0.");
		
		
		
		}
		
	
		
	}
