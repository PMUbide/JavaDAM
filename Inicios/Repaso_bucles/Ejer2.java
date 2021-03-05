import java.util.*;
public class Ejer2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Implementa un programa Java que le solicite al usuario
//		introducir 5 notas (números reales) y devuelva por pantalla la mejor nota
//		de las 5 introducidas.
		
		Scanner entrada= new Scanner (System.in);
		System.out.println("Introduce 5 notas:");
		int nota1=0;
		int nota;
		for(int i=0;i<5;i++) {
			nota=entrada.nextInt();
			if (nota>nota1) {
				nota1=nota;
			}
		}
		System.out.println("La nota más alta es: " + nota1);
	}
}
