import java.util.*;
public class Ejer5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Implementa un programa Java que solicite al usuario
//		introducir un a�o y muestre por pantalla si este a�o introducido es
//		bisiesto o no.
		Scanner entrada=new Scanner(System.in);
		System.out.println("Introduce un a�o: ");
		int z=0,anio;
		while(z==0) {
			System.out.println("Introduce un a�o: ");
			anio=entrada.nextInt();
			if ((anio % 4 == 0) && ((anio % 100 != 0) || (anio % 400 == 0)))
				System.out.println("El a�o es bisiesto");
			else
				System.out.println("El a�o no es bisiesto");
		}
	}
}
