import java.util.*;
public class Ejer7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Implementa un programa Java solicite al usuario introducir un
//		n�mero entero entre 0 y 99999, y muestre por pantalla el n�mero de
//		cifras de dicho n�mero.
		Scanner entrada=new Scanner(System.in);
		int num;
		do{
			System.out.println("Introduce un n�mero entre 0 y 99999.");
			num=entrada.nextInt();
			}while (num <0 || num >99999);
		String numcadena=String.valueOf(num);
		
		System.out.println("El n�mero tiene "+ numcadena.length()+ " cifras.");
		
	}

}
