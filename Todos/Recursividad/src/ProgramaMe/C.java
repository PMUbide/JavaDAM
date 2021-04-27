package ProgramaMe;

import java.util.Scanner;

public class C {

	public static void main(String[] args) {
		//casos de uso
		Scanner in = new Scanner(System.in);
		int casosUso = in.nextInt();
		int[][] operaciones = new int[casosUso][2];
		//Introducir las operaciones
		for (int i = 0; i < operaciones.length; i++) {
			String lineaOperacion = in.next();
			lineaOperacion += in.nextLine();
			String[] lineaSplit = lineaOperacion.split(" ");
			operaciones[i][0] = Integer.parseInt(lineaSplit[0]);
			operaciones[i][1] =	Integer.parseInt(lineaSplit[1]);
		}
		for (int i = 0; i < operaciones.length; i++) {
//			System.out.println(operaciones[i][0] + " " + operaciones[i][0]);
		}
		//empezar programa.
		for (int i = 0; i < operaciones.length; i++) {
			int num1 = operaciones[i][0];
			int num2 = operaciones[i][1];
			int u = (num1%10) * (num2%10);
//			System.out.println(num1%10 + " " + num2%10 + " = "+ u);
			int d = ((num1/10 )%10) * ((num2/10)%10) + ((u/10)%10);
//			System.out.println((((num1/100)%10) * ((num2/100)%10)) + " ---- " + (d/10)%10);
			int c = (((num1/100)%10) * ((num2/100)%10)) + ((d/10)%10);
			System.out.println(c + "" + d%10 + "" + u%10);
		}
		
	}
	
	

}
