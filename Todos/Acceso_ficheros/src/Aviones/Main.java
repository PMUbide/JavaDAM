package Aviones;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ruta = "files/Airplane_Crashes_and_Fatalities_Since_1908.csv";
		File f = new File(ruta);
		ArrayList <Accidentes> datos = new ArrayList <>();
		try {
			Scanner archivo = new Scanner(f);
			int conteo = 0;
			while(archivo.hasNextLine()) {
				String[] lineas = archivo.nextLine().split(",");
//				for(int i = 0; i < lineas.length; i++) {
//					System.out.print(lineas[i] + " ; ");
//				}
//				System.out.println();
				/*
				 * [0] fecha
				 * [1] hora
				 * if [2] substring (0,1).equals(""") -> [2]+[3] lugar
				 * [7] tipoAvion
				 * else [2] lugar
				 * 		[6] tipoAvion
				 */
				String fecha = lineas[0];
				String hora = lineas[1];
				String lugar, tipoAvion;
				if(!lineas[2].equals("") && lineas[2].substring(0, 1).equals("\"") && !lineas[4].equals("") &&  
						!lineas[4].substring(lineas[4].length()-1, lineas[4].length()).equals("\"")) {
					lugar = lineas[2] + ", " + lineas[3];
					tipoAvion = lineas[4];
				}
				else if (!lineas[2].equals("") && lineas[2].substring(0, 1).equals("\"") &&
						!lineas[4].equals("") && lineas[4].substring(lineas[4].length()-1, lineas[4].length()).equals("\"")){
					lugar = lineas[2] + ", " + lineas[3] + lineas[4];
					tipoAvion = lineas[5];
				}
				else {
					lugar = lineas[2];
					tipoAvion = lineas[3];
				}
//				System.out.println("Fecha " + fecha + ". hora: " + hora + ". lugar " + lugar + " AVION: "+ tipoAvion);
				if(conteo > 0) {
					Accidentes accidente = new Accidentes(fecha,lugar, hora, tipoAvion);
					datos.add(accidente);
				}
				conteo++;
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("ERROR");
		}
		
		/*Enseñar el vector*/
//		for(Accidentes i : datos) {
//			System.out.println(i.toString());
//			
//		}
		/*Saca el avion que mas veces aparece*/
		int veces = 0;
		int contador = 0;
		String elegido ="";
		for(int i = 0; i < datos.size(); i++) {
			String caido = datos.get(i).getTipoAvion();
//			System.out.println(caido);
//			System.out.println(i);
			for(int j = 0; j < datos.size(); j++) {
				if(datos.get(j).getTipoAvion().equals(caido)) {
					contador++;
				}
			}
			if(contador > veces) {
				veces = contador;
				elegido = caido;
			}
			//System.out.println(elegido + " " + veces);
			contador = 0;
		}
		System.out.println("Avion: " + elegido + " veces " + veces);
		
	}

}
