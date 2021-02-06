package FicherosEjercicios;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Formatter;
import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Ejercicio 6: Crea una aplicación donde pidamos el nombre de un fichero por teclado y un texto
//		que queramos escribir en el fichero. Después de crear el fichero con la información
//		introducida, deberás mostrar por pantalla el texto del fichero pero variando entre mayúsculas
//		y minúsculas.
//		Por ejemplo, si escribo: “Bienvenidos a Plasencia” deberá devolver “bIENVENIDOS A
//		pLASENCIA”.
		String ruta = "files/ejercicio6_inicial.txt";
		File archivo = new File (ruta);
		System.out.println("Introduce un texto para escribir: ");
		Scanner in = new Scanner (System.in);
		String texto = in.nextLine();
		//Volcarlo en el fichero
		try {
			Formatter nuevo = new Formatter (archivo);
			String lineaTotal = "";
			for(int i = 0; i < texto.length(); i++) {
				char letra = texto.charAt(i);
				if(Character.isUpperCase(letra)) {
					//la transforma en minuscula
					lineaTotal += Character.toLowerCase(letra);
				}
				else {
					lineaTotal += Character.toUpperCase(letra);
				}
			}
			//System.out.println(palabraTotal);
			nuevo.format(lineaTotal);
			nuevo.close();
			Scanner fichero = new Scanner (archivo);
			String linea = "";
			while(fichero.hasNextLine()) {
				linea = fichero.nextLine();
			}
			System.out.println(linea);
			fichero.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("ERROR");
		}
		
		
		
	}

	

}
