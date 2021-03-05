package Tarea6;
import java.util.*;


public class Ejer3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Escribe un programa Java que solicite al usuario un entero N y escriba el
		siguiente patrón por pantalla:
		 */
		
		Scanner entrada=new Scanner(System.in);
		
		int num1=entrada.nextInt();
		
		int y=num1;
		
		/*for (int i=0;i<=y;i++) {
			
			System.out.println();
			
			for(int d=1;d<=num1;d++) {
			
				System.out.print("*");
			}
		
			num1--;
						
			*/
			
			for (int i=num1;i>=0;i--) {
				
				System.out.println();
				
					for(int d=num1;d>0;d--) {
				
						System.out.print("*");
				
					}
							
				
				num1--;
			}
		
			
			
			
			
			
		
		
		
	}

}
