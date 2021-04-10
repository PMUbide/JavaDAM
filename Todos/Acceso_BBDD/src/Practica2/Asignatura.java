package Practica2;

public class Asignatura {
	
	private int idAsignatura;
	private String nombre;
	private int curso;
	
	public Asignatura(int idAsignatura, String nombre, int curso) {
		this.idAsignatura = idAsignatura;
		this.nombre = nombre;
		this.curso = curso;
	}

	public int getIdAsignatura() {
		return idAsignatura;
	}

	public void setIdAsignatura(int idAsignatura) {
		this.idAsignatura = idAsignatura;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getCurso() {
		return curso;
	}

	public void setCurso(int curso) {
		this.curso = curso;
	}

	@Override
	public String toString() {
		return "Asignatura id: " + idAsignatura + ", " + nombre + ", curso = " + curso;
	}
	
	
	
}
