package herencia;

public class Animal { //Si la clase va a trabjar como padre, no tiene que ser private. Solo publicas para acceder desde otro paquete.
	protected String nombre;
	protected int patas;
	protected int edad;
	
	
	public Animal(String nombre, int patas, int edad) {
		this.patas = patas;
		this.nombre = nombre;
		this.edad = edad;
	}


	
	public void mostrar() {
		
		System.out.println("numero de patas: " + patas + " y el nombre es "
							+ nombre + " con " + edad + " años de edad.");
	
		
	
	
	}
	
	
	
	
	
	public int getPatas() {
		return patas;
	}


	public void setPatas(int patas) {
		this.patas = patas;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public int getEdad() {
		return edad;
	}


	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	
	
	
	
	
	
	
}
