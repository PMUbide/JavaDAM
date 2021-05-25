package Ejercicio1;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
//		Queremos desarrollar un programa Java que sea capaz de analizar la información de un
//		fichero de texto. El algoritmo recibe como parámetro la dirección de un fichero de texto junto a una
//		letra del abecedario. El resultado debe mostrar por pantalla cada una de las palabras del texto que
//		empiezan o terminan con dicha letra, junto a la línea en la que se encuentran.
//		Con la finalidad de que la información mostrada por el algoritmo sea persistente, el programa
//		deberá almacenarla en una Base de Datos formada por una única tabla, con la siguiente estructura:
		
		String ruta = "files/HablanosDelDon.txt";
		//Llamamos al metodo que realiza toda la accion.
		buscaPalabra(ruta, "t");
	}
	
	/**
	 * Método que realiza la tarea del programa.
	 * @param ruta -> Recibe la ruta del archivo
	 * @param l -> la letra con la que debe hacer el criterio de busqueda
	 */
	public static void buscaPalabra(String ruta, String l) {
		try {
			Scanner f = new Scanner(new File(ruta));
			String linea;
			int numLinea = 1;
			//ArrayList para ir almacenando objetos de par palabra + linea
			ArrayList<Tupla> conteo = new ArrayList<Tupla>();
			while(f.hasNextLine()) {
				//leemos linea
				linea = f.nextLine();
				//Quitamos los caracteres que no interesan
				linea = linea.replace(".", "").replace(",", "").replace(":", "").replace(";","").replace("¿", "")
						.replace("?", "").replace("\"", "").replace("¡", "").replace("!","");
				//Hacemos split para ir analizando palabra a palabra.
				String[] lineaSplit = linea.split(" ");
				for (int i = 0; i < lineaSplit.length; i++) {
					//comprobamos si empieza o acaba con la letra.
					if(lineaSplit[i].substring(0, 1).equalsIgnoreCase(l) ||
							lineaSplit[i].substring(lineaSplit[i].length() - 1, lineaSplit[i].length()).equalsIgnoreCase(l)) {
						//Si se cumple se crea un objeto tupla y se añade al ArrayList
						conteo.add(new Tupla(lineaSplit[i], numLinea));
					}
				}
				numLinea++;
			}
			//mostrar los datos:
			for (Tupla tupla : conteo) {
				System.out.println(tupla);
			}
			//Almacenarlos en la BBDD:
			MySqlAccess con = new MySqlAccess();
			for (Tupla tupla : conteo) {
				try {
					con.insertTupla(tupla, l);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			System.out.println("Subido a la base de datos.");
			f.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	

}
