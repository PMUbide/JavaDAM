package Principal;

import java.util.ArrayList;

public class Asignaturas {
	private int codAsignatura;
	private double creditos;
	private int trimestre;
	private String tipo;
	private String nombre;
	private int numAlumnos; //La suma de alumnos cursando esa asignatura.
	private ArrayList<Integer> codAlumnos;
	
	public Asignaturas(int codAsignatura, double creditos, int trimestre, String tipo, String nombre) {
		this.codAsignatura = codAsignatura;
		this.creditos = creditos;
		this.trimestre = trimestre;
		this.tipo = tipo;
		this.nombre = nombre;
		codAlumnos = new ArrayList<Integer>();
	}

	
	public int getNumAlumnos() {
		return numAlumnos;
	}

	public void setNumAlumnos(int alumnos) {
		this.numAlumnos = alumnos;
	}

	

	public ArrayList<Integer> getCodAlumnos() {
		return codAlumnos;
	}

	public void setCodAlumnos(ArrayList<Integer> codAlumnos) {
		this.codAlumnos = codAlumnos;
	}


	@Override
	public String toString() {
		return "Asignaturas [" + codAsignatura + ", " + creditos + ", " + trimestre
				+ ", " + tipo + ", " + nombre + "]";
	}



	public int getCodAsignatura() {
		return codAsignatura;
	}

	public void setCodAsignatura(int codAsignatura) {
		this.codAsignatura = codAsignatura;
	}

	
	public int getTrimestre() {
		return trimestre;
	}

	public void setTrimestre(int trimestre) {
		this.trimestre = trimestre;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
	
	
}
