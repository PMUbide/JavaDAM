package Principal;

import java.util.ArrayList;

public class Alumno {
	private int nip;
	private String nombre;
	private String apellidos;
	private ArrayList<Integer> matriculaciones;
	
	public Alumno(int nip, String nombre, String apellidos) {
		this.nip = nip;
		this.nombre = nombre;
		this.apellidos = apellidos;
		matriculaciones = new ArrayList<Integer>();
	}
	
	public ArrayList<Integer> getMatriculaciones() {
		return matriculaciones;
	}

	
	public void setMatriculaciones(ArrayList<Integer> matriculaciones) {
		this.matriculaciones = matriculaciones;
	}

	public void setMatriculaciones(int matricula) {
		matriculaciones.add(matricula);
	}

	@Override
	public String toString() {
		return "Alumno [nip=" + nip + ", nombre=" + nombre + ", apellidos=" + apellidos + "]";
	}

	public int getNip() {
		return nip;
	}

	public void setNip(int nip) {
		this.nip = nip;
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

	
	
}
