package Principal;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Array con los comandos.
		ArrayList<Par> matriculaciones = new ArrayList<Par>();
		//Crear unos objetos par para probar
		for (int i = 0; i < 10; i++) {
			Par nuevo = new Par((i + 100 + ""), i + "");
			matriculaciones.add(nuevo);
		}
		matriculaciones.add(new Par("101", "2"));
		for (int i = 0; i < matriculaciones.size(); i++) {
			System.out.println(matriculaciones.get(i).toString());
		}
		//Empieza con comandos para hacer.
		Scanner in = new Scanner(System.in);
		String comando = "";
		do {
			System.out.println("Comando > ");
			comando = in.nextLine();
			comprobacionOrden(comando, matriculaciones);
		}while(!comando.equalsIgnoreCase("fin"));
		
		
		for (int i = 0; i < matriculaciones.size(); i++) {
			System.out.println(matriculaciones.get(i).toString());
		}
		
	}
	
	
	public static void comprobacionOrden(String comando, ArrayList<Par> matric) {
		String[] ordenes = {"Añadir", "Eliminar"};
		//Hacer split al comando por espacios. [orden] [nip] [matriculas]
		String[] comando_split = comando.split(" ");
		//si tiene menos de 3 size es false.
		if(comando_split.length < 3) {
			System.out.println("Faltan parámetros");
			//return false;
		}
		//orden de añadir.
		else if(comando_split[0].equalsIgnoreCase(ordenes[0])) {
			//Si está dentro del archivo de alumnos
//			System.out.println("tamaño " + comando_split.length);
			if(comprobarNip(comando_split[1])) {
				//Añadir una matriculacion.
				for (int i = 2; i < comando_split.length; i++) {
					if(comprobarCodAsig(comando_split[i])){
						//Meterlo al arvhivo con toda la info
						//FALTA EN EL CASO DE QUE YA EXISTA ESA MATRICULACION
						Par nuevo = new Par(comando_split[1], comando_split[i]);
						matric.add(nuevo);
						System.out.println("Añadido matriculacion " + comando_split[i]);
					}
				}
			}
		}
		//orden de eliminar
		else if(comando_split[0].equalsIgnoreCase(ordenes[1])) {
			if(comprobarNip(comando_split[1])) {
				//Eliminar una matriculacion.
				for (int i = 2; i < comando_split.length; i++) {
					int a = 0;
					if(comprobarCodAsig(comando_split[i])){
						a = 0;
						//Eliminar ese del arraylist de pares 
						for (int j = 0; j < matric.size(); j++) {
							if(matric.get(j).getNip().equalsIgnoreCase(comando_split[1]) &&
									matric.get(j).getMatricula().equalsIgnoreCase(comando_split[i])) {
								System.out.println("Eliminada la matricula " + matric.get(j).getMatricula());
								matric.remove(j);
								a++;
								break;
							}
						}
						if(a == 0) {
							System.out.println("No tenía adjudicada matriculacion " + comando_split[i]);
						}
					}
				}
			}
		}
		else {
			System.out.println("No se reconoce esa orden.");
		}
		
	}
	
	
	/**
	 * Método para que devuelve true si el NIP se corresponde con el de un alumno.
	 * @param nip
	 * @return
	 */
	public static boolean comprobarNip(String nip) {
		String[] alumnos = {"100", "101","102", "103","104", "105","106", "107", "108", "109"};
		for (int i = 0; i < alumnos.length; i++) {
			if(nip.equalsIgnoreCase(alumnos[i])) {
				//alumno Existe.
				return true;
			}
		}
		System.out.println("No existe ese alumno");
		return false;
	}
	
	
	/**
	 * Método que devuelve true si el código de asignatura se corresponde con el de una existente.
	 * @param cod
	 * @return
	 */
	public static boolean comprobarCodAsig(String cod) {
		String[] asignaturas= {"0", "1","2", "3","4", "5","6", "7", "8", "9"};
		for (int i = 0; i < asignaturas.length; i++) {
			if(cod.equalsIgnoreCase(asignaturas[i])) {
				//cod asignatura existe.
				return true;
			}
		}
		System.out.println("No existe ese código de asignatura");
		return false;
	}
	

}
