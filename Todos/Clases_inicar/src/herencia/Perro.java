package herencia;

public class Perro extends Animal{

	public Perro(String nombre, int patas, int edad) {
		super(nombre, patas, edad);
		// TODO Auto-generated constructor stub
		
	}
	
	@Override
	public void mostrar() {
		
		System.out.println("El perro se llama " + nombre + " tiene  " + patas + 
				" patas y tiene "+ edad + " años.");
	}
	
	

}
