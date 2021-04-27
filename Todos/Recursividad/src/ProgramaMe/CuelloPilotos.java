package ProgramaMe;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CuelloPilotos {

	public static void main(String[] args) {
		//Leer fichero
		Scanner fileIn = null;
		try {
			fileIn = new Scanner(new File("files/inicio_pilotos.txt"));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		int veces = 0;
		String[][] circuito = null;
		while(fileIn.hasNextLine()) {
			String linea = fileIn.nextLine();
			//Ver si la linea tiene espacios
			System.out.println(linea);
			int fila = 0, columna = 0;
			boolean espacios = false;
			boolean acaba = false;
			for (int i = 0; i < linea.length(); i++) {
	            // Si el carácter en [i] es un espacio (' ') aumentamos el contador 
	            if (linea.charAt(i) == ' ') {
	            	espacios = true;
	            }
	        }
			if(linea.equals("0 0")) {
				acaba = true;
				System.out.println("se acaba");
			}
			if(!acaba) {
				if(espacios) {
					String[] lineaSplit = linea.split(" ");
					fila = Integer.parseInt(lineaSplit[0]);
					columna = Integer.parseInt(lineaSplit[1]);
					circuito = new String[fila][columna];
					veces = 0;
				}else {
					String[] lineaSplit = linea.split("");
					for (int i = 0; i < lineaSplit.length; i++) {
						circuito[veces][i] = lineaSplit[i];
					}
					veces++;
				}
				
			}
			espacios = false;
		}
		
	}

}
