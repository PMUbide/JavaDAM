import java.util.*;
public class Ejer4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Juan necesita calcular su salario semanal, el cual se obtiene de
//		la siguiente forma: si trabaja 40 horas o menos a la semana, se le paga
//		16€ la hora. Si trabaja más de 40 horas a la semana, se le paga 16€ por
//		cada una de las primeras 40 horas y 20€ por cada una de las horas extra.
//		Implementa un programa Java que solicite al usuario el número de horas
//		trabajadas y presente por pantalla el sueldo semanal de Juan.
		Scanner entrada=new Scanner(System.in);
		int z=1;
		while(z==1) {
			System.out.println("Introduce las horas trabajadas: ");
			int horas=entrada.nextInt();
			if (horas<=40) {
				System.out.println("Su sueldo será de: "+ (horas*16)+" €.");
			}
			else {
				horas=(horas-40)*20+(40*16);
				System.out.println("Su sueldo será de: "+ horas +" €.");
			}
			
		}
	}
}
