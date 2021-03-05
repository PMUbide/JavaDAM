import java.util.Scanner;
public class Bucle_facil {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//un programa que pregunte por un numero
		//y escriba por pantalla del numero del 0 hasta el numero que ha dado el usuario.
		
		System.out.println("Introduce un numero:");
		Scanner entrada= new Scanner(System.in);
		
		int num1=entrada.nextInt();
		
		int i=-1;
		
		System.out.println("del 0 hasta el "+ num1+ ": ");
		while (i<(num1-1)) {
			i++;
			
			if (i==0) {
			System.out.print("-> "+i);
			}
			else if(i>0) {
			System.out.print(", "+i);}
			
			}
		
		System.out.print(" y el "+(i+1) +".");
		
	}

}
