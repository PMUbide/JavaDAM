import java.util.Scanner;

public class E7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Escribe un programa Java que pregunte al usuario por un número entero y muestre por pantalla su tabla de multiplicar
		
		
		
		/*
		Scanner entrada=new Scanner (System.in);
		System.out.println("Inserta un número entero: ");
		int num1=entrada.nextInt();
		
		
		int i=0;
		System.out.println("Su tabla de multiplicar es: ");
			
		
			while (i<=10) {
			
				System.out.println(num1 +"x"+ i +" es igual a "+ num1*i);
		
				i++;
					
		}
		*/
		
		Scanner entrada=new Scanner (System.in);
		System.out.println("Inserta un número entero: ");
		int num1=entrada.nextInt();
		
		for(int i=0;i<=10;i++) {
			
			System.out.println(num1*i);
			
		}
		
		
		
		
		
		
		
	}

}
