import java.util.*;
public class Ejer7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Implementa un programa Java solicite al usuario introducir un
//		número entero entre 0 y 99999, y muestre por pantalla el número de
//		cifras de dicho número.
		Scanner entrada=new Scanner(System.in);
		int num;
		do{
			System.out.println("Introduce un número entre 0 y 99999.");
			num=entrada.nextInt();
			}while (num <0 || num >99999);
		String numcadena=String.valueOf(num);
		
		System.out.println("El número tiene "+ numcadena.length()+ " cifras.");
		
	}

}
