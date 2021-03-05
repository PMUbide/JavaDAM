import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Tarea3 {
	public static void main(String[] args) {
		//Scanner para recoger la ruta del fichero a leer.
		Scanner in = new Scanner(System.in);
		//Creamos los ArrayList donde se van a guardar los datos leídos
		ArrayList <UsoBizi> total_datos = new ArrayList <UsoBizi> ();
		/*Pasamos el fichero que ha elegido el usuario,
		* Teniendo en cuenta que deberá seguir el modelo de
		* datos que se han creado en la práctica 1.
		* (No podrá recibir un fichero de datos original).
		*/
		//Se llama al método para leer el fichero y almacenarlo.
		int num_datos = 0;
		//Si introduce mal la ruta seguirá pidiendola 
		//Hasta que pueda leer el fichero.
		while(num_datos == 0) {
			String fichero = in.next();
			leerFichero(fichero, total_datos);
			num_datos = total_datos.size();
		}
		//Se crea un ArrayList de objetos tipo UsuarioBizi para almacenar la info.
		ArrayList <UsuarioBizi> usuarios_10 = new ArrayList <UsuarioBizi> (); 
		//Bucle para ir recorriendo las filas de información de usos
		for (UsoBizi i: total_datos) {
			//Primer condicional teniendo en cuenta que el fichero 
			//que almacena los usuarios está todavía vacío.
			if(usuarios_10.size() == 0) {
				//Se llama al método que devolverá si es circular.
				int circular = buscarCircular(i);
				int lineal = 0;
				if(circular == 0) {
					lineal = 1;
				}
				//Se crea un objeto de UsuarioBizi con la información recogida.
				UsuarioBizi nuevo = new UsuarioBizi(i.getIdUsuario(), lineal, circular);
				//A su vez se añade al ArrayList
				usuarios_10.add(nuevo);
			} else {
				int index = comprobarId(i.getIdUsuario(), usuarios_10);
				//Si lo encuentra, sumará +1 a los datos que correspondan.
				if(index != -1) {
					int circular = buscarCircular(i);
					//Llama al método adecuado después de buscar si es un trayecto
					//circular o no.
					if(circular == 1) {
						usuarios_10.get(index).sumarCircular();
					} else {
						usuarios_10.get(index).sumarTraslado();
					}
				//En caso de que no lo encuentre lo creará nuevo.
				} else {
					int circular = buscarCircular(i);
					int lineal = 0;
					if(circular == 0) {
						lineal = 1;
					}
					UsuarioBizi nuevo = new UsuarioBizi(i.getIdUsuario(), lineal, circular);
					usuarios_10.add(nuevo);
				}
			}
		}
		//Se llama al método sort para ordenar el ArrayList.
		Collections.sort(usuarios_10);
		//Se muestra la información.
		System.out.println("Visualizamos usuarios");
		System.out.println("----------------------------");
		System.out.println("Usuarios totales: " + usuarios_10.size());
		System.out.println("----------------------------");
		for(int j = 0; j < 15; j++) {
			System.out.println(usuarios_10.get(j).toString());
		}
		
	}
	
	/**
	 * Método que recibe un ID y comprueba si existe en el ArrayList 
	 * que contiene a los usuarios. En caso de que exista devuelve el índice,
	 * sino devuelve -1.
	 * @param idUsuario -> Recoge el id de una fila.
	 * @param usos -> ArrayList con la información de los usuarios. 
	 * @return
	 */
	public static int comprobarId(int idUsuario, ArrayList<UsuarioBizi> usos){
		for (int i = 0; i < usos.size(); i++) {
			if(usos.get(i).getIdUsuario() == idUsuario) {
				return i;
			}
		}
		return -1;
	}
	
	/**
	 * Método que para una fila compara si coinciden los id de las
	 * estaciones de anclaje y de retirada para devolver en
	 * cada caso un 1 o un 0.
	 * @param recorrido -> Un objeto de la clase UsoBizi
	 * @return -> Devuelve 1 o 0 según si es circular o no.
	 */
	public static int buscarCircular(UsoBizi recorrido) {
		if(recorrido.getEstAnclaje() == recorrido.getEstRetiro()) {
			return 1;
		} else {
			return 0;
		}
	}
	
	/**
	 * Método que recibe la ruta de un fichero creado en la tarea 1,
	 * como un csv separado por punto y coma, y a su vez un ArrayList
	 * para almacenar la información de las filas como objetos.
	 * @param nombreFichero -> Ruta del fichero que se quiere leer
	 * @param totales -> ArrayList que se almacena la información.
	 */
	private static void leerFichero(String nombreFichero,  ArrayList<UsoBizi> totales) {
		try {
			//Scanner para leer el fichero.
			Scanner texto = new Scanner(new File(nombreFichero));
			while (texto.hasNextLine()) {
				String linea = texto.nextLine();
				String[] lineaSeparada = linea.split(";");
				int num1 = Integer.parseInt(lineaSeparada[0].trim());
				int num2 = Integer.parseInt(lineaSeparada[1].trim());
				int num3 = Integer.parseInt(lineaSeparada[2].trim());
				UsoBizi uso = new UsoBizi(num1, num2, num3);
				totales.add(uso);
			}
		} catch (FileNotFoundException e) {
			System.out.println("Error en el nombre de uno de los ficheros");
		}
	}
	
}
