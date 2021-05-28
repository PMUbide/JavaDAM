package Repaso1;

import java.util.*;
import java.io.*;

public class Ejer3_formulaOne {

	public static void main(String[] args) {
//		Dado el fichero "constructors.csv" que contiene la información sobre las escuderías de F1, y el fichero "constructor_standings.csv"
//		que contiene información adicional sobre estas mismas, diseña una base de datos capaz de almacenar todos estos datos.
//		Pista: piensa el número de tablas necesarias y como las relacionarías entre ellas.
		MySqlAccess con = new MySqlAccess();
		try {
			Scanner f = new Scanner(new File("files/constructors.csv"));
			int cont = 0;
			while (f.hasNextLine()) {
				String linea = f.nextLine();
				if(cont > 0) {
					//con.insertConstructor(linea.split(","));
 				}
				cont++;
			}
			System.out.println("Constructors leidos");
			f = new Scanner(new File("files/constructor_standings.csv"));
			cont = 0;
			while (f.hasNextLine()) {
				String linea = f.nextLine();
				if(cont > 0) {
					con.insertStanding(linea.split(","));
 				}
				cont++;
			}
			System.out.println("Standingd leidos");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
