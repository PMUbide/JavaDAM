import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class MainPruebas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// CREAR CLUB
		// GESTIONAR CLUB (añadir socio, borrar socio, ver socios, guardar club elegido
		// y sus socios en un texto, SALIR DE LA GESTIÓN)

//			Elegir un club.
//		• Dar de alta un socio en el club elegido.
//		• Dar de baja un socio en el club elegido.
//		• Visualizar por pantalla los socios de un club elegido.
//		• Crear un fichero de texto y guardar en él el club elegido (con todos sus socios).

		ArrayList<Club> clubTotales = new ArrayList<Club>();

		int menu = 1;
		while (menu < 3) {
			Scanner in = new Scanner(System.in);
			System.out.println("Introduce acción del menú: ");
			System.out.println("1 - MENÚ CREACIÓN");
			System.out.println("2 - MENÚ GESTIÓN");
			System.out.println("3 - SALIR");
			menu = in.nextInt();
			// Crear clubs
			if (menu == 1) {
				boolean crearClub = true;
				while (crearClub) {
					System.out.println("Crear CLUB. Introduce nombre: ");
					String nombre = in.next();
					Club nuevo = new Club(nombre);
					clubTotales.add(nuevo);
					System.out.println("¿Quieres crear otro club? s/n");
					String eleccion = in.next();
					if (eleccion.equalsIgnoreCase("n")) {
						crearClub = false;
					}
				}
			} else if (menu == 2) {
				// MEnu gestión.
				boolean gestionClub = true;
				if (clubTotales.size() == 0) {
					System.out.println("No hay clubs");
					gestionClub = false;
				}
				// Elegir un club.
				while (gestionClub) {
					System.out.println("¿Que club quieres gestionar?");
					for (int i = 0; i < clubTotales.size(); i++) {
						System.out.println(i + " - " + clubTotales.get(i).getNombre());
					}
					int club_eleccion = in.nextInt();
					if(club_eleccion > clubTotales.size() || club_eleccion < 0) {
						System.out.println("Elección errónea.");
					}else {
						gestionClub(clubTotales.get(club_eleccion), in);
						System.out.println("¿Quieres gestionar otro club? s/n");
						String eleccion = in.next();
						if (eleccion.equalsIgnoreCase("n")) {
							gestionClub = false;
						}
					}
				}
			} else {
				System.out.println("Elección errónea");
			}
		}

//		Club nuevoClub = new Club("LOS MEJORES");
//		
//		
//		Socio uno = new Socio("ZZatsAblo", "abc", "1234", "ase");
//		Socio dos = new Socio("Edurne", "abc", "1234", "ase");
//		Socio tres = new Socio("bdurne", "abc", "1234", "ase");
//		System.out.println(("aatsAblo").compareToIgnoreCase("bdurne"));
//		
//		nuevoClub.incorporacion(uno);
//		nuevoClub.incorporacion(dos);
//		nuevoClub.incorporacion(tres);
//		nuevoClub.incorporacion(new Socio("Cesar", "ZAatruste", "ab", "ase"));
//		nuevoClub.incorporacion(new Socio("Cesario", "abc", "ac", "ase"));
//		nuevoClub.incorporacion(new Socio("AAAAAAAAaaablo", "bbc", "1234", "ase"));

//		
//		for (int i = 0; i < 100; i++) {
//			Random r = new Random();
//			Random t = new Random();
//			Random v = new Random();
//			String alphabet = "abcdefghijklmopqrstuvwxyz";
//			String ea = alphabet.charAt(r.nextInt(alphabet.length())) + "";
//			String eo = alphabet.charAt(t.nextInt(alphabet.length())) + "";
//			String eu = alphabet.charAt(v.nextInt(alphabet.length())) + "";
//		    System.out.println(alphabet.charAt(r.nextInt(alphabet.length())));
//		    nuevoClub.incorporacion(new Socio(ea, eo, eu, "ase"));
//		}

//		nuevoClub.borrado("Edurne", "abc", "1234");
//		
//		
//		Club otroClub = new Club("LOS PEORES");
//		otroClub.incorporacion(new Socio("Gordo", "abc", "ac", "ase"));
//		otroClub.incorporacion(new Socio("Flaco", "abc", "ac", "ase"));
//		otroClub.incorporacion(new Socio("FEO", "bbc", "1234", "ase"));
//		mostrarClub(nuevoClub);
//		System.out.println("___________");
//		mostrarClub(otroClub);
//		System.out.println("___________");
//		Club union = new Club("La union");
////		
//		
//		System.out.println(union.isEmpty());
//		union.union(nuevoClub, otroClub);
////		
//		
//		
//		System.out.println(union.getSize());
//		
//		mostrarClub(union);
//		System.out.println(union.isEmpty());
//		
////		System.out.println(union.pertenencia("FEo", "bbc", "1234"));

	}

//	public static void mostrarClubs(ArrayList<Club>)

	/**
	 * Dar de alta un socio en el club elegido. • Dar de baja un socio en el club
	 * elegido. • Visualizar por pantalla los socios de un club elegido. • Crear un
	 * fichero de texto y guardar en él el club elegido (con todos sus socios).
	 * 
	 * @param club
	 */
	public static void gestionClub(Club club, Scanner entrada) {
		int menu = 1;
		while (menu != 5) {
			System.out.println("Elige acción para el club " + club.getNombre());
			System.out.println("1 - Dar de alta un socio en el club.");
			System.out.println("2 - Dar de baja un socio en el club.");
			System.out.println("3 - Visualizar los socios.");
			System.out.println("4 - Crear fichero de texto y guardar el club.");
			System.out.println("5 - SALIR");
			menu = entrada.nextInt();
			// Elección de dar de alta un socio.
			if (menu == 1) {
				altaUsuario(club, entrada);
			} else if (menu == 2) {
				System.out.println("Eliminar");
			}else if(menu == 3) {
				System.out.println("Socios del club " + club.getNombre());
				mostrarSocios(club);
			}

		}
	}

	
	
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
			if (eleccion.equalsIgnoreCase("s")) {
				Socio nuevo = new Socio(nombre, primerApe, segunApe, fecha);
				club.incorporacion(nuevo);
				System.out.println("Socio introducido");
			}else {
				altaUsuario(club, entrada);
			}
	}
	
	
	
//	public static int comprobarExistenciaAsignatura(ArrayList<Asignatura> asignaturas, String comando) {
//		int codAsignatura;
//		// Se gestiona que el usuario haya introducido algo que no sea un int.
//		try {
//			codAsignatura = Integer.parseInt(comando);
//		} catch (NumberFormatException e) {
//			// Si llega introduce alguna letra en el código devuelve -1
//			return -1;
//		}
//		for (int i = 0; i < asignaturas.size(); i++) {
//			// Recorre las asignaturas y cuando encuentra una devuelve el índice.
//			if (asignaturas.get(i).getCodAsig() == codAsignatura) {
//				return i;
//			}
//		}
//		// Si acaba de recorrer todas y no la encuentra devuelve un -1
//		return -1;
//	}

	public static void mostrarSocios(Club club) {
		if (club.getSize() == 0) {
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
