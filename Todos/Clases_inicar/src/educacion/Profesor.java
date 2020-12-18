package educacion;

public class Profesor extends Persona {
	private String correoCorporativo;
	private String [] asignaturas; //Asignaturas que imparte
	
	public Profesor(String nombre, String apellidos, int edad,
			int dni, String correo, String[] asignaturas) {
		super(nombre, apellidos, edad, dni);
		// TODO Auto-generated constructor stub
		correoCorporativo = correo;
		this.asignaturas = asignaturas;
	}

	
	public void mostrarDatos() {
		System.out.println("Su correo corporativo es " + correoCorporativo);
		System.out.println("Las asignaturas que imparte son: ");
		for (int i = 0; i < asignaturas.length; i++) {
			System.out.println(" "+ asignaturas[i]);
		}
		
	}
	
	
	
}
