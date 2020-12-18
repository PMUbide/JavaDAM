import java.util.*;
public class E10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Introduce un número para sacar la secuencia de Fibonacci.");
		Scanner entrada = new Scanner (System.in);
		
		int fb=entrada.nextInt();
		
		long num1=0L;
		long num2=1L;
		long num3=0L;
		System.out.println(num1);
		System.out.println(num2);
		
		int i=0;
		
			while (i<fb-2) {
				
				num3=num1+num2;
				
				i++;
								
				System.out.println(num3);
				num1=num2;
				num2=num3;
				
				
				
			}
		
		
		
	}

	
}

