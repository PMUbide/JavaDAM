package ProgramaMe;

import java.util.Scanner;

public class SemaforosSubmit {

	static Scanner in;
	
	public static void main(String[] args) {
		//in.nextLine();
		in = new Scanner(System.in);
		while(casoDePrueba());
		
		
	}
	
	
	public static boolean casoDePrueba() {
		if(!in.hasNextLine()) {
			return false;
		}else {
			String sem = in.nextLine();
			for(int i = 0; i < sem.length(); i++) {
				int cont = 0;
				int hayR = sem.indexOf("R");
				while(hayR != -1) {
					sem = sem.substring(hayR + 1);
					sem = sem.substring(0, sem.lastIndexOf("V") + 1);
					int hayA = sem.indexOf("A");
					if(hayA != -1) {
						int hayV = sem.indexOf("V");
						while(sem.length() != 0 || hayV == -1) {
							if(hayV > hayA) {
								cont++;
								sem = sem.replaceFirst("A", "");
								sem = sem.replaceFirst("V", "");
								hayR = sem.indexOf("R");
								break;
							} else {
								sem = sem.substring(sem.indexOf("V") + 1);
							}
							hayV = sem.indexOf("V");
						}
					} else {
						break;
					}
				}
				System.out.println(String.valueOf(cont));
			}
			return true;
		}
	}
}
