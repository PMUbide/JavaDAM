package ProgramaMe;

import java.util.Scanner;

public class MontandoSemaforos {

	static Scanner in;
	
	public static void main(String[] args) {
		in = new Scanner(System.in);
		while(casoDePrueba());
	}
	
	public static boolean casoDePrueba() {
		if(!in.hasNextLine()) {
			return false;
		}
		String linea = in.nextLine();
		for(int i = 0; i < linea.length(); i++) {
			int cont = 0;
			int hayR = linea.indexOf("R");
			while(hayR != -1) {
				linea = linea.substring(hayR + 1);
				linea = linea.substring(0, linea.lastIndexOf("V") + 1);
				int hayA = linea.indexOf("A");
				if(hayA != -1) {
					int hayV = linea.indexOf("V");
					while(linea.length() != 0 || hayV == -1) {
						if(hayV > hayA) {
							cont++;
							linea = linea.replaceFirst("A", "");
							linea = linea.replaceFirst("V", "");
							hayR = linea.indexOf("R");
							break;
						} else {
							linea = linea.substring(linea.indexOf("V") + 1);
						}
						hayV = linea.indexOf("V");
					}
				} else {
					break;
				}
			}
			linea = String.valueOf(cont);
		}
		System.out.println(linea);
		return true;
	}

}
