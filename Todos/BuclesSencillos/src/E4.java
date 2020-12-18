import java.util.*;
public class E4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

/* PRIMERA FORMA
  
 		System.out.println("Introduce un número:");
 
		Scanner entrada=new Scanner (System.in);
		
		int num1 = entrada.nextInt();
		
		System.out.println("Introduce otro número");

		
		int num2= entrada.nextInt();
		
		
		int i=num1;
		
		System.out.println("Los números situados entre ambos son: ");
			while (i<num2-1 ) {
				
				i++;
				
				System.out.println(i);
*/			
				
	//FORMA CON FOR
		
			System.out.println("Introduce un número:");
		 
			Scanner entrada=new Scanner (System.in);
		
			int num1 = entrada.nextInt();
		
			System.out.println("Introduce otro número");
		
		
			int num2= entrada.nextInt();
		
		
			if(num2<num1) {
	
				for(int i=num2; i<=num1;i++) {
					
					System.out.println(i);
					
				}	} else {
						
					for(int i=num1; i<=num2;i++) {
						
						
						System.out.println(i);
					}
				
					
				}		
				
	
	

}}
