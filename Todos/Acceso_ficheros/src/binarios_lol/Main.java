package binarios_lol;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Primero leer el binario.
		String ruta = "files/equipos_lol/resultadosLol.bin";
		ArrayList<Equipo> total = new ArrayList<>();
		try {
			DataInputStream f = new DataInputStream(new FileInputStream(ruta));
			try {
				while (true) {
					int idLiga = f.readInt();
					int anno = f.readInt();
					int idEquipoLocal = f.readInt();
					int idEquipoVisitante = f.readInt();
					int ganador = f.readInt();
//					System.out.printf("%6d %10d %9d %9d %9d %n", idLiga, anno, idEquipoLocal, idEquipoVisitante, ganador);
					Equipo lol = new Equipo(idLiga, anno, idEquipoLocal, idEquipoVisitante, ganador);
					total.add(lol);
				}
			} catch (EOFException e) {
			}
			f.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		Collections.reverse(total);
		// mostrar
//		System.out.println("\n LOCAL  //  VISITANTE //  GANADOR");
//		for(int i = 0; i < total.size(); i++) {
//			System.out.printf("%5d %10d %10d %n",
//					total.get(i).getIdEquipoLocal(), total.get(i).getIdEquipoVisitante(), total.get(i).getGanador() );
//		}
		// Ahora leer CSV
		File ligas = new File("files/equipos_lol/ligas.csv");
		ArrayList<String> listaLiga = new ArrayList<>();
		File equipos = new File("files/equipos_lol/equipos.csv");
		ArrayList<String> listaEquipos = new ArrayList<>();
		//GUARDAMOS LAS LIGAS
		try {
			Scanner e = new Scanner(ligas);
			int cont = 0;
			while (e.hasNextLine()) {
				String linea = e.nextLine();
				if (cont > 0) {
					String[] lineaSeparada = linea.split(";");
					listaLiga.add(lineaSeparada[0]);
				}
				cont++;
			}
			e.close();
			for (int i = 0; i < listaLiga.size(); i++) {
//				System.out.println("Liga: " + listaLiga.get(i).getNombre() + " id " + listaLiga.get(i).getId());
			}
		} catch (FileNotFoundException e) {
			System.out.println("El archivo no se encuentra");
		}
		// Ahora guardamos los EQUIPOS en un arraylist de objetos de DATOS
		try {
			Scanner e = new Scanner(equipos);
			int cont = 0;
			while (e.hasNextLine()) {
				String linea = e.nextLine();
				if (cont > 0) {
					String[] lineaSeparada = linea.split(";");
					listaEquipos.add(lineaSeparada[0]);
				}
				cont++;
			}
			e.close();
			for (int i = 0; i < listaEquipos.size(); i++) {
//				System.out.println("Equipo: " + listaEquipos.get(i).getNombre() + " id " + listaEquipos.get(i).getId());
			}
		} catch (FileNotFoundException e) {
			System.out.println("El archivo no se encuentra");
		}
		// MOSTRARLO BIEN
		System.out.println("\n LIGA //   LOCAL  //  VISITANTE //  GANADOR");
		System.out.println("--------------------------------------------");
		for (int i = 0; i < total.size(); i++) {
			String nameL = listaEquipos.get((total.get(i).getIdEquipoLocal()) - 1);
			String nameV = listaEquipos.get((total.get(i).getIdEquipoVisitante()) - 1);
			String liga = listaLiga.get((total.get(i).getIdLiga()) - 1);
			//imprimir
			System.out.printf("%5s %10s %10s %10d %n", liga, nameL, nameV, total.get(i).getGanador());
		}
	}

}
