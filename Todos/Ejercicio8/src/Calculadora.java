import java.util.*;
import javax.swing.*;

public class Calculadora 
{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		double numero1 = preguntar("Introduzca el primer número");
		double numero2 = preguntar("Introduzca el segundo número");
		double operacion = preguntar("¿Qué operación desea realizar? (1:sumar, 2:restar, 3:multiplicar y 4:dividir)");
		double resultado = 0;
		if (operacion==1) {
			resultado = numero1+numero2;}
		
		if (operacion==2) {
			resultado=numero1-numero2;}
		
		if (operacion==3) {
			resultado=numero1*numero2;}
		
		if (operacion==4) {
			resultado=numero1/numero2;}
		else {
			System.out.print("Introduzca un número del 1 al 4");
			
		}
		
		
		System.out.print("El resultado es " + resultado);
}		
		
	
		
	public static double preguntar (String mensaje) {
		System.out.print(mensaje);
		Scanner entrada = new Scanner(System.in);
		return entrada.nextDouble();
	}
	
	
	
	
	
	
	
}
