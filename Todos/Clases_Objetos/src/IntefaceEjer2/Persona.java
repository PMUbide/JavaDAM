package IntefaceEjer2;

public class Persona {
	private String nombre;
	private String dni;
	
	public Persona(String nombre, String dni) {
		this.dni = dni;
		this.nombre = nombre;
	}
	
	public Persona() {
	}
	
	public String getDni() {
		return dni;
	}
	
	public void setDni(String dni) {
		this.dni = dni;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
	
}
