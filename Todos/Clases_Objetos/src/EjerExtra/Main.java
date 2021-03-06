package EjerExtra;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;



public class Main {

	public static void main(String[] args) {
//		TODO Auto-generated method stub
//		Reparaciones nueva = new Reparaciones("Pinchazo", 2, true, 1, 10);
//		Reparaciones nueva1 = new Reparaciones("otros", 5, false, 2, 5);
//		System.out.println(nueva.ToString());	
//		System.out.println(nueva1.ToString());
//		Revisiones hola = new Revisiones("Radiador", 1, true);
//		System.out.println(hola.ToString());
		ArrayList <Trabajo> datos = new ArrayList <Trabajo>();	
		//menu 1.Registra trabajo. 2.Aumenta horas 3.Aumenta coste piezas 4.Finaliza Trabajo 5.Muestra trabajo.
		boolean estado = true;
		System.out.println("PROGRAMA GARAJE");
		while(estado) {
			System.out.println("\n �Que quiere hacer?");
			System.out.println("\n Menu 1.Registra trabajo. 2.Aumenta horas 3.Aumenta coste piezas 4.Finaliza Trabajo 5.Muestra trabajo.");
			int menu = comprobarEntrada(5);
			switch(menu) {
				case 1:
					registraTrabajo(datos); //M�todo que resgistra el trabajo
					break;
				case 2:
					aumentaHoras(datos);
					break;
				case 3:
					incluyeMaterial(datos);
					break;
				case 4:
					finalizaTrabajo(datos);
					break;
				case 5:
					System.out.println("hola");
					muestraTrabajo(datos);
					break;
			}
		}
			
			
	}

	public static int comprobarEntrada(int veces) {
		int num = 0;
		boolean correcto = false; //variable para controlar que sea v�lido o no el n�mero
		do {
			try { //Hace un try y recoge el Catch el error,
				Scanner entrada = new Scanner (System.in);
				System.out.println("Introduce el n�mero del menu.");
				num = entrada.nextInt();
				if(num <= 0 || num > veces) {
					System.out.println("error");
					correcto = false;
				}
				else{ //si es correcto pasa a ser true y finaliza el bucle while y llega al return final.
					correcto = true;
				}
			}catch (InputMismatchException e) {
				System.out.println("error");
				correcto = false;
			}
		}while(!correcto); //Mientras no sea correcto no dejar� de pedir el dato al usuario.
		return num;
	}
	

	
	public static void registraTrabajo(ArrayList<Trabajo> nombre) {
		System.out.println("Introduce tipo de trabajo y descripci�n. REPARACION / REVISION");
		Scanner in = new Scanner(System.in);
		String registro = in.next(); //Variable para elegir el tipo de trabajo.
		if(registro.equalsIgnoreCase("revision")){
			System.out.println("DESCRIPCI�N: ");
			String descrip = in.next();
			System.out.println("Horas: ");
			double tiempo = in.nextInt();
			Revisiones revision1 = new Revisiones(descrip, tiempo, false);
			nombre.add(revision1);
			System.out.println("Trabajo introducido. ID = " + revision1.getIdentificador());
		}
		else if(registro.equalsIgnoreCase("reparacion")) {
			System.out.println("DESCRIPCI�N: ");
			String descrip = in.next();
			System.out.println("Horas: ");
			double tiempo = in.nextInt();
			System.out.println("TIPO? 1. MECANICA o 2. CHAPA/PINTURA");
			int eleccion = comprobarEntrada(2);
			Reparaciones reparacion1 = new Reparaciones(descrip, tiempo, false, eleccion);
			nombre.add(reparacion1);
			System.out.println("Trabajo introducido. ID = " + reparacion1.getIdentificador());
		}
		else {
			System.out.println("Tipo de trabajo introducido incorrecto");
		}
		
	}
	
	public static void aumentaHoras(ArrayList<Trabajo> nombre) {
		System.out.println("Indica el ID del trabajo:");
		Scanner in = new Scanner (System.in);
		int indicadorId = in.nextInt();
		System.out.println("Indica el n�mero de horas a aumentar: ");
		double horas = in.nextDouble();
		boolean comprobar = false;
		for (int i = 0; i < nombre.size(); i++) {
			if (indicadorId  == nombre.get(i).getIdentificador()) {
				nombre.get(i).setHoras(horas);
				comprobar = true;
				break;
			}
		}
		if(!comprobar) {
			System.out.println("No existe ese ID.");
			
		}
		
	}
	
	public static void incluyeMaterial(ArrayList<Trabajo> nombre) {
		System.out.println("Indica el ID del trabajo:");
		Scanner in = new Scanner (System.in);
		int indicadorId = in.nextInt();
		System.out.println("Indica el coste de las piezas. ");
		double material = in.nextDouble();
		boolean comprobar = false;
		for (int i = 0; i < nombre.size(); i++) {
			if (indicadorId   == nombre.get(i).getIdentificador() && (nombre.get(i) instanceof Reparaciones)) {
				 ((Reparaciones) nombre.get(i)).setPrecioMaterial(material);
				 System.out.println("Es reparacion");
				 comprobar = true;
				 break;
			}
			else if(indicadorId   == nombre.get(i).getIdentificador() && (nombre.get(i) instanceof Revisiones)) {
				System.out.println("Ese trabajo es una revisi�n.");
				comprobar = true;
				break;
			}
		}
		if(!comprobar) {
			System.out.println("No existe ese ID.");
			
		}
		
	}
	
	public static void finalizaTrabajo(ArrayList<Trabajo> nombre) {
		System.out.println("Indica el ID del trabajo:");
		Scanner in = new Scanner (System.in);
		int indicadorId = in.nextInt();
		boolean comprobar = false;
		for (int i = 0; i < nombre.size(); i++) {
			if (indicadorId == nombre.get(i).getIdentificador()) {
				nombre.get(i).setFinalizado(true);
				System.out.println("Trabajo finalizado.");
				comprobar = true;
				break;
			}
		}
		if(!comprobar) {
			System.out.println("No existe ese ID.");
		}
		
	}
	
	
	
	public static void muestraTrabajo(ArrayList<Trabajo> nombre) {
		System.out.println("Indica el ID del trabajo:");
		Scanner in = new Scanner (System.in);
		int indicadorId = in.nextInt();
		boolean comprobar = false;
		for (int i = 0; i < nombre.size(); i++) {
			if (indicadorId == nombre.get(i).getIdentificador()) {
				System.out.println(nombre.get(i).ToString());
				comprobar = true;
				break;
			}
		}
		if(!comprobar) {
			System.out.println("No existe ese ID.");
		}
		
	}
	
	
	
}
