package Practica4;

import java.util.ArrayList;
import java.util.Collections;

public class Asignatura {
	private int					codAsig;		// Código de la asignatura
	private double				creditos;		// Créditos de la asignatura
	private int					cuatrimestre;	// Cuatrismestre al que pertenece
	private String				tipo;			// Tipo de asignatura
	private String				nombre;			// Nombre de la asignatura
	private ArrayList<Integer>	alumnosCursan;	// Para almacenar los id de los alumnos de cada asignatura.

	/**
	 * Constructor
	 * 
	 * @param codAsig
	 * @param creditos
	 * @param cuatrimestre
	 * @param tipo
	 * @param nombre
	 */
	public Asignatura(int codAsig, double creditos, int cuatrimestre, String tipo, String nombre) {
		this.codAsig = codAsig;
		this.creditos = creditos;
		this.cuatrimestre = cuatrimestre;
		this.tipo = tipo;
		this.nombre = nombre;
		alumnosCursan = new ArrayList<Integer>();
	}

	/**
	 * Añade al ArrayList de los alumnos matriculados un nuevo alumno.
	 * 
	 * @param nip
	 */
	public void introducirAlumno(int nip) {
		alumnosCursan.add(nip);
	}

	/**
	 * Elimina el alumno que le llega como parámetro del ArrayList de alumnos
	 * 
	 * @param nip
	 */
	public void eliminarAlumno(int nip) {
		int index = 0;
		for (int i = 0; i < alumnosCursan.size(); i++) {
			if (alumnosCursan.get(i) == nip) {
				index = i;
				break;
			}
		}
		alumnosCursan.remove(index);
	}

	/**
	 * Método que recibe un ArrayList de los alumnos, Recorre los alumnos que tiene
	 * la asignatura, y si coincide con alguno de los alumnos, las muestra por
	 * pantalla con orden del NIP.
	 * 
	 * @param alumnos
	 */
	public void mostrarAlumnosMatriculadosNip(ArrayList<Alumno> alumnos) {
		// Copia del array para no modificar el del objeto.
		ArrayList<Integer> copyAlumnCurs = this.alumnosCursan;
		if (copyAlumnCurs.size() == 0) {
			System.out.println("No hay ningún alumno matriculado en la asignatura de " + nombre);
			return;
		}
		// Ordena por número.
		Collections.sort(copyAlumnCurs);
		for (int i = 0; i < copyAlumnCurs.size(); i++) {
			for (int j = 0; j < alumnos.size(); j++) {
				if (copyAlumnCurs.get(i) == alumnos.get(j).getNip()) {
					System.out.println(copyAlumnCurs.get(i) + " - " + alumnos.get(j).getNombre() + " "
							+ alumnos.get(j).getApellido());
				}
			}
		}
	}

	/**
	 * Método que recibe un ArrayList de los alumnos. Recorre los alumnos que tiene
	 * la asignatura, y si coincide con alguno de los alumnos, las muestra por
	 * pantalla con orden del nombre.
	 * 
	 * @param alumnos
	 */
	public void mostrarAlumnosMatriculadosNombre(ArrayList<Alumno> alumnos) {
		// Copia del array para no modificar el del objeto.
		ArrayList<Integer> copyAlumnCurs = this.alumnosCursan;
		ArrayList<String> nombres = new ArrayList<String>();
		if (copyAlumnCurs.size() == 0) {
			System.out.println("No hay ningún alumno matriculado en la asignatura de " + nombre);
			return;
		}
		for (int i = 0; i < copyAlumnCurs.size(); i++) {
			for (int j = 0; j < alumnos.size(); j++) {
				if (copyAlumnCurs.get(i) == alumnos.get(j).getNip()) {
					nombres.add(alumnos.get(j).getNombre() + " " + alumnos.get(j).getApellido() + " - "
							+ alumnos.get(j).getNip());
				}
			}
		}
		// Ordena por orden alfabético.
		Collections.sort(nombres);
		for (int i = 0; i < nombres.size(); i++) {
			System.out.println(nombres.get(i));
		}
	}

	@Override
	/**
	 * Método ToString() sobrescrito.
	 */
	public String toString() {
		return "Asignaturas [codAsig=" + codAsig + ", creditos=" + creditos + ", cuatrimestre=" + cuatrimestre
				+ ", tipo=" + tipo + ", nombre=" + nombre + "]";
	}

	/**
	 * Método getter de los alumnos que contiene una asignatura.
	 * 
	 * @return
	 */
	public ArrayList<Integer> getAlumnCurs() {
		return alumnosCursan;
	}

	/**
	 * Método setter de los alumnos de la asignatura.
	 * 
	 * @param alumnCurs -> Recibe un ArraList<Integer>
	 */
	public void setAlumnCurs(ArrayList<Integer> alumnCurs) {
		this.alumnosCursan = alumnCurs;
	}

	/**
	 * Getter del código asignatura.
	 * 
	 * @return
	 */
	public int getCodAsig() {
		return codAsig;
	}

	/**
	 * Setter del código de asignatura.
	 * 
	 * @param codAsig -> int del código.
	 */
	public void setCodAsig(int codAsig) {
		this.codAsig = codAsig;
	}

	/**
	 * Getter del nombre de la asignatura
	 * 
	 * @return
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * setter del nombre de la asignatura.
	 * 
	 * @param nombre
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

}
