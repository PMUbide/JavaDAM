import java.util.*;
public class Ejer6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Implementa un programa Java solicite al usuario introducir 3
//		números enteros y los muestre por pantalla ordenados de menor a
//		mayor.
		Scanner entrada=new Scanner(System.in);
		System.out.println("Introduce 3 números: ");
		int a,b,c;
		a=entrada.nextInt();
		b=entrada.nextInt();
		c=entrada.nextInt();
		
		int Mayor,Menor,Medio;
		
		
		System.out.println("Los números ordenados de mayor a menor son:");  
		 if (a > b && a > c) {
			 Mayor = a;
			 } else if (b > a && b > c) {
			 Mayor = b;
			 } else {
			 Mayor = c;
			 }

			 if (a < b && a < c) {
			 Menor = a;
			 } else if (b < a && b < c) {
			 Menor = b;
			 } else {
			 Menor = c;
			 }
			 Medio = (a + b + c) - (Mayor + Menor);
			 System.out.println("");
			 System.out.println("el orden ascendente de los numeros ingresados es: ");
			 System.out.println(Mayor + " " + Medio + " " + Menor);
	}

}
