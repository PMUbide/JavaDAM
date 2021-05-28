package Tarea2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Tarea2 {

	public static void main(String[] args) {
		//Se crea una conexión a la bbdd
		MySqlAccess con = new MySqlAccess();
		Scanner inFile = null;
		try {
			//Se hace el Scanner del archivo a leer.
			inFile = new Scanner(new File("files/alumnos.csv"));
			int cont = 0; //variable para no contar la linea cabecera
			while(inFile.hasNextLine()) {
				//Variable para ir recogiendo la linea del fichero
				String linea = inFile.nextLine();
				//Para las lineas que no sean la primera entra
				if(cont > 0) {
					//Realiza automaticamente el insert a la bbdd con los datos que lee
					//de realizar el split por comas.
					con.insertAlumno(linea.split(","));
				}
				cont++;
			}
			//Mensaje de comprobación
			System.out.println("Alumnos añadidos.");
			//Se realiza un nuevo Scanner con las notas.
			inFile = new Scanner(new File("files/notas.csv"));
			cont = 0; //Se actualiza la variable a 0
			while(inFile.hasNextLine()) {
				String linea = inFile.nextLine();
				//Evita el primer bucle la cabecera
				if(cont > 0) {
					//Conexion a la bbdd mandando la información
					//después de hacer el split por comas.
					con.insertNota(linea.split(","));
				}
				cont++;
			}
			System.out.println("Notas añadidos.");
		} catch (Exception  e) {
			e.printStackTrace();
		}
			
		
		
	}

}
