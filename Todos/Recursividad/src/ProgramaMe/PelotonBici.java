package ProgramaMe;

import java.text.*;
import java.util.*;

public class PelotonBici {

	static Scanner in;
	
	public static void main(String[] args) throws Exception {
		in = new Scanner(System.in);
		while(casoDePrueba());
	}

	public static boolean casoDePrueba() throws Exception {
		String linea = in.nextLine();
		if(linea.equals("0")) {
			return false;
		}else {
			int numCorredores = Integer.parseInt(linea);
			Date[] peloton = new Date[numCorredores];
			for (int i = 0; i < numCorredores; i++) {
				String tiempo = in.nextLine();
				Date date1 = new SimpleDateFormat("HH:mm:ss").parse(tiempo);
				peloton[i] = date1;
			}
			Date contador = peloton[0];
			ArrayList<Date>
			for (int i = 1; i < peloton.length; i++) {
				if(peloton[i].getSeconds() - contador.getSeconds() == 0) {
					System.out.println(peloton[i].getSeconds() - contador.getSeconds());
				}
			}
			return true;
		}
	}
}
