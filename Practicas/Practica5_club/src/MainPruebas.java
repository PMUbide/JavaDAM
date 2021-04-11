import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class MainPruebas {

	public static void main(String[] args) {
		//Arraylist para guardar los clubs durante el programa.
		ArrayList<Club> clubTotales = new ArrayList<Club>();
		//leer fichero que estén guardados al inicio del programa.
		leerFichero(clubTotales);
		String menu = "1";
		boolean menuPrincipal = true;
		//Empieza el programa principal.
		while (menuPrincipal) {
			Scanner in = new Scanner(System.in);
			System.out.println("Introduce acción del menú: ");
			System.out.println("1 - MENÚ CREACIÓN");
			System.out.println("2 - MENÚ GESTIÓN");
			System.out.println("3 - UNIÓN DOS CLUBS");
			System.out.println("4 - SALIR");
			menu = in.next();
			// Crear Clubs si no existen.
			if (menu.equals("1")) {
				boolean crearClub = true;
				while (crearClub) {
					System.out.println("Crear CLUB. Introduce nombre: ");
					String nombre = in.next();
					Club nuevo = new Club(nombre);
					clubTotales.add(nuevo);	//Añadido en el arrayList.
					System.out.println("¿Quieres crear otro club? s/n");
					String eleccion = in.next();
					//Opción para seguir creando clubs.
					if (eleccion.equalsIgnoreCase("n")) {
						crearClub = false;
					}
				}
			} else if (menu.equals("2")) {
				//Menu gestión, comprueba
				boolean gestionClub = true;
				//comprueba si hay clubs actualmente para trabajar.
				if (clubTotales.size() == 0) {
					System.out.println("No hay clubs");
					gestionClub = false;
				}
				//Elegir un club.
				while (gestionClub) {
					System.out.println("¿Que club quieres gestionar?");
					for (int i = 0; i < clubTotales.size(); i++) {
						System.out.println(i + " - " + clubTotales.get(i).getNombre());
					}
					//llama al método para almacenar un "int".
					int eleccionClub = comprobarEleccion(in);
					if(eleccionClub < 0 || eleccionClub >= clubTotales.size()) {
						System.out.println("Elección errónea.");
					}else {
						//LLama al método con las opciones de gestión del club
						gestionClub(clubTotales.get(eleccionClub), in, clubTotales);
						System.out.println("¿Quieres gestionar otro club? s/n");
						String eleccion = in.next();
						//para controlar si se vuelve a repetir el proceso.
						if (eleccion.equalsIgnoreCase("n")) {
							gestionClub = false;
						}
					}
				}
			}else if(menu.equals("3")) {
				System.out.println("Nombre del nuevo club: ");
				String nombre = in.next();
				Club nuevo = new Club(nombre);
				for (int i = 0; i < clubTotales.size(); i++) {
					System.out.println(i + " - " + clubTotales.get(i).getNombre());
				}
				System.out.println("Elige primer club: ");
				int eleccionClub1 = comprobarEleccion(in);
				if(eleccionClub1 < 0 || eleccionClub1 >= clubTotales.size()) {
					System.out.println("Elección errónea.");
				}else {
					System.out.println("Elige segundo club: ");
					int eleccionClub2 = comprobarEleccion(in);
					if(eleccionClub2 < 0 || eleccionClub2 >= clubTotales.size()) {
						System.out.println("Elección errónea.");
					}else {
						if(eleccionClub1 != eleccionClub2) {
							nuevo.union(clubTotales.get(eleccionClub1), clubTotales.get(eleccionClub2));
							clubTotales.add(nuevo);
						}
					}
					
				}
			}else if(menu.equals("4")) { //La opción para finalizar el programa.
				System.out.println("Gracias, Hasta pronto.");
				menuPrincipal = false;
			}
			else { //Si no coincide con ninguna de las anteriores, vuelve a pedir elección.
				System.out.println("Elección errónea");
			}
		}
	}
	
	
	/**
	 * Método que evita "crasheos" si el usuario introduce una eleccón errónea del menú-
	 * @param in -> recibe el objeto Scanner.
	 * @return -> Devuelve un número int. Si es error devuelve -1.
	 */
	public static int comprobarEleccion(Scanner in) {
		String comando = in.next();
		int menu;
		try {
			return menu = Integer.parseInt(comando);
		} catch (NumberFormatException e) {
			return -1;
		}
	}


	/**
	 * Dar de alta un socio en el club elegido. Dar de baja un socio en el club
	 * elegido. Visualizar por pantalla los socios de un club elegido. Crear un
	 * fichero de texto y guardar en él el club elegido (con todos sus socios).
	 * 
	 * @param club -> Recibe el club sobre el que hacer las gestiones.
	 * @param entrada -> Recibe el objeto Scanner para hacer peticiones.
	 * @param lista -> Recibe el ArrayList<Club> del programa para hace el guardado.
	 */
	public static void gestionClub(Club club, Scanner entrada, ArrayList<Club> lista) {
		String menu = "1";
		//mientras no sea 5 seguirá preguntando.
		while (!menu.equalsIgnoreCase("5")) {
			System.out.println("Elige acción para el club " + club.getNombre());
			System.out.println("1 - Dar de alta un socio en el club.");
			System.out.println("2 - Dar de baja un socio en el club.");
			System.out.println("3 - Visualizar los socios.");
			System.out.println("4 - Crear fichero de texto y guardar el club.");
			System.out.println("5 - SALIR");
			menu = entrada.next();
			//Elección que llama al método de dar de alta un socio.
			if (menu.equals("1")) {
				altaUsuario(club, entrada);
			} else if (menu.equals("2")) { //Eliminar un socio. Si el club no está vacío.
				if(club.isEmpty()) {
					System.out.println("Club vacío. Nada que eliminar.");
				}else {
					//LLama al método para dar de baja a un usuario.
					bajaUsuario(club, entrada);
				}
			}else if(menu.equals("3")) {
				//LLama al método para mostrar los socios del club.
				System.out.println("Socios del club " + club.getNombre());
				mostrarSocios(club);
			}else if(menu.equals("4")) {
				//LLama al método para escribir el fichero actual y los que tenga el programa guardados del inicio.
				escribirFichero(club);
				System.out.println("Club " + club.getNombre() + " guardado.");
			}
		}
	}

	
	/**
	 * Método para escribir el fichero de datos con los clubes.
	 * @param lista -> Recibe la lista actual de los clubs.
	 * @param club
	 */
	public static void escribirFichero(Club club) {
		//Primero lee los ficheros que ya hay en el TXT:
		File fichero = new File("files/clubs.dat");
		ArrayList<Club> listaExistente = new ArrayList<Club>();
		try {
			FileInputStream fi = new FileInputStream("files/clubs.dat");
			ObjectInputStream oisFP = new ObjectInputStream(new FileInputStream("files/clubs.dat"));
			while (true) {
				listaExistente.add((Club) oisFP.readObject());
			}
		} catch (FileNotFoundException e) {
			System.out.println("No se ha importado ningún club.");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (EOFException e) {
			System.out.println("Clubs importados correctamente.");
		} catch (IOException e) {
			e.printStackTrace();
		}
		try {
			//Ahora procede a escribir el nuevo club
			FileOutputStream f = new FileOutputStream(fichero);
			ObjectOutputStream oosFP = new ObjectOutputStream(f);
			//Comprueba si el club ya existia antes para borrarlo, y después añadirlo con los cambios.
			int remove = -1;
			for (int i = 0; i < listaExistente.size(); i++) {
				if(listaExistente.get(i).getNombre().equals(club.getNombre())) {
					remove = i; //Si encuentra el mismo nombre sobrescribe.
				}
			}
			//si lo ha encontrado lo elimina de la lista con la que está trabajando.
			if(remove >= 0) {
				listaExistente.remove(remove);
			}
			//A continuación lo vuelve a añadir para evitar crear archivos que ya existian.
			listaExistente.add(club);
			//Escribe todos los que hay.
            for(Club i: listaExistente) {
            	oosFP.writeObject(i);
            }
			oosFP.close();
		} catch (IOException e) {}
	}
	
	
	
	/**
	 * Método que lee el fichero por defecto de Clubs con el que trabaja el programa.
	 * @param lista -> Recibe un ArrayList en el que guarda los clubs que lee del fichero.
	 */
	public static void leerFichero(ArrayList<Club> lista) {
		try {
			FileInputStream fi = new FileInputStream("files/clubs.dat");
			ObjectInputStream oisFP = new ObjectInputStream(new FileInputStream("files/clubs.dat"));
			while (true) {
				lista.add((Club) oisFP.readObject());
			}
		} catch (FileNotFoundException e) {
			System.out.println("No se ha importado ningún Club");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (EOFException e) {
			System.out.println("Clubs importados correctamente.");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	
	/**
	 * Método para dar de alta a un usuario y añadirlo a la lista CLUB
	 * @param club -> Recibe el club donde se va a añadir.
	 * @param entrada -> Recibe el objeto Scanner.
	 */
	public static void altaUsuario(Club club, Scanner entrada) {
			System.out.println("Introduce datos del socio. ");
			System.out.println("Nombre: ");
			String nombre = entrada.next();
			System.out.println("Primer apellido: ");
			String primerApe = entrada.next();
			System.out.println("Segundo apellido: ");
			String segunApe = entrada.next();
			System.out.println("Fecha de incorporación: d/m/a ");
			String fecha = entrada.next();
			System.out.println("Socio introducido: ");
			System.out.println(nombre + " " + primerApe + " " + segunApe + " " + fecha);
			System.out.println("¿Es correcto? s/n");
			String eleccion = entrada.next();
			//Si confirma que los datos son correctos llama al método para incorporar un socio.
			if (eleccion.equalsIgnoreCase("s")) {
				Socio nuevo = new Socio(nombre, primerApe, segunApe, fecha);
				club.incorporacion(nuevo);
				System.out.println("Socio introducido");
			}else {
				//En caso contrario vuelve a llamarse a si mismo para introducir el socio hasta que sea correcto.
				altaUsuario(club, entrada);
			}
	}
	
	/**
	 *  Método para dar de baja a un usuario y quitarlo de la lista CLUB
	 * @param club -> El club para dar de baja al usuario.
	 * @param entrada -> Recibe el objeto Scanner.
	 */
	public static void bajaUsuario(Club club, Scanner entrada) {
		System.out.println("Introduce datos del socio: ");
		System.out.println("Nombre: ");
		String nombre = entrada.next();
		System.out.println("Primer apellido: ");
		String primerApe = entrada.next();
		System.out.println("Segundo apellido: ");
		String segunApe = entrada.next();
		//Una vez tiene los datos llama al método para borrarlo.
		club.borrado(nombre, primerApe, segunApe);
}
	
	
	/**
	 * Método que muestra los socios de un club.
	 * @param club -> Recibe un club para mostrar los socios.
	 */ 
	public static void mostrarSocios(Club club) {
		if (club.isEmpty()) {
			System.out.println("Está vacío.");
			return;
		}
		Nodo puntero = club.getPrimerNodo();
		int cont1 = 0;
		while (cont1 < club.getSize()) {
			System.out.println(puntero.getContenido().toString());
			puntero = puntero.getSiguiente();
			cont1++;
		}
	}

}
