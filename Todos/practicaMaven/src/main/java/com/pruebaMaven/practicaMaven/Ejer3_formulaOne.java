package com.pruebaMaven.practicaMaven;

import java.util.*;
import java.io.*;

public class Ejer3_formulaOne {

	public static void main(String[] args) {
		//conexion a la bbdd
		MySqlAccess con = new MySqlAccess();
		try {
			//Scanner del archivo csv
			Scanner f = new Scanner(new File("files/constructors.csv"));
			int cont = 0;
			while (f.hasNextLine()) {
				String linea = f.nextLine();
				//Evita la cabecera
				if(cont > 0) {
					//envia el split con los datos separados por "," al metodo que hace el inser
					con.insertConstructor(linea.split(","));
 				}
				cont++;
			}
			System.out.println("Constructors leidos");
			f = new Scanner(new File("files/constructor_standings.csv"));
			cont = 0;
			while (f.hasNextLine()) {
				String linea = f.nextLine();
				if(cont > 0) {
					//envia el split con los datos separados por "," al metodo que hace el inser
					con.insertStanding(linea.split(","));
 				}
				cont++;
			}
			System.out.println("Standingd leidos");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}

}
