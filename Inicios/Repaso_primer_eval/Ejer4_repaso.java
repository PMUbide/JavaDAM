import java.util.*;
public class Ejer4_repaso {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Ejercicio 4: Escribe un programa Java que pregunte al usuario por dos
//		Strings, y compruebe si el primero de ellos finaliza con el valor del segundo.
//		1º String: Hola
//		2º String: la
//		Hola finaliza con la -> devuelvo TRUE
		Scanner in = new Scanner(System.in);
		System.out.println("Introduce el primer String: ");
		String cadena1=in.next();
		System.out.println("Introduce el segundo String: ");
		String cadena2=in.next();
		if(cadena1.substring((cadena1.length()-cadena2.length()), cadena1.length()).equals(cadena2)) {
			System.out.println("Si finaliza igual");
		}
		else System.out.println("No finaliza igual");
		
	}

}
