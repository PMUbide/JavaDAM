package EdurneVersion;

import java.util.ArrayList;
import java.util.Collections;

public class Asignatura {
	private int					codAsig;	//Código de la asignatura
	private double				creditos;	//Creditos de la asignatura
	private int					cuatrimestre; //Cuatrismestre al que pertenece
	private String				tipo;		//Tipo de asignatura
	private String				nombre;		//Nombre de la asignatura
	private ArrayList<Integer>	alumnCurs;	// Para almacenar los id de los alumnos de cada asignatura.

	/**
	 * Constructor
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
		alumnCurs = new ArrayList<Integer>();
	}

	/**
	 * Método que recibe un ArrayList de los alumnos,
	 * Recorre los alumnos que tiene la asignatura, y si coincide con
	 * alguno de los alumnos, las muestra por pantalla con orden
	 * del NIP.
	 * @param alumnos
	 */
	public void mostrarAlumnosMatriculadosNip(ArrayList<Alumno> alumnos) {
		// Copia del array para no modificar el del objeto.
		ArrayList<Integer> copyAlumnCurs = this.alumnCurs;
		if (copyAlumnCurs.size() == 0) {
			System.out.println("No hay ningún alumno matriculado en la asignatura de " + nombre);
			return;
		}
		// Ordena por numero.
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
	 * Método que recibe un ArrayList de los alumnos,
	 * Recorre los alumnos que tiene la asignatura, y si coincide con
	 * alguno de los alumnos, las muestra por pantalla con orden
	 * del nombre.
	 * @param alumnos
	 */
	public void mostrarAlumnosMatriculadosNombre(ArrayList<Alumno> alumnos) {
		// Copia del array para no modificar el del objeto.
		ArrayList<Integer> copyAlumnCurs = this.alumnCurs;
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
	 * @return
	 */
	public ArrayList<Integer> getAlumnCurs() {
		return alumnCurs;
	}

	/**
	 * Método setter de los alumnos de la asignatura.
	 * @param alumnCurs -> Recibe un ArraList<Integer>
	 */
	public void setAlumnCurs(ArrayList<Integer> alumnCurs) {
		this.alumnCurs = alumnCurs;
	}

	/**
	 * Getter del código asignatura.
	 * @return
	 */
	public int getCodAsig() {
		return codAsig;
	}

	/**
	 * Setter del código de asignatura.
	 * @param codAsig -> int del codigo.
	 */
	public void setCodAsig(int codAsig) {
		this.codAsig = codAsig;
	}
	
	/**
	 * Getter del nombre de la asignatura
	 * @return
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * setter del nombre de la asignatura.
	 * @param nombre
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

}
