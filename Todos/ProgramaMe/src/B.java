import java.util.Scanner;

public class B {

	static Scanner in;
	
	public static void main(String[] args) {
		in = new Scanner(System.in);
		while(casoDePrueba());
	}

	public static boolean casoDePrueba() {
		String linea = in.nextLine();
		if(linea.equals(".")) {
			return false;
		}
		String[] lineaS = linea.split(" ");
		int v = 0;
		int i = 0;
//		int a = 0;
		for (int j = 0; j < lineaS.length; j++) {
			if(lineaS[j].equals("V")) {
				v++;
			}
			if(lineaS[j].equals("I")){
				i++;
			}
//			if(lineaS[j].equals("A")) {
//				a++;
//			}
			if(lineaS[j].equals(".")) {
				break;
			}
		}
		if(v > i) {
			System.out.println("VERANO");
		}else if(i > v){
			System.out.println("INVIERNO");
		}else {
			System.out.println("EMPATE");
		}
		return true;
	}
	
	
	
}
