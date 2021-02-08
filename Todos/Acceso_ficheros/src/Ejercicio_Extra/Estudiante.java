package Ejercicio_Extra;

public class Estudiante {
	private String nip;
	private String nombre;
	private String apellido;
	private int anno;
	private double [] notas = new double[2];
	
	
	public Estudiante(String nip, String nombre, String apellido) {
		this.nip = nip;
		this.nombre = nombre;
		this.apellido = apellido;
		
	}
	
	public Estudiante() {
		
	}
	
	public Estudiante(Estudiante a) {
		this.nip = a.getNip();
		this.nombre = a.getNombre();
		this.apellido = a.getApellido();
		this.anno = 1000;
	}
	
	
	//Lo que devuelve
	public <T> String devuelveDato(T a){
		return "Es impreso  " + a;
	}
	
	
	public String toString() {
		return "El estudiante " + nombre + " con dni " + nip + " tiene las notas PR1: " +
				notas[0] + " notas PR2: " + notas[1];
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
