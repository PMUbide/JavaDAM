package Practica2;

import java.util.ArrayList;


public class Alumno {
	
	private int idAlumno;
	private String nombre;
	private String apellidos;
	private String dni;
	private ArrayList<Integer> asignaturas;
	
	public Alumno(int idAlumno, String nombre, String apellidos, String dni) {
		this.idAlumno = idAlumno;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.dni = dni;
		asignaturas = new ArrayList<Integer>();
	}

	public int getIdAlumno() {
		return idAlumno;
	}

	public void setIdAlumno(int idAlumno) {
		this.idAlumno = idAlumno;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	
	public void insertAsignatura(int idAsignatura) {
		asignaturas.add(idAsignatura);
	}
	
	
	public void muestraAsignaturas(ArrayList<Asignatura> asignaturas) {
		System.out.println("\nAsignaturas de " + nombre + " :");
		for (int i = 0; i < this.asignaturas.size(); i++) {
			for (int j = 0; j < asignaturas.size(); j++) {
				if(this.asignaturas.get(i) == asignaturas.get(j).getIdAsignatura()) {
					System.out.println(asignaturas.get(j).toString());
				}
			}
		}
	}

	public ArrayList<Integer> getAsignaturas() {
		return asignaturas;
	}

	public void setAsignaturas(ArrayList<Integer> asignaturas) {
		this.asignaturas = asignaturas;
	}

	@Override
	public String toString() {
		return "Alumno [idAlumno=" + idAlumno + ", nombre=" + nombre + ", apellidos=" + apellidos + ", dni=" + dni
				+ "]";
	}
	
	
	
	
	
	
}
