import java.util.*;
public class ejercicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner numero=new Scanner (System.in); 
		
		System.out.println("Introduce un número:");
		
		int x= numero.nextInt(); 
		
		System.out.println("Tabla de multiplicar de "+ x + " es igual a: ");
		for(int i=10; i>0; i--) {
						
			System.out.println(x + " x "+ i+ " = " + x*i);
			
		}
		
				
	}

}
