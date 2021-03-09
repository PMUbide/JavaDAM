package Principal;

import java.io.EOFException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.Collections;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Añadir info de las asignaturas.
		ArrayList<Asignaturas> datos_asignaturas = new ArrayList<>();
		leerAsignaturas("files/asignaturas.txt", datos_asignaturas);
		for (Asignaturas asignaturas : datos_asignaturas) {
			System.out.println(asignaturas.toString());
		}
		// Añadir info de los alumnos.
		ArrayList<Alumno> datos_alumnos = new ArrayList<>();
		leerAlumnos("files/alumnos.csv", datos_alumnos);
		for (Alumno a : datos_alumnos) {
			System.out.println(a.toString() + a.getMatriculaciones().size());
		}
		// AÑADIR INFO DE MATRICULACIONES
		ArrayList<Matricula> datos_matriculas = new ArrayList<>();
		leerMatriculas("files/matriculas.dat", datos_matriculas);
//		for (Matricula a : datos_matriculas) {
//			System.out.println(a.toString());
//		}

		// Ahora combinar la información en las clases.
//		//Añadir las matriculas a los alumnos.
//		for (int i = 0; i < datos_alumnos.size(); i++) {
//			for (int j = 0; j < datos_matriculas.size(); j++) {
//				if(datos_alumnos.get(i).getNip() == datos_matriculas.get(j).getNip()) {
//					datos_alumnos.get(i).setMatriculaciones(datos_matriculas.get(j).getCod());
//				}
//			}
//		}
		// Añadir el número de alumnos que tiene cada asignatura.
		// actualizarAsignaturas(datos_asignaturas, datos_matriculas);

		// Empieza con comandos para hacer.

		// Ordenes posibles.
		String[] ordenes = { "Matriculas", "Asignaturas", "Alumnos", "Matricular", "Eliminar" };
		String comando = "";
		do {
			Scanner in = new Scanner(System.in);
			// Añadir el número de alumnos que tiene cada asignatura.
			actualizarAsignaturas(datos_asignaturas, datos_matriculas);
			// Ahora combinar la información en las clases.
			// Añadir las matriculas a los alumnos.
			actualizarAlumnos(datos_alumnos, datos_matriculas);
			System.out.println("\nComando > ");
			comando = in.nextLine();

			// Método para comprobar que le llegan bien el modelo STRING - int - int
			// Si es igual a "Matriculas"
			if (comando.equalsIgnoreCase(ordenes[0])) {
				// Llamar al método que muestra las asignaturas.
				matriculas(datos_matriculas, datos_asignaturas);
			} else {
				String[] comando_s = comando.split(" ");
				if (comando_s[0].equalsIgnoreCase(ordenes[1])) {
					// LLamar al metodo de asignaturas.
					if (splitCorrecto2(comando)) {
						asignaturas(datos_alumnos, datos_asignaturas, comando_s);
					}
				} else if (comando_s[0].equalsIgnoreCase(ordenes[2])) {
					// LLamar al metodo de alumnos
					if (splitCorrecto2(comando)) {
						alumnos(datos_alumnos, datos_asignaturas, comando_s);
					}
				} else if (comando_s[0].equalsIgnoreCase(ordenes[3])) {
					// LLamar al método matricular
					if (splitCorrecto(comando)) {
						matricular(comando_s, datos_alumnos, datos_asignaturas, datos_matriculas);
					}
				} else if (comando_s[0].equalsIgnoreCase(ordenes[4])) {
					// Llamar al método eliminar
					if (splitCorrecto(comando)) {
						eliminar(comando_s, datos_alumnos, datos_asignaturas, datos_matriculas, in);
					}
				} else {
					System.out.println("Comando erróneo");
					sugerirOrden(comando, ordenes);
				}
			}

//			comprobacionOrden(comando, datos_matriculas, datos_asignaturas);
		} while (!comando.equalsIgnoreCase("fin"));

		for (int i = 0; i < datos_matriculas.size(); i++) {
			System.out.println(datos_matriculas.get(i).toString());
		}

	}

	public static void sugerirOrden(String comando, String[] ordenes) {
//		String[] ordenes = {"Matriculas", "Asignaturas", "Alumnos", "Matricular", "Eliminar"};

	}

	/**
	 * Comprueba que los datos introducidos tienen el formato de string + int + int
	 * + S
	 * 
	 * @param comando
	 * @return
	 */
	public static boolean splitCorrecto(String comando) {
		try {
			String comandoSplit[] = comando.split(" ");
			for (int i = 1; i < comandoSplit.length; i++) {
				int numero = Integer.parseInt(comandoSplit[i]);
			}
			return true;
		} catch (NumberFormatException e) {
			System.out.println("Tienes que introducir códigos");
			return false;
		}
	}

	/**
	 * Comprueba que los datos introducidos tienen el formato de string + int + int
	 * + S
	 * 
	 * @param comando
	 * @return
	 */
	public static boolean splitCorrecto2(String comando) {
		try {
			String comandoSplit[] = comando.split(" ");
			int numero = Integer.parseInt(comandoSplit[1]);
			return true;
		} catch (NumberFormatException e) {
			System.out.println("Tienes que introducir códigos");
			return false;
		}
	}

	/**
	 * opcion de comando alumnos
	 * 
	 * @param array
	 * @param asig
	 * @param orden
	 * @throws Exception 
	 */
	public static void alumnos(ArrayList<Alumno> array, ArrayList<Asignaturas> asig, String[] orden) throws Exception {
//		Alumnos código [A | N]
//			Presenta la lista de alumnos matriculados en la asignatura cuyo código es igual al código. Si al final de
//			la orden se hace constar la letra A el listado de alumnos es presentado en orden alfabético. Si al final
//			de la orden se hace constar la letra N o no se hace constar ninguna orden, el listado de asignaturas es
//			presentado en orden de valores de NIP crecientes.
		boolean encontrado = false;
		boolean parametros = false;
		// Si está sin parámetros
		if (orden.length == 1) {
			System.out.println("Faltan parámetros");
			return;
		}
		// si no le llega ningun otro comando o le llega una C
		if (orden.length >= 3 && !orden[2].equalsIgnoreCase("A")) {
			System.out.println("Parámetro no encontrado");
			return;
		}
		
		if (orden.length < 3 || orden[2].equalsIgnoreCase("N")) {
			for (int i = 0; i < asig.size(); i++) {
				if (orden[1].equalsIgnoreCase(asig.get(i).getCodAsignatura() + "")) {
					encontrado = true;
					System.out.println("Asignatura encontrado. Alumnos mariculadas por código: ");
					System.out.println("--------------------------------------------");
					ArrayList<Integer> nips = asig.get(i).getCodAlumnos();
					Collections.sort(nips);
					for (Integer index : nips) {
						for (int j = 0; j < array.size(); j++) {
							if (index == array.get(j).getNip()) {
								System.out.println(
										index + " - " + array.get(j).getNombre() + " " + array.get(j).getApellidos());
							}
						}
					}
				}
			}
			if (!encontrado) {
				System.out.println("Código asignatura no existe");
			}
		} else if (orden[2].equalsIgnoreCase("A")) {
			for (int i = 0; i < asig.size(); i++) {
				if (orden[1].equalsIgnoreCase(asig.get(i).getCodAsignatura() + "")) {
					encontrado = true;
					System.out.println("Alumno encontrado. Asignaturas mariculadas alfabeticamente: ");
					System.out.println("--------------------------------------------");
					ArrayList<Integer> nips = asig.get(i).getCodAlumnos();
					ArrayList<String> names = new ArrayList<String>();
					for (Integer index : nips) {
						for (int j = 0; j < array.size(); j++) {
							if (index == array.get(j).getNip()) {
								names.add(array.get(j).getNombre() + " " + array.get(j).getApellidos() + " - " + index);
							}
						}
					}
					Collections.sort(names);
					for (String s : names) {
						System.out.println(s);
					}
				}
			}
			if (!encontrado) {
				System.out.println("Código asignatura no existe");
			}
		} 

	}

	/**
	 * Para la opción del comando asignaturas.
	 * 
	 * @param array
	 * @param asig
	 * @param orden
	 */
	public static void asignaturas(ArrayList<Alumno> array, ArrayList<Asignaturas> asig, String[] orden) {
//		Asignaturas nip [A | C]
//			Presenta la lista de asignaturas en las que se encuentra matriculado el alumno cuyo NIP es igual a nip.
//			Si al final de la orden se hace constar la letra A, el listado de asignaturas es presentado en orden
//			alfabético. Si se hace constar la letra C o no se hace constar ninguna letra el listado de asignaturas es
//			presentado en orden de valores de código de asignatura creciente.
		boolean encontrado = false;
		boolean parametros = false;
		// Si está sin parámetros
		if (orden.length == 1) {
			System.out.println("Faltan parámetros");
		} else {
			// si no le llega ningun otro comando o le llega una C
			if (orden.length < 3 || orden[2].equalsIgnoreCase("C")) {
				for (int i = 0; i < array.size(); i++) {
					if (orden[1].equalsIgnoreCase(array.get(i).getNip() + "")) {
						encontrado = true;
						System.out.println("Alumno encontrado. Asignaturas mariculadas por código: ");
						System.out.println("--------------------------------------------");
						ArrayList<Integer> matriculas = array.get(i).getMatriculaciones();
						Collections.sort(matriculas);
						for (Integer index : matriculas) {
							for (int j = 0; j < asig.size(); j++) {
								if (index == asig.get(j).getCodAsignatura()) {
									System.out.println(index + " - " + asig.get(j).getNombre());
								}
							}
						}
					}
				}
				if (!encontrado) {
					System.out.println("NIP no existe");
				}
			} else if (orden[2].equalsIgnoreCase("A")) {
				for (int i = 0; i < array.size(); i++) {
					if (orden[1].equalsIgnoreCase(array.get(i).getNip() + "")) {
						encontrado = true;
						System.out.println("Alumno encontrado. Asignaturas mariculadas alfabeticamente: ");
						System.out.println("--------------------------------------------");
						ArrayList<Integer> matriculas = array.get(i).getMatriculaciones();
						ArrayList<String> name_matriculas = new ArrayList<String>();
						for (Integer index : matriculas) {
							for (int j = 0; j < asig.size(); j++) {
								if (index == asig.get(j).getCodAsignatura()) {
									name_matriculas.add(asig.get(j).getNombre() + " - " + index);
								}
							}
						}
						Collections.sort(name_matriculas);
						for (String s : name_matriculas) {
							System.out.println(s);
						}
					}
				}
				if (!encontrado) {
					System.out.println("NIP no existe");
				}
			} else if (!orden[2].equalsIgnoreCase("A")) {
				System.out.println("Parámetro no encontrado");
			}

		}
	}

	public static void actualizarAsignaturas(ArrayList<Asignaturas> asigna, ArrayList<Matricula> matric) {
		for (int i = 0; i < asigna.size(); i++) {
			ArrayList<Integer> nuevos = new ArrayList<Integer>();
			asigna.get(i).setCodAlumnos(nuevos);
			int cont = 0;
			for (int j = 0; j < matric.size(); j++) {
				if (asigna.get(i).getCodAsignatura() == matric.get(j).getCod()) {
					nuevos.add(matric.get(j).getNip());
				}
			}
			asigna.get(i).setCodAlumnos(nuevos);
			// asigna.get(i).setNumAlumnos(cont);
		}
	}

	public static void actualizarAlumnos(ArrayList<Alumno> datos_alumnos, ArrayList<Matricula> datos_matriculas) {
		for (int i = 0; i < datos_alumnos.size(); i++) {
			ArrayList<Integer> nuevos = new ArrayList<Integer>();
			datos_alumnos.get(i).setMatriculaciones(nuevos);
			for (int j = 0; j < datos_matriculas.size(); j++) {
				if (datos_alumnos.get(i).getNip() == datos_matriculas.get(j).getNip()) {
					nuevos.add(datos_matriculas.get(j).getCod());
					// datos_alumnos.get(i).setMatriculaciones(datos_matriculas.get(j).getCod());
				}
			}
			datos_alumnos.get(i).setMatriculaciones(nuevos);
		}
	}

	public static void matriculas(ArrayList<Matricula> matric, ArrayList<Asignaturas> asigna) {
		System.out.println("-----------Asignaturas y sus alumnos-----------");
		System.out.println("-----------------------------------------------");
		for (int i = 0; i < asigna.size(); i++) {
			System.out.printf("%-43s %d %n", asigna.get(i).getNombre(), asigna.get(i).getCodAlumnos().size());
		}
	}

	/**
	 * matricular(comando_s, datos_alumnos, datos_asignaturas, datos_matriculas);
	 * 
	 * @param comando
	 * @param matric
	 */
	public static void matricular(String[] comando, ArrayList<Alumno> datos_alumnos, ArrayList<Asignaturas> asigna,
			ArrayList<Matricula> matric) {
//		//orden de añadir.
//		Matricular nip código { código }
//		o En el caso de que el NIP corresponda a un alumno de la titulación, procede a añadir la matcula de las
//		asignaturas cuyo código figura en la lista de códigos, siempre y cuando no estuviera ya matriculado
//		en ellas. El programa informa al operador, mediante un mensaje, que el alumno ha sido matriculado
//		en un número determinado de asignaturas.
		if (comando.length == 1) {
			System.out.println("Faltan parámetros");
		} else {
			int index = comprobarNip(datos_alumnos, comando[1]);
			if (index != -1) {
				// Añadir una matriculacion.
				for (int i = 2; i < comando.length; i++) {
					if (comprobarCodAsig(asigna, comando[i])) {
						// Meterlo al arvhivo con toda la info
						ArrayList<Integer> matriculas = datos_alumnos.get(index).getMatriculaciones();
						// FALTA EN EL CASO DE QUE YA EXISTA ESA MATRICULACION
						boolean esta = false;
						for (int j = 0; j < matriculas.size(); j++) {
							if (matriculas.get(j) == Integer.parseInt(comando[i])) {
								esta = true;
								break;
							}
						}
						if (!esta) {
							Matricula nuevo = new Matricula(Integer.parseInt(comando[1]), Integer.parseInt(comando[i]));
							matric.add(nuevo);
//							datos_alumnos.get(index)
							System.out.println("Añadido matriculación " + comando[i]);
							// Si añade lo actualiza.
							actualizarAsignaturas(asigna, matric);
							actualizarAlumnos(datos_alumnos, matric);
						} else {
							System.out.println("Ya está matriculado.");
						}
					} else {
						System.out.println("CodAsignatura no válido.");
					}
				}
			} else {
				System.out.println("No existe ese NIP de alumno");
			}
		}

	}

	public static void eliminar(String[] comando, ArrayList<Alumno> datos_alumnos, ArrayList<Asignaturas> asigna,
			ArrayList<Matricula> matric, Scanner in) {
//		En el caso de que la lista de códigos no esté vacía, entonces elimina del fichero de matrículas las
//		matrículas del alumno cuyo NIP es igual a nip en las asignaturas cuyos códigos se especifican en la
//		lista. En el caso de que la lista de códigos esté vacía entonces elimina del fichero de matrículas todas
//		las asignaturas en las que estuviera matriculado el alumno cuyo NIP es igual a nip. El programa informa
//		al operador, mediante un mensaje, que ha eliminado las asignaturas especificadas o, en su caso, que
//		ha eliminado todas las asignaturas matriculadas por el alumno.
//		Scanner entrada = new Scanner(System.in);
		if (comando.length == 1) {
			System.out.println("Faltan parámetros");
		} else {
			int index = comprobarNip(datos_alumnos, comando[1]);
			if (index != -1) {
				if (comando.length == 2) {
					// Elimina TODAS las asignaturas de ese alumnos.
					System.out.println("¿Estás seguro de eliminar todas matriculaciones del alumno "
							+ datos_alumnos.get(index).getNombre() + "? (s/n)");
					String respuesta = in.next();
					if (respuesta.equalsIgnoreCase("s")) {
						// Dejo en blanco el arraylist de sus matriculaciones,
						// Y elimino las del archivo de matriculaciones.
						datos_alumnos.get(index).setMatriculaciones(null);
						int matric_totales = matric.size();
						// iterator para ir eliminado de las matriculaciones
						Iterator<Matricula> itr = matric.iterator();
						while (itr.hasNext()) {
							Matricula elim = itr.next();
							if (elim.getNip() == datos_alumnos.get(index).getNip()) {
								itr.remove();
							}
						}
						System.out.println(
								"En total se han eliminado " + (matric_totales - matric.size()) + " matriculaciones.");
						actualizarAsignaturas(asigna, matric);
						actualizarAlumnos(datos_alumnos, matric);
					}
				} else {
					for (int i = 2; i < comando.length; i++) {
						if (comprobarCodAsig(asigna, comando[i])) {
							boolean esta = false;
							Iterator<Matricula> itr = matric.iterator();
							while (itr.hasNext()) {
								Matricula elim = itr.next();
								if (elim.getNip() == datos_alumnos.get(index).getNip()
										&& comando[i].equalsIgnoreCase(elim.getCod() + "")) {
									System.out.println("MAriculación eliminada");
									esta = true;
									itr.remove();
								}
							}
							if (!esta) {
								System.out.println("No está matriculado de esa asignatura.");
							}
							actualizarAsignaturas(asigna, matric);
							actualizarAlumnos(datos_alumnos, matric);
						} else {
							System.out.println("Código asignatura no válido");
						}
					}
				}
			}
		}
//		entrada.close();
	}

	public static boolean comprobarCodAsig(ArrayList<Asignaturas> asignaturas, String cod) {
		for (int i = 0; i < asignaturas.size(); i++) {
			if (asignaturas.get(i).getCodAsignatura() == Integer.parseInt(cod)) {
				return true;
			}
		}
		return false;
	}

	public static int comprobarNip(ArrayList<Alumno> alumnos, String nip) {
		for (int i = 0; i < alumnos.size(); i++) {
			if (alumnos.get(i).getNip() == Integer.parseInt(nip)) {
				return i;
			}
		}
		return -1;
	}

	/**
	 * Lee un ".txt" con los códigos de las asignaturas y los almacena en un
	 * ArayList de la clase Asignaturas.
	 * 
	 * @param ruta
	 */
	public static void leerAsignaturas(String ruta, ArrayList<Asignaturas> array) {
		try {
			Scanner in = new Scanner(new File(ruta));
			while (in.hasNextLine()) {
				String linea = in.nextLine();
				String[] linea_s = linea.split(" ");
				String nombre = linea_s[4];
				for (int i = 5; i < linea_s.length; i++) {
					nombre += " " + linea_s[i];
				}
				nombre = nombre.trim();
//				System.out.println(nombre);
				Asignaturas nueva = new Asignaturas(Integer.parseInt(linea_s[0]), Double.parseDouble(linea_s[1]),
						Integer.parseInt(linea_s[2]), linea_s[3], nombre);
				array.add(nueva);
			}
			in.close();
		} catch (FileNotFoundException e) {
			System.out.println("Archivo no encontrado");
		}
	}

	public static void leerAlumnos(String ruta, ArrayList<Alumno> array) {
		try {
			Scanner in = new Scanner(new File(ruta));
			int cont = 0;
			while (in.hasNextLine()) {
				String linea = in.nextLine();
				if (cont > 0) {
					String[] linea_s = linea.split(";");
					Alumno nuevo = new Alumno(Integer.parseInt(linea_s[0]), (linea_s[2]), (linea_s[1]));
					array.add(nuevo);
				}
				cont++;
			}
			in.close();
		} catch (FileNotFoundException e) {
			System.out.println("Archivo no encontrado");
		}

	}

	public static void leerMatriculas(String ruta, ArrayList<Matricula> array) {
		try {
			RandomAccessFile in = new RandomAccessFile(ruta, "r");
			try {
				while (true) {
					int nip = in.readInt();
					int cod = in.readInt();
					array.add(new Matricula(nip, cod));
				}
			} catch (EOFException e) {
			}
			in.close();
		} catch (FileNotFoundException e) {
			System.out.println("Fichero no encontrado");
		} catch (IOException e) {
			System.out.println("Error en la lectura o escritura del fichero");
		}

	}

}
