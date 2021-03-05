import java.util.Scanner;
public class Aa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada= new Scanner(System.in);
		
		System.out.println("Entra el primer numero");
		
		int num1=entrada.nextInt();
		
		System.out.println("Entra el segundo numero");
		
		int num2=entrada.nextInt();
		
		operaciones(num1,num2);
		
				
	}

	public static void operaciones(int n1, int n2) {
		
		
		int suma=n1+n2;
		System.out.println("La suma es " + suma);
		
		int resta=n1-n2;
		
		System.out.println("La resta es " + resta);
		
		
	}
	
	
	
}
