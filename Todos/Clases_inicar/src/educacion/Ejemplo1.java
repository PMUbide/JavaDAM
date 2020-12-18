package educacion;

public class Ejemplo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println("Introduce tu nombre");
		int[] notas_pablo = {10,5,3,5,8};
		int[] notas_juan = {3,5,7,6,10};
		int[] notas_pedro = {10, 4,7,1,6};
		Alumno [] vespertino = new Alumno [3];
		vespertino[0] = new Alumno("Pablo", "Martinez", 28, 6666666,
				notas_pablo, "pablom@escuela.com");
		vespertino [1] = new Alumno("juan", "Martinez", 25, 51231255,
				notas_juan, "juanm@escuela.com");
		vespertino [2]= new Alumno("pedro", "Garcia", 41, 1231556,
				notas_pedro, "pedrom@escuela.com");
		String [] asign_jesus = {"Matemáticas", "Física", "Quimica"};
		Profesor jesus = new Profesor("Jesus", "Laborda", 50, 1231245,
				 "pedrom@escuela.com",asign_jesus );
		for (int i = 0; i < vespertino.length; i++) {
			System.out.println(vespertino[i].mostrarPersona());
			System.out.println("Con el correo" + vespertino[i].getCorreo()+ "  Sus notas son:");
			vespertino[i].mostrarNotas();
			System.out.println();
			System.out.println();
			
		}
		System.out.println("------PROFESORES-------");
		System.out.println(jesus.mostrarPersona());
		jesus.mostrarDatos();
		
		
	}

}
