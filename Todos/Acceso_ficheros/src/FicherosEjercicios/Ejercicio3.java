package FicherosEjercicios;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Ejercicio 3: Realiza un programa en Java donde introduzcas la ruta de un fichero y te indique
//		si el fichero existe o de lo contrario no existe. Posteriormente mostrar el número de
//		caracteres del fichero y el número de palabras.
		String ruta = "files/final.txt";
		File archivo = new File(ruta);
		if (archivo.exists()) {
			System.out.println("El archivo existe");
		} else {
			System.out.println("El arhivo no existe");
		}
		String acabado = "";
		int conteo = 0;
		if (archivo.exists()) {
			try {
				Scanner f = new Scanner(archivo);
				while (f.hasNext()) {
					String linea = f.next();
					acabado += linea;
					// String lineaJunta = linea.trim();
					conteo++;
				}
				f.close();
			} catch (FileNotFoundException e) {
				System.out.println("El fichero " + archivo + " no ha podido ser leido.");
			}
			System.out.println("El número de carácteres(sin espacios) es: " + acabado.length());
			System.out.println("El número de palabras es: "+ conteo);
		}
		
		
	}

}
