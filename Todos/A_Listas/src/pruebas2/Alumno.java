package pruebas2;

import java.util.ArrayList;
import java.util.Collections;

public class Alumno {
	private int					nip;					// El nip del alumno
	private String				apellido;				// Apellido del alumno.
	private String				nombre;					// Nombre del alumno
	private ArrayList<Integer>	asignaturasCursadas;	// Asignaturas que cursa.

	/**
	 * Constructor
	 * 
	 * @param nip
	 * @param apellido
	 * @param nombre
	 */
	public Alumno(int nip, String apellido, String nombre) {
		this.nip = nip;
		this.apellido = apellido;
		this.nombre = nombre;
		asignaturasCursadas = new ArrayList<Integer>();
	}

	/**
	 * Añade al atributo de las matriculas del alumno una nueva matrícula.
	 * 
	 * @param asig
	 */
	public void introducirAsignatura(int asig) {
		asignaturasCursadas.add(asig);
	}

	/**
	 * Elimina la asignatura que le llega como parámetro del arraylist
	 * 
	 * @param asig
	 */
	public void eliminarAsignatura(int asig) {
		int index = 0;
		for (int i = 0; i < asignaturasCursadas.size(); i++) {
			if (asignaturasCursadas.get(i) == asig) {
				index = i;
				break;
			}
		}
		asignaturasCursadas.remove(index);
	}

	/**
	 * Método que recibe un ArrayList de las asignaturas. Recorre las asignaturas
	 * que tiene el alumno, y si coincide con alguna de la lista de asignaturas, las
	 * muestra por pantalla con orden del código.
	 * 
	 * @param asignaturas
	 */
	public void mostrarAsignaturasCod(ArrayList<Asignatura> asignaturas) {
		// Copia del array para no modificar el del objeto.
		ArrayList<Integer> matriculas = asignaturasCursadas;
		// Si no tiene ninguna:
		if (matriculas.size() == 0) {
			System.out.println("No está matriculado/a en ninguna asignatura");
			return;
		}
		// Ordena el array por los codigos int.
		Collections.sort(matriculas);
		for (int i = 0; i < matriculas.size(); i++) {
			for (int j = 0; j < asignaturas.size(); j++) {
				if (matriculas.get(i) == asignaturas.get(j).getCodAsig()) {
					System.out.println(matriculas.get(i) + " - " + asignaturas.get(j).getNombre());
				}
			}
		}
	}

	/**
	 * Método que recibe un ArrayList de las asignaturas, Recorre las asignaturas
	 * que tiene el alumno, y si coincide con alguna de la lista de asignaturas, las
	 * muestra por pantalla por orden alfabético del nombre.
	 * 
	 * @param asignaturas
	 */
	public void mostrarAsignaturasNombre(ArrayList<Asignatura> asignaturas) {
		// Copia del array para no modificar el del objeto.
		ArrayList<Integer> matriculas = asignaturasCursadas;
		if (matriculas.size() == 0) {
			System.out.println("No está matriculado/a en ninguna asignatura");
			return;
		}
		ArrayList<String> nombres = new ArrayList<String>();
		for (int i = 0; i < matriculas.size(); i++) {
			for (int j = 0; j < asignaturas.size(); j++) {
				if (matriculas.get(i) == asignaturas.get(j).getCodAsig()) {
					nombres.add(asignaturas.get(j).getNombre() + " - " + asignaturas.get(j).getCodAsig());
				}
			}
		}
		// Ordenar orden alfabético un array de Strings.
		Collections.sort(nombres);
		for (int i = 0; i < nombres.size(); i++) {
			System.out.println(nombres.get(i));
		}
	}

	@Override
	/*
	 * Método toString() sobrescrito.
	 */
	public String toString() {
		return "Alumno [nip=" + nip + ", apellido=" + apellido + ", nombre=" + nombre + "] "
				+ asignaturasCursadas.size();
	}

	/**
	 * Getter del arraylist de asignaturas.
	 * 
	 * @return
	 */
	public ArrayList<Integer> getAsignaturas() {
		return asignaturasCursadas;
	}

	/**
	 * Setter del arraylist de asignaturas
	 * 
	 * @param asignaturas
	 */
	public void setAsignaturas(ArrayList<Integer> asignaturas) {
		this.asignaturasCursadas = asignaturas;
	}

	/**
	 * Getter del nip.
	 * 
	 * @return
	 */
	public int getNip() {
		return nip;
	}

	/**
	 * Setter del nip
	 * 
	 * @param nip
	 */
	public void setNip(int nip) {
		this.nip = nip;
	}

	/**
	 * Getter de los apellidos
	 * 
	 * @return
	 */
	public String getApellido() {
		return apellido;
	}

	/**
	 * Setter del apellido.
	 * 
	 * @param apellido
	 */
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	/**
	 * Getter del nombre.
	 * 
	 * @return
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * Setter del nombre
	 * 
	 * @param nombre
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

}
