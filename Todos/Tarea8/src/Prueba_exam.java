import java.util.*;
public class Prueba_exam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//1. Pregunta al usuario cuantas preguntas tipo test a puntuar.
		Scanner in = new Scanner(System.in);
		Scanner entrada = new Scanner(System.in);
		//Scanner entrada=new Scanner(System.in).useDelimiter("[,\\s+]");
		System.out.println("Escribe cuantas preguntas tipo test tiene el examen:");
		int num_test = in.nextInt();
		//Ahora escribre las soluciones a las tipo test que son corectas.
		System.out.println("Escribe las soluciones correctas a los test:");
		//Ahora segun lo escriba lo irá almacenando en la tabla de solu[] como Strings.
		String solucion = entrada.nextLine();
		String solu[] = new String[num_test];
		if (solucion.indexOf(' ') >= 0) {
			solu = solucion.split(" ");
		}else {
			for(int i=0;i<solu.length;i++) {
				if(i==0) solu[i]=solucion;
				else {
					System.out.println("Introduce otro dato.");
					solucion = entrada.nextLine();
					solu[i] = solucion;
				}
			}
		}
		//Ahora irá a pedir las respuestas del alumno.
		System.out.println("Escribe las respuestas del alummo:");
		String alumno=entrada.nextLine();
		String respu[]= new String[num_test];
		if (alumno.indexOf(' ') >= 0) {
			respu=alumno.split(" ");
		}else {
			for(int i=0;i<respu.length;i++) {
				if(i==0) respu[i]=alumno;
				else {
					System.out.println("Introduce otro dato.");
					alumno=entrada.nextLine();
					respu[i]=alumno;
				}
			}
		}
		//Ahora comporbara las respuestas correctas.
		int correr=0;
		for(int z=0;z<respu.length;z++) {
			if(solu[z].equals(respu[z])){
				correr++;
			}
		}
		System.out.println("El número de respuestas correctas han sido: "+ correr);
		double correr1=correr;
		double num_test1=num_test;
		System.out.println(" El porcentaje de aciertos es del "+((correr1/num_test1)*100)+" %");
	}

	public static void visualizar(String [] array) {
		for(int u=0;u<array.length;u++) {
			System.out.println(array[u]);
		}
	}
	
//	for(int i=0;i<=solucion.length();i++) {
//	
//	if(!solucion.substring(i, i+1).equals(" ")) {
//		
//		a=a+solucion.substring(i, i+1);
//	}
//	
//	else if (solucion.substring(i, i+1).equals(" ")) {
//		
//		solu[contador_solu]=Integer.parseInt(a);
//		
//		contador_solu++;
//		
//		a="";
//	}
//	
//	
//	
//	
//}	
}
