import java.util.Scanner;

public class K {

	static Scanner in;
	public static void main(String[] args) {
		in = new Scanner(System.in);
		while(casoDePrueba());
	}
	
	public static boolean casoDePrueba() {
		String linea = in.nextLine();
		if(linea.equals("0 0")) {
			return false;
		}
		String[] lineaS = linea.split(" ");
		
		return true;
	}

}
