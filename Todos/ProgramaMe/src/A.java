import java.util.*;
public class A {

	static Scanner in;
	
	public static void main(String[] args) {
		in = new Scanner(System.in);
		String casos = in.nextLine();
		for (int i = 0; i < Integer.parseInt(casos); i++) {
			casoDePrueba();
		}
	}
	
	public static void casoDePrueba() {
		String linea = in.nextLine();
//		String linea = "6 D J P 7 P 6 P 5 P 4 P K C J C 9 C 8 C 4 C 2 C 10 T";
		String[] lineaSplit = linea.split(" ");
		int puntuacion = 0;
		for (int i = 0; i < lineaSplit.length; i+=2) {
			if(lineaSplit[i].equals("J")) {
				puntuacion += 1;
			}else if(lineaSplit[i].equals("Q")) {
				puntuacion += 2;
			}else if(lineaSplit[i].equals("K")) {
				puntuacion += 3;
			}else if(lineaSplit[i].equals("A")) {
				puntuacion += 4;
			}
		}
		int[] tabla = {0, 0, 0, 0};
		for (int i = 1; i < lineaSplit.length; i+=2) {
			if(lineaSplit[i].equals("P")) {
				tabla[0]++;
			}else if(lineaSplit[i].equals("D")) {
				tabla[1]++;
			}else if(lineaSplit[i].equals("T")) {
				tabla[2]++;
			}else if(lineaSplit[i].equals("C")) {
				tabla[3]++;
			}
		}
		for (int i = 0; i < tabla.length; i++) {
			if(tabla[i] == 0) {
				puntuacion += 3;
			}else if(tabla[i] == 1) {
				puntuacion += 2;
			}else if(tabla[i] == 2) {
				puntuacion++;
			}
		}
		
		System.out.println(puntuacion);
	}

}
