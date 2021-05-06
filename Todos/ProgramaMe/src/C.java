import java.util.Scanner;

public class C {
	
	static Scanner in;
	
	public static void main(String[] args) {
		in = new Scanner(System.in);
		while(casoDePrueba());
	}

	public static boolean casoDePrueba() {
		String linea = in.nextLine();
		if(linea.equals("0")) {
			return false;
		}
		int dias = Integer.parseInt(linea);
		String lineaGas = in.nextLine();
		String[] lineaSplit = lineaGas.split(" ");
		int precio = 1;
		int anterior = Integer.parseInt(lineaSplit[0]);
		for (int i = 1; i < lineaSplit.length; i++) {
			if(Integer.parseInt(lineaSplit[i]) >= anterior + 1) {
				precio++;
			}
			anterior = Integer.parseInt(lineaSplit[i]);
		}
		System.out.println(precio);
		return true;
	}
}
