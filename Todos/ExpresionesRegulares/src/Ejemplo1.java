import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ejemplo1 {

	public static void main(String[] args) {
//		1. Escribe una expresi�n regular que sea capaz de detectar si un String contiene �nicamente estos caracteres (a-z, A-Z y 0-9).
//		2. Escribe una expresi�n regular que sea capaz de detectar si un String est� formado por una "a" seguida de cero o m�s "b".
//		3. Escribe una expresi�n regular que sea capaz de detectar si un String est� formado por una "a" seguida de uno o m�s "b".
//		4. Escribe una expresi�n regular que sea capaz de detectar si un String tiene una "a" seguida de cualquier cosa, y adem�s termina con una "b"
//		5. Escribe na expresi�n regular que encuentre todas las palabras que contienen una "z" dentro de un String.
//		6. Escribe una expresi�n regular que encuentre todas las palabras con cinco caracteres de un String.
//		7. Escribe una expresi�n regular que encuentre urls dentro de un String.
		
		String input = "la caracola dice hola a la mariposa";
		Pattern p = Pattern.compile("hola");
		
		Matcher mat = p.matcher(input);
		//1 -   ^[A-Za-z0-9]*$
		//2 - [a]*b
		if(mat.find()) {
			System.out.println("Encontrado");
		}else {
			System.out.println("No encontrado");
		}
		
	}

}
