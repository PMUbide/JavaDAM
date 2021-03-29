package pruebas2;

public class Nodo {
	private Nodo siguiente;
	//private Nodo anterior;
	private Alumno alumno;
	
	public Nodo(Alumno alumno, Nodo siguiente) {
		this.siguiente = siguiente;
		this.alumno = alumno;
	}

	public Nodo getSiguiente() {
		return siguiente;
	}

	public void setSiguiente(Nodo siguiente) {
		this.siguiente = siguiente;
	}

	public Alumno getAlumno() {
		return alumno;
	}

	public void setAlumno(Alumno alumno) {
		this.alumno = alumno;
	}

	
	
	
	
}
