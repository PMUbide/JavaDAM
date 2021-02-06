package Ejercicio_Extra;

public class Estudiante {
	private String nip;
	private String nombre;
	private String apellido;
	private double [] notas = new double[2];
	
	
	public Estudiante(String nip, String nombre, String apellido) {
		this.nip = nip;
		this.nombre = nombre;
		this.apellido = apellido;
		
	}

	public String getNip() {
		return nip;
	}

	public void setNip(String nip) {
		this.nip = nip;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public double [] getNotas() {
		return notas;
	}

	public void setNotas(double [] notas) {
		this.notas = notas;
	}
	
	public void setSuNota(int posicion, double nota) {
		this.notas[posicion] = nota;
	}
	
}
