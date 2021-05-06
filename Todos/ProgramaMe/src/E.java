import java.util.*;

public class E {

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
		int casos = Integer.parseInt(linea);
		String lineaT = in.nextLine();
		String[] lineaSplit = lineaT.split(" ");
		int avisos = 0;
		boolean frio = false;
		boolean inicio = true;;
		for (int i = 0; i < lineaSplit.length; i++) {
			if((Integer.parseInt(lineaSplit[i]) <= 4 && !frio) || (Integer.parseInt(lineaSplit[i]) <= 4 && inicio)) {
				avisos++;
				frio = true;
				inicio = false;
			}
			if(Integer.parseInt(lineaSplit[i]) > 6) {
				frio = false;
			}
		}
		System.out.println(avisos);
		return true;
	}
}
