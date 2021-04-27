package ProgramaMe;

import java.util.Scanner;

public class problema427 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int casos = in.nextInt();
		in.nextLine(); //descarta la linea.
		for (int i = 0; i < casos; i++) {
			String cadena1 = in.nextLine();
			String cadena2 = in.nextLine();
			    if (cadena1.equals("Luke") && cadena2.equals("padre")) {
			        System.out.println("TOP SECRET");
			    }
			    else {
			        System.out.println(cadena1 + ", yo soy tu " + cadena2);
			    }
		}
	
		
	}

}


