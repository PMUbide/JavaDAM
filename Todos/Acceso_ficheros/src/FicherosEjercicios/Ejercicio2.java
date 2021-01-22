package FicherosEjercicios;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Ejercicio 2: Realiza un programa en Java donde introduzcas la ruta de un fichero por teclado
//		y un texto que queramos a escribir en el fichero. Posteriormente, muestra el contenido del
//		fichero.

		System.out.println("Introduce la ruta completa");
		Scanner in = new Scanner (System.in);
		String ruta = in.next();
		File f = new File (ruta);
		String acabado = "";
		try {
			Formatter salida = new Formatter(f);
			salida.format("Hola que tal? Esto esta creado en el ejercicio 2");
			salida.close();
			System.out.println("Texto añadido");
			Scanner nuevo= new Scanner(f);
			while(nuevo.hasNext()) {
				String linea = nuevo.nextLine();
				//String lineaJunta = linea.trim();
				acabado += linea;
				
			}
			System.out.println(acabado);
			nuevo.close();
		} catch(FileNotFoundException e) {
			System.out.println("El fichero " + f + " no ha podido ser creado.");
		}
	
		
		
	}
}
