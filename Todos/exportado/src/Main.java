

import java.util.Scanner;

public class Main {
	public static final String ANSI_RED = "\u001B[31m";
	public static final String ANSI_RESET = "\u001B[0m";
	
	public static void main(String[] args) {
		System.out.println(ANSI_RED + "This text is red!" + ANSI_RESET);
		Scanner entrada = new Scanner(System.in);
		System.out.print("Introduce un entero: ");
		int num = entrada.nextInt();
		Funciones.bucle(num);
		
		System.out.print("Ahora introduce 2 enteros: ");
		num = entrada.nextInt();
		System.out.print("Dame el segundo: ");
		int num2 = entrada.nextInt();
		Funciones.sumar(num, num2);
		
		System.out.print("Ahora introduce 3 enteros: ");
		num = entrada.nextInt();
		System.out.print("Dame el segundo: ");
		num2 = entrada.nextInt();
		System.out.print("Dame el tercero: ");
		int num3 = entrada.nextInt();
		Funciones.multiplicar(num, num2, num3);
	}
}
