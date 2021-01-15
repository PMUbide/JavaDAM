package Ejernuevos4;

public class Empleado {
	
	protected String nombre;

	public Empleado(String nombre) {
		this.nombre = nombre;
	}
	
	public Empleado() {
	}
	
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String toString() {
		return "Empleado " + nombre ;
	}
	
	
	
	
}
