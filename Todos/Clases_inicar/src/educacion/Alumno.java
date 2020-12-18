package educacion;

public class Alumno extends Persona{
	private int[] calificaciones;
	private String correoAlumno;
	
	public Alumno(String nombre, String apellidos,
			int edad, int dni, int[] notas, String correo) {
		super(nombre, apellidos, edad, dni);
		// TODO Auto-generated constructor stub
		calificaciones = notas;
		correoAlumno = correo;
	}

	
	public void mostrarNotas() {
		for (int i = 0; i < calificaciones.length; i++) {
			 System.out.print(" "+calificaciones[i]);
		}
	}
	
	public String getCorreo() {
		return correoAlumno;
	}
	
}
