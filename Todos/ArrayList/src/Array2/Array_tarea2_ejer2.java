package Array2;
import java.util.*;

public class Array_tarea2_ejer2 {

	public static void main (String[] args) {
//		Un cine nos propone hacer una aplicación para controlar las
//		personas (nombre y edad) de la cola en los grandes estrenos de películas.
//		Un conjunto de personas espera la cola para sacar una entrada, y
//		deberemos calcular su precio dependiendo de su edad. El número total
//		de personas que forman la cola es un número aleatorio entre 0 y 50.
//		Al finalizar el programa, se deberá mostrar por pantalla la cantidad total
//		recaudada.
		ArrayList <Persona> cinesa = new ArrayList <Persona> ();
		int num_ale = 51;
		System.out.println("PROGRAMA");
		while (num_ale > 50) {
			num_ale = (int) (100 * Math.random());
			System.out.println ("num elatorio: " + num_ale);
		}
		for (int i = 0; i < num_ale; i++) {
			Persona per = new Persona ("nombre" + (i+1), (int)(100 * Math.random()));
			cinesa.add(per); 
		}
		for (Persona i: cinesa) {
			System.out.println (i.getNombre() + " con edad " + i.getEdad());
		}
		double recaudado = 0;
		for (Persona i: cinesa) {
			if (i.getEdad() >= 5  && i.getEdad() < 11) {
				recaudado += 1;
			}
			else if (i.getEdad() >= 11 && i.getEdad() < 18) {
				recaudado += 2.5;
			}
			else if (i.getEdad() >=18){
				recaudado += 3.5;
			}
		}
		System.out.println ("El total del dinero recaudado es: " + recaudado);
		
	}
	
}
