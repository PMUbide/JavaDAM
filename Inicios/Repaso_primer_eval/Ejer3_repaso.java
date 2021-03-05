import java.util.*;
public class Ejer3_repaso {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Ejercicio 3: Escribe un programa Java que pregunte al usuario por dos
//		Strings, y compruebe si el primero de ellos contiene al segundo.
		Scanner in = new Scanner(System.in);
		System.out.println("Introduce el primer String: ");
		String cadena1=in.next();
		System.out.println("Introduce el segundo String: ");
		String cadena2=in.next();
		boolean asi=false;
		for(int i = 0; i < cadena1.length(); i++) {
			for(int j = i+1; j < cadena1.length(); j++) {
				if (cadena1.substring(i,j).equals(cadena2)) {
					asi=true;
					break;
				}
			}
		}
		if (asi==true) {
			System.out.println("Si lo contiene.");
		}
		else System.out.println("No lo contiene.");
		if(cadena1.indexOf(cadena2)==-1) {
	       System.out.println(cadena1 + " no contiene " + cadena2);
	    }else {
	       System.out.println(cadena1 + " contiene " + cadena2);
	    }
	}
}


