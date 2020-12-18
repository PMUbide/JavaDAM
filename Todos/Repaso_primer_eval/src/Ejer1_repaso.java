import java.util.*;
public class Ejer1_repaso {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Ejercicio 1: Escribe un programa Java que pregunte al usuario por dos
//		Strings y los compare lexicográficamente. Dos Strings son lexicográficamente
//		iguales si tienen la misma longitud y contienen los mismos caracteres en las
//		mismas posiciones.	
		System.out.println("Introduce la primera cadena a comparar: ");
		Scanner in = new Scanner(System.in);
		String cadena1 = in.next();
		System.out.println("Introduce la segunda cadena a comparar: ");
		String cadena2 = in.next();
		int cont = 0;
		boolean resul = false;
		if(cadena1.length()==(cadena2.length())) {
			for(int i = 0;i<cadena1.length();i++) {
				if (cadena1.substring(i,i+1).equals(cadena2.substring(i,i+1))){
					cont++;
				}
			}
			
			if (cont==cadena1.length()) {
				resul=true;
			}
		}
		System.out.println("Son lexicográficamente iguales?" + resul);
	
		int num1 = 5;
		int num2 = 10;
		
		
		num2 = suma(5,10);
			
		System.out.println(num2);
	
	}
	
	
	//Siempre que entra en una función, hay que darle esas variables ? no se le puede dar uno predefinido por si no le pasas parámetro.
	public static int suma (int a, int b) {
			
		b = 4;
		
		return b;
	}

}
