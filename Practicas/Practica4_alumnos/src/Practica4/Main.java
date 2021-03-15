package Practica4;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// Creo el ArrayList de Alumno.
		ArrayList<Alumno> alumnos = new ArrayList<Alumno>();
		leerFicheroAlumnos_csv(alumnos, "files/alumnos.csv");
		// Código debugger para visualizar los alumnos del fichero.
//		for (Alumno a : alumnos) {
//			System.out.println(a.toString());
//		}
//		System.out.println("------------------");
		// Creo el ArrayList de Asignatura.
		ArrayList<Asignatura> asignaturas = new ArrayList<Asignatura>();
		leerFicheroAsignaturas_txt(asignaturas, "files/asignaturas.txt");
		// Código debugger para visualizar las asignaturas del fichero.
//		for (Asignatura as : asignaturas) {
//			System.out.println(as.toString());
//		}
//		System.out.println("------------------");
		// Creo el ArrayList de Matricula.
		ArrayList<Matricula> matriculas = new ArrayList<Matricula>();
		String rutaMatriculas = "files/matriculas.dat";
		leerFicheroMatriculas_dat(matriculas, rutaMatriculas);
		// Código debugger para visualizar las matriculas del fichero.
//		for (Matricula an : matriculas) {
//			System.out.println(an.toString());
//		}
//		System.out.println("------------------");
		/*
		 * LLama al método para añadir las matriculas de los alumnos y a su vez los
		 * respectivos alumnos matriculados en las asignaturas.
		 */
		actualizarAlumnos(alumnos, matriculas);
		actualizarAsignaturas(asignaturas, matriculas);
		Scanner in = new Scanner(System.in);
		String respuesta = "0";
		System.out.println("Orden>");
		respuesta = in.nextLine();
		while (!respuesta.equalsIgnoreCase("fin")) {
			// Casos de uso:
			if (respuesta.equalsIgnoreCase("Matriculas")) {
				for (Asignatura i : asignaturas) {
					System.out.println(
							i.getCodAsig() + " - " + i.getNombre() + ". Total alumnos: " + i.getAlumnCurs().size());
				}
			} else if (respuesta.equalsIgnoreCase("Actualizar")) {
				actualizarArchivoMatriculas(matriculas, rutaMatriculas);
			} else {
				String[] respuestaEspac = respuesta.split(" ");
				if (respuestaEspac[0].equalsIgnoreCase("asignaturas")) {
					// LLama al método de mostrar las asignaturas del alumno si le llega
					// más de un parámetro.
					if (respuestaEspac.length == 1) {
						System.out.println("Debe indicar el nip.");
					} else {
						mostrarAsignaturasDeAlumno(respuestaEspac, alumnos, asignaturas);
					}
				} else if (respuestaEspac[0].equalsIgnoreCase("alumnos")) {
					// LLama al método de mostrar los alumnos de una asignatura si le llega
					// más de un parámetro.
					if (respuestaEspac.length == 1) {
						System.out.println("Debe indicar el Cod Asignatura.");
					} else {
						mostrarAlumnosDeAsignatura(respuestaEspac, alumnos, asignaturas);
					}
				} else if (respuestaEspac[0].equalsIgnoreCase("matricular")) {
					// LLama al método de matricular una asignatura nueva a un alumno si le llega
					// más de un parámetro.
					if (respuestaEspac.length == 1) {
						System.out.println("Debe indicar el NIP para matricular.");
					} else {
						matricularAsignatura(respuestaEspac, alumnos, asignaturas, matriculas);
					}
				} else if (respuestaEspac[0].equalsIgnoreCase("eliminar")) {
					// LLama al método de eliminar una asignatura a un alumno si le llega
					// más de un parámetro.
					if (respuestaEspac.length == 1) {
						System.out.println("Debe indicar el nip.");
					} else {
						eliminarAsignatura(respuestaEspac, alumnos, asignaturas, matriculas, in);
					}
				} else {
					// Si no coindice con ningun caso de uso:
					System.out.println("Se desconoce la orden introducida.");
				}
			}
			System.out.println("Orden>");
			respuesta = in.nextLine();
		}
		//Cuando finaliza actualiza el archivo binario automáticamente.
		actualizarArchivoMatriculas(matriculas, rutaMatriculas);
		System.out.println("Has finalizado el programa.");
		System.out.println("¿Mostrar resumen de alumnos? (s/n)");
		String resumen = in.next();
		if (resumen.equalsIgnoreCase("s")) {
			System.out.println("Total alumnos: " + alumnos.size() + "\n");
			for (Alumno a : alumnos) {
				System.out.println(a.getNip() + " - " + a.getNombre() + " " + a.getApellido());
				System.out.println("----------------------------------");
				a.mostrarAsignaturasCod(asignaturas);
				System.out.println();
			}
		}
		in.close();
	}

	/**
	 * Método que recibe un ArrayList de alumno para escribir La información que va
	 * a leer de un .csv.
	 * 
	 * @param alumnos -> Array donde se almacenará la información
	 * @param ruta    -> Ruta del archivo .csv donde están los datos de los alumnos.
	 */
	public static void leerFicheroAlumnos_csv(ArrayList<Alumno> alumnos, String ruta) {
		// Leemos el fichero .csv
		try {
			Scanner in = new Scanner(new File(ruta));
			int cont = 0;
			// Mientras haya siguiente línea...
			while (in.hasNextLine()) {
				String linea = in.nextLine();
				// Eliminamos la primera línea que no necesitamos.
				if (cont > 0) {
					// Hacemos un split por ";"
					String[] separado = linea.split(";");
					// Pasamos el int a string (nip)
					Alumno alumno1 = new Alumno(Integer.parseInt(separado[0]), separado[1], separado[2]);
					// Añadimos un nuevo alumno.
					alumnos.add(alumno1);
				}
				cont++;
			}
			in.close();
		} catch (FileNotFoundException e) {
			System.out.println("La ruta para leer alumnos no es correcta.");
		}
	}

	/**
	 * Método que recibe un ArrayList de asignaturas para escribir La información
	 * que va a leer de un .txt.
	 * 
	 * @param asignaturas -> Array donde se almacenará la información.
	 * @param ruta        -> Ruta del archivo .txt que va a ser leído.
	 */
	public static void leerFicheroAsignaturas_txt(ArrayList<Asignatura> asignaturas, String ruta) {
		// Leemos el fichero .txt
		try {
			Scanner in = new Scanner(new File(ruta));
			// Mientras haya siguiente línea...
			while (in.hasNextLine()) {
				String linea = in.nextLine();
				// Hacemos el split.
				String[] separado = linea.split(" ");
				// Almacenamos en la posición 4 las varias palabras del nombre de la asignatura.
				String nombre = separado[4];
				for (int i = 5; i < separado.length; i++) {
					nombre = nombre + " " + separado[i];
				}
				// Pasamos a lo que corresponda.
				Asignatura asignatura1 = new Asignatura(Integer.parseInt(separado[0]), Double.parseDouble(separado[1]),
						Integer.parseInt(separado[2]), separado[3], nombre);
				asignaturas.add(asignatura1);
			}
			in.close();
		} catch (FileNotFoundException e) {
			System.out.println("La ruta para leer asignaturas no es correcta.");
		}

	}

	/**
	 * Método que recibe un ArrayList de matrículas para escribir La información que
	 * va a leer de un .dat.
	 * 
	 * @param matriculas -> el Array en el que se va a almacenar la info.
	 * @param ruta       -> ruta del fichero que se va a leer
	 */
	public static void leerFicheroMatriculas_dat(ArrayList<Matricula> matriculas, String ruta) {
		// Leemos el fichero .dat (bin)
		try {
			DataInputStream f = new DataInputStream(new FileInputStream(ruta));
			try {
				while (true) {
					int idAlumno = f.readInt();
					int codAsig = f.readInt();
					// Pasamos a lo que corresponda.
					Matricula matricula1 = new Matricula(idAlumno, codAsig);
					matriculas.add(matricula1);
				}
			} catch (EOFException e) {}
			f.close();
		} catch (FileNotFoundException e) {
			System.out.println("La ruta para leer mariculas no es correcta.");
		} catch (IOException e) {
			System.out.println("Fallo al leer el archivo.");
		}

	}

	/**
	 * Método que actualiza el campo del ArrayList de Asignaturas matriculadas que
	 * tiene cada alumno, leyendo los datos del Array de las matrículas del
	 * programa.
	 * 
	 * @param alumnos    -> ArrayList que va a ser actualizado con los datos.
	 * @param matriculas -> ArrayList donde se va a leer las matrículas para
	 *                   añadirlas.
	 */
	public static void actualizarAlumnos(ArrayList<Alumno> alumnos, ArrayList<Matricula> matriculas) {
		// Recorre todos los alumnos.
		for (int i = 0; i < alumnos.size(); i++) {
			// Creamos un ArrayList de Integer vacío para añadir las matrículas.
			ArrayList<Integer> aux = new ArrayList<Integer>(); // Almacena los id de alumnos.
			// Se añade el vacío siempre primero para sobreescribir lo que había
			// anteriormente.
			alumnos.get(i).setAsignaturas(aux);
			// Se recorren los pares matrícula-NIP alumno
			for (int j = 0; j < matriculas.size(); j++) {
				// Si coincide el NIP(i) con el NIP(j) se añade al array de Alumnos
				if (alumnos.get(i).getNip() == matriculas.get(j).getIdAlumno()) {
					aux.add(matriculas.get(j).getCodAsig());
					// Código de asignatura será el int que se guarde
				}
			}
			// Por último a ese alumno le aplicamos con el setter ese ArrayList.
			alumnos.get(i).setAsignaturas(aux);
		}
//		System.out.println("He actualizado alumnos");
	}

	/**
	 * Método que actualiza el campo del ArrayList de Alumnos matriculadas que tiene
	 * cada asignatura, leyendo los datos del Array de las matrículas del programa.
	 * 
	 * @param asignaturas -> el Array en el que se va a almacenar la info.
	 * @param matriculas  -> ArrayList donde se va a leer los NIP de los alumnos
	 *                    para añadirlos.
	 */
	public static void actualizarAsignaturas(ArrayList<Asignatura> asignaturas, ArrayList<Matricula> matriculas) {
		// Recorre las asignaturas
		for (int i = 0; i < asignaturas.size(); i++) {
			// Almacena los id de alumnos matriculados en cada asignatura.
			ArrayList<Integer> aux = new ArrayList<Integer>();
			// Se añade el vacío siempre primero para sobreescribir lo que había
			// anteriormente.
			asignaturas.get(i).setAlumnCurs(aux);
			// Se recorren las matrículas
			for (int j = 0; j < matriculas.size(); j++) {
				// si coincide el cod de asignaturas(i) se añade el nip de esa matrícula(j) al
				// ArrayList.
				if (asignaturas.get(i).getCodAsig() == matriculas.get(j).getCodAsig()) {
					aux.add(matriculas.get(j).getIdAlumno());
				}
			}
			// Por último a ese alumno le aplicamos con el setter ese ArrayList.
			asignaturas.get(i).setAlumnCurs(aux);
		}
//		System.out.println("He actualizado asignaturas");
	}

	/**
	 * Método que escribe un archivo binario, Como la ruta va a ser la misma en el
	 * programa va a sobrescribir con los datos que hayan resutlado de la
	 * manipulacion del ArrayList de matrículas.
	 * 
	 * @param matriculas -> ArrayList que va a ser transformado a binario.
	 * @param ruta       -> ruta donde se va a guardar el binario. Por defecto es el
	 *                   que se ha creado.
	 */
	public static void actualizarArchivoMatriculas(ArrayList<Matricula> matriculas, String ruta) {
		try {
			DataOutputStream f = new DataOutputStream(new FileOutputStream(ruta));
			// En caso de que no hubiese ninguna matrícula.
			if (matriculas.size() == 0) {
				f.writeInt(0);
				f.writeInt(0);
			} else {
				// Recorre las matrículas y las va escribiendo en pares de int.
				for (Matricula matricula : matriculas) {
					f.writeInt(matricula.getIdAlumno());
					f.writeInt(matricula.getCodAsig());
				}
			}
			System.out.println("Matriculas actualizadas correctamente.");
			// Cerrar fichero
			f.close();
		} catch (FileNotFoundException e) {
			System.out.println("El fichero no ha podido ser abierto");
		} catch (IOException e) {
			System.out.println("Error en operación de E/S con el fichero ");
		}

	}

	/**
	 * Muestra las asignaturas en las que está matriculado un alumno, le pasamos las
	 * listas para comprobar, y el comando que introduce el usuario con el nip.
	 * 
	 * @param respuestaEspac -> Comando escrito por el usuario.
	 * @param alumnos        -> Lista con todos los alumnos.
	 * @param asignaturas    -> Lista con las asignaturas.
	 */
	public static void mostrarAsignaturasDeAlumno(String[] respuestaEspac, ArrayList<Alumno> alumnos,
			ArrayList<Asignatura> asignaturas) {
		// comprobamos si existe ese NIP con el método.
		int index = comprobarExistenciaAlumno(alumnos, respuestaEspac[1]);
		// Si ha devuelto un -1 significa que no existe el nip y sale del método.
		if (index == -1) {
			System.out.println("No existe el NIP");
			return;
		}
		if (respuestaEspac.length < 3 || respuestaEspac[2].equalsIgnoreCase("C")) {
			// LLama al metodo de la clase alumno que muestra las asignaturas matriculadas.
			alumnos.get(index).mostrarAsignaturasCod(asignaturas);
		} else if (respuestaEspac[2].equalsIgnoreCase("A")) {
			// LLama al metodo de la clase alumno que muestra las asignaturas matriculadas
			// por orden alfabético.
			alumnos.get(index).mostrarAsignaturasNombre(asignaturas);
		} else {
			System.out.println("La orden no existe");
		}

	}

	/**
	 * Muestra los alumnos que están matriculados en una asignaturas que le pasa el
	 * usuario por comandos
	 * 
	 * @param respuestaEspac -> Comando escrito por el usuario.
	 * @param alumnos        -> Lista con todos los alumnos.
	 * @param asignaturas    -> Lista con las asignaturas.
	 */
	public static void mostrarAlumnosDeAsignatura(String[] respuestaEspac, ArrayList<Alumno> alumnos,
			ArrayList<Asignatura> asignaturas) {
		// Comprobamos si existe el cod de asignatura introducido con el método.
		int index = comprobarExistenciaAsignatura(asignaturas, respuestaEspac[1]);
		// Si no existiese devuelve un -1, finalizaría el método.
		if (index == -1) {
			System.out.println("No existe el código");
			return;
		}
		if (respuestaEspac.length < 3 || respuestaEspac[2].equalsIgnoreCase("N")) {
			// LLama al método de la clase asignatura que meustra los alumnos por orden nip.
			asignaturas.get(index).mostrarAlumnosMatriculadosNip(alumnos);
		} else if (respuestaEspac[2].equalsIgnoreCase("A")) {
			// LLama al método de la clase asignatura que meustra los alumnos por orden
			// nombre.
			asignaturas.get(index).mostrarAlumnosMatriculadosNombre(alumnos);
		} else {
			System.out.println("La orden no existe");
		}
	}

	/**
	 * Método para añadir una mátricula en el ArrayList de matrículas.
	 * 
	 * @param respuestaEspac -> Donde estará indicado el NIP y la matrícula a añadir
	 * @param alumnos        -> ArrayList de los alumnos.
	 * @param asignaturas    -> ArrayList de las asignaturas
	 * @param matriculas     -> ArrayList de las matrículas.
	 */
	public static void matricularAsignatura(String[] respuestaEspac, ArrayList<Alumno> alumnos,
			ArrayList<Asignatura> asignaturas, ArrayList<Matricula> matriculas) {
		// Primero con el metodo comprobamos si existe el alumno.
		int index = comprobarExistenciaAlumno(alumnos, respuestaEspac[1]);
		// Si no existe el alumno sale del método.
		if (index == -1) {
			System.out.println("No existe el NIP");
			return;
		}
		// Si no ha introducido más valores sale del método.
		if (respuestaEspac.length < 3) {
			System.out.println("Falta código para matricular");
			return;
		}
		// Recorre las posiciones del split del comando introducido.
		for (int i = 2; i < respuestaEspac.length; i++) {
			// Si el metodo deuelve -1 es que no existe la asignatura que está intentando
			// matricular.
			int index_asignatura = comprobarExistenciaAsignatura(asignaturas, respuestaEspac[i]);
			if (index_asignatura == -1) {
				System.out.println("El código " + respuestaEspac[i] + " no corresponde a ninguna asignatura.");
			} else {
				// Comprueba con el método si ese alumno ya está matriculado de esa que se
				// pretende añadir.
				if (comprobarMatricula(matriculas, alumnos, respuestaEspac[i], index) != -1) {
					System.out.println("El alumno ya está matriculado en " + respuestaEspac[i]);
				} else {
					// Si todas las demas condiciones no se dan,
					// Añade al ArrayList de matriculas una nueva matrícula
					// con los parámetros introducidos por el usuario.
					matriculas.add(new Matricula(alumnos.get(index).getNip(), Integer.parseInt(respuestaEspac[i])));
					// A continuación llamamos a los métodos de actualizan las matrículas.
					alumnos.get(index).introducirAsignatura(Integer.parseInt(respuestaEspac[i]));
					asignaturas.get(index_asignatura).introducirAlumno(alumnos.get(index).getNip());
					// Mostramos por pantalla
					System.out.println("El alumno: " + alumnos.get(index).getNombre() + " "
							+ alumnos.get(index).getApellido() + " ha sido matriculado correctamente en: "
							+ respuestaEspac[i] + " - " + asignaturas.get(index_asignatura).getNombre());
				}
			}
		}

	}

	/**
	 * Método para eliminar una matrícula del ArrayList de matrículas
	 * 
	 * @param respuestaEspac -> Donde estará indicado el NIP y la matrícula a
	 *                       eliminar.
	 * @param alumnos        -> ArrayList de los alumnos.
	 * @param asignaturas    -> ArrayList de las asignaturas.
	 * @param matriculas     -> ArrayList de las matrículas.
	 * @param in             -> objeto tipo Scanner.
	 */
	public static void eliminarAsignatura(String[] respuestaEspac, ArrayList<Alumno> alumnos,
			ArrayList<Asignatura> asignaturas, ArrayList<Matricula> matriculas, Scanner in) {
		// Se llama al método para comprobar si el nip introducido es válido.
		int index = comprobarExistenciaAlumno(alumnos, respuestaEspac[1]);
		// Si no existe el alumno devuelve -1 y se acaba el método.
		if (index == -1) {
			System.out.println("No existe el NIP");
			return;
		}
		// Si no introduce más parámetros se pasa a eliminar todas las matrículas:
		if (respuestaEspac.length < 3) {
			// Primero pregunta y resgistrta la comprobación del usuario para no eliminar
			// por error.
			System.out.println("¿Está seguro de eliminar todos las matriculaciones de " + alumnos.get(index).getNombre()
					+ " " + alumnos.get(index).getApellido() + "? (s/n)");
			String respuesta = in.next();
			// Si el usuario introduce "s", se eliminarán todas las matrículas.
			if (respuesta.equalsIgnoreCase("s")) {
				int numEliminadas = 0;
				// Se crea un objeto de la clase Iterator para recorrer el
				// ArrayList y a la vez poder ir borrando.
				Iterator<Matricula> iterator = matriculas.iterator();
				while (iterator.hasNext()) {
					Matricula eliminado = iterator.next();
					// Si coincide el NIP introducido con el NIP de la matrícula se elimina.
					if (eliminado.getIdAlumno() == alumnos.get(index).getNip()) {
						iterator.remove();
						numEliminadas++;
					}
				}
				System.out.println("Un total de " + numEliminadas + " matrículas han sido eliminadas");
				// Se actualizan los datos de nuestros ArrayList principales con la información.
				// Al alumno se le pone a 0 el arrayList de las asignaturas matriculadas.
				alumnos.get(index).setAsignaturas(new ArrayList<Integer>());
				actualizarAsignaturas(asignaturas, matriculas);
			}
			// Si elige "n", u otra cosa no sucede nada.
		} else {
			// Se recorre para cada elemento de la linea introducida por el usuario
			for (int i = 2; i < respuestaEspac.length; i++) {
				// Primero se comprueba si no existe el codigo introducido.
				int index_asignatura = comprobarExistenciaAsignatura(asignaturas, respuestaEspac[i]);
				if (index_asignatura == -1) {
					System.out.println("El código de la asignatura no existe");
				} else {
					// Se comprueba si existe la matriculación para poder eliminarla.
					int index_matricula = comprobarMatricula(matriculas, alumnos, respuestaEspac[i], index);
					if (index_matricula == -1) {
						System.out.println("El alumno no está matriculado en esa asignatura.");
					} else {
						// Elimina la matrícula del ArrayList donde tenemos toda la información.
						matriculas.remove(index_matricula);
						System.out
								.println("La matrícula: " + respuestaEspac[i] + " ha sido eliminado correctamente de: "
										+ alumnos.get(index).getNombre() + " " + alumnos.get(index).getApellido());
						// Actualiza los datos de nuestros ArrayList de información.
						alumnos.get(index).eliminarAsignatura(Integer.parseInt(respuestaEspac[i]));
						asignaturas.get(index_asignatura).eliminarAlumno(alumnos.get(index).getNip());
					}
				}
			}
		}
	}

	/**
	 * Método que comprueba si un String se corresponde con algún código de
	 * asignatura de nuestro ArrayList de asignaturas.
	 * 
	 * @param asignaturas -> ArrayList con la asignaturas.
	 * @param comando     -> String que se va a analizar.
	 * @return En caso de que exista, devuelve la posición del objeto en el
	 *         ArrayList.
	 */
	public static int comprobarExistenciaAsignatura(ArrayList<Asignatura> asignaturas, String comando) {
		int codAsignatura;
		// Se gestiona que el usuario haya introducido algo que no sea un int.
		try {
			codAsignatura = Integer.parseInt(comando);
		} catch (NumberFormatException e) {
			// Si llega introduce alguna letra en el código devuelve -1
			return -1;
		}
		for (int i = 0; i < asignaturas.size(); i++) {
			// Recorre las asignaturas y cuando encuentra una devuelve el índice.
			if (asignaturas.get(i).getCodAsig() == codAsignatura) {
				return i;
			}
		}
		// Si acaba de recorrer todas y no la encuentra devuelve un -1
		return -1;
	}

	/**
	 * Método que comprueba si un String se corresponde con algún NIP de alumno de
	 * nuestro ArrayList de alumnos.
	 * 
	 * @param alumnos -> ArraList con los alumnos.
	 * @param comando -> String que se va a analizar.
	 * @return En caso de que exista, devuelve la posicion del objeto en el
	 *         ArrayList.
	 */
	public static int comprobarExistenciaAlumno(ArrayList<Alumno> alumnos, String comando) {
		int nipAlumno;
		// Se gestiona un posible error en caso de que el usario
		// haya introducido letras y no solo números.
		try {
			nipAlumno = Integer.parseInt(comando);
		} catch (NumberFormatException e) {
			return -1;
		}
		// Recorre los alumnos y si existe ese nip devuelve la posición.
		for (int i = 0; i < alumnos.size(); i++) {
			if (alumnos.get(i).getNip() == nipAlumno) {
				return i;
			}
		}
		// Si no lo encuentra devuelve -1.
		return -1;
	}

	/**
	 * Método que comprueba si un String se corresponde con alguna matrícula de
	 * nuestro ArrayList de matrículas.
	 * 
	 * @param matriculas  -> ArrayList donde tenemos la información de matrículas.
	 * @param alumnos     -> ArrayList con los alumnos.
	 * @param comando     -> Comando introducido por el usuario, Debe ser un CóDIGO
	 *                    asignatura.
	 * @param indexAlumno -> NIP que se está comparando que ya le llega como int
	 * @return Si existe la matriculacion, devuelve la posición en el ArrayList. Si
	 *         no existe duvuelve -1.
	 */
	public static int comprobarMatricula(ArrayList<Matricula> matriculas, ArrayList<Alumno> alumnos, String comando,
			int indexAlumno) {
		// Se gestiona con un try-catch que ha introducido un código.
		int codAsignatura;
		try {
			codAsignatura = Integer.parseInt(comando);
		} catch (NumberFormatException e) {
			return -1;
		}
		// Recorre las matrículas
		for (int i = 0; i < matriculas.size(); i++) {
			// Comprueba si el alumno ya está matriculado en la asignatura.
			// con los dos parámetros NIP && COD
			if ((matriculas.get(i).getCodAsig() == codAsignatura)
					&& (matriculas.get(i).getIdAlumno() == alumnos.get(indexAlumno).getNip())) {
				return i;
			}
		}
		// En caso de que no encuentre devuelve -1
		return -1;
	}
}
