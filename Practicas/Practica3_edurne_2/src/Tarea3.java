import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Tarea3 {
	public static void main(String[] args) {
		//Scanner para recoger la ruta del fichero a leer.
		Scanner in = new Scanner(System.in);
		//Creamos los ArrayList donde se van a guardar los datos le�dos
		ArrayList <UsoBizi> total_datos = new ArrayList <UsoBizi> ();
		/*Pasamos el fichero que ha elegido el usuario,
		* Teniendo en cuenta que deber� seguir el modelo de
		* datos que se han creado en la pr�ctica 1.
		* (No podr� recibir un fichero de datos original).
		*/
		//Se llama al m�todo para leer el fichero y almacenarlo.
		int num_datos = 0;
		//Si introduce mal la ruta seguir� pidiendola 
		//Hasta que pueda leer el fichero.
		while(num_datos == 0) {
			String fichero = in.next();
			leerFichero(fichero, total_datos);
			num_datos = total_datos.size();
		}
		//Se crea un ArrayList de objetos tipo UsuarioBizi para almacenar la info.
		ArrayList <UsuarioBizi> usuarios_10 = new ArrayList <UsuarioBizi> (); 
		//Bucle para ir recorriendo las filas de informaci�n de usos
		for (UsoBizi i: total_datos) {
			//Primer condicional teniendo en cuenta que el fichero 
			//que almacena los usuarios est� todav�a vac�o.
			if(usuarios_10.size() == 0) {
				//Se llama al m�todo que devolver� si es circular.
				int circular = buscarCircular(i);
				int lineal = 0;
				if(circular == 0) {
					lineal = 1;
				}
				//Se crea un objeto de UsuarioBizi con la informaci�n recogida.
				UsuarioBizi nuevo = new UsuarioBizi(i.getIdUsuario(), lineal, circular);
				//A su vez se a�ade al ArrayList
				usuarios_10.add(nuevo);
			} else {
				int index = comprobarId(i.getIdUsuario(), usuarios_10);
				//Si lo encuentra, sumar� +1 a los datos que correspondan.
				if(index != -1) {
					int circular = buscarCircular(i);
					//Llama al m�todo adecuado despu�s de buscar si es un trayecto
					//circular o no.
					if(circular == 1) {
						usuarios_10.get(index).sumarCircular();
					} else {
						usuarios_10.get(index).sumarTraslado();
					}
				//En caso de que no lo encuentre lo crear� nuevo.
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
		//Se llama al m�todo sort para ordenar el ArrayList.
		Collections.sort(usuarios_10);
		//Se muestra la informaci�n.
		System.out.println("Visualizamos usuarios");
		System.out.println("----------------------------");
		System.out.println("Usuarios totales: " + usuarios_10.size());
		System.out.println("----------------------------");
		for(int j = 0; j < 15; j++) {
			System.out.println(usuarios_10.get(j).toString());
		}
		
	}
	
	/**
	 * M�todo que recibe un ID y comprueba si existe en el ArrayList 
	 * que contiene a los usuarios. En caso de que exista devuelve el �ndice,
	 * sino devuelve -1.
	 * @param idUsuario -> Recoge el id de una fila.
	 * @param usos -> ArrayList con la informaci�n de los usuarios. 
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
	 * M�todo que para una fila compara si coinciden los id de las
	 * estaciones de anclaje y de retirada para devolver en
	 * cada caso un 1 o un 0.
	 * @param recorrido -> Un objeto de la clase UsoBizi
	 * @return -> Devuelve 1 o 0 seg�n si es circular o no.
	 */
	public static int buscarCircular(UsoBizi recorrido) {
		if(recorrido.getEstAnclaje() == recorrido.getEstRetiro()) {
			return 1;
		} else {
			return 0;
		}
	}
	
	/**
	 * M�todo que recibe la ruta de un fichero creado en la tarea 1,
	 * como un csv separado por punto y coma, y a su vez un ArrayList
	 * para almacenar la informaci�n de las filas como objetos.
	 * @param nombreFichero -> Ruta del fichero que se quiere leer
	 * @param totales -> ArrayList que se almacena la informaci�n.
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
