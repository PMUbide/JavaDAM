package ProgramaMe;

import java.util.Scanner;

public class SemaforosSubmit2 {

	static Scanner in;

	public static void main(String[] args) {
		// in.nextLine();
		in = new Scanner(System.in);
		while (casoDePrueba())
			;

	}

	public static boolean casoDePrueba() {
		if (!in.hasNextLine()) {
			return false;
		}
		String sem = in.nextLine();
		String[] semSplit = sem.split("");
		int contador = 0;
		for (int i = 0; i < semSplit.length; i++) {
			if (semSplit[i].equals("R")) {
				for (int j = i + 1; j < semSplit.length; j++) {
					if (semSplit[j].equals("A")) {
						for (int j2 = j + 1; j2 < semSplit.length; j2++) {
							if (semSplit[j2].equals("V")) {
								contador++;
								semSplit[j2] = "0";
								semSplit[j] = "0";
								break;
							}
						}
						break;
					}
				}
			}
		}
		System.out.println(contador);
		return true;
	}

}
