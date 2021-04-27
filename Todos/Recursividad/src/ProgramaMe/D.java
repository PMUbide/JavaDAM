package ProgramaMe;

import java.util.Scanner;

public class D {

	public static void main(String[] args) {
		//primero casos de prueb
		Scanner in = new Scanner(System.in);
		int casosPrueba = in.nextInt();
		String[] datos = new String[casosPrueba];
		//Rellenar datos
		for (int i = 0; i < casosPrueba; i++) {
			datos[i] = in.next();
			datos[i] += in.nextLine();
		}
		for (int i = 0; i < datos.length; i++) {
//			System.out.println(datos[i]);
			String[] split = datos[i].split(" ");
			if(split[0].equalsIgnoreCase(split[2])) {
				System.out.println("TAUTOLOGIA");
			}else {
				System.out.println("NO TAUTOLOGIA");
			}
		}
	}

}
