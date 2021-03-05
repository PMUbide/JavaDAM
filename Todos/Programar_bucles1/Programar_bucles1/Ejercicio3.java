import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("¿Qué número introduces?");
		
		Scanner entrada1=new Scanner(System.in);
		
		double figura1=entrada1.nextDouble();
						
		while (figura1<=0) {
				
		System.out.println("Es negativo, Introduce otro número.");
				
		figura1 = entrada1.nextDouble();
		
		} System.out.println("Es mayor que 0.");
		
											
		}

	}
