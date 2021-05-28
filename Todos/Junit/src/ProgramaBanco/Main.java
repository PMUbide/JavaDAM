package ProgramaBanco;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//leeArchivo y guardarlo en Array.
		ArrayList<Usuario> usuariosBanco = new ArrayList<Usuario>();
		try {
			Scanner in = new Scanner(new File("files/banco_users.csv"));
			while(in.hasNextLine()) {
				String linea = in.nextLine();
				String[] lineaSplit = linea.split(";");
				Usuario nuevo = new Usuario(lineaSplit[0], lineaSplit[1], Double.parseDouble(lineaSplit[2]));
				//añade usuario al arrayList
				usuariosBanco.add(nuevo);
			}
			in.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		//leer usuarios
		for (Usuario usuario : usuariosBanco) {
			System.out.println(usuario);
		}
		//Empieza el MENU con los usuarios leidos
		Menu principal = new Menu(usuariosBanco);
		principal.start();
		//Vuelve a leer usuarios para ver cambios
		for (Usuario usuario : usuariosBanco) {
			System.out.println(usuario);
		}
	}

}
