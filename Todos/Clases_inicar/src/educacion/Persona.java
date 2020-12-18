package educacion;

public class Persona {
	protected String nombre;
	protected String apellidos;
	protected int edad;
	protected int dni; //dni sin letra
	
	
	public Persona(String nombre, String apellidos, int edad, int dni) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.edad = edad;
		this.dni = dni;
		
		
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {      //GETTER. puede ir con un VOID y estaría correcto?
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public int getDni() {
		return dni;
	}

	public void setDni(int dni) {
		this.dni = dni;
	}

	public String mostrarPersona() {
		return "El nombre es " + nombre + " el apellido " + apellidos + 
				" tiene " + edad + " años. Con DNI "+ dni;
	}
}
