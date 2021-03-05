import java.util.*;
public class Ejer5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Implementa un programa Java que solicite al usuario
//		introducir un año y muestre por pantalla si este año introducido es
//		bisiesto o no.
		Scanner entrada=new Scanner(System.in);
		System.out.println("Introduce un año: ");
		int z=0,anio;
		while(z==0) {
			System.out.println("Introduce un año: ");
			anio=entrada.nextInt();
			if ((anio % 4 == 0) && ((anio % 100 != 0) || (anio % 400 == 0)))
				System.out.println("El año es bisiesto");
			else
				System.out.println("El año no es bisiesto");
		}
	}
}
