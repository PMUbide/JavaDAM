package Titanic;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ruta = "files/titanic.csv";
		// crear archivo
		File archivo = new File(ruta);
		// leer archivo
		Scanner entrada;
		ArrayList<Pasajero> personas = new ArrayList<>();
		try {
			entrada = new Scanner(archivo);
			int conteo = 0;
			while (entrada.hasNextLine()) {
				String linea = entrada.nextLine();
				String[] lineaSinEspacios = linea.split(",");
				// posicion [1] 0 muere 1 sobrevive
				// posicion [4] male / female
				boolean vive;
				String nombre;
				if (lineaSinEspacios[1].equals("0")) {
					vive = false;
				} else {
					vive = true;
				}
				if (lineaSinEspacios[5].equals("male")) {
					nombre = "male";
				} else {
					nombre = "female";
				}
				if (conteo > 0) {
					Pasajero persona = new Pasajero(nombre, vive);
					personas.add(persona);
				}
				conteo++;
			}
			//Cerrar el scanner
			entrada.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("ERROR");
		}
		int hombres = conteo(personas, "male");
		int mujeres = conteo(personas, "female");
		int hombresMuertos = conteoMuertos(personas, "male");
		int mujeresMuertas = conteoMuertos(personas, "female");
		System.out.println("Número total de pasajeros: " + (hombres + mujeres) + "\n");
		System.out.println("Número de mujeres " + mujeres + ". Muertas: " + mujeresMuertas + ". Porcentaje muertas: "
				+ (mujeresMuertas * 100 / mujeres) + " %." + "\n");
		System.out.println("Número de hombres " + hombres + ". Muertos: " + hombresMuertos + ". Porcentaje muertos: "
				+ (hombresMuertos * 100 / hombres) + " %." + "\n");
		System.out.println("Número de mujeres muertas " + mujeresMuertas + ". Porcentaje: "
				+ (mujeresMuertas * 100 / (mujeresMuertas + hombresMuertos)) + " %. \n");
		System.out.println("Número de hombres muertos " + hombresMuertos + ". Porcentaje: "
				+ (hombresMuertos * 100 / (mujeresMuertas + hombresMuertos)) + " %. \n");

	}

	public static int conteoMuertos(ArrayList<Pasajero> cosa, String sexo) {
		int conteo = 0;
		for (int i = 0; i < cosa.size(); i++) {
			if (cosa.get(i).getSexo().equals(sexo) && cosa.get(i).isEstado() == false) {
				conteo++;
			}
		}
		return conteo;
	}

	public static int conteo(ArrayList<Pasajero> cosa, String sexo) {
		int conteo = 0;
		for (int i = 0; i < cosa.size(); i++) {
			if (cosa.get(i).getSexo().equals(sexo)) {
				conteo++;
			}
		}
		return conteo;
	}

}
