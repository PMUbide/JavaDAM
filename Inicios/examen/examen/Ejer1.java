package examen;
import java.util.*;
public class Ejer1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Implementa un programa Java que solicite al usuario 2 cadenas de
		caracteres (String):
			1. La primera de ellas llamada N que tiene que tener una longitud >=4
			2. La segunda de ellas llamada M que tiene que tener una longitud >=N.
			En el caso de que alguna condición de las anteriores no se cumpla, se le
			solicitará al usuario que vuelva a introducir AMBOS Strings HASTA un
			máximo de 5 veces. Si siguen sin cumplirse, el programa finaliza.
		*/
		Scanner entrada=new Scanner (System.in); //Scanner para introducir datos
		String N=" "; String M=""; //iniciamos las variables, ya con unos espacios para que entre en el while.
		int z=0; // unas variables de contador para usarse dentro del bucle por si nos introducen una cadena que no sea válida.
		while((N.length()<4) || (M.length()<N.length())) {
			System.out.println("1.Introduce la primera cadena de caracteres (>=4)"); //Cambiará el mensaje si nos hemos equivocado una vez.
			N=entrada.nextLine(); //la variable N será la que introduzca el usuario.
			System.out.println("2.Introduce la segunda cadena de caracteres (>=N)");
			M=entrada.nextLine(); //la variable M será la que introduzca el usuario.
			z++;
			System.out.println("Intentos "+ z+ "/5");
			if (z==5) {
				System.out.println("Has agotado el número de intentos.");
				break;
			}
		}	
		if(z<5) {
			System.out.println("Primera cadena de carácteres: "+(char)(34)+ N +(char)(34));
			System.out.println("Segunda cadena de carácteres: "+(char)(34)+M+(char)(34));
			String nueva=N+M;
			System.out.println("Resultado: "+(char)(34)+ nueva+(char)(34)); // usaremos el metodo replace para cambiar.
			System.out.println("Resultado sin vocales: " + (char)(34)+  (N+M).replace("a","").replace("e","").replace("i","").replace("o","").replace("u","")+(char)(34));
			int cont=0;
			String Letra;
			for(int i=0;i<nueva.length();i++) {
				Letra = nueva.substring(i,i+1);
				for (int d=i+1;d<nueva.length();d++) {
					if (Letra.equals(nueva.substring(d,d+1))) {
						cont++;
					}
				}
			}
			if (cont>0) {
			System.out.println("Hay letras repetidas?: Si");
			}
			else System.out.println("Hay letras repetidas?: No");
		}
	}	
}
