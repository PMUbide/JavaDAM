import java.util.*;
import javax.swing.*;

public class CalculadoraMetodos
{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/**
		 * pregunta por dos números con los que operar
		 * pregunta por la operación a realizar
		 */
		double numero1 = preguntar("Introduzca el primer número"); 
		double numero2 = preguntar("Introduzca el segundo número");
		int operacion = preguntarInt("¿Qué operación desea realizar? (1:sumar, 2:restar, 3:multiplicar y 4:dividir)");
		double resultado = 0;
		/**
		 * La variable acabar la creo para hacer que el programa no pare de preguntar por qué operación realizar hasta que
		 * se introduzca un valor correcto (del 1 al 4), en el caso de que introduzca un valor correcto, esta variable
		 * cambia a 2 y hace que el programa abandone el bucle "while (acabar<1)"
		 */
		int acabar = 0; 
		do {
			
			if (operacion==1) {
			sumar(numero1, numero2);
			acabar=2;}
		
			else if (operacion==2) {
			restar(numero1, numero2);
			acabar=2;}
		
			else if (operacion==3) {
			multiplicar(numero1, numero2);
			acabar=2;}
		
			else if (operacion==4) {
			dividir(numero1, numero2);
			acabar=2;}
			
			else  {
			operacion = preguntarInt("El número debe de ser 1, 2, 3 ó 4. Inténtelo de nuevo");}
			
		} while (acabar<1);
	}
	/**
	 * un método para sumar, otro para restar, otro para multiplicar y otro para dividir
	 */
	public static void sumar(double numero1, double numero2) {
	System.out.print("La suma es " + (numero1+numero2));
	}	
	public static void restar(double numero1, double numero2) {
		System.out.print("La resta es " + (numero1-numero2));
	}	
	public static void multiplicar(double numero1, double numero2) {
		System.out.print("La multiplicación es " + (numero1*numero2));
	}	
	public static void dividir(double numero1, double numero2) {
		System.out.print("La división es " + (numero1/numero2));
	}	
	
	/**
	 * método para preguntar y recoger los números de tipo double que se introducen
	 */
	
	public static double preguntar (String mensaje) {
		System.out.print(mensaje);
		Scanner entrada = new Scanner(System.in);
		return entrada.nextDouble();
	}
	
	/**
	 * método para preguntar y recoger el número de tipo int que determina la operación a realizar
	 */
	public static int preguntarInt (String mensaje) {
		System.out.print(mensaje);
		Scanner entrada = new Scanner(System.in);
		return entrada.nextInt();
	}
	
	
	
	
	
	
	
}
